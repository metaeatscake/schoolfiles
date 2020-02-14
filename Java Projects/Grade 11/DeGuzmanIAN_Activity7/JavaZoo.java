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
    
    public static void main(String args[])
    {
        ZooAnimal myFirstAnimal = new ZooAnimal();
        Cage myFirstCage = new Cage();
        ZooKeeper myFirstZooKeeper = new ZooKeeper();
        JavaZoo myZoo = new JavaZoo();
        
        myZoo.printAll();
        
        myFirstAnimal.inputAll();
        myFirstCage.inputAll();
        myFirstZooKeeper.inputAll();
        
        myFirstAnimal.printAll();
        myFirstCage.printAll();
        myFirstZooKeeper.printAll();
    }
}