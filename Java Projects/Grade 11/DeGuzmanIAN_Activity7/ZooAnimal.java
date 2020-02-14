import java.util.*;
public class ZooAnimal
{
    private String name;
    private String type;
    private int age;
    private boolean hungry;
    
    private static Scanner sc = new Scanner(System.in);
    
    public ZooAnimal()
    {
        this.name = "";
        this.type = "";
        this.age = 0;
        this.hungry = false;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public String getName()
    {
        return this.name;
    }
    public String getType()
    {
        return this.type;
    }
    public int getAge()
    {
        return this.age;
    }
    public boolean isHungry()
    {
        return this.hungry;
    }
    
    // Extra custom method. it's too annoying to output on main
    public void printAll()
    {
        // Name, type, age, hungry
        System.out.println("\n---Zoo Animal Details---");
        System.out.println("Animal Name: "+ getName());
        System.out.println("Animal Type: "+ getType());
        System.out.println("Animal Age: " + getAge());
        System.out.println("Hungry: " + isHungry());
    }
    public void inputAll()
    {
        System.out.println("\n---Zoo Animal Setup---");
        System.out.print("Give your animal a name: ");
        setName(sc.nextLine());
        System.out.print("Enter animal type: ");
        setType(sc.nextLine());
        System.out.print("Enter animal age: ");
        setAge(Integer.parseInt(sc.nextLine()));
    }
}