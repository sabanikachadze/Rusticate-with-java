import java.util.InputMismatchException;
import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int row = 0;
    int column = 0;
    char symbol = '*';
    boolean loopExit = true;
    int indicator = 0;
    System.out.println("To create pyramid enter row and column numbers");
    while(loopExit){
    try{
    System.out.print("Enter number of rows: ");
    row = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter column num but it should be odd number or will be converted into one! :");
    column = scanner.nextInt();
    System.out.print("Choose symbol to build pyramid out of :");
    symbol = scanner.next().charAt(0);
    loopExit = false;
    } catch (InputMismatchException e) {
                System.out.println("That's not an integer! Try again.");
                scanner.nextLine();
            }

    }


    if(column % 2 == 0){
            column++;
            indicator =  (column/2 );
    for(int i= 0; i < row; i++){
        for(int j = 0; j < column; j++){

        if(indicator - i <= j && j <= indicator + i){
          System.out.print(symbol);
        }else{
            System.out.print(" ");
            }
        }
        System.out.println();
    }
    }else{
    indicator =  (column / 2 );

    for(int i= 0; i < row; i++){
        for(int j = 0; j < column; j++){
        if(indicator - i <= j && j <= indicator + i){
          System.out.print(symbol);
        }else{
            System.out.print(" ");
            }
        }
        System.out.println();
    }}

    }
}
