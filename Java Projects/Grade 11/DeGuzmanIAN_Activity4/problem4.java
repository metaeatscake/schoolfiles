import java.io.*;

public class problem4 extends processes
{
    public static void main(String args[]) throws IOException, InterruptedException
    {
        obj.problemNumber = "Item 4";
        
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
                obj.item4();
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
