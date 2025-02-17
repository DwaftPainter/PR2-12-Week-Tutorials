package Week05.TutorialWeek05;

public class Point {
    //Attributes
    private float x = 0.0f;
    private float y = 0.0f;

    //Constructors
    public Point() {}
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //Getter Methods
    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    //Setter Methods
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%.1f,%.1f)", this.x, this.y);
    }

}

class MovablePoint extends Point {
    //Attributes
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    //Constructors
    public MovablePoint() {}
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //Getter Methods
    public float getXSpeed() {
        return this.xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    //Setter Methods
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return String.format("(%.1f,%.1f), speed=(%.1f,%.1f)", getX(), getY(), this.xSpeed, this.ySpeed);
    }

    public float[] move() {
        this.setXY(this.xSpeed, this.ySpeed);
        return getXY();
    }
}
