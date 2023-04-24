import java.lang.Math;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Class                            Circle2D
 * Description                      This class represents a 2D circle with properties x, y, and a radius.
 *                                  The class provides methods for  area, perimeter. We also check
 *                                  to see if a two circles overlap, or if a circle is inside circle 1.
 *
 * @author                          Steven halla
 * File                             Circle2D.java
 * Environment                      IntelliJ JavaSDK 20, compatible with other environments
 * Date                             April 23, 2023
 * @version                         1.0.0
 * @see                             java.lang.Math
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


public class Circle2D {
    private double x;
    private double y;
    private double radius;

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method               main()
     * Description          The main method creates two Circle2D objects, as well as
     *                      doing calculations to see if a circle has a point, circle, or overlaps
     *                      a circle.
     *
     * @param               args Strings
     * @author              Steven halla
     * Date                 April 23, 2023
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


    public static void main(String[] args) {
        Circle2D circle1 = new Circle2D();
        Circle2D circle2 = new Circle2D(3, 4, 2);

        System.out.println("Circle 1:");
        System.out.println("Area = " + circle1.getArea());
        System.out.println("Perimeter = " + circle1.getPerimeter());
        System.out.println("Contains a point " + circle1.contains(2, 2));
        System.out.println("Contains circle 2? " + circle1.contains(circle2));
        System.out.println("Overlaps circle 2? " + circle1.overlaps(circle2));


    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method               Circle2D()
     * Description          Constructs a Circle2D object with default values for its properties.
     *                      x and y set to 0, radius set to 1.
     *
     * @author              Steven halla
     * Date                 4/15/2023
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method               Circle2D(double x, double y, double radius)
     * Description          Constructs a Circle2D object with the specified values for its properties.
     *
     * @param x             the x-coordinate of the circle center
     * @param y             the y-coordinate of the circle center
     * @param radius        the radius of the circle
     * @author              Steven halla
     * Date                 4/15/2023
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method               getRadius()
     * Description          Returns the radius of the circle. The Homework asked for this
     *                      though it didn't ask for a return so I am assuming
     *                      that we did not need to actually use this function?
     *                      If I had to use this I would do up top with the other print statements:
     *                      System.out.println("Radius = " + circle1.getRadius());
     *
     * @return              the radius of the circle
     * @author              Steven halla
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getRadius() {
        return radius;
    }


    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method               getArea()
     * Description          Calculates and returns the area of the circle.
     *
     * @return              the area of the circle
     * @author              Steven halla
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method               getPerimeter()
     * Description          Calculates and returns the perimeter of the circle.
     *
     * @return              the perimeter of the circle
     * @author              Steven halla
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method               contains(double x, double y)
     * Description          Checks if a point with the specified x and y coordinates is inside circle 1.
     *
     * @param x             the x-point of the point
     * @param y             the y-point of the point
     * @return              true if the point is within the circle, false otherwise
     * @author              Steven halla
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance <= radius;
    }


    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method               contains(Circle2D circle)
     * Description          Checks if the specified circle is completely contained within this circle.
     *
     * @param circle        the Circle2D object to check for containment
     * @return              true if the circle is within this circle, or it's a false return
     * @author              Steven halla
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance + circle.radius <= radius;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Method               overlaps(Circle2D circle)
     * Description          Checks if the specified circle overlaps with this circle.
     *
     * @param circle        the Circle2D object to check for overlap
     * @return              true if the circle overlaps with this circle, or it returns false
     * @author              Steven halla
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance < radius + circle.radius;
    }

}
