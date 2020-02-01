import java.io.*;

public class Factorial extends programFormat
{

    public static void main(String args[]) throws IOException
    {
        while(!menuChoice.equals("2"))
        {
            double factorial = 1;

            obj.clearScreen();
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

                    for(int i = doubleNum1; i > 0; i--)
                    {
                        factorial *= i;
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