public class Player {
    private char symbol;
    /**
     * Constructs a new Player with the specified symbol.
     *
     * @param symbol The symbol representing the player.
     */
    public Player(char symbol) {
        this.symbol = symbol;
    }
    /**
     * Gets the symbol of the player.
     *
     * @return The player's symbol.
     */
    public char getSymbol() {
        return symbol;
    }
   /**
     * Sets the symbol of the player.
     *
     * @param symbol The new symbol for the player.
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    
     public String toString() {
        return "Player " + symbol + "'s turn.";
    }
}
