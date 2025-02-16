package Week04.TutorialWeek04;

public class Circle {
    //Attributes
    private double radius = 1.0;
    private String color = "red";

    //Constructors
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //Getter Methods
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
