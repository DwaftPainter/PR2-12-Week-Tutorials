package Week05.TutorialWeek05;

public class Shape {
    //Attributes
    private String color = "red";
    private boolean filled = true;

    //Constructors
    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //Getter Methods
    public String getColor() {
        return this.color;
    }

    public boolean getFilled() {
        return this.filled;
    }

    //Setter Methods
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return String.format("Shape[color=%s, filled=%b]", this.color, this.filled);
    }
}

class Circle extends Shape {
    //Attributes
    private double radius = 1.0;

    //Constructors
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
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
        return String.format("Circle[Shape[color=%s, filled=%b], radius=%.1f]", getColor(), getFilled(), this.radius);
    }
}

class Rectangle extends Shape {
    //Attributes
    private double width = 1.0;
    private double height = 1.0;

    //Constructors
    public Rectangle() {}
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
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
        return String.format("Rectangle[Shape[color=%s, filled=%b], width=%.1f, length=%.1f]", getColor(), getFilled(), this.width, this.height);
    }
}

class Square extends Rectangle {
    //Constructors
    public Square() {}
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
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
        return String.format("Square[Rectangle[Shape[color=%s, filled=%b], width=%.1f, length=%.1f]]", getColor(), getFilled(), getSide(), getSide());
    }
}