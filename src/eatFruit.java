import java.util.InputMismatchException;
import java.util.Scanner;

public class eatFruit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {};
        boolean whileBrake = true;

        while (whileBrake) {
            try {
                System.out.print("Enter how many fruits you would like to eat :");
                fruits = new String[scanner.nextInt()];
                scanner.nextLine();
                whileBrake = false;
            } catch (InputMismatchException | NegativeArraySizeException e) {
                System.out.println("Invalid input! enter positive number.");
                scanner.nextLine();
            }
        }
        System.out.println("-----------------------------");
        int b = 1;
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("Enter any fruit you like %d:", i + 1);
            fruits[i] = scanner.nextLine();
        }
        System.out.println("-----------------------------");
        for (String f : fruits) {
            System.out.printf("%d:  %s\n", b, f);
            b++;
        }
    }

}

