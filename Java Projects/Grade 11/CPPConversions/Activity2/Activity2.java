package Activity2;

import java.util.*;
import java.io.*;

     //=============//
    // Label Class //
   //=============//

class problemDescriptions
{
    public void pause() throws IOException
    {
        System.out.println("\nPress enter key to continue.");
        System.in.read();
    }

    public void divider()
    {
        System.out.println("\n-------------------------------------------------------------------------------------------------------------");
    }

    public void invalid() throws IOException
    {
        System.out.println("\nInvalid Input");
        System.out.println("\nPress enter key to continue.");
        System.in.read();
    }

    public void finish()
    {
        System.out.println("\nGoodbye!\n");
    }

    public void item1()
    {
        System.out.println("\nProblem Description:\n");
        System.out.println("Design a (program) that will determine if the input is positive, negative, or zero");

        System.out.print("\nEnter a number: ");
    }

    public void item2()
    {
        System.out.println("\nProblem Description:\n");
        System.out.println("Design a (program) that will ask for an age and display the respective remarks as follows: ");
        System.out.println("Age\tRemarks");
        System.out.println("1-2\tBaby");
        System.out.println("3-4\tToddler");
        System.out.println("5-9\tKid");
        System.out.println("10-12\tAdolescent");
        System.out.println("13-19\tTeenager");
        System.out.println("20-25\tYoung Adult");
        System.out.println("26+\tAdult");

        System.out.print("\nEnter age: ");
    }

    public void item3()
    {
        System.out.println("\nProblem Description:\n");
        System.out.println("Design a (program) that will determine the number of digits from an integer input.");
        System.out.println("Assume that the maximum number of digits is 6.");

        System.out.print("\nEnter a number: ");
    }

    public void item4()
    {
        System.out.println("\nProblem Description:\n");
        System.out.println("Design a flowchart that will determine the total cell phone bill as follows");
        System.out.println("\t...a fixed rate of 500.00 with free 20 minute airtime and 500 worth of text");
        System.out.println("\t...an additional charge of 6.00 per min in excess of 20 minutes");
        System.out.println("\t...an additional charge of 1.00 per text in excess of 500 texts");

        // Putting the input label in this class doesn't work if you're asking for two inputs.
    }

    public void menuMain()
    {
        System.out.println("\n----Converted C++ Activity 2 Menu----");
        System.out.println("[1] Item 1 | Sample #1");
        System.out.println("[2] Item 2 | Sample #2");
        System.out.println("[3] Item 3 | Sample #3");
        System.out.println("[4] Item 4 | Sample #4");
        System.out.println("[5] Exit");

        System.out.print("\nEnter Choice: ");
    }
}

     //===============//
    // Process Class //
   //===============//

class selection
{
    public String item1(double input)
    {
        String state1 = "Positive";
        String state2 = "Negative";
        String state3 = "Zero";

        String chosenState;

        if (input > 0)
        {
            chosenState = state1;
        }

        else if (input < 0)
        {
            chosenState = state2;
        }

        else
        {
            chosenState = state3;
        }

        return("\nThe number " + input + " is " + chosenState);
    }

    public String item2(double age)
    {
        String[] Remarks = 
        {
            "Baby",         // [0]
            "Toddler",      // [1]
            "Kid",          // [2]
            "Adolescent",   // [3]
            "Teenager",     // [4]
            "Young Adult",  // [5]
            "Adult"         // [6]
        };

        String chosenRemark;

        if(age >= 1 && age <= 2)
        {
            chosenRemark = Remarks[0];
        }

        else if (age >= 3 && age <= 4)
        {
            chosenRemark = Remarks[1];
        }

        else if (age >= 5 && age <= 9)
        {
            chosenRemark = Remarks[2];
        }

        else if (age >= 10 && age <= 12)
        {
            chosenRemark = Remarks[3];
        }

        else if (age >= 13 && age <= 19)
        {
            chosenRemark = Remarks[4];
        }

        else if (age >= 20 && age <= 25)
        {
            chosenRemark = Remarks[5];
        }

        else if (age <= 0)
        {
            chosenRemark = "[Invalid]";
        }

        else
        {
            chosenRemark = Remarks[6];
        }

        return("\nThe given age " + age + " is considered as '" + chosenRemark + "'");
    }

    public String item3(int input)
    {
        int length = String.valueOf(Math.abs(input)).length();

        int limit = 6;

        if(length <= limit)
        {
            return("\nThe amount of digits in the number " + input + " is " + length);
        }

        else
        {
            return("\nThere is too many digits in the number " + input);
        }

        /* Code without the given limit

        return
        (
            "Given number: " + input +
            "\nNumber of digits: " + length
        );

        */

    }

    public String item4(double call, double text)
    {
        double fixedText = 500;
        double fixedCall = 20;

        double excessText, excessCall, phoneBill;

        excessText = text - fixedText;
        excessCall = call - fixedCall;

        if(call <= 20)
        {
            if(text <= 500)
            {
                phoneBill = 500;
            }

            else
            {
                phoneBill = 500 + excessText;
            }
        }

        else
        {
            if(text <= 500)
            {
                phoneBill = 500 + (excessCall * 6);
            }

            else
            {
                phoneBill = 500 + (excessCall * 6) + excessText;
            }

        }

        return("\nYour phone bill is: " + phoneBill);
    }
}

     //==============//
    // Driver Class //
   //==============//

public class Activity2
{
    public static void main(String args[]) throws IOException
    {
        Scanner cin = new Scanner(System.in);
        problemDescriptions desc = new problemDescriptions();
        selection cout = new selection();

        double input1, input2, menu;
        int input3;

        for(menu = 0; menu != 5;)
        {
            desc.divider();
            desc.menuMain();
            menu = cin.nextDouble();
            
            if(menu == 1)
            {
                desc.divider();
                desc.item1();

                input1 = cin.nextDouble();

                System.out.println(cout.item1(input1));
                desc.pause();
            }

            else if(menu == 2)
            {
                desc.divider();
                desc.item2();

                input1 = cin.nextDouble();

                System.out.println(cout.item2(input1));
                desc.pause();
            }

            else if(menu == 3)
            {
                desc.divider();
                desc.item3();

                input3 = cin.nextInt();

                System.out.println(cout.item3(input3));
                desc.pause();
            }

            else if(menu == 4)
            {
                desc.divider();
                desc.item4();

                System.out.print("\nEnter amount of calls: ");
                input1 = cin.nextDouble();

                System.out.print("Enter amount of texts: ");
                input2 = cin.nextDouble();

                System.out.println(cout.item4(input1, input2));
                desc.pause();
            }

            else if(menu == 5)
            {
                desc.divider();
                desc.finish();
            }

            else
            {
                desc.divider();
                desc.invalid();
            }
        }
    }
}