import java.io.*;
import java.util.*;

public class programFormat
{
    public static Scanner sc = new Scanner(System.in);
    public static programFormat obj = new programFormat();

    // Variables
    static int num1 = 0;
    // Menus
    static String menuChoice = "";

    // Methods
    public void clearScreen() throws InterruptedException, IOException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public void pause() throws IOException
    {
        System.out.println("\nPress the Enter key to continue.");
        System.in.read();
    }

    public void invalidInput()
    {
        System.out.println("\nInvalid Input.");
    }

    public void goodbye() // kind of unnecessary
    {
        System.out.println("\nGoodbye!");
    }

    public int intInput()
    {
        return Integer.parseInt(sc.nextLine());
    }

}