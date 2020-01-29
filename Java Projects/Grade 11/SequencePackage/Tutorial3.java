public class Tutorial3
{
    public static void main(String []args)
    {
        //Title
        System.out.println("--Computation and Output--");
        
        // Variable declaration of operands
        int firstnum = 5, secondnum = 12;
        
        // Result var
        int sum, diff, prod;
        double quotient;
        
        // Process
        sum = firstnum + secondnum;
        diff = firstnum - secondnum;
        prod = firstnum * secondnum;
        quotient = (double) firstnum / secondnum;
        
        System.out.println(firstnum + " + " + secondnum + " = " + sum);
        System.out.println(firstnum + " - " + secondnum + " = " + diff);
        System.out.println(firstnum + " * " + secondnum + " = " + prod);
        System.out.println(firstnum + " / " + secondnum + " = " + quotient);
    }
}