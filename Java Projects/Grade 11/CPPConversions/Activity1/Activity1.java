package Activity1;

import java.util.*; // Scanner
import java.io.*;   // Pause function System.in.read();

class problemDescriptions
{
    public void item1()
    {
        System.out.println("\n--Problem Description--");
        System.out.println("Design a (program) that will ask for two integers");
        System.out.println("Compute and display the following:");
        System.out.println("\ta. Product of these two integers");
        System.out.println("\tb. Cube of the difference of these two integers");
        System.out.println("\tc. Fifth root of the square of the sum of these two integers");
        System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
    }
    
    public void item2()
    {
        System.out.println("\n--Problem Description--");
        System.out.println("Design a (program) that will ask for a number of minutes.");
        System.out.println("Compute and display the equivalent number of hours and minutes.");
        System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
    }
    
    public void item3()
    {
        System.out.println("\n--Problem Description--");
        System.out.println("Design a (program) that will ask for a student name and ratings for:");
        System.out.println("four quizzes, minor exam A, class standing and midterm exam.");
        System.out.println("Compute the midterm grade of the student by the formula: ");
        System.out.println("midterm grade = 20% of quiz average + 20% of minorA + 10% of class standing + 50% of midterm exam");
        System.out.println("Display the name and midterm grade of the student.");
        System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
    }
    
    public void item4()
    {
        System.out.println("\n--Problem Description--");
        System.out.println("Input a value for variables A and B.");
        System.out.println("Variable C is equal to the sum of the squares of A and B");
        System.out.println("Variable D is equal to 10 less than the value of A");
        System.out.println("Display the values of C and D");
        System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
    }
   
    public void item5()
    {
        System.out.println("\n--Problem Description--");
        System.out.println("Compute and display the following: ");
        System.out.println("\ta. Perimeter of a rectangle");
        System.out.println("\tb. Area of a triangle");
        System.out.println("\tc. Volume of a cylinder");
        System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
    }
    
    public void item6()
    {
        System.out.println("\n--Problem Description--");
        System.out.println("Input an employee name, number of hours worked and hourly rate.");
        System.out.println("Compute his pay where pay is equal to the product of his rate and hours worked.");
        System.out.println("Display the employee name and his pay");
        System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
    }
    
    public void exit()
    {
        System.out.println("\nGoodbye!");
    }
    
    public void invalid() throws IOException
    {
        System.out.println("\nInvalid Input.");
        System.out.println("\nPress enter key to continue.");
        System.in.read();
    }
    
    public void pause() throws IOException
    {
        System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
        System.out.println("\nPress enter key to continue.");
        System.in.read();
    }
    
    public void divider()
    {
        System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
    }
}

class sequence
{
    // SLIDE 12; ITEM 1 of the C++ Flowcharting powerpoint. First program for Activity 1
    public String item1(final double num1, final double num2) {
        double cube, product, fifthRoot;

        product = num1 * num2;
        cube = Math.pow(Math.abs(num1 - num2), 3);
        fifthRoot = Math.pow(Math.pow(num1 + num2, 2), 1.0 / 5.0);

        return ("\nProduct of num1 and num2: " + product + "\nCube of difference of num1 and num2: " + cube
                + "\nFifth root of sum of num1 and num2: " + fifthRoot);
    }

    // SLIDE 13; ITEM 2 of the C++ Flowcharting powerpoint. Second program for
    // Activity 1
    public String item2(final int minuteInput) {
        int hours, minuteOutput;

        hours = minuteInput / 60;
        minuteOutput = minuteInput % 60;

        return ("\nHours: " + hours + "\nMinutes: " + minuteOutput);
    }

    // SLIDE 14; ITEM 3 of the C++ Flowcharting powerpoint. Third program for
    // Activity 1
    public String item3(final String name, final double quiz1, final double quiz2, final double quiz3,
            final double quiz4, final double minorA, final double classPos, final double midExam) 
    {
        double weightedQuizAverage, weightedMinA, weightedCP, weightedMidEx, midGrade;

        weightedQuizAverage = ((quiz1 + quiz2 + quiz3 + quiz4) / 4) * 0.2;
        weightedMinA = minorA * 0.2;
        weightedCP = classPos * 0.1;
        weightedMidEx = midExam * 0.5;

        midGrade = weightedQuizAverage + weightedMinA + weightedCP + weightedMidEx;

        return ("\nName: " + name + "\nMidterm Grade: " + midGrade);
    }

    // SLIDE 15 Problem 1; EXERCISE 1 of the C++ Flowcharting powerpoint. Fourth
    // program for Activity 1
    public String item4(final double varA, final double varB) 
    {
        double varC, varD;

        varC = Math.pow(varA, 2) + Math.pow(varB, 2);
        varD = varA - 10;

        return ("\nProcess----------------------------------------------" + "\nC = (" + varA + "^2) + (" + varB + "^2)"
                + "\nD = " + varA + " - 10" + "\n-----------------------------------------------------\n"
                + "\nValue of Variable C: " + varC + "\nValue of Variable D: " + varD);
    }

    // SLIDE 15 Problem 2; EXERCISE 2 of the C++ Flowcharting powerpoint. Fifth
    // program for Activity 1
    // Separated because handling inputs for all three different processes is
    // awkward.
    public String item5A(final double rectLength, final double rectWidth) 
    {
        double rectPerimeter;

        rectPerimeter = 2 * (rectLength + rectWidth);

        return ("\nPerimeter of Rectangle: " + rectPerimeter);
    }

    public String item5B(final double triBase, final double triHeight) 
    {
        double triArea;

        triArea = (triBase * triHeight) / 2;

        return ("\nArea of Triangle: " + triArea);
    }

    public String item5C(final double cylRadius, final double cylHeight) 
    {
        double cylVolume, pi;

        pi = 3.14159;
        cylVolume = pi * Math.pow(cylRadius, 2) * cylHeight;

        return ("\nVolume of Cylinder: " + cylVolume);
    }

    // SLIDE 15 Problem 3; EXERCISE 3 of the Flowcharting Powerpoint. Sixth and last
    // program for Activity 1.
    public String item6(final String name, final double hours, final double rate) 
    {
        double salary;

        salary = hours * rate;

        return ("\nName: " + name + "\nSalary: " + salary);
    }
}

// Driver class
public class Activity1 
{
    public static void main(final String[] args) throws IOException 
    {
        final Scanner cin = new Scanner(System.in);
        final problemDescriptions desc = new problemDescriptions();
        final sequence cout = new sequence();

        // Loop
        int i;
        int menu;

        // Inputs
        double input;
        int inputInt;
        String inputName;

        // Input holders
        final int array = 10;

        final double[] holder = new double[array];
        final int[] holderInt = new int[array];
        String holdername;
        
        for(menu = 0; menu != 7;)
        {
            System.out.println("\n----Converted C++ Activity 1 Menu----");
            System.out.println("[1] Item 1 | Sample #1");
            System.out.println("[2] Item 2 | Sample #2");
            System.out.println("[3] Item 3 | Sample #3");
            System.out.println("[4] Item 4 | Exercise #1");
            System.out.println("[5] Item 5 | Exercise #2");
            System.out.println("[6] Item 6 | Exercise #3");
            System.out.println("[7] Exit");
            
            System.out.print("\nEnter choice: ");
            menu = cin.nextInt();
            
            // Data clean
            for(i = 0; i < array; i++)
            {
                holder[i] = 0;
                holderInt[i] = 0;
                holdername = "";
                
                input = 0;
                inputInt = 0;
                inputName = "";
            }
            
            if(menu == 1)
            {
                desc.item1();
                
                System.out.print("Enter num1: ");
                input = cin.nextDouble();
                holder[0] = input;
                input = 0;
                
                System.out.print("Enter num2: ");
                input = cin.nextDouble();
                holder[1] = input;
                input = 0;
                
                System.out.println(cout.item1(holder[0], holder[1]));
                
                desc.pause();
            }
            
            else if(menu == 2)
            {
                desc.item2();
                
                System.out.print("Enter a number of minutes: ");
                inputInt = cin.nextInt();
                holderInt[0] = inputInt;
                inputInt = 0;
                
                System.out.println(cout.item2(holderInt[0]));
                
                desc.pause();
            }
            
            else if(menu == 3)
            {
                desc.item3();
                
                System.out.print("Enter your name: ");
                cin.nextLine();
                inputName = cin.nextLine();
                holdername = inputName;
                inputName = "";
                
                for(i = 0; i < 7; i++)
                {
                    if(i < 4)
                    {
                        System.out.print("Enter Quiz [" + (i+1) + "]: ");
                        input = cin.nextDouble();
                        holder[i] = input;
                        input = 0;
                    }
                    
                    else if(i == 4)
                    {
                        System.out.print("Enter Minor A: ");
                        input = cin.nextDouble();
                        holder[i] = input;
                        input = 0;
                    }
                    
                    else if(i == 5)
                    {
                        System.out.print("Enter Class Position: ");
                        input = cin.nextDouble();
                        holder[i] = input;
                        input = 0;
                    }
                    
                    else
                    {
                        System.out.print("Enter Midterms Score: ");
                        input = cin.nextDouble();
                        holder[i] = input;
                        input = 0;
                    }
                }
                
                System.out.println
                (cout.item3
                    (
                        holdername,
                        holder[0],
                        holder[1],
                        holder[2],
                        holder[3],
                        holder[4],
                        holder[5],
                        holder[6]
                    )
                );
                
                desc.pause();
            }
            
            else if(menu == 4)
            {
                desc.item4();
                
                System.out.print("Enter a value for varA: ");
                input = cin.nextDouble();
                holder[0] = input;
                input = 0;
                
                System.out.print("Enter a value for varB: ");
                input = cin.nextDouble();
                holder[1] = input;
                input = 0;
                
                System.out.println(cout.item4(holder[0], holder[1]));
                
                desc.pause();
            }
            
            else if(menu == 5)
            {
                desc.item5();
                
                System.out.print("Enter width of the rectangle: ");
                input  = cin.nextDouble();
                holder[0] = input;
                input = 0;

                System.out.print("Enter length of the rectangle: ");
                input = cin.nextDouble();
                holder[1] = input;
                input = 0;

                System.out.println(cout.item5A(holder[0], holder[1]) + "\n");

                System.out.print("Enter base of triangle: ");
                input = cin.nextDouble();
                holder[2] = input;
                input = 0;

                System.out.print("Enter height of triangle: ");
                input = cin.nextDouble();
                holder[3] = input;
                input = 0;

                System.out.println(cout.item5B(holder[2], holder[3]) + "\n");

                System.out.print("Enter radius of Cylinder: ");
                input = cin.nextDouble();
                holder[4] = input;
                input = 0;

                System.out.print("Enter height of Cylinder: ");
                input = cin.nextDouble();
                holder[5] = input;
                input = 0;

                System.out.println(cout.item5C(holder[4], holder[5]));

                System.out.println("\nSummary----------------------------------------------------");
                System.out.println("Rectangle Perimeter (l = " + holder[0] + " and w = " + holder[1] + "): " + (2 * (holder[0] + holder[1])));
                System.out.println("Triangle Area (b = " + holder[2] + " and h = " + holder[3] + "): " + ((holder[2] * holder[3]) / 2));
                System.out.print("Cylinder Volume (r = " + holder[4] + " and h = " + holder[5] + "): " + (3.14159 * Math.pow(holder[4],2) * holder[5]));

                desc.pause();
            }
            
            else if(menu == 6)
            {
                desc.item6();
                
                System.out.print("Enter your name: ");
                cin.nextLine();
                inputName = cin.nextLine();
                holdername = inputName;
                inputName = "";

                System.out.print("Enter number of hours: ");
                input = cin.nextDouble();
                holder[0] = input;
                input = 0;

                System.out.print("Enter rate per hour: ");
                input = cin.nextDouble();
                holder[1] = input;
                input = 0;

                System.out.print(cout.item6(holdername, holder[0], holder[1]));

                desc.pause();
            }
            
            else if(menu == 7)
            {
                desc.exit();
            }
            
            else
            {
                desc.invalid();
            }
        }
    }
}