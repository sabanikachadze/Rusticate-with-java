import java.util.Random;
import java.util.Scanner;

public class randomNum {
    public static void main(String[] args){
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int guess = 0;
    int attempts = 0;
    int randomNumber = random.nextInt(1,101);
    int score = 0;
    String decision = "";
    boolean loopBrake = true;
    System.out.print("If you would like to play number guessing game write (YES) if not, enter anything else : ");
    decision = scanner.nextLine();

    if(decision.equalsIgnoreCase("yes")){
        while(loopBrake){


        try{
            System.out.print("Number is out of 100, Guess :");
            guess = scanner.nextInt();
            scanner.nextLine();
            score = (100 - (attempts * 10) < 0) ? 0 : 100 - (attempts * 10);
            if(guess == randomNumber){
                attempts++;
                System.out.println("Congratulations you are right. ");
                System.out.println("Number of attempts --> " + attempts + " <--");
                System.out.println("Your score is --> " + score + " <--");
                loopBrake = false;
            }else if(guess < randomNumber){
                System.out.println("Go Higher");
                attempts++;
            }else{
            System.out.println("Go Lower");
            attempts++;
            }
            }catch(Exception e){
                System.out.println("❌ Numbers only, try again.");
                scanner.nextLine();
            }

        }

    }else{
        System.out.println("have a good day.");
    }

    }

}
