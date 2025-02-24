package Week06.TutorialWeek06;

enum Colors {
    White,
    Black,
    Red,
    Pink,
    Orange,
    Yellow,
    Purple,
    Green,
    Blue,
    Brown
}

interface Shape2DCalculation {
    double getArea();

    double getPerimeter();
}

class Point2D {
    //Attributes
    private double x = 0.0;
    private double y = 0.0;

    //Constructors
    public Point2D() {
    }

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

    //Setter Method
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double setDistanceTo(Point2D p) {
        double x = p.getX();
        double y = p.getY();

        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double setDistanceTo(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public String toString() {
        return String.format("Point2D[x=%.1f,y=%.1f]", this.x, this.y);
    }
}

abstract class Shape2D implements Shape2DCalculation {
    //Attributes
    private Colors color = Colors.White;
    private boolean filled = false;
    private Point2D position = new Point2D();

    //Constructors
    public Shape2D() {
    }

    public Shape2D(Point2D position) {
        this.position = position;
    }

    public Shape2D(Colors color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape2D(Colors color, boolean filled, Point2D position) {
        this.color = color;
        this.filled = filled;
        this.position = position;
    }

    //Getter Methods
    public Colors getColor() {
        return this.color;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public Point2D getPosition() {
        return this.position;
    }

    //Setter Methods
    public void setColor(Colors color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public String toString() {
        return "Shape2D[color=" + this.color + ",filled status=" + this.filled + ",position=" + this.position.toString() + "]";
    }

}

class Circle extends Shape2D {
    //Attributes
    private double radius = 1.0;

    //Constructors
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, Colors color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius, Colors color, boolean filled, Point2D position) {
        super(color, filled, position);
        this.radius = radius;
    }

    //Getter Methods
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    //Setter Methods
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%.1f," + super.toString() + "]", this.radius);
    }
}

class Rectangle extends Shape2D {
    //Attributes
    private double width = 1.0;
    private double height = 1.0;

    //Constructors
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, Colors color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, Colors color, boolean filled, Point2D position) {
        super(color, filled, position);
        this.width = width;
        this.height = height;
    }

    //Setter Methods
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Getter Methods
    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[length=%.1f,width=%.1f," + super.toString() + "]", this.height, this.width);
    }

}


public class Square extends Rectangle {
    //Constructors
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, Colors color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(double side, Colors color, boolean filled, Point2D position) {
        super(side, side, color, filled, position);
    }

    //Getter Methods
    public double getSide() {
        return getWidth();
    }

    //Setter Methods
    public void setSide(double side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return String.format("Square[side=%.1f," + super.toString() + "]", getSide());
    }
}
