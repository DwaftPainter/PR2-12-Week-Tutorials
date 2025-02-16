package Week04.TutorialWeek04;

public class Point2D {
    //Attributes
    private double x;
    private double y;

    //Constructors
    public Point2D() {}
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Getter Methods
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance (Point2D p) {
        double x = p.getX();
        double y = p.getY();

        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance (double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public String toString() {
        return String.format("Point: (x:%.1f, y:%.1f)", this.x, this.y);
    }
}
