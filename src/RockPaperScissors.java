import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;
    private static final String[] TOOLS = { "rock", "paper", "scissors" };

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Would you like to play Rock Paper Scissors game ? (Yes/No):");
           String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("yes"))
             {
                runGame(scanner);
                break;
            } else if (userChoice.equals("no"))
            {
                System.out.println("Have a nice day.");
                return;
            }
        }


    }

    static void runGame(Scanner scanner)
    {
        Random random = new Random();

        while (true)
        {
            System.out.print("Enter your move (rock , paper , scissors):");
            String input = scanner.nextLine().toLowerCase();

            int userNum = convertChoice(input);
            if (userNum == -1)
            {
                System.out.println("Wrong input! Try again.");
                continue;
            }

            int cpuNum = random.nextInt(0, 3);
            int result = (userNum - cpuNum + 3) % 3;


            System.out.println("Computers choice :" + TOOLS[cpuNum]);
            if (result == 0)
            {
                System.out.println("It is tie!");
                continue;
            } else if (result == 1)
            {
                System.out.println("You won!");
            } else
            {
                System.out.println("You lost!");

            }

            System.out.print("Try again? Write yes if you do:");
            String retry = scanner.nextLine().toLowerCase();

            if (retry.equals("yes"))
            {
                System.out.println();
            } else
            {
                System.out.println("Thanks for playing");
                break;
            }
        }

    }

    static int convertChoice(String choice)
    {
        return switch (choice)
        {
            case "rock" -> ROCK;
            case "paper" -> PAPER;
            case "scissors" -> SCISSORS;
            default -> -1;
        };
    }
}






