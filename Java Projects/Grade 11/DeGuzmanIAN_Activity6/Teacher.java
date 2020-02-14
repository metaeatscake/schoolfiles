import java.util.*;
public class Teacher
{
    private String teacherName;
    
    public Teacher()
    {
        teacherName = "Default Teacher";
    }
    
    public String getTeacherName()
    {
        return teacherName;
    }
    
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Teacher t = new Teacher();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter name of Student 1: ");
        s1.setStudentName(sc.nextLine());
        System.out.print("Enter Grade of Student 1: ");
        s1.setStudentGrade(Double.parseDouble(sc.nextLine()));
        
        System.out.print("\nEnter name of Student 2: ");
        s2.setStudentName(sc.nextLine());
        System.out.print("Enter grade of Student 2: ");
        s2.setStudentGrade(Double.parseDouble(sc.nextLine()));
        
        System.out.println("\n--Student 1--");
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("Grade: " + s1.getStudentGrade());
        
        System.out.println("\n--Student 2--");
        System.out.println("Name: " + s2.getStudentName());
        System.out.println("Grade: " + s2.getStudentGrade());
        
        System.out.println("\n\nTeacher: " + t.getTeacherName());
    }
}