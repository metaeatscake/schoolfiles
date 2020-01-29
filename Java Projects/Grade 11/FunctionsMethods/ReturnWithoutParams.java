import java.io.*;

public class ReturnWithoutParams extends toolazy
{
    // instaance
    public static ReturnWithoutParams rwop = new ReturnWithoutParams(); 
    
    public static void main(String []args)
    {
        System.out.println(rwop.introduce());
    }
    
    public String introduce()
    {
        int choice = 1;
        String message[] =
        {
            "I like eggs",
            "Please buy me food",
            "SKI DAAAAAAA"
        };
        
        return (message[choice]);
    }
}
