import java.util.*;
public class ZooKeeper
{
    private String name;
    private String title;
    private double payRate;
    private boolean degree;
    
    //private static Scanner sc = new Scanner(System.in);
    
    public ZooKeeper()
    {
        this.name = "";
        this.title = "";
        this.payRate = 0;
        this.degree = false;
    }
    public ZooKeeper(String name, String title, double payRate, boolean degree)
    {
        this.name = name;
        this.title = title;
        this.payRate = payRate;
        this.degree = degree;
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
    
    public void feedAnimal()
    {
        System.out.println(this.name + " is feeding an animal...");
    
    }
    public void coverCage()
    {
        System.out.println(this.name + " is covering the cage...");
    }
    public void uncoverCage()
    {
        System.out.println(this.name + " is uncovering the cage...");
    }
    public void cleanCage()
    {
        System.out.println(this.name + " is cleaning the cage...");
    }
    
}