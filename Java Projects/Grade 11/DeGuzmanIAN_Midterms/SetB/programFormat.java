import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class programFormat
{
    public static Scanner sc = new Scanner(System.in);
    public static programFormat obj = new programFormat();

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public static LocalDateTime now = LocalDateTime.now();

    // Basic Variables
    static int intNum1 = 0, intNum2 = 0, intNum3 = 0;
    static double doubleNum1 = 0, doubleNum2 = 0, doubleNum3 = 0;
    static String name1 = "", name2 = "", name3 = "";

    // Arrays
    static int arraySize1 = 0, arraySize2 = 0;

    // Menus
    static String menuChoice = "";
    static String subMenu = "";

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

    public double doubleInput()
    {
        return Double.parseDouble(sc.nextLine());
    }

    // In case I want to add a logging system to the ATM
    public String currentTime()
    {
        return dtf.format(now);
    }
}