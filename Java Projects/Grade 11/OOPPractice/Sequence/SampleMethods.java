import java.util.*;
import java.io.*;
public class SampleMethods extends Animals
{
    public static void main(String args[])
    {
       Animals bobby = new Animals();
       Animals bobby2 = new Animals("Yellow", "Brown", "Askal", "Female");
       
       System.out.println(bobby.printDetails());
       System.out.println("\n" + bobby2.printDetails());
    }
}