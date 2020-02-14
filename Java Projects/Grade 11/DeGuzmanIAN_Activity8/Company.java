import java.util.*;
public class Company
{
    private String companyName;
    private String companyLocation;

    public Company()
    {
        this.companyName = "CodingCorps";
        this.companyLocation = "Far, far away";
    }

    public static void main(String args[])
    {
        Employee mp = new Employee(177013, "Bezos", "notAScam.atAll@amazon.com", 200);
        Department dp = new Department(69, "Nice Human Resources", "We do stuff");
        Company comp = new Company();

        Scanner sc = new Scanner(System.in);

        dp.setEmployee(mp);

        System.out.println("\n---Company Details---");
        System.out.println("Name: " + comp.companyName);
        System.out.println("Location: " + comp.companyLocation);

        System.out.print("\nEnter the hours worked by the employee: ");
        mp.setHours(Integer.parseInt(sc.nextLine()));

        dp.viewDepartmentDetails();
        dp.viewEmployeeDetails();
    }
}