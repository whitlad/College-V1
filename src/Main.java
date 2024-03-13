import com.sun.org.apache.xpath.internal.operations.Mod;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* //this is the constructor call
        Student s = new Student("Stewart", 39);
        //just enter the values no titles

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getName() + " " + s.getAge());

        s.setName("Larry");
        System.out.println(s.getName());
        //System.out.println(s.name); //bad encapsulation can't get it outside the class
        s.birthday();

        s.addNickName("Stew");
        s.addNickName("Big Stew");
        s.addNickName("Grahamer");

        s.printNickNames(); //calls s students print nickName method*/

        Student s = new Student("Stewart", 39);
        Student s2 = new Student("Larry", 22);
        Student s3 = new Student("Harry", 55);
        Student s4 = new Student("Moe", 44);

        Module m = new Module("Indian Head Massage", 3);
        m.enrolStudent(s2);
        m.enrolStudent(s3);
        m.enrolStudent(s4);

        System.out.println();

        System.out.println("The number of enrolments  " + m.getNumberOfEnrolments());
        m.printEnrolledStudents();

        //m.cancelEnrolment(1);
        m.cancelEnrolment("Harry");
        m.printEnrolledStudents();
        System.out.println("The number of enrolments  " + m.getNumberOfEnrolments());




    }
}
