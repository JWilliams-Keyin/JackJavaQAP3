package problem3and4;

public abstract class Shape implements Scalable {

    /* Attributes */

    private final String name;
    public double area;
    public double perimeter;

    /* Constructors */

    public Shape(String name) {
        this.name = name;
    }

    /* Methods */

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Name: " + name + " Area: " + area + " Perimeter: " + perimeter;
    }
}
