import java.io.*;
import java.util.*;

public class programFormat
{
    public static Scanner sc = new Scanner(System.in);
    public static programFormat obj = new programFormat();

    // Basic Variables
    int intNum1 = 0, intNum2 = 0, intNum3 = 0;
    double doubleNum1 = 0, doubleNum2 = 0, doubleNum3 = 0;
    String name1 = "", name2 = "", name3 = "";

    // Arrays
    int arraySize1 = 0, arraySize2 = 0, arraySize3 = 0, arraySize4 = 0;
    int choiceIndex1 = 0, choiceIndex2 = 0, choiceIndex3 = 0, choiceIndex = 0;
    int arrayInputInt = 0;
    double arrayInputDouble = 0;
    String arrayInputString = "";

    int arrayInt[] = new int[arraySize1];
    double arrayDouble1[] = new double[arraySize2];
    double arrayDouble2[] = new double[arraySize3];
    String arrayString[] = new String[arraySize4];

    // Verifications
    boolean condition1 = false;
    boolean condition2 = false;

    // Menus
    String menuChoice = "";

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

}