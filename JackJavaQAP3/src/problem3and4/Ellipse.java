package problem3and4;

class Ellipse extends Shape{

    /* Attributes */

    public double a;
    public double b;

    /* Constructors */

    public Ellipse(String name, double a, double b) {
        // Call super constructor
        super(name);

        // Make sure biggest value is a & smallest is b
        if (a <= b) {
            this.a = b;
            this.b = a;
        } else {
            this.a = a;
            this.b = b;
        }

        // Set area and perimeter
        this.area = getArea();
        this.perimeter = getPerimeter();
    }

    /* Methods */

    @Override
    public double getArea() {
        return Math.PI * (this.a * this.b);
    }

    @Override
    public double getPerimeter() {
        return Math.PI *
                (Math.sqrt(2 * ((this.a * this.a) - (this.b * this.b)) - (Math.pow(this.a - this.b, 2) / 2)));
    }

    /* Scale Method */
    @Override
    public void scale(double factor) {
        double scaledA = this.a * factor;
        double scaledB = this.b * factor;
    }
}
