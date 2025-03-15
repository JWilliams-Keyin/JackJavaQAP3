package problem1;

public class Demo1 {
    public static void main(String[] args) {

        /* Person Class */
        Person jason = new Person("Jason Noseworthy", 34, "M");
        System.out.println(jason);

        /* Student Class */
        Student abby = new Student("Abby Pearson", 17, "F", "H1923736", 3.9);
        System.out.println(abby);

        /* Teacher Class */
        Teacher richard = new Teacher("Richard Roberts", 60, "M", "English", 55000);
        System.out.println(richard);

        /* College Student Class */
        CollegeStudent theo = new CollegeStudent("Theo Turnbolt", 20, "M", "U1932721", 3.6, "Chemistry", 3);
        System.out.println(theo);
    }
}
