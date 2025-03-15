package problem3and4;

class Triangle extends Shape{

    /* Attributes */

    public double side1;
    public double side2;
    public double side3;

    /* Constructors */

    public Triangle(String name, double side1, double side2, double side3) {
        // Call super constructor
        super(name);

        // Validate that sides make a triangle
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            System.out.println("Error: The given measurements don't form a triangle.");
            System.exit(0);
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        // Set area and perimeter
        this.area = getArea();
        this.perimeter = getPerimeter();
    }

    /* Methods */

    @Override
    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /* Scale Method */
    @Override
    public void scale(double factor) {
        double scaledSide1 = this.side1 * factor;
        double scaledSide2 = this.side2 * factor;
        double scaledSide3 = this.side3 * factor;
    }
}
