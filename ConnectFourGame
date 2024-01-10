import java.util.Scanner;

public class ConnectFourGame {
  private static final int ROWS = 6;
  private static final int COLS = 7;
  private static final char EMPTY = '-';
  private char[][] board = new char[ROWS][COLS];
  private char currentPlayer;
  
  public ConnectFourGame() {
    initializeBoard();
    currentPlayer = 'X';
  }
  
  private void initializeBoard() {
    for (int i = 0; i < ROWS; i++){
      for (int j = 0; j < COLS; j++){
        board[i][j] = EMPTY;
      }
    }
  }
  
  private void printBoard() {
    for (char[] row : board) {
      for (char cell : row) {
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
    // TODO: Implement the logic to check for a win
    // You can use similar logic as in the previous example
    
    return false;
  }
  
  public void play() {
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      System.out.println("Current board:");
      printBoard();
      
      System.out.println("Player " + currentPlayer + "'s turn. Enter column (1-" + COLS + "): ");
      int column = scanner.nextInt() - 1;
      
      if (isValidMove(column)) {
        dropToken(column);
        
        if (checkForWin()) {
          System.out.println("Player " + currentPlayer + " wins!");
          break;
        }
        
        // Switch players
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
      } else {
        System.out.println("Invalid move. Try again.");
      }
    }
  }
}


