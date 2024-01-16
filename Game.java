public class Game {
    private static final int rows = 6;
    private static final int cols = 7;
    private char[][] board;
    private int[] boards = {1, 2, 3, 4, 5, 6, 7};
       
    /**
     * Constructs a new Game object and initializes the game board.
     */
    public Game() {
        initializeBoard();
    }

    private void initializeBoard() {
        board = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
    }
    /**
     * Gets the current game board.
     *
     * @return the game board.
     */

    public char[][] getBoard() {
        return board;
    }
    
    /**
     * Makes a move in the specified column for the given player symbol.
     *
     * @param column       The column where the move is made.
     * @param playerSymbol The symbol of the player making the move.
     * @return True if the move is successful, false otherwise.
     */

    public boolean makeMove(int column, char playerSymbol) {
        for (int i = rows - 1; i >= 0; i--) {
            if (board[i][column] == '-') {
                board[i][column] = playerSymbol;
                Utils.incrementMoves();
                return true;
            }
        }
        return false;
    }

    public boolean checkForWin(char playerSymbol) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                if (board[i][j] == playerSymbol &&
                        board[i][j + 1] == playerSymbol &&
                        board[i][j + 2] == playerSymbol &&
                        board[i][j + 3] == playerSymbol) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == playerSymbol &&
                        board[i + 1][j] == playerSymbol &&
                        board[i + 2][j] == playerSymbol &&
                        board[i + 3][j] == playerSymbol) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                if (board[i][j] == playerSymbol &&
                        board[i + 1][j + 1] == playerSymbol &&
                        board[i + 2][j + 2] == playerSymbol &&
                        board[i + 3][j + 3] == playerSymbol) {
                    return true;
                }
            }
        }

        for (int i = 3; i < rows; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                if (board[i][j] == playerSymbol &&
                        board[i - 1][j + 1] == playerSymbol &&
                        board[i - 2][j + 2] == playerSymbol &&
                        board[i - 3][j + 3] == playerSymbol) {
                    return true;
                }
            }
        }

        return false; 
    }

    public boolean checkForDraw() {
        for (int i = 0; i < cols; i++) {
            if (board[0][i] == '-') {
                return false; 
            }
        }
        return true; 
    }

    public static int getRows() {
        return rows;
    }

    public static int getCols() {
        return cols;
    }
}
