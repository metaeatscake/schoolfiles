import java.io.*;

public class ConsecutiveSums extends programFormat
{
    public static void main(String args[]) throws IOException
    {
        while(!menuChoice.equals("2"))
        {
            double sum = 0;

            System.out.println("\n--(Java Midterms: Set A, Number 4)--");
            System.out.println("Consecutive sums between two numbers");
            System.out.println("[1] Input");
            System.out.println("[2] Exit");

            System.out.print("\nEnter Choice: ");
            menuChoice = sc.nextLine();

            switch(menuChoice)
            {
                case "1":
                    System.out.print("\nEnter the first number: ");
                    doubleNum1 = obj.doubleInput();
                    System.out.print("Enter the second number: ");
                    doubleNum2 = obj.doubleInput();

                    if(doubleNum1 > doubleNum2)
                    {
                        for(double i = doubleNum1; i >= doubleNum2; i--)
                        {
                            sum += i;
                        }
                    }

                    else if(doubleNum1 < doubleNum2)
                    {
                        for(double i = doubleNum2; i >= doubleNum1; i--)
                        {
                            sum += i;
                        }
                    }

                    else
                    {
                        sum = doubleNum1;
                    }

                    System.out.println("\nAnswer: " + sum);
                    obj.pause();
                break;

                case "2": obj.goodbye(); break;
                default: obj.invalidInput();
            }
        }
    }
}