public class PrimeOrComposite extends programFormat
{
    static String tester()
    {
        String answer = "";
        int factors = 0;

        for(double i = doubleNum1; i > 0; i--)
        {
            if(doubleNum1 % i == 0)
            {
                factors++;
            }
        }

        if(factors == 2)
        {
            answer = "Prime";
        }

        else
        {
            answer = "Composite";
        }

        return answer;
    }
    public static void main(String args[])
    {
        System.out.println("--(Java Midterms: Set B, Number 4");
        System.out.println("Prime or Composite tester (no menu loop)");
        System.out.print("\nEnter a number: ");
        doubleNum1 = obj.doubleInput();
        System.out.println("\nThis number is: " + tester());
    }
}