import java.io.*;
import java.util.*;

// A case for multi-level inheritance.
// even if it's not being used properly.
public class universal
{
    public static universal ins = new universal();
    public static Scanner sc = new Scanner(System.in);
    
    public String methodType = "";
    public String menuchoice = "";

    // https://stackoverflow.com/questions/2979383/java-clear-the-console
    public void clearScreen(String... arg) throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    // I'm too lazy to type this whole thing out.
    public int scanInt()
    {
        return Integer.parseInt(sc.nextLine());
    }

    public double scanDouble()
    {
        return Double.parseDouble(sc.nextLine());
    }

    public void pause() throws IOException
    {
        System.out.println("\nPress Enter key to continue.");
        System.in.read();
    }

    public void dividerLine()
    {
        System.out.println("\n--------------------------------------------------------------------------------------\n");
    }

    public void menu()
    {
        System.out.println("\nActivity 5 Menu");
        System.out.println("--Method Type [" + methodType + "]--");
        System.out.println("[1] Item 1: Comparing three numbers");
        System.out.println("[2] Item 2: Net Pay with Overtime Bonus");
        System.out.println("[3] Item 3: Final Grade with Remarks");
        System.out.println("[4] Item 4: Course Title, Enrollees and Remark");
        System.out.println("[5] Item 5: Separation Pay");
        System.out.println("[6] Exit Program");
    }

    public void goodbye()
    {
        System.out.println("\nGoodbye!");
    }

    public void invalidInput() throws IOException
    {
        System.out.println("\nInvalid Input.");
        dividerLine();
        pause();
    }

    public void desc1()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Create a program that will input three values and will test which of the three is the highest");
        System.out.println("Print the value and remark 'Highest'.");
        System.out.println("Assume that there will be no equal values entered.");
    }

    public void desc2()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Create a program that will input the number of hours worked by an employee,");
        System.out.println("their hourly rate, and the total deductions");
        System.out.println("Compute and print the net pay of the employee.");
        System.out.println("Assume that time-and-a-half is paid to any employee for those hours worked");
        System.out.println("over 40 hours but not greater than 50 hours.");
        System.out.println("If the employee worked for more than 50 hours, he gets double time for those");
        System.out.println("hours plus 10 hours of time-and-a-half and forty times the regular rate for");
        System.out.println("the first 40 hours.");
    }

    public void desc3()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Input ratings for midterm and final exams.");
        System.out.println("Compute the grade, where the grade is equal to 40% of midterm and 60% of final.");
        System.out.println("Output the grade and the corresponing remark:");
        System.out.println("Grade\t\tRemark");
        System.out.println("91-100\t\tExcellent");
        System.out.println("81-90\t\tGood");
        System.out.println("71-80\t\tFair");
        System.out.println("61-70\t\tPass");
        System.out.println("Below 61\tFail");
    }

    public void desc4()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Input the course title and the number of enrollees.");
        System.out.println("Output the corresponding remark based on the following: ");
        System.out.println("Number of enrollees\tRemark");
        System.out.println("3 and below        \tDissolved");
        System.out.println("4-9                \tOpen");
        System.out.println("10                 \tClosed");
        System.out.println("Above 10           \tInvalid");
    }

    public void desc5()
    {
        System.out.println("Description of the Problem:");
        System.out.println("Input the employee name, basic salary, and the length of service in years.");
        System.out.println("Compute for the separation pay as follows:");
        System.out.println("Length of Service(years)\t\t\tSeparation Pay");
        System.out.println("5 and below\t\t\t1.5 of salary * lenght of service");
        System.out.println("Above 5 to 10\t\t\t2.0 of salary * lenght of service");
        System.out.println("Above 10 to 15\t\t\t2.5 of salary * length of service");
        System.out.println("Above 15\t\t\t3.0 of salary * length of service");
    }
}