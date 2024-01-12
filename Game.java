import java.util.Scanner;
public class Game {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static final char EMPTY = '-';
    private char[][] board = new char[ROWS][COLS];
    private char currentPlayer;
    public Game() {
        initializeBoard();
        currentPlayer = 'X';
    }
    private void initializeBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = EMPTY;
            }
        }
    }
    private void printBoard() {
        for (char[] row: board) {
            for (char cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private boolean isValidMove(int column) {
        return column >= 0 && column < COLS && board[0][column] == EMPTY;
    }
    private void dropToken(int column) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][column] == EMPTY) {
                board[i][column] = currentPlayer;
                break;
            }
        }
    }
    private boolean checkForWin() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS - 3; j++) {
                if (board[i][j] == currentPlayer && board[i][j + 1] == currentPlayer && board[i][j + 2] == currentPlayer && board[i][j + 3] == currentPlayer) {
                    return true;
                }
            }
        }
        for (int i = 0; i < ROWS - 3; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == currentPlayer && board[i + 1][j] == currentPlayer && board[i + 2][j] == currentPlayer && board[i + 3][j] == currentPlayer) {
                    return true;
                }
            }
        }
        for (int i = 0; i < ROWS - 3; i++) {
            for (int j = 0; j < COLS - 3; j++) {
                if (board[i][j] == currentPlayer && board[i + 1][j + 1] == currentPlayer && board[i + 2][j + 2] == currentPlayer && board[i + 3][j + 3] == currentPlayer) {
                    return true;
                }
            }
        }
        for (int i = 0; i < ROWS - 3; i++) {
            for (int j = 3; j < COLS; j++) {
                if (board[i][j] == currentPlayer && board[i + 1][j - 1] == currentPlayer && board[i + 2][j - 2] == currentPlayer && board[i + 3][j - 3] == currentPlayer) {
                    return true;
                }
            }
        }
        return false;
    }
    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + "'s turn. Enter column (1-" + COLS + "): ");
            int column = scanner.nextInt() - 1;
            if (isValidMove(column)) {
                dropToken(column);
                if (checkForWin()) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
}
