import java.util.*;
public class ZooKeeper
{
    private String name;
    private String title;
    private double payRate;
    private boolean degree;
    
    private static Scanner sc = new Scanner(System.in);
    
    public ZooKeeper()
    {
        this.name = "";
        this.title = "";
        this.payRate = 0;
        this.degree = false;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }
    public void setDegree(boolean degree)
    {
        this.degree = degree;
    }
    
    public String getName()
    {
        return this.name;
    }
    public String getTitle()
    {
        return this.title;
    }
    public double getPayRate()
    {
        return this.payRate;
    }
    public boolean hasDegree()
    {
        return this.degree;
    }
    
    // extra
    public void printAll()
    {
        // Name, title, payrate, degree
        System.out.println("\n---ZooKeeper Details---");
        System.out.println("ZooKeeper Name: " + getName());
        System.out.println("ZooKeeper Title: " + getTitle());
        System.out.println("ZooKeeper Pay Rate: " + getPayRate());
        System.out.println("Zookeeper Degree: " + hasDegree());
    }
    public void inputAll()
    {
        System.out.println("\n---ZooKeeper Setup---");
        System.out.print("Enter ZooKeeper Name: ");
        setName(sc.nextLine());
        System.out.print("Enter ZooKeeper Title: ");
        setTitle(sc.nextLine());
        System.out.print("Enter ZooKeeper Pay Rate: ");
        setPayRate(Double.parseDouble(sc.nextLine()));
        System.out.print("Does Zookeeper have a degree? (true/false): ");
        setDegree(Boolean.parseBoolean(sc.nextLine()));
    }
}