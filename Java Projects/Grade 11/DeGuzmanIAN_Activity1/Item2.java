import java.util.Scanner;

public class Item2{
    
    public static void main(String []args){
        
        Scanner cin = new Scanner(System.in);
        
        // Extra code to help increase flexibility
        double weightA, weightB;
        weightA = 1.0 / 3.0;    //Minor A
        weightB = 2.0 / 3.0;    //MidTerms
        
        // Declare inputs
        double minorA, midTerms;
        
        // Declare output
        double midGrade;
        
        // Describe the function of the program. Purely cosmetic.
        System.out.println("(Description of the Problem)");
        System.out.println("Create a program that will compute for the midterm grade of a student.");
        System.out.println("The midterm grade is equal to one-third of the minor A exam and two-thirds of the midterm exam.");
        System.out.println("Print the midterm grade");
        System.out.println("-----------------------------------------------------------------------------------------------\n\n");
        
        // Input
        System.out.print("Enter Minor A: ");
        minorA = cin.nextDouble();
        System.out.print("Enter Midterm Exam: ");
        midTerms = cin.nextDouble();
        
        // Process
        midGrade = (minorA * weightA) + (midTerms * weightB);
        
        // Output
        System.out.println("\nMidterm Grade: " + midGrade);
    }
}