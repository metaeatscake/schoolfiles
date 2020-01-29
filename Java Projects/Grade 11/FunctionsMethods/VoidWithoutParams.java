import java.io.*;

public class VoidWithoutParams extends toolazy
{
   
    public static VoidWithoutParams objA = new VoidWithoutParams();
    
    public static void main(String args[])
    {
        objA.addition();
    }
    
    public void addition()
    {
        int num1, num2,sum = 0;
        
        System.out.print("Enter a number: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter another number: ");
        num2 = Integer.parseInt(sc.nextLine());
        
        sum = num1 + num2;
        
        System.out.println("\nSum: " + sum);
    }
}