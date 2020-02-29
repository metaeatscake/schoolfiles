import java.io.*;
import java.util.*;

public class extras
{
    // Call other classes
    private ZooAnimal zooanimal;
    private Cage cage;
    private ZooKeeper zookeeper;
    private JavaZoo zoo = new JavaZoo();

    // Scanner
    private Scanner sc = new Scanner(System.in);
    
    // Attributes
    private String menuChoice;
    private String exitKey;

    // To be used for Act 9 JavaZoo. just to have less code on the main.
    public extras(ZooAnimal zooanimal, Cage cage, ZooKeeper zookeeper)
    {
        this.zooanimal = zooanimal;
        this.cage = cage;
        this.zookeeper = zookeeper;

        this.exitKey = "5";
        this.menuChoice = "";
    }
    // More flexible ver.
    public extras()
    {
        this.exitKey = "5";
        this.menuChoice = "";
    }

    // Like the first constructor, but longer.
    public void setZooAnimal(ZooAnimal zooanimal)
    {
        this.zooanimal = zooanimal;
    }
    public void setCage(Cage cage)
    {
        this.cage = cage;
    }
    public void setZooKeeper(ZooKeeper zookeeper)
    {
        this.zookeeper = zookeeper;
    }
    
    // The usual.
    public void clearScreen() throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public void pause() throws IOException
    {
        System.out.println("\n------------------------");
        System.out.println("Press Enter to Continue.");
        System.out.println("------------------------\n");
        System.in.read();
    }
    
    public void printAnimal()
    {
        System.out.println("\n--------Animal Details--------");
        System.out.println("Name: " + zooanimal.getName());
        System.out.println("Type: " + zooanimal.getType());
        System.out.println("Age: " + zooanimal.getAge());
        System.out.println("Hungry: " + zooanimal.isHungry());
        System.out.println("-------------------------------");
    }
    
    public void printZooKeeper()
    {
        System.out.println("\n--------ZooKeeper Details--------");
        System.out.println("Name: " + zookeeper.getName());
        System.out.println("Title: " + zookeeper.getTitle());
        System.out.println("Pay Rate: " + zookeeper.getPayRate());
        System.out.println("Degree: " + zookeeper.hasDegree());
        System.out.println("-----------------------------------");
    }
    
    public void printCage()
    {
        System.out.println("\n--------Cage Details--------");
        System.out.println("Length: " + cage.getLength());
        System.out.println("Width: " + cage.getWidth());
        System.out.println("Height: " + cage.getHeight());
        System.out.println("Clean: " + cage.isClean());
        System.out.println("Covered: " + cage.isCovered());
        System.out.println("-------------------------------");
    }
    
    public void setMenuChoice(String menuChoice)
    {
        this.menuChoice = menuChoice;
    }
    public String getMenuChoice()
    {
        return this.menuChoice;
    }

    public void setExitKey(String exitKey)
    {
        this.exitKey = exitKey;
    }
    public String getExitKey()
    {
        return this.exitKey;
    }
    
    // The menu
    public void mainMenu() throws IOException, InterruptedException
    {
        while(!getMenuChoice().equals(getExitKey()))
        {
            clearScreen();
            zoo.printAll();
            
            System.out.println("---Zoo Menu---");
            System.out.println("[1] Feed");
            System.out.println("[2] Put To Sleep");
            System.out.println("[3] Clean Cage");
            System.out.println("[4] View All Information");
            System.out.println("[5] Exit");
            
            System.out.print("\nEnter Choice: ");
            try
            {
                setMenuChoice(sc.nextLine());
            }
            catch(Exception e)
            {
                // i don't know what error can break a string. even Enter is already caught.
                System.out.println("\nHow did you mess that up?");
            }
            
            choiceSelector(getMenuChoice());
        }
    }
    
    // Only for this class: Switch case for menuChoice
    // Each case could also be it's own method but for now, no.
    private void choiceSelector(String menuChoice) throws IOException, InterruptedException
    {
        switch(menuChoice)
        {
            case "1":

                // Disable feeding twice.
                if(zooanimal.isHungry() == true)
                {
                    // Animal will not eat if cage is dirty
                    if(cage.isClean() == false)
                    {
                        // Animal could go hungry without a covered cage.
                        if(cage.isCovered() == true)
                        {
                            zookeeper.uncoverCage();
                            cage.covered(false);
                        }
                        
                        zookeeper.feedAnimal();
                        zooanimal.eat();
                        cage.cleaned(false);
                        pause();
                    }
                    else
                    {
                        System.out.println("\nThe Cage is dirty.");
                        System.out.println(zooanimal.getName() + " can't eat!");
                    }
                }
                else
                {
                    System.out.println("\n" + zooanimal.getName() + " is already full.");

                    pause();
                }

            break;
            
            case "2":

                // Can't sleep if hungry.
                if(zooanimal.isHungry() == false)
                {
                    zooanimal.sleep();
                    zookeeper.coverCage();
                    cage.covered(true);
                    
                    pause();
                }

                else
                {
                    System.out.println("\n" + zooanimal.getName() + " is hungry.");
                    System.out.println("Please feed " + zooanimal.getName() + " first.");
                    pause();
                }

            break;
            
            case "3":

                // Only clean cage if it is dirty
                if(cage.isClean() == false)
                {
                    zookeeper.cleanCage();
                    cage.cleaned(true);
                    pause();
                }
                else
                {
                    System.out.println("\nThe cage is already clean!");
                    pause();
                }

            break;

            case "4":
                clearScreen();

                printAnimal();
                printCage();
                printZooKeeper();

                pause();

            break;

            case "5":

                System.out.println("\nGoodbye!");

            break;

            default:

                System.out.println("\nInvalid Input.");
                pause();
        }
    }
}