import java.util.InputMismatchException;
import java.util.Scanner;

public class Banking {
    private double balance = 0.0;
    static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    Banking account = new Banking(); // 👈 create object

    String userIn = "";
    double amount = 0.0;
    boolean loopBrake = true;

    while (loopBrake) {
        try {

            System.out.print(
                    "<====================================>\n" +
                    "1.Show balance\n" +
                    "2.Withdraw\n" +
                    "3.Deposit\n" +
                    "4.Exit\n" +
                    "<====================================>\n" +
                    "(1 - 2 - 3 - 4) Enter your choice :");
            userIn = scanner.nextLine();

            switch(userIn){
                case "1":
                account.showBalance();
                break;

                case "2":
                account.withdraw(amount);
                break;

                case "3":
                account.deposit(amount);
                break;

                case "4":
                loopBrake = false;
                break;

                default:
                System.out.println("Enter correct number!");
                break;
            }

        } catch (InputMismatchException e) {
            System.out.println("That's not a number! Try again.");
            scanner.nextLine();
        }
    }
    scanner.close();
}


    public void showBalance() {
        System.out.println("Your balance is $" + balance);
    }

    public void withdraw(double amount) {
        System.out.print("Enter amount : ");
        amount = scanner.nextDouble();
        scanner.nextLine();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }else{
        System.out.println("You can't withdraw more than balance amount or 0!");}
    }

    public void deposit(double amount) {
        System.out.print("Enter amount : ");
        amount = scanner.nextDouble();
        scanner.nextLine();
        if (amount > 0) {
            balance += amount;
        }else{
        System.out.println("You can't deposit negative amount!");}
    }
}
