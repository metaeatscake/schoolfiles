import java.io.*;
import java.util.*;
import java.util.stream.*;

public class ATM extends programFormat
{

    // Edit this to change acceptable withdrawal amounts
    static double acceptedWithdraw[] = 
    {
        200,
        300,
        500,
        1000
    };
    

    // Edit this to change acceptable deposit amounts
    static double acceptedDeposit[] = 
    {
        500,
        1000,
        2000,
        5000,
        10000
    };

    static int[] validWithArray(final double input, final double balance) 
    {
        int condition1 = 0;
        int condition2 = 0;
        int condition3 = 0;
        int condition4 = 0;

        // Negative check: Input has to be positive
        if (input > 0) 
        {
            condition1 = 1;
        }

        // Zero check: Input cannot be zero
        if (input != 0) 
        {
            condition2 = 1;
        }

        // Exceeding limit check: Input cannot exceed balance
        if (input <= balance) 
        {
            condition3 = 1;
        }

        // Acceptable amount check: Input has to be a printable amount.
        if (DoubleStream.of(acceptedWithdraw).anyMatch(x -> x == input)) 
        {
            condition4 = 1;
        }

        // In the input process, check if any of these contain a false.
        // if there is one false, it is invalid.
        return new int[] { condition1, condition2, condition3, condition4 };
    }

    // Same as the method above.
    static int[] validDepArray(final double input, final double balance) 
    {
        int condition1 = 0;
        int condition2 = 0;
        int condition3 = 0;

        if (input > 0)
        {
            condition1 = 1;
        }

        if (input != 0) 
        {
            condition2 = 1;
        }

        if (DoubleStream.of(acceptedDeposit).anyMatch(x -> x == input)) 
        {
            condition3 = 1;
        }

        return new int[] { condition1, condition2, condition3 };
    }

    public static void main(final String args[]) throws IOException, InterruptedException, NullPointerException 
    {
        // Starting balance for this account
        double balance = 10000;

        while (!menuChoice.equals("4")) 
        {
            obj.clearScreen();
            double input = 0;

            System.out.println("--(Midterms: Java Set B, Number 1)--");
            System.out.println("ATM Machine (Invalids denied and returns to menu.)");

            System.out.println("\nCurrent Balance: " + balance + "\n");

            System.out.println("[1]Withdraw");
            System.out.println("[2]Deposit");
            System.out.println("[3]View Balance");
            System.out.println("[4]Exit");

            System.out.print("\nEnter choice: ");
            menuChoice = sc.nextLine();

            switch (menuChoice) 
            {
                case "1":
                    obj.clearScreen();

                    System.out.println("--Withdrawal Menu--\n");
                    System.out.println("Supported Amounts:");
                    System.out.println(Arrays.toString(acceptedWithdraw));

                    System.out.print("\nEnter amount to withdraw: ");
                    input = obj.doubleInput();

                    System.out.println("\n");

                    // Insert the method to a local array variable.
                    final int withdrawArray[] = validWithArray(input, balance);

                    // If there is one false(0) in the array, the input is invalid.
                    if (IntStream.of(withdrawArray).anyMatch(x -> x == 0)) 
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("No amount was deducted from your balance");
                        System.out.println("Possible reasons why the input was invalid:");
                        System.out.println("--Entering a negative value");
                        System.out.println("--Entering only 0");
                        System.out.println("--Entering an amount exceeding your balance");
                        System.out.println("--Entering an amount unsupported by the ATM");

                        obj.pause();
                    }

                    // If it does not contain a false(0), it is valid.
                    else 
                    {
                        System.out.println("Transaction Accepted.");
                        System.out.println(input + " was deducted from your balance.");

                        balance -= input;

                        obj.pause();
                    }
                break;

                case "2":

                    obj.clearScreen();

                    System.out.println("--Deposit Menu--\n");
                    System.out.println("Supported Amounts:");
                    System.out.println(Arrays.toString(acceptedDeposit));

                    System.out.print("\nEnter amount to deposit: ");
                    input = obj.doubleInput();

                    System.out.println("\n");

                    final int depositArray[] = validDepArray(input, balance);

                    if(IntStream.of(depositArray).anyMatch(x -> x == 0))
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("No amount has been added to your balance.");
                        System.out.println("Possible reasons why your input was invalid:");
                        System.out.println("--Entering a negative input");
                        System.out.println("--Entering only 0");
                        System.out.println("--Entering an amount unsupported by the ATM");

                        obj.pause();
                    }

                    else
                    {
                        System.out.println("Transaction Accepted.");
                        System.out.println(input + " has been added to your balance.");

                        balance += input;

                        obj.pause();
                    }

                break;

                case "3": 
                    obj.clearScreen();
                    
                    System.out.println("--Balance--");
                    System.out.println("\nCurrent Balance: " + balance);

                    obj.pause();
                break;

                case "4": 
                    obj.goodbye();
                break;

                default:
                    obj.invalidInput();
                break;
            }

        }

    }

}