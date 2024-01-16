public class Utils {
    private static int totalMoves = 0;

    /**
     * Increments the total number of moves.
     */
    public static void incrementMoves() {
        totalMoves++;
    }
    /**
     * Gets the total number of moves.
     *
     * @return The total number of moves.
     */

    public static int getTotalMoves() {
        return totalMoves;
    }
    /**
     * Returns a string representation of the Utils class.
     *
     * @return A string representation of totalMoves.
     */
    public String toString() {
      return "Total Moves = " + totalMoves + " "; 
    }

}
