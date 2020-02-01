import java.io.*;
import java.util.*;

public class programFormat
{
    public static Scanner sc = new Scanner(System.in);
    public static programFormat obj = new programFormat();

    // Basic Variables
    static int intNum1 = 0, intNum2 = 0, intNum3 = 0;
    static double doubleNum1 = 0, doubleNum2 = 0, doubleNum3 = 0;

    // Arrays
    static int arraySize1 = 0;

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

    public void invalidInput() throws IOException
    {
        System.out.println("\nInvalid Input.");
        obj.pause();
    }

    public void goodbye() // kind of unnecessary
    {
        System.out.println("\nGoodbye!");
    }

    public int intInput()
    {
        return Integer.parseInt(sc.nextLine());
    }

    public double doubleInput()
    {
        return Double.parseDouble(sc.nextLine());
    }

}