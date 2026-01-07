import java.util.Scanner;

public class quiz {
    static String[][] questions = {
            {"In what country did the first Starbucks open outside of North America?",
                    "In a website browser address bar, what does “www” stand for? ",
                    "Who painted the Mona Lisa?",
                    "What was the original purpose of the tiny pocket in jeans?"
            },

            {"""
            1.Germany
            2.Japan
            3.Italy
            4.Spain
            """,
                    """
            1.World Wide Web
            2.prefix indicating a web service
            3.subdomain of a domain name
            4.convention, not a requirement
            """,
                    """
            1.Michelangelo
            2.Raphael
            3.Sandro Botticelli
            4.Leonardo da Vinci
            """,
                    """
            1.To hold a pocket watch
            2.For small valuables
            3.As a place for chewing tobacco
            4.As a fashion or design element
            """
            },

            {"2",
                    "1",
                    "4",
                    "1"
            }
    };


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String play;

        System.out.println("                     .\n" +
                "                    / V\\\n" +
                "                  / `  /\n" +
                "                 <<   |\n" +
                "                 /    |\n" +
                "               /      |\n" +
                "             /        |\n" +
                "           /    \\  \\ /\n" +
                "          (      ) | |\n" +
                "  ________|   _/_  | |\n" +
                "<__________\\______)\\__)");
        System.out.println("    ______________________________\n" +
                " / \\                             \\.\n" +
                "|   |                            |.\n" +
                " \\_ |                            |.\n" +
                "    |          WELCOME           |.\n" +
                "    |                            |.\n" +
                "    |    Would you like to       |.\n" +
                "    |     participate in quiz    |.\n" +
                "    |           GAME?            |.\n" +
                "    |   ---------------------    |.\n" +
                "    |    Enter (1) if you        |.\n" +
                "    |      wish to continue      |.\n" +
                "    |                            |.\n" +
                "    |                            |.\n" +
                "    |                            |.\n" +
                "    |   _________________________|___\n" +
                "    |  /                            /.\n" +
                "    \\_/____________________________/.");
        System.out.print("         Enter your choice here :");
        play = scanner.nextLine();

        if (play.equalsIgnoreCase("1")) {
            startGame();
        } else {
            System.out.println("Bye");
        }

    }


    static void startGame() {
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        String userChoice = "";
        System.out.println("Welcome to general knowledge quiz - Think as long as you want.");
        System.out.println();
        int score = 0;
        for (int i = 0; i < 4; i++) {
            System.out.printf("%s\n", questions[0][i]);
            System.out.printf("%s\n", questions[1][i]);
            System.out.println("Write only number as answers from 1 to 4!");
            System.out.print("Answer :");
            userChoice = scanner.nextLine();
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            if (userChoice.equalsIgnoreCase(questions[2][i])) {
                score++;
            }
        }

        System.out.printf("Your score is %d/4\n", score);
    }
}
