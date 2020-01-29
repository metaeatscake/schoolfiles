import java.io.*;

public class OddOrEven extends toolazy
{
    public static OddOrEven ooe = new OddOrEven();
    
    public void voidTester()
    {
        int num;
        
        System.out.print("Enter a value: ");
        num = Integer.parseInt(sc.nextLine());
        
        if(num % 2 == 0)
        {
            System.out.println("This number is EVEN");
        }
        
        else
        {
            System.out.println("This number is ODD");
        }
    }
    
    public void voidTesterParams(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("The number " + num + " is EVEN");
        }
        
        else
        {
            System.out.println("The number " + num + " is ODD");
        }
    }
    
    public String returnTester()
    {
        int num = 69;
        
        if(num % 2 == 0)
        {
            return("The number " + num + " is EVEN");
        }
        
        else
        {
            return("The number " + num + " is ODD");
        }
    }
    
    public String returnTesterParams(int num)
    {
        if(num % 2 == 0)
        {
            return("The number " + num + " is EVEN");
        }
        
        else
        {
            return("The number " + num + " is ODD");
        }
    }
    
    public static void main(String args[])
    {
        System.out.println("Void Type, No Params");
        ooe.voidTester();
        
        System.out.println("\nVoid Type with params");
        ooe.voidTesterParams(77);
        
        System.out.println("Return type, no params");
        System.out.println(ooe.returnTester());
        
        System.out.println("Return type, with params");
        System.out.println(ooe.returnTesterParams(66));
    }
}