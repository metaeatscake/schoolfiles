import java.io.*;

public class problem1 extends processes
{
    public static void main(String args[]) throws IOException, InterruptedException
    {
        obj.problemNumber = "Item 1";
        
        String choice = "";

        while(!choice.equals("2"))
        {
            obj.clearScreen();
            obj.menuFormat();

            System.out.print("\nEnter choice: ");
            choice = sc.nextLine();

            if(choice.equals("1"))
            {
                obj.clearScreen();
                obj.item1();
                obj.pause();
            }

            else if(choice.equals("2"))
            {
                System.out.println("\nGoodbye!");
            }

            else
            {
                System.out.println("\nInvalid Input.");
                obj.pause();
            }
        }
    }
}
