import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set the number of questions and track length
        int totalQuestions = 5;
        int trackLength = 20;

        // Initialize players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Display initial track
        displayTrack(trackLength, player1.getPosition(), player2.getPosition());

        // Game loop
        for (int questionNumber = 1; questionNumber <= totalQuestions; questionNumber++) {
            System.out.println("Question " + questionNumber + ":");

            // Create a random math question
            Question question = new Question();

            // Display the math question for both players
            player1.answerQuestion(question, scanner);
            player2.answerQuestion(question, scanner);

            // Determine the faster player and update positions
            updatePlayerPositions(player1, player2);

            // Display updated track
            displayTrack(trackLength, player1.getPosition(), player2.getPosition());
        }

        // Determine the winner
        determineWinner(player1, player2);

        scanner.close();
    }

    private static void displayTrack(int trackLength, int player1Position, int player2Position) {
        System.out.println("\nTrack:");

        // Display player positions on the track
        for (int i = 0; i < trackLength; i++) {
            if (i == player1Position) {
                System.out.print("1");
            } else if (i == player2Position) {
                System.out.print("2");
            } else {
                System.out.print("-");
            }
        }

        System.out.println(); // Move to the next line
    }

    private static void updatePlayerPositions(Player player1, Player player2) {
        if (player1.isFasterThan(player2)) {
            player1.move();
            System.out.println(player1.getName() + " answered faster! " + player1.getName() + " proceeds.");
        } else if (player2.isFasterThan(player1)) {
            player2.move();
            System.out.println(player2.getName() + " answered faster! " + player2.getName() + " proceeds.");
        } else {
            System.out.println("It's a tie! No one proceeds.");
        }
    }

    private static void determineWinner(Player player1, Player player2) {
        if (player1.getPosition() > player2.getPosition()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getPosition() > player1.getPosition()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie! No clear winner.");
        }
    }
}

