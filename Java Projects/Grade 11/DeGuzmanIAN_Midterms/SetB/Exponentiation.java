public class Exponentiation extends programFormat
{
    static double exponent(final double base, final double exponent)
    {
        double answer = Math.pow(base, exponent);
        return answer;
    }
    public static void main(final String args[])
    {
        System.out.println("--(Java Midterms: Set B, Number 3");
        System.out.println("Exponent Calculator (no menu loop)\n");

        System.out.print("Enter the base number: ");
        doubleNum1 = obj.doubleInput();
        System.out.print("Enter the exponent: ");
        doubleNum2 = obj.doubleInput();

        System.out.println("\nAnswer: " + exponent(doubleNum1, doubleNum2));
    }
}