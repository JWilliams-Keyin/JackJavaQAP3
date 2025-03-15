package problem1;

class Student extends Person {

    /* Attributes */

    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average

    /* Constructors */

    public Student(String name, int age, String gender, String idNum, double gpa) {
        // use the super class’ constructor
        super (name, age, gender);

        // initialize what’s new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    /* Getters & Setters */

    public String getMyIdNum() {
        return this.myIdNum;
    }

    public double getMyGPA() {
        return this.myGPA;
    }

    public void setMyIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public void setMyGPA(double gpa) {
        this.myGPA = gpa;
    }

    /* Methods */

    public String toString() {
        return super.toString() + ", Id Number: " + myIdNum + ", GPA: " + myGPA;
    }
}

