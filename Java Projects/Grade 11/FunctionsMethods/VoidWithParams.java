import java.io.*;

public class VoidWithParams extends toolazy
{
    public static VoidWithParams vwp = new VoidWithParams();
    
    public void introduction(String name, String food)
    {
        System.out.println("Hello my name is " + name + ". I like " + food);
    }
    
    public static void main(String args[])
    {
        String name = "Jeff";
        String food = "Sushi";
        vwp.introduction(name, food);
    }
    
    
    
}
