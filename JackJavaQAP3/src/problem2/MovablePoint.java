package problem2;

class MovablePoint extends Point{

    /* Attributes */

    public float xSpeed;
    public float ySpeed;

    /* Constructors */

    public MovablePoint() {
        super();
        this.xSpeed = 2;
        this.ySpeed = 2;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /* Getters & Setters */

    public float getxSpeed() {
        return this.xSpeed;
    }

    public float getySpeed() {
        return this.ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /* Methods */

    public String toString() {
        return super.toString() + " Speed: " + xSpeed + ", " + ySpeed;
    }

    MovablePoint move() {
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return this;
    }
}
