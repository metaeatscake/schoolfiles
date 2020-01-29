import java.util.*;
import java.io.*;

public class processes
{
    public static Scanner sc = new Scanner(System.in);

    // Everything below will be called through this object
    public static processes obj = new processes();
    
    public String problemNumber = "";
    
    public void menuFormat()
    {
        System.out.println("Activity 4, " + problemNumber);
        System.out.println("[1] Proceed to the problem");
        System.out.println("[2] Exit");
    }
    
    public void item1()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Input two integers.");
        System.out.println("Sum up all the numbers between the two integers");
        System.out.println("Display the total sum");
        System.out.println("note: negative inputs are treated as positive.");
        
        int num1, num2, ctr, holder, answer = 0;
        
        System.out.print("\nEnter a value for num1: ");
        num1 = Math.abs(Integer.parseInt(sc.nextLine()));
        
        System.out.print("Enter a value for num2: ");
        num2 = Math.abs(Integer.parseInt(sc.nextLine()));
        
        if(num1 > num2)
        {
            holder = num1;
            for(ctr = num2; ctr <= num1; ctr++)
            {
                answer += holder;
                holder--;
            }
        }
        
        else if(num2 > num1)
        {
            holder = num2;
            for(ctr = num1; ctr <= num2; ctr++)
            {
                answer += holder;
                holder--;
            }
        }
        
        else
        {
            answer = 0;
        }
        
        System.out.println("\nAnswer: " + answer);
    }
    
    public void item2()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Create a program that will input the number of seconds");
        System.out.println("and equivalent no. of hours, minutes and seconds.");
        System.out.println("Negative value is invalid and should loop back");
        
        int secondsInput, hours, minutes, secondsOutput;
        String timeFormat;
        
        System.out.print("\nEnter number of seconds: ");
        secondsInput = Integer.parseInt(sc.nextLine());
            
        if(secondsInput < 0)
        {
            while(secondsInput < 0)
            {
                System.out.print("Enter a POSITIVE number of seconds: ");
                secondsInput = Integer.parseInt(sc.nextLine());
            }
        }
              
        hours = (secondsInput / 3600);
        minutes = (secondsInput % 3600) / 60;
        secondsOutput = secondsInput % 60;
        
        // String.format, as I found in stackOverflow yay
        // https://stackoverflow.com/questions/6118922/convert-seconds-value-to-hours-minutes-seconds
        timeFormat = String.format("%02d:%02d:%02d", hours, minutes, secondsOutput);
        
        System.out.println("\nGiven amount of seconds: " + secondsInput);
        System.out.println("Converted time(hrs:mins:sec): (" + timeFormat + ")"); 
        
    }
    
    public void item3()
    {
        System.out.println("\nDescription of the Problem: ");
        System.out.println("Input two integers. Do a multiplication process without the *");
        System.out.println("Operator. Output the result");
        
        int ctr;
        double multiplier, multiplicand, product = 0;
        
        System.out.print("\nEnter multiplicand: ");
        multiplicand = Double.parseDouble(sc.nextLine());
        System.out.print("Enter multiplier: ");
        multiplier = Double.parseDouble(sc.nextLine());
        
        // If multiplier is negative, the for loop breaks.
        // So the negative is moved to the multiplicand.
        if(multiplier < 0)
        {
            multiplier = Math.abs(multiplier);
            multiplicand *= -1;
        }
        
        for(ctr = 0; ctr < multiplier; ctr++)
        {
            product += multiplicand;
        }
        
        System.out.print("\nProduct: " + product);
    }
    
    public void item4()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Create a program that will ask for an odd number,");
        System.out.println("determine and display whether the number is divisible");
        System.out.println("by 3. Even numbers are not valid and should loop back");
        System.out.println("to the input process.");
        
        double num;
        
        System.out.print("\nEnter a number: ");
        num = Double.parseDouble(sc.nextLine());
        
        while(num % 2 == 0)
        {
            System.out.print("Enter an ODD number: ");
            num = Double.parseDouble(sc.nextLine());
        }
        
        if(num % 3 == 0)
        {
            System.out.println("This number is divisible by 3");
        }
        
        else
        {
            System.out.println("This number is not divisible by 3");
        }
    }
    
    public void clearScreen(String... arg) throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    
    public void pause() throws IOException
    {
        System.out.print("\nPress enter key to continue.");
        System.in.read();
    }
    
    public void divider()
    {
        System.out.println("\n----------------------------------------------------------------------\n");
    }
}