package problem1;

public class Person {

    /* Attributes */

    protected String myName ; // name of the person
    protected int myAge; // person’s age
    protected String myGender; // “M” for male, “F” for female

    /* Constructors */

    public Person(String name, int age, String gender) {
        myName = name; myAge = age ; myGender = gender;
    }

    /* Getters & Setters */

    public String getMyName() {
        return this.myName;
    }

    public int getMyAge() {
        return this.myAge;
    }

    public String getMyGender() {
        return this.myGender;
    }

    public void setMyName(String name) {
        this.myName = name;
    }

    public void setMyAge(int age) {
        this.myAge = age;
    }

    public void setMyGender(String gender) {
        this.myGender = gender;
    }

    /* Methods */

    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}

