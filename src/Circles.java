import java.lang.Math;

public class Circles {
    public static void main(String[] args) {
        Circles circle1 = new Circles(0, 0, 1);
        Circles circle2 = new Circles(3, 4, 2);

        System.out.println("Circle 1:");
        System.out.println("Area = " + circle1.getArea());
        System.out.println("Perimeter = " + circle1.getPerimeter());
        System.out.println("Contains point (0, 0)? " + circle1.contains(0, 0));
        System.out.println("Contains point (2, 2)? " + circle1.contains(2, 2));
        System.out.println("Contains circle 2? " + circle1.contains(circle2));
        System.out.println("Overlaps circle 2? " + circle1.overlaps(circle2));

        System.out.println("Circle 2:");
        System.out.println("Area = " + circle2.getArea());
        System.out.println("Perimeter = " + circle2.getPerimeter());
        System.out.println("Contains point (3, 4)? " + circle2.contains(3, 4));
        System.out.println("Contains point (5, 6)? " + circle2.contains(5, 6));
        System.out.println("Contains circle 1? " + circle2.contains(circle1));
        System.out.println("Overlaps circle 1? " + circle2.overlaps(circle1));
    }

    private double x;
    private double y;
    private double radius;

    public Circles() {
        this(0, 0, 1);
    }

    public Circles(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance <= radius;
    }

    public boolean contains(Circles circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance + circle.radius <= radius;
    }

    public boolean overlaps(Circles circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance < radius + circle.radius;
    }
}
