public class ZooAnimal
{
    private String name;
    private String type;
    private int age;
    private boolean hungry;
    
    public ZooAnimal()
    {
        this.name = "";
        this.type = "";
        this.age = 0;
        this.hungry = false;
    }
    public ZooAnimal(String name, String type, int age, boolean hungry)
    {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hungry = hungry;
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
    
    public void sleep()
    {
        System.out.println(this.name + " is sleeping...");
        this.hungry = true;
    }
    public void eat()
    {
        System.out.println(this.name + " is eating...");
        this.hungry = false;
    }
    
    
}