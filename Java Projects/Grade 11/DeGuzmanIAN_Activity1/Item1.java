import java.util.Scanner;

public class Item1
{
    public static void main(String []args)
    {
        // cin because c++
        Scanner cin = new Scanner(System.in);
        
        // Declare Array
        int array = 4; // Change this to control the amount of quizzes to average.
        double[] grades = new double[array];
        
        // Declare loop counter
        int i = 0;
        
        // Declare Input holder, process holder and Output
        double in_grade, totals = 0, average;
        
        System.out.println("(Description of the Problem)");
        System.out.println("Input 4 quizzes of a student into a computer and find the average.");
        System.out.println("Print the result.");
        System.out.println("------------------------------------------------------------------\n\n");
        
        // Input quiz (hooray, the C++ syntax still works)
        for(i = 0; i < array; i++){
            System.out.print("Enter Quiz [" + (i+1) + "]: ");
            in_grade = cin.nextDouble();
            grades[i] = in_grade;
            in_grade = 0;
        }
        
        /*
         * Testing if the array held all the inputs.
        for(i = 0; i < array; i++){
            System.out.println("Value in index " + i + ": " grades[i]);
        }
        */
       
        // Computing for average
        for(i = 0; i < array; i++){
            totals += grades[i];
        }
        
        average = totals / array;
        
        // Output
        System.out.println("\nAverage: " + average);
        
    }
}