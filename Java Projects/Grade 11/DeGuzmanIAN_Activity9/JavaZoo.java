import java.io.*;
public class JavaZoo
{
    public static String zooName = "Java Park n Zoo";
    
    public JavaZoo()
    {
        // nothing.
    }
    
    public String getZooName()
    {
        return zooName;
    }
    
    public void printAll()
    {
        System.out.println("\nWelcome to " + getZooName() + "!");
    }
    
    public static void main(String args[]) throws InterruptedException, IOException
    {
        // Given
        ZooAnimal chip = new ZooAnimal("Chip", "Brown Monkey", 5, false);
        Cage cage = new Cage(15,20,15,false,false);
        ZooKeeper jackson = new ZooKeeper("Jackson Rock", "ZooKeeper", 15, false);
        
        // The whole menu is offloaded to this object
        extras utils = new extras(chip, cage, jackson);
        
        utils.mainMenu();

    }
}