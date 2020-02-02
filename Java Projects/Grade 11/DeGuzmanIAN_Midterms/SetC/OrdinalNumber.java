public class OrdinalNumber extends programFormat
{
    static String ordinal(int input)
    {
        String ordinalST = "1";
        String ordinalND = "2";
        String ordinalRD = "3";

        String convertedInput = Integer.toString(input);
        String lastNum = Character.toString(convertedInput.charAt(convertedInput.length()-1));
        String firstNumTwoDigits = Character.toString(convertedInput.charAt(0));

        // Handle 10 to 19
        if(convertedInput.length() == 2 && firstNumTwoDigits.equals("1"))
        {
            convertedInput += "th";
        }

        // handle everything else.
        else if(lastNum.equals(ordinalST))
        {
            convertedInput += "st";
        }

        else if(lastNum.equals(ordinalND))
        {
            convertedInput += "nd";
        }

        else if(lastNum.equals(ordinalRD))
        {
            convertedInput += "rd";
        }

        else
        {
            convertedInput += "th";
        }

        return convertedInput;
    }

    public static void main(String args[])
    {
        System.out.println("--(Java Midterms: Set C, Number 2)--");
        System.out.println("Convert numbers to Ordinal (no input loop)");

        System.out.print("\nEnter a number: ");
        num1 = obj.intInput();

        System.out.println("Ordinal Output: " + ordinal(num1));
    }
}