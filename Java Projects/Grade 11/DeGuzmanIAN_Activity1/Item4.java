import java.util.Scanner;

// Testing object oriented programming.
// Note: I don't fully get it, I just looked at other people's code.
// Polymorphism test.
// Reference: https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/

public class Item4{
    
    /*
     *Self notes: The process is already here. simple format:
     *
     * public <dataType> <processname>(<dataType> var1, <datatype> var2 ...){
     *     
     *     return(<process; what to do with these variables>); 
     * }
     * 
     * Edit after completing item5: you can declare variables and do stuff within this method too.
     */
    
    public double netpay(double hours, double rate, double deductions){
        
        return ((hours * rate) - deductions);
    }
    
    // I noticed I could still just call this 'netpay'. Too lazy to change it now.
    // Also a bit redundant.
    public String empname(String name){
        
        return (name);
    }
    
    public static void main(String []args) {
        // I forgot what these are called but I think I know what it does
        Scanner cin = new Scanner(System.in);
        Item4 p = new Item4();
        
        // Declare variables
        double in1, in2, in3;
        String in4;
        
        //Description of problem
        System.out.println("(Description of the Problem)");
        System.out.println("Input the employee name, number of hours worked, the rate per hour, and the amount of total deductions.");
        System.out.println("Compute and output the net pay of the employee");
        System.out.println("-------------------------------------------------------------------------------------------------------\n");
        
        // Input
        System.out.print("Enter your name: ");
        in4 = cin.nextLine();
        System.out.print("Enter number of hours worked: ");
        in1 = cin.nextDouble();
        System.out.print("Enter rate per hour: ");
        in2 = cin.nextDouble();
        System.out.print("Enter amount of total deductions: ");
        in3 = cin.nextDouble();
        
        // Process is already there.
        
        // Outputs
        System.out.println("-------------------------------------------------------------------------------------------------------\n");
        System.out.println("Employee Name: " + p.empname(in4));
        System.out.println("Net Pay: " + p.netpay(in1, in2, in3));
        
    }
}