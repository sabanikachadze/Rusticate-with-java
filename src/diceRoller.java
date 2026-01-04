import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class diceRoller {
    static String[] dieFaces = {
            "+-------+\r\n|       |\r\n|   ◉   |\r\n|       |\r\n+-------+",
            "+-------+\r\n| ◉     |\r\n|       |\r\n|     ◉ |\r\n+-------+",
            "+-------+\r\n| ◉     |\r\n|   ◉   |\r\n|     ◉ |\r\n+-------+",
            "+-------+\r\n| ◉   ◉ |\r\n|       |\r\n| ◉   ◉ |\r\n+-------+",
            "+-------+\r\n| ◉   ◉ |\r\n|   ◉   |\r\n| ◉   ◉ |\r\n+-------+",
            "+-------+\r\n| ◉   ◉ |\r\n| ◉   ◉ |\r\n| ◉   ◉ |\r\n+-------+"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userIn = 0;
        int rolledDice;
        int total = 0;
        boolean loopBrake = true;

        while (loopBrake) {
            try {
                System.out.print("Roll any number of dice :");
                userIn = scanner.nextInt();
                scanner.nextLine();
                if(userIn > 0){
                 loopBrake = false;
                }else{
                 System.out.println("You can't roll negative or zero dice!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                scanner.nextLine();
            }
        }
        System.out.println("##########");
        for (int i = 0; i < userIn; i++) {
            rolledDice = random.nextInt(1, 7);
            switch (rolledDice) {
                case 1:
                    diceOne();
                    total++;
                    break;
                case 2:
                    diceTwo();
                    total += 2;
                    break;
                case 3:
                    diceThree();
                    total += 3;
                    break;
                case 4:
                    diceFour();
                    total += 4;
                    break;
                case 5:
                    diceFive();
                    total += 5;
                    break;
                case 6:
                    diceSix();
                    total += 6;
                    break;
            }
        }
        System.out.println("Your total score is -- " + total);
    }


    static public void diceOne() {
        System.out.println(dieFaces[0]);
        System.out.println("##########");
    }
     static public void diceTwo() {
        System.out.println(dieFaces[1]);
         System.out.println("##########");
    }
      static public void diceThree() {
        System.out.println(dieFaces[2]);
         System.out.println("##########");
    }
      static public void diceFour() {
        System.out.println(dieFaces[3]);
         System.out.println("##########");
    }
      static public void diceFive() {
        System.out.println(dieFaces[4]);
         System.out.println("##########");
    }
     static public void diceSix() {
        System.out.println(dieFaces[5]);
         System.out.println("##########");
    }

}
