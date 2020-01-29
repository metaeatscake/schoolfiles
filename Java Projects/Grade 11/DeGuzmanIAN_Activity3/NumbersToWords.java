// Thanks to StackOverflow
// https://stackoverflow.com/a/47376072
// I just modified it to include the scanner and the main method
import java.util.Scanner;

public class NumbersToWords {
    
    private static final String ZERO = "zero";
    private static String[] oneToNine = {
            "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    private static String[] tenToNinteen = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static String[] dozens = {
            "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    
    public static Scanner sc = new Scanner(System.in);
    public static NumbersToWords process = new NumbersToWords();
    
    public String solution(int number) {
        if(number == 0)
            return ZERO;

        return generate(number).trim();
    }

    public String generate(int number) {
        if(number >= 1000000000) {
            return generate(number / 1000000000) + " billion " + generate(number % 1000000000);
        }
        else if(number >= 1000000) {
            return generate(number / 1000000) + " million " + generate(number % 1000000);
        }
        else if(number >= 1000) {
            return generate(number / 1000) + " thousand " + generate(number % 1000);
        }
        else if(number >= 100) {
            return generate(number / 100) + " hundred " + generate(number % 100);
        }

        return generate1To99(number);
    }

    private String generate1To99(int number) {
        if (number == 0)
            return "";

        if (number <= 9)
            return oneToNine[number - 1];
        else if (number <= 19)
            return tenToNinteen[number % 10];
        else {
            return dozens[number / 10 - 1] + " " + generate1To99(number % 10);
        }
    }
    
    public static void main(String args[])
    {
        int number;
        System.out.println("This program will convert numbers to words");
        System.out.println("Limit: 2,147,483,647 (negatives unsupported)");
        
        System.out.print("\nEnter a number: ");
        number = Math.abs(Integer.parseInt(sc.nextLine()));
        
        System.out.println("\nWord form: " + process.solution(number));
    }
}