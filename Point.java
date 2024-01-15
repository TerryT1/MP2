/**
 * A class representing a Point in a 2D space.
 */
public class Point {
    private double x;
    private double y;

    /**
     * Constructor to initialize the Point with given coordinates.
     *
     * @param x The x-coordinate of the Point.
     * @param y The y-coordinate of the Point.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter method to retrieve the x-coordinate of the Point.
     *
     * @return The x-coordinate of the Point.
     */
    public double getX() {
        return x;
    }

    /**
     * Getter method to retrieve the y-coordinate of the Point.
     *
     * @return The y-coordinate of the Point.
     */
    public double getY() {
        return y;
    }

    /**
     * Setter method to update the x-coordinate of the Point.
     *
     * @param x The new x-coordinate for the Point.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Setter method to update the y-coordinate of the Point.
     *
     * @param y The new y-coordinate for the Point.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calculates the distance between this Point and another Point.
     *
     * @param other The other Point.
     * @return The distance between the two Points.
     */
    public double calculateDistance(Point other) {
        double deltaX = this.x - other.x;
        double deltaY = this.y - other.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    /**
     * Static method to find the midpoint between two Points.
     *
     * @param p1 The first Point.
     * @param p2 The second Point.
     * @return The midpoint as a new Point.
     */
    public static Point findMidpoint(Point p1, Point p2) {
        double midX = (p1.x + p2.x) / 2;
        double midY = (p1.y + p2.y) / 2;
        return new Point(midX, midY);
    }

    /**
     * Overrides the default toString method to print the Point's coordinates.
     *
     * @return String representation of the Point.
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * A void method that prints "Hello, World!".
     */
    public void printHelloWorld() {
        System.out.println("Hello, World!");
    }
}


