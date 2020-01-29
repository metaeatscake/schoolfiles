import java.util.Scanner;

public class Input2
{
    public static void main(String []args)
    {
        // Declare a scanner instance
        Scanner sc = new Scanner(System.in);
        
        // Var declaration
        String name;
        String address;
        int age;
        
        // Input Process
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your address:" );
        address = sc.nextLine();
        
        // Output process
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        
    }
}