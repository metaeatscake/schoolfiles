import java.util.Scanner;

public class ExtendedMultiplication
{
    public static void main(final String[] args) {
        final Scanner cin = new Scanner(System.in);

        System.out.println("\nThis program will multiply two numbers without using *");
        System.out.println("Note: The output here is always positive");
        System.out.println("------------------------------------------------------\n");

        int i;
        double num1, num2;
        double prod = 0;

        System.out.print("Enter multiplicand: ");
        num1 = Math.abs(cin.nextDouble());
        System.out.print("Enter multiplier: ");
        num2 = Math.abs(cin.nextDouble());

        for(i = 0; i < num2; i++)
        {
            prod += num1;
        }

        System.out.println("\nAnswer: " + prod);
    }
}