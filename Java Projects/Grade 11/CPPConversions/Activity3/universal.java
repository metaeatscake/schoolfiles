package Activity3;

import java.util.*;
import java.io.*;

class universal
{
    static Scanner sc = new Scanner(System.in);
    static universal univ = new universal();

    void clearScreen(String... args) throws InterruptedException, IOException
    {
        new ProcessBuilder("cmd", "cls", "/c").inheritIO().start().waitFor();
    }

    void pause() throws IOException
    {
        System.out.println("\nPress the Enter key to continue.");
        System.in.read();
    }


}
