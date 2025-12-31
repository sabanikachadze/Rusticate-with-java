import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playNotPlay = "";
        String userGameMode = "";
        boolean whileBrake = true;

        System.out.print("If you would like to play number guessing game write -- yes -- if not enter anything :");
        playNotPlay = scanner.nextLine();
        if(playNotPlay.equalsIgnoreCase("yes")){

        while(whileBrake){
            System.out.print("Choose game difficulty --Easy--Medium--Hard-- :");
            userGameMode = scanner.nextLine().toLowerCase();
            switch(userGameMode){
                case "easy" ->{ easyMode(); whileBrake = false;}
                case "medium" -> { mediumMode(); whileBrake = false;}
                case "hard" -> { hardMode(); whileBrake = false;}
                default -> System.out.println("Wrong input!.") ;
                }}

            }else{
            System.out.println("Well have a good day");}

        }






    static void easyMode(){
           boolean whileBrake = true;
           Scanner scanner = new Scanner(System.in);
           Random random = new Random();

           int randomNumber = random.nextInt(1,6);
           int guess = 0;

           System.out.println("Number is in between 1 and 5, Have a guess.");
           while(whileBrake){
        try{
            System.out.print("Try here :");
            guess = scanner.nextInt();
            scanner.nextLine();
            if(randomNumber == guess){
                System.out.println("Congratulations you Won. Number was " + randomNumber);
                whileBrake = false;
            }else if(randomNumber == random.nextInt(1,6)){
                System.out.println("You lost, computer guessed first it was " + randomNumber);
                 whileBrake = false;
            }else{
            }
            }catch(Exception e){
                System.out.println("❌ Numbers only, try again.");
                scanner.nextLine();
            }

        }
    }
    static void mediumMode(){
           boolean whileBrake = true;
           boolean cpuBrake = true;
           Scanner scanner = new Scanner(System.in);
           Random random = new Random();

           int randomNumber = random.nextInt(1,11);
           int guess = 0;
           ArrayList<Integer> usedNumbers = new ArrayList<>();
           int cpuGuess = 0;



           System.out.println("Number is in between 1 and 10, Have a guess.");
           while(whileBrake){
           System.out.print("Try here :");
        try{

            do {
                cpuGuess = random.nextInt(1, 11); // 1–20
                cpuBrake = false;
                for (int f : usedNumbers) {
                    if (cpuGuess == f) {
                        cpuBrake = true;
                        break;
                    }
                }
            } while (cpuBrake);
            guess = scanner.nextInt();
            scanner.nextLine();
            if(randomNumber == guess){
                System.out.println("Congratulations you Won. Number was " + randomNumber);
                whileBrake = false;
            }else if(randomNumber == cpuGuess){
                System.out.println("You lost, computer guessed first, it was " + randomNumber);
                 whileBrake = false;
            }else{
            usedNumbers.add(cpuGuess);
            }
            }catch(Exception e){
                System.out.println("❌ Numbers only, try again.");
                scanner.nextLine();
            }

        }
    }
    static void hardMode(){
           boolean whileBrake = true;
           boolean cpuBrake = true;
           Scanner scanner = new Scanner(System.in);
           Random random = new Random();

           int randomNumber = random.nextInt(1,21);
           int guess = 0;
           ArrayList<Integer> usedNumbers = new ArrayList<>();
           int cpuGuess = 0;



           System.out.println("Number is in between 1 and 20, Have a guess :");
           while(whileBrake){
           System.out.print("Try here :");
        try{

            do {
                cpuGuess = random.nextInt(1, 21); // 1–20
                cpuBrake = false;
                for (int f : usedNumbers) {
                    if (cpuGuess == f) {
                        cpuBrake = true;
                        break;
                    }
                }
            } while (cpuBrake);

            guess = scanner.nextInt();
            scanner.nextLine();
            if(randomNumber == guess){
                System.out.println("Congratulations you Won. Number was " + randomNumber);
                whileBrake = false;
            }else if(randomNumber == cpuGuess){
                System.out.println("You lost, computer guessed first, it was " + randomNumber);
                 whileBrake = false;
            }else{
            usedNumbers.add(cpuGuess);
            usedNumbers.add(guess);
            }
            }catch(Exception e){
                System.out.println("❌ Numbers only, try again.");
                scanner.nextLine();
            }

        }
    }
}
