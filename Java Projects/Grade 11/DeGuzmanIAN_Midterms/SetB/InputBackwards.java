public class InputBackwards extends programFormat
{
    static String converter(String input)
    {
        String output = "";

        for(int i = input.length()-1; i >= 0; i--)
        {
            output += input.charAt(i);
        }

        return output;
    }
    static void backwards()
    {
        System.out.println("--(Java Midterms: Set B, Number 2)--");
        System.out.println("Output a given number backwards.(No menu loop)\n");

        System.out.print("Enter a number/word: ");
        name1 = sc.nextLine();

        System.out.println("\nBackwards Output: " + converter(name1));
    }
    public static void main(String args[])
    {
        backwards();
    }
}