package main.java.activity1;

import java.io.*;

public final class consoleTools
{
    public static void clearScreen() throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void pause() throws IOException
    {
        System.out.println("\n------------------------");
        System.out.println("Press Enter to Continue.");
        System.out.println("------------------------\n");
        System.in.read();
    }

    public static boolean verifyDouble(String input)
    {
        boolean valid = true;

        try
        {
            double test = Double.parseDouble(input);
        } 
        catch(NumberFormatException e) {
            valid = false;
        }
        return valid;
    }
}