public class Student
{
    private String studentName;
    private double studentGrade;
    
    public Student()
    {
        studentName = "Default Man";
        studentGrade = 100;
    }
    
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    public void setStudentGrade(double grade)
    {
        this.studentGrade = grade;
    }
    
    public String getStudentName()
    {
        return this.studentName;
    }
    public double getStudentGrade()
    {
        return this.studentGrade;
    }
}