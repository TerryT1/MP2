/**
 * A class representing a Circle with a center Point and a radius.
 */
public class Circle {
    private Point center;
    private double radius;

    /**
     * Constructor to initialize the Circle with a center Point and a radius.
     *
     * @param center The center Point of the Circle.
     * @param radius The radius of the Circle.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Getter method to retrieve the center Point of the Circle.
     *
     * @return The center Point of the Circle.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Getter method to retrieve the radius of the Circle.
     *
     * @return The radius of the Circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Setter method to update the center Point of the Circle.
     *
     * @param center The new center Point for the Circle.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Setter method to update the radius of the Circle.
     *
     * @param radius The new radius for the Circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the Circle.
     *
     * @return The area of the Circle.
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the circumference of the Circle.
     *
     * @return The circumference of the Circle.
     */
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    /**
     * A static method that increments a static variable in the Point class.
     *
     * @param increment The amount to increment the static variable.
     */
    public static void incrementStaticVariable(int increment) {
        // Assuming there is a static variable in the Point class named 'staticVariable'
        Point.staticVariable += increment;
    }
}
