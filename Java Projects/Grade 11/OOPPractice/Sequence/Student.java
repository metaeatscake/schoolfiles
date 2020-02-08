// Class Diagram
public class Student
{
    String idNumber;
    String firstName;
    String lastName;
    String gradeLevel;
    String course;
    
    public void introduce()
    {
        System.out.println("\nHello my name is " + firstName + " " + lastName);
        System.out.println("My ID number is " + idNumber);
        System.out.println("My course is " + course);
        System.out.println("I am in grade " + gradeLevel);
    }
    
    public String toString()
    {
        return(
            "\nID Number: " + idNumber +
            "\nFirst Name: " + firstName +
            "\nLast Name: " + lastName +
            "\nGrade Level: " + gradeLevel +
            "\nCourse: " + course
        );
    }
}