package Activity3;

import java.util.*;
import java.io.*;

class label
{
    public static void item1()
    {
        System.out.println("Problem Description: ");
        System.out.println("Compute for the sum, difference and product of two integers.");
        System.out.println("Determine whichever is the highest and display the computed");
        System.out.println("value of the highest and the remark 'Highest'");

        // Can't put label for two integer inputs
    }

    public static void item2()
    {
        System.out.println("Problem Description: ");
        System.out.println("Input an employee name, basic salary and no. of overtime hrs.");
        System.out.println("Computation is as follows: \n");

        System.out.println("\tGross pay = basic salay + overtime pay");
        System.out.println("\tOvertime pay/hr = 1% of basic salary");
        System.out.println("\tWithholding Tax = Gross pay * Tax Rate");
        System.out.println("\tNet pay = Gross pay - Withholding Tax");

        System.out.println("\nDisplay the employee name, position, gross pay, overtime pay,");
        System.out.println("withholding tax, and net pay.\n");

        System.out.println("Basic Salary\t\tPosition\t\tTax Rate");
        System.out.println("10,000-30,000\t\tRank&File\t\t10%");
        System.out.println("30,001-45,000\t\tManager\t\t15%");
        System.out.println("45,001-65,000\t\tVice-President\t\t18%");
        System.out.println("65,001+\t\tPresident\t\t20%");
    }

    public static void menuMain() 
    {
        System.out.println("\n----Converted C++ Activity 3 Menu----");
        System.out.println("[1] Item 1 | Exercise #1");
        System.out.println("[2] Item 2 | Exercise #2");
        System.out.println("[3] Exit");
    }

    public static void divider() 
    {
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------");
    }

    public static void pause() throws IOException 
    {
        System.out.println("\nPress Enter key to continue.");
        System.in.read();
    }

    public static void invalid() throws IOException 
    {
        System.out.println("\nInvalid Input");
        System.out.println("\nPress enter key to continue.");
        System.in.read();
    }

    public static void finish() 
    {
        System.out.println("\nGoodbye!\n");
    }
}

class process 
{
    public static String item1(int num1, int num2) 
    {
        int sum, diff, product;
        String chosenHighest;

        String highestA = "Highest: Sum";
        String highestB = "Highest: Difference";
        String highestC = "Highest: Product";
        String highestNull = "(No Process returned the absolute highest)";

        sum = num1 + num2;
        diff = Math.abs(num1 - num2);
        product = num1 * num2;

        if (sum > diff && sum > product) {
            chosenHighest = highestA;
        }

        else if (diff > sum && diff > product) {
            chosenHighest = highestB;
        }

        else if (product > sum && product > diff) {
            chosenHighest = highestC;
        }

        else {
            chosenHighest = highestNull;
        }

        return 
        (
            "\nSum = " + num1 + " + " + num2 + 
            "\nSum = " + sum + 
            "\n\nDifference = |" + num1 + " - " + num2 + "|" + 
            "\nDifference = " + diff + 
            "\n\nProduct = " + num1 + " * " + num2 + 
            "\nProduct = " + product + 
            "\n\n" + chosenHighest
        );
    }

    public static String item2(String employeeName, double basicSalary, double overtimeHours) 
    {
        double grossPay, overtimePayPerHour, withholdingTax, netPay, chosenTaxRate;
        String chosenPosition;

        String[] position = { "Rank & File", // [0]
                "Manager", // [1]
                "Vice President", // [2]
                "President" // [3]
        };

        double[] taxRate = { 0.1, // [0]
                0.15, // [1]
                0.18, // [2]
                0.2, // [3]
        };

        return ("lol");
    }
}

public class mainProgram 
{
    public static void main(String args[]) throws IOException
    {
        Scanner cin = new Scanner(System.in);

        boolean done = false;

        int menu, num1, num2;

        for (menu = 0; menu != 3;) 
        {
            label.divider();
            label.menuMain();

            System.out.print("\nEnter choice: ");
            menu = cin.nextInt();

            if (menu == 1)
            {
                label.divider();
                label.item1();

                System.out.print("\nEnter a value for num1: ");
                num1 = cin.nextInt();
                System.out.print("Enter a value for num2: ");
                num2 = cin.nextInt();

                System.out.println(process.item1(num1, num2));
                label.pause();
            }
            
        }
    }
}