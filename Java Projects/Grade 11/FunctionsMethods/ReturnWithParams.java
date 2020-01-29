import java.io.*;

public class ReturnWithParams extends toolazy
{
    public static void main(String []args)
    {
        int num;
        System.out.print("Please enter a number: ");
        num = Integer.parseInt(sc.nextLine());
        
        System.out.println("\n" + introduce(num));
    }
    
    public static String introduce(int choice)
    {
        String message[] =
        {
            "I like eggs",
            "Please buy me food",
            "SKI DAAAAAAA",
            "I love you",
            "Why you no love meee"
        };
        
        return (message[choice]);
    }
}
