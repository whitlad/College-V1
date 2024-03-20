import java.util.ArrayList;


public class Module
{
    //1st create the FIELDS
    private String name;

    private int capacity; //max number of students on the module
    private ArrayList<Student> students;

    //2nd create the CONSTRUCTORS

    public Module(String aName, int aCapacity)
    {
        this.name = aName;
        this.capacity = aCapacity;
        this.students = new ArrayList<>();

    }
//3rd Set the GETTERS
    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    //4th Now look at the array list of the students


    public void enrolStudent (Student aStudent)
    {
        this.students.add(aStudent);
    }

    //same name but different values
    public void cancelEnrolment(int index)
    {
        this.students.remove(index);
    }

    public void cancelEnrolment(String name) //finds name in list and removes it
    {
       int index = -1;
       int count = 0;

       for (Student eachStudent : this.students)

       {
           if (eachStudent.getName().equals(name))
           {
               index = count;
           }
            count++;
       }
       if(index != -1)
       {
           this.students.remove(index);
       }

       //caller passes in name index - goes to larry and removes this from 1st index place

    }



    //print out students who have enrolled on module

    public void printEnrolledStudents()
    {
        for (Student eachStudent : this.students) //loop variable
        {
           // System.out.println(eachStudent.getName()); //add the .getName to get a logical
            System.out.print(eachStudent.getName() + "  age  " + eachStudent.getAge() + "\n");
        }
    }


    public int getNumberOfEnrolments()
    {
        return this.students.size();
    }
}





