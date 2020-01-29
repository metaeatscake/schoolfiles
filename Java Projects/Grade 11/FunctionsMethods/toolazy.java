import java.io.*;
import java.util.*;
import java.lang.*;

public class toolazy
{
    public static Scanner sc = new Scanner(System.in);
    public static toolazy inst = new toolazy();
    
    public void clearScreen(String... args) throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    
    public void pause() throws IOException
    {
        System.out.println("\nPress enter key to continue.");
        System.in.read();
    }
}