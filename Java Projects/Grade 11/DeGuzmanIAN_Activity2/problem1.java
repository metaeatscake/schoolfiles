import java.io.*;
import java.util.*;

public class problem1 extends processes
{
    public static void main(String args[]) throws IOException, InterruptedException
    {
        int i = 0;

        for(i = 0; i != 2;)
        {
            problem1.clearScreen();

            System.out.println("Java Activity 2, Item 1");
            System.out.println("[1] Proceed to the problem");
            System.out.println("[2] Exit");
            System.out.print("\nEnter choice: ");
            i = sc.nextInt();

            if(i < 1 || i > 2)
            {
                System.out.println("\n\nInvalid Input.");
                problem1.pause();
            }

            else if (i == 1)
            {
                problem1.clearScreen();
                problem1.item1();
                problem1.pause();
            }

            else
            {
                System.out.println("\nGoodbye!");
            }
        }
    }
}