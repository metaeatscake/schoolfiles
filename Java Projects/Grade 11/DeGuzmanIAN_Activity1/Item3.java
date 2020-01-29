import java.util.Scanner;

public class Item3 {
    
    public static void main(String []args){
        
        Scanner cin = new Scanner(System.in);
        
        // Descripion of the problem
        System.out.println("(Description of the Problem)");
        System.out.println("Input three values. Compute and display the following: ");
        System.out.println("\ta. The difference of the first two values");
        System.out.println("\tb. The square of the sum of the second and third values");
        System.out.println("\tc. The average of the three values");
        System.out.println("--------------------------------------------------------------------\n");
        
        // Declaring inputs
        double n1, n2, n3;
        
        // Declaring outputs
        double diff, squaredSum, ave;
        
        // Input
        System.out.print("Enter value for number[1]: ");
        n1 = cin.nextDouble();
        System.out.print("Enter value for number[2]: ");
        n2 = cin.nextDouble();
        System.out.print("Enter value for number[3]: ");
        n3 = cin.nextDouble();
        
        // Process
        diff = Math.abs(n1 - n2);
        squaredSum = Math.pow(n2 + n3, 2.00);
        ave = (n1 + n2 + n3) / 3.00;
        
        // Output: Solutions
        System.out.println("\na.) | " + n1 + " - " + n2 + " | = " + diff);
        System.out.println("b.) ( " + n2 + " + " + n3 + " ) ^ 2 = " + squaredSum);
        System.out.println("c.) ( " + n1 + " + " + n2 + " + " + n3 + " ) / 3 = " + ave);
        System.out.println("--------------------------------------------------------------------\n");
        
        // Output: Formal
        System.out.println("Difference: " + diff);
        System.out.println("Squared Sum: " + squaredSum);
        System.out.println("Average: " + ave);
    }
}