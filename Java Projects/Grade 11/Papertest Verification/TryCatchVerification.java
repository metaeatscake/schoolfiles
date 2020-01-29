import java.util.*; 
// Code source
// https://www.w3schools.com/java/java_try_catch.asp

class Errortest
{
    static void Age(int age)
    {
        if(age < 18)
        {
            String e = "Access Denied. You must be 18 years old or older.\n";
            throw new ArithmeticException(e);
        }

        else
        {
            System.out.println("Access Granted. Proceeding...\n");
        }
    }
}

public class TryCatchVerification
{
    public static void main(String args[])
    {
        final Scanner cin = new Scanner(System.in);

        int ageInput;

        try
        {
            System.out.print("\nEnter your age: ");
            ageInput = cin.nextInt();
    
            Errortest.Age(ageInput);
        
        } catch(ArithmeticException e) {

            System.out.println(e);
            System.out.println("You're not old enough for this.\n");

        }

    }
}
