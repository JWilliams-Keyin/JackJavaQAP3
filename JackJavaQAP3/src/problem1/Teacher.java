package problem1;

class Teacher extends Person {

    /* Attributes */

    protected String mySubject; // Teacher's subject
    protected double mySalary; // Teacher's salary

    /* Constructors */

    public Teacher(String name, int age, String gender, String subject, double salary) {
        // Use person class super constructor
        super(name, age, gender);

        // Initialize new values
        this.mySubject = subject;
        this.mySalary = salary;
    }

    /* Getters & Setters */

    public String getMySubject() {
        return this.mySubject;
    }

    public double getMySalary() {
        return this.mySalary;
    }

    public void setMySubject(String subject) {
        this.mySubject = subject;
    }

    public void setMySalary(double salary) {
        this.mySalary = salary;
    }

    /* Methods */

    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
    }
}
