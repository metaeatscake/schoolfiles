package Activity3;

import java.util.*;
import java.io.*;

class universal
{
    static Scanner sc = new Scanner(System.in);
    //static universal univ = new universal();

    void clearScreen() throws InterruptedException, IOException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    void pause() throws IOException
    {
        System.out.println("\nPress the Enter key to continue.");
        System.in.read();
    }

    void invalidInput()
    {
        System.out.println("\nInvalid Input.");
    }

    void goodbye() // kind of unnecessary
    {
        System.out.println("\nGoodbye!");
    }

    int intInput()
    {
        return Integer.parseInt(sc.nextLine());
    }

    double doubleInput()
    {
        return Double.parseDouble(sc.nextLine());
    }

    void desci1()
    {
        System.out.println("Activity 3, Item 1");
        System.out.println("Problem description: ");
        System.out.println("Compute for the sum, difference and product of two integers.");
        System.out.println("Determine whichever is the highest and display the computed");
        System.out.println("value of the highest with the remark 'Highest'\n");
    }

    void desci2()
    {
        System.out.println("Activity 3, Item 2");
        System.out.println("Problem description: ");
        System.out.println("Input an employee name, basic salary, and no. of overtime hours");
        System.out.println("Computation is as follows: ");
        System.out.println("\tGross Pay = Basic Salary + Overtime pay");
        System.out.println("\tOvertime pay/hr = 1% of basic salary");
        System.out.println("\tWithholding tax = gross pay * tax rate");
        System.out.println("\tNet pay = gross pay - withholding tax");
        System.out.println("Display the employee name, position, gross pay, overtime pay,");
        System.out.println("withholding tax and net pay.");
        System.out.println("\tBasic Salary\tPosition\tTax Rate");
        System.out.println("\t10,000-30,000\tRank&File\t10%");
        System.out.println("\t30,001-45,000\tManager\t15%");
        System.out.println("\t45,001-65,000\tVice Pres\t18%");
        System.out.println("\tAbove 65,000\tPresident\t20%\n");
    }

    void menu()
    {
        System.out.println("--------C++ Activity 3 Converted to Java--------");
        System.out.println("------------------------------------------------");
        System.out.println("[1][i1] Slide 18: Compare Sum, Diff and Products");
        System.out.println("[2][i2] Slide 19: Employee Gross Pay Calculator ");
        System.out.println("[3] Exit");

        System.out.println("\nEnter choice: ");
    }


}
