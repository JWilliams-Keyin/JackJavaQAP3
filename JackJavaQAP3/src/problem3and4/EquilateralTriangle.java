package problem3and4;

class EquilateralTriangle extends Triangle{

    /* Constructors */

    public EquilateralTriangle(String name, double side1, double side2, double side3) {
        // Call super constructor
        super(name, side1, side2, side3);

        // Validate that all sides are the same
        if (side1 != side2 || side1 != side3 || side2 != side3) {
            System.out.println("Error: The given measurements don't form an equilateral triangle.");
            System.exit(0);
        }

        // Set values
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        this.area = getArea();
        this.perimeter = getPerimeter();
    }

    /* Methods */

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side1 * side1;
    }

    @Override
    public double getPerimeter() {
        return 3 * side1;
    }

    /* Scale Method */
    @Override
    public void scale(double factor) {
        double scaledSide1 = this.side1 * factor;
        double scaledSide2 = this.side2 * factor;
        double scaledSide3 = this.side3 * factor;
    }
}
