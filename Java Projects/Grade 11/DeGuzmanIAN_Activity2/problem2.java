import java.io.*;
import java.util.*;

public class problem2 extends processes
{
    public static void main(String args[]) throws IOException, InterruptedException
    {
        int i = 0;

        for(i = 0; i != 2;)
        {
            problem2.clearScreen();

            System.out.println("Java Activity 2, Item 2");
            System.out.println("[1] Proceed to the problem");
            System.out.println("[2] Exit");
            System.out.print("\nEnter choice: ");
            i = sc.nextInt();

            if(i < 1 || i > 2)
            {
                System.out.println("\n\nInvalid Input.");
                problem2.pause();
            }

            else if (i == 1)
            {
                problem2.clearScreen();
                problem2.item2();
                problem2.pause();
            }

            else
            {
                System.out.println("\nGoodbye!");
            }
        }
    }
}