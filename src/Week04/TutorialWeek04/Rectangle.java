package Week04.TutorialWeek04;

public class Rectangle {
    //Attributes
    private double width = 1.0;
    private double height = 1.0;

    //Constructors
    public Rectangle() {}
    public Rectangle(double width, double height) {
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

    public String toString() {
        return String.format("Rectangle[width=%.1f,height=%.1f]", this.width, this.height);
    }
}
