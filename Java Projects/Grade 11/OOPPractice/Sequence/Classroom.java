public class Classroom extends Student
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.idNumber = "2019-0035";
        s1.firstName = "John Thompson";
        s1.lastName = "Oppa";
        s1.gradeLevel = "11";
        s1.course = "CPROG";
        
        s2.idNumber = "2019-0018";
        s2.firstName = "Al";
        s2.lastName = "Niemo";
        s2.gradeLevel = "11";
        s2.course = "69";
        
        s1.introduce();
        System.out.println(s1.toString());
        
        System.out.println("\n");
        
        s2.introduce();
        System.out.println(s2.toString());
    }
}