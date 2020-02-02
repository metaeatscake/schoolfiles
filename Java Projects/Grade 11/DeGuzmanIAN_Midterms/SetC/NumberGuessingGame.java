import java.io.*;

public class NumberGuessingGame extends programFormat
{
    // Generate three random numbers, put them in an array
    static int[] randomizer()
    {
        int randNum1 = rnd.nextInt(10);
        int randNum2 = rnd.nextInt(10);
        int randNum3 = rnd.nextInt(10);

        return new int[] {randNum1, randNum2, randNum3};
    }

    // Turn the array to a single String
    static String concatRandoms()
    {
        String number = "";
        int randNums[] = randomizer();
        int arrayLength = randNums.length;
        String temp;

        for(int i = 0; i < arrayLength; i++)
        {
            temp = Integer.toString(randNums[i]);
            number += temp;
        }
        return number;
    }

    // Take the guess, break apart the random number string and compare.
    // Finally, output the hints.
    static String hints(String randomNumber,int input)
    {
        String inputString = Integer.toString(input);

        // Add padding if input is less than 3 digits
        while(inputString.length() < randomNumber.length())
        {
            inputString = "0" + inputString;
        }

        String guess1 = Character.toString(inputString.charAt(0));
        String guess2 = Character.toString(inputString.charAt(1));
        String guess3 = Character.toString(inputString.charAt(2));

        String random1 = Character.toString(randomNumber.charAt(0));
        String random2 = Character.toString(randomNumber.charAt(1));
        String random3 = Character.toString(randomNumber.charAt(2));

        String fullHint = "";
        String hint1, hint2, hint3;

        if(Integer.parseInt(guess1) > Integer.parseInt(random1))
        {
            hint1 = "-";
        }
        else if(Integer.parseInt(guess1) < Integer.parseInt(random1))
        {
            hint1 = "+";
        }
        else
        {
            hint1 = "*";
        }

        if(Integer.parseInt(guess2) > Integer.parseInt(random2))
        {
            hint2 = "-";
        }
        else if(Integer.parseInt(guess2) < Integer.parseInt(random2))
        {
            hint2 = "+";
        }
        else
        {
            hint2 = "*";
        }

        if(Integer.parseInt(guess3) > Integer.parseInt(random3))
        {
            hint3 = "-";
        }
        else if(Integer.parseInt(guess3) < Integer.parseInt(random3))
        {
            hint3 = "+";
        }
        else
        {
            hint3 = "*";
        }

        fullHint = hint1 + hint2 + hint3;

        return fullHint;
    }

    public static void main(String[] args) throws IOException, InterruptedException
    {
        int attempts = 5;

        String randomNum;
        int guess;

        while(!menuChoice.equals("2"))
        {
            boolean correctGuess = false;
            obj.clearScreen();
            System.out.println("--(Java Midterms: Set C, Number 1)--");
            System.out.println("Three Number Guessing Game");
            System.out.println("[1] Play");
            System.out.println("[2] Exit");

            System.out.print("\nEnter choice: ");
            menuChoice = sc.nextLine();

            switch(menuChoice)
            {
                case "1":
                    obj.clearScreen();
                    randomNum = concatRandoms();
                    System.out.println("\n");

                    // Testing
                    // System.out.println("Target: " + randomNum + "\n");

                    for(int i = 0; i < attempts && correctGuess == false; i++)
                    {
                        System.out.print("Guess : ");
                        guess = obj.intInput();

                        if(guess == Integer.parseInt(randomNum))
                        {
                            correctGuess = true;
                            System.out.println("Congratulations! You got it.");
                            obj.pause();
                        }
                        else if(guess != Integer.parseInt(randomNum) && i < attempts-1)
                        {
                            System.out.println("Output: " + hints(randomNum,guess));
                        }
                        else if(guess != Integer.parseInt(randomNum) && i == attempts-1)
                        {
                            System.out.println("\nGame over! the number was " + randomNum);
                            obj.pause();
                        }
                        else
                        {
                            // nothing.
                        }
                        
                    }

                break;

                case "2":
                    obj.goodbye();
                break;

                default:
                    obj.invalidInput();
                break;
            }
        }
    }
}