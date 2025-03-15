package problem1;

class CollegeStudent extends Student{

    /* Attributes */

    protected String myMajor;
    protected int myYear;

    /* Constructors */

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        // Use student class super constructor
        super(name, age, gender, idNum, gpa);

        // Initialize new values
        this.myMajor = major;
        this.myYear = year;
    }

    /* Getters & Setters */

    public String getMyMajor() {
        return this.myMajor;
    }

    public int getMyYear() {
        return this.myYear;
    }

    public void setMyMajor(String major) {
        this.myMajor = major;
    }

    public void setMyYear(int year) {
        this.myYear = year;
    }

    /* Methods */

    public String toString() {
        return super.toString() + ", Major: " + myMajor + ", Year: " + myYear;
    }
}
