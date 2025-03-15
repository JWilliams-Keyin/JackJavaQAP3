package problem3and4;

class Circle extends Shape{

    /* Attributes */

    public double radius;

    /* Constructors */

    public Circle(String name, double radius) {
        // Call super constructor
        super(name);

        // Set radius, area, & perimeter
        this.radius = radius;
        this.area = getArea();
        this.perimeter = getPerimeter();
    }

    /* Methods */

    @Override
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    /* Scale Method */
    @Override
    public void scale(double factor) {
        double scaledRadius = this.radius * factor;
    }
}
