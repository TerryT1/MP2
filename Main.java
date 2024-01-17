import java.util.Scanner;
//Precondtion: Input can only be 1-7
//Postcondition: Total Moves is always positive
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player playerX = new Player('X');
        Player playerO = new Player('O');
        Scanner scanner = new Scanner(System.in);
        boolean gameActive = true;

        while (gameActive) {
            printBoard(game.getBoard());
            playerMove(game, scanner, playerX);
            printBoard(game.getBoard()); 

            //X win
            if (game.checkForWin(playerX.getSymbol())) {
                System.out.println("Player X wins!");
                gameActive = false;
                break;
            }

            //draw
            if (game.checkForDraw()) {
                System.out.println("It's a draw!");
                gameActive = false;
                break;
            }

            // 0 move
            playerMove(game, scanner, playerO);

            printBoard(game.getBoard());        

            //win
            if (game.checkForWin(playerO.getSymbol())) {
                System.out.println("Player O wins!");
                gameActive = false;
                break;
            }

            //draw
            if (game.checkForDraw()) {
                System.out.println("It's a draw!");
                gameActive = false;
                break;
            }

        }     
        System.out.println(new Utils().toString());
        scanner.close();
        
        //object reference requirement
        Object[] objectArray = new Object[1];
         for (int i = 0; i < objectArray.length; i++) {
            objectArray[i] = new Object(i + 1);
        }

    }

    private static void playerMove(Game game, Scanner scanner, Player player) {
        int column = -1; 
          
        while (column < 0 || column >= Game.getCols() || !game.makeMove(column, player.getSymbol())) {
            System.out.print("Player " + player.getSymbol() + "'s turn. Enter column (1-7): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            column = scanner.nextInt() - 1; 
        }
    }


     private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
