package problem2;

public class Demo2 {
    public static void main(String[] args) {

        /* Point Class */

        Point defPoint = new Point();
        System.out.println(defPoint);

        Point myPoint = new Point(5, 8);
        System.out.println(myPoint);

        /* Movable Point Class */

        MovablePoint defMovPoint = new MovablePoint();
        System.out.println(defMovPoint);

        MovablePoint halfMovPoint = new MovablePoint(7, 9);
        System.out.println(halfMovPoint);

        MovablePoint myMovPoint = new MovablePoint(2, 5, 9, 6);
        System.out.println(myMovPoint);
    }
}
