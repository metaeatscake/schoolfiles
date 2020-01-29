import java.io.*;
import java.util.*;

public class problem5 extends processes
{
    public static void main(String args[]) throws IOException, InterruptedException
    {
        int i = 0;

        for(i = 0; i != 2;)
        {
            problem5.clearScreen();

            System.out.println("Java Activity 2, Item 5");
            System.out.println("[1] Proceed to the problem");
            System.out.println("[2] Exit");
            System.out.print("\nEnter choice: ");
            i = sc.nextInt();

            if(i < 1 || i > 2)
            {
                System.out.println("\n\nInvalid Input.");
                problem5.pause();
            }

            else if (i == 1)
            {
                problem5.clearScreen();
                problem5.item5();
                problem5.pause();
            }

            else
            {
                System.out.println("\nGoodbye!");
            }
        }
    }
}