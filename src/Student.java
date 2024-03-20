import java.util.ArrayList;


public class Student {

    private String name; //name field - holds student's name
    // belongs to whole class used throughout all of it

    private int age; // age field - hold a student's age
    // useable any method in the class
    private ArrayList<String> nickNames; // nickNames fields holds the student may be known

    //CONSTRUCTOR

    public Student(String aName, int anAge) //what's needed for the student
    {
        /** student name for the constructors**/
        this.name = aName;
        this.age = anAge;
        this.nickNames = new ArrayList<>();  //initialising field empty arraylist **must be done

    }

    //DEFINE SOME METHODS
//this is getter method for the name field = returns students name to the caller of the method
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    //SETTERS
    //void means not returning anything from calling this method

    /**
     * Setter method for the name field - sets the value of the name field to teh value of the paramater
     *
     * @param aName
     */
    public void setName(String aName) {

        this.name = aName;

    }

    /**
     * Increments the value of the age field of the student
     */
    public void birthday() {
        this.age++;
    }

    /**
     *
     */

    public void addNickName(String aName)  //.add let's us add a nickname to collection of nicknames
    {
        this.nickNames.add(aName);

    }

    /**
     * prints students nicknames to the console
     * printouts the nicknames added by the student
     */
    public void printNickNames() {
        for (String nickName : nickNames) {
            System.out.println(nickName);
        }
    }

    /** stewarts code
     public void printNickNames()
     for (string eachName : this.NickNames)
     {
     System.out.println(nickNames)
     }
     **/

    }












