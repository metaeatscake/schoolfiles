import java.io.*;

public class Factorial extends programFormat
{

    public static void main(String args[]) throws IOException
    {
        while(!menuChoice.equals("2"))
        {
            double factorial = 1;
            double holder = 0;

            System.out.println("\n--(Java Midterms: Set A, Number 3)--");
            System.out.println("Factorial Calculator");
            System.out.println("[1] Input");
            System.out.println("[2] Exit");

            System.out.print("Enter choice: ");
            menuChoice = sc.nextLine();

            switch(menuChoice)
            {
                case "1":
                    System.out.print("\nEnter a number: ");
                    doubleNum1 = obj.doubleInput();
                    
                    holder = Math.abs(doubleNum1);
                    for(double i = holder; i > 0; i--)
                    {
                        factorial *= i;
                    }
                    
                    // If the input is positive, do nothing.
                    // For negatives, the process is the same but the output is changed.
                    // If the input is odd, the factorial output is negative.
                    // If the input is even, the factorial output is positive.
                    
                    if(doubleNum1 < 0 && doubleNum1 % 2 != 0)
                    {
                        factorial *= -1;
                    }

                    System.out.println("\nAnswer: " + factorial);

                    obj.pause();
                break;

                case "2": obj.goodbye(); break;
                default: obj.invalidInput();
            }
        }
    }
}