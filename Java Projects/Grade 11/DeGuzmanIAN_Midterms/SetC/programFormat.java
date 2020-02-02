import java.io.*;
import java.util.*;

class programFormat
{
    static Scanner sc = new Scanner(System.in);
    static programFormat obj = new programFormat();
    static Random rnd = new Random();

    // Variables
    static int num1 = 0;
    // Menus
    static String menuChoice = "";

    // Methods
    void clearScreen() throws InterruptedException, IOException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    void pause() throws IOException
    {
        System.out.println("\nPress the Enter key to continue.");
        System.in.read();
    }

    void invalidInput()
    {
        System.out.println("\nInvalid Input.");
    }

    void goodbye() // kind of unnecessary
    {
        System.out.println("\nGoodbye!");
    }

    int intInput()
    {
        return Integer.parseInt(sc.nextLine());
    }

}