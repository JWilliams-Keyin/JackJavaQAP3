package problem2;

public class Point {

    /* Attributes */

    public float x;
    public float y;

    /* Constructors */

    public Point() {
        this.x = 1;
        this.y = 1;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /* Getters & Setters */

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

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

    /* Methods */

    public String toString() {
        return "Point: " + x + ", " + y;
    }
}
