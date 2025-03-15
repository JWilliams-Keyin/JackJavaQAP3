package problem3and4;

public class Demo3and4 {

    /* Scaling Method */

    public static void scaleArray(Shape[] shapesList, double factor) {
        for (Shape shape : shapesList) {
            // Print before scaling
            System.out.print("Before Scale: ");
            System.out.println(shape);

            // Scale object
            shape.scale(factor);

            // Print after scaling
            System.out.print("After Scale: ");
            System.out.println(shape);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /* Create Shape Array */

        Shape[] shapesList = {
                new Circle("My Circle", 7),
                new Ellipse("My Ellipse", 8, 9),
                new Triangle("My Triangle", 4, 5, 6),
                new EquilateralTriangle("My Equilateral", 3, 3, 3),
        };

        /* Loop Through Array to Print Objects */

        scaleArray(shapesList, 3);
    }
}
