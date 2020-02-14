public class Department
{
    private int departmentId;
    private String departmentName;
    private String departmentDesc;
    private Employee employee;
    
    public Department(int departmentId, String departmentName, String departmentDesc)
    {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentDesc = departmentDesc;
    }

    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }

    public void viewDepartmentDetails()
    {
        System.out.println("\n---Department Details---");
        System.out.println("Department ID: " + this.departmentId);
        System.out.println("Department Name: " + this.departmentName);
        System.out.println("Department Description: " + this.departmentDesc);
    }

    public void viewEmployeeDetails()
    {
        System.out.println("\n---Employee Details---");
        System.out.println("ID Number: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Email: " + employee.getEmployeeEmail());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Gross Salary: " + employee.computeGrossSalary(employee.getHoursWorked()));
    }
}