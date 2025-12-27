import java.util.Scanner;

public class whileLoop {
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    boolean firstTF = true;
    boolean secondTF = true;



    while(firstTF){

    System.out.print("Would you like me to ask you same question again and again?... (Yes/No) : ");
    String userIn = scanner.nextLine();



    if(userIn.equalsIgnoreCase("yes")){
        while(secondTF){
             System.out.print("Keep asking.  (YES) <- OR -> (NO) :");
             userIn = scanner.nextLine();

             if(userIn.equalsIgnoreCase("yes")){
                System.out.println("Keep reading boy!..");
             }else if(userIn.equalsIgnoreCase("no")){
                System.out.println();
                secondTF = false;
             }else{
                System.out.println("Enter YES OR NO!");
             }

        }
        firstTF = false;
    }else if (userIn.equalsIgnoreCase("no")){
        System.out.println("Well.. Goodbye <3 0_0");
        firstTF = false;
    }else{
        System.out.println("Either enter -YES- OR -NO-");
    }


    }

}


}
