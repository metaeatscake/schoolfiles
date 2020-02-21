import java.util.*;

public class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number;
        
        System.out.print("Enter a number: ");
        try
        {
            number = Integer.parseInt(sc.nextLine());
        }
        catch(Exception e)
        {
            System.out.println("\nThis is not a number.");
        }
    }
}