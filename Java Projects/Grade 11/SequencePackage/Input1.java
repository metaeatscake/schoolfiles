import java.io.*;
public class Input1
{
    public static void main(String []args) throws Exception
    {
        //Create instance of the BufferedReader and
        //InputStreamReader class
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //Variable declaration
        String name;
        int age;
        String address;
        
        // Input process
        System.out.print("Enter your name: ");
        name = br.readLine();
        
        // To convert integer or real numbers from String
        // We use the parse method.
        //
        // Integers
        // short --> Short.parseShort()
        // int --> Int.parseInt()
        // long --> Long.parseLong()
        //
        // Float
        // float --> Float.parseFloat()
        // double --> Double.parseDouble()
        
        /* To input characters
         * br.readLine().charAt(0)
         *
         */
        System.out.print("Enter your age: ");
        age = Integer.parseInt(br.readLine());
        
        System.out.print("Enter your address: ");
        address = br.readLine();
        
        // Output Process
        System.out.println("\nName: " + name);
        System.out.println("\nAge: " + age);
        System.out.println("\nAddress: " + address);
        
    }
}