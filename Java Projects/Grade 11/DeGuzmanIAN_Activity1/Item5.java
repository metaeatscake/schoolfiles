import java.util.Scanner;
import java.io.IOException;

// Applying everything from Item4 and earlier, and changing some formatting.
// Code logic taken from midterms code last sem

public class Item5
{
    public String process(int in)
    {
        int firstValue, oneThousand, fiveHundred, twoHundred, oneHundred, fifty, twenty, ten, five, one;
        
        firstValue = in; // Because I want the label "Showing denomination of: ", and to test Math.abs();
        
        oneThousand = in / 1000;
        in %= 1000;
        
        fiveHundred = in / 500;
        in %= 500;
        
        twoHundred = in / 200;
        in %= 200;
        
        oneHundred = in / 100;
        in %= 100;
        
        fifty = in / 50;
        in %= 50;
        
        twenty = in / 20;
        in %= 20;
        
        ten = in / 10;
        in %= 10;
        
        five = in / 5;
        in %= 5;
        
        one = in;
        
        return
        (
            "Showing the denomination of: " + firstValue + 
            "\n1000: " + oneThousand + 
            "\n500: " + fiveHundred + 
            "\n200: " + twoHundred + 
            "\n100: " + oneHundred + 
            "\n50: " + fifty + 
            "\n20: " + twenty + 
            "\n10: " + ten + 
            "\n5: " + five + 
            "\n1: " + one
        );
    }
    
    public void pause() throws IOException
    {
        System.out.print("\nPlease press enter to continue");
        System.in.read();
    }
    
    public void exit()
    {
        System.out.print("\nGoodbye!");
    }
    
    public static void main(String []args) throws IOException
    {
        Scanner cin = new Scanner(System.in);
        Item5 cout = new Item5();
        
        // Menu choice - looped so that the program can be repeatedly tested.
        int choice = 0;
        
        // Declare input
        int input = 0;
        // Description of problem, only shown once.
        System.out.println("(Description of the Problem)");
        System.out.println("Input a positive integer as money amount.");
        System.out.println("Separate the input value into number of bills/coins from 1000, 500, 200, 100, 50, 20, 10, 5, and 1.");
        System.out.println("---------------------------------------------------------------------------------------------------\n");
        
        for(choice = 0; choice != 2;)
        {
            System.out.println("\nMoney Denomination Program Menu");
            System.out.println("[1] Enter a value");
            System.out.println("[2] Exit");
            System.out.print("\nEnter choice: ");
            choice = cin.nextInt();
            
            if(choice == 1)
            {
                input = 0;
            
                System.out.print("\nEnter amount: ");
                input = Math.abs(cin.nextInt()); // Remove negative from input.
            
                System.out.println("\n-----------------------------------------------");
                System.out.println(cout.process(input));
                System.out.println("-----------------------------------------------\n");
                cout.pause();
                
            }
            
            else{
                cout.exit();
            }
        }
    }
}