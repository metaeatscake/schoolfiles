import java.util.*;
public class Employee
{
    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private double basicSalary;
    private int hoursWorked;
    private double grossSalary;
    
    public Employee(int employeedId, String employeeName, String employeeEmail,
        double basicSalary)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.basicSalary = basicSalary;
    }
    
    public void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    
    public int getEmployeeId()
    {
        return this.employeeId;
    }
    public String getEmployeeName()
    {
        return this.employeeName;
    }
    public String getEmployeeEmail()
    {
        return this.employeeEmail;
    }
    public double getBasicSalary()
    {
        return this.basicSalary;
    }
    public double getHoursWorked()
    {
        return this.hoursWorked;
    }
    
    public double computeGrossSalary(int hrsWorked)
    {
        return hrsWorked * basicSalary;
    }
}