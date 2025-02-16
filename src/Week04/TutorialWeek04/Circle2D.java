package Week04.TutorialWeek04;

public class Circle2D {
    //Attributes
    private Point2D point = new Point2D(0, 0);
    private double radius = 1.0;

    //Constructors
    public Circle2D() {}
    public Circle2D(Point2D point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    //Getter Methods
    public Point2D getCenter() {
        return this.point;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        System.out.println(this.radius);
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public boolean contains(Point2D point) {
        return this.point.distance(point) < this.radius;
    }

    public boolean contains(Circle2D circle) {
        return this.point.distance(circle.point) + circle.radius < this.radius;
    }

    public boolean overlaps(Circle2D circle) {
        return this.point.distance(circle.point) < this.radius + circle.radius;
    }
}
