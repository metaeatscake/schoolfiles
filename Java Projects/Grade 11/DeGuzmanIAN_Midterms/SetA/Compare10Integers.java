
import java.io.*;

class Compare10Integers extends programFormat
{
    public static void main(String args[]) throws IOException
    {
        // Change this to control amount of integers to compare.
        arraySize1 = 10;
        int arrayInt[] = new int[arraySize1];
        
        while(!menuChoice.equals("2"))
        {
            System.out.println("\n--(Java Midterms: Set A, Number 2)--");
            System.out.println("Highest and Lowest in " + arraySize1 + " Integer inputs");
            System.out.println("[1] Input");
            System.out.println("[2] Exit");

            System.out.print("\nEnter Choice: ");
            menuChoice = sc.nextLine();
            System.out.println("\n");

            switch(menuChoice)
            {
                case "1":

                    // Input integers, put them in an array
                    for(int i = 0; i < arrayInt.length; i++)
                    {
                        System.out.print("Enter a number for num [" + (i+1) + "]: ");
                        intNum1 = obj.intInput();
                        arrayInt[i] = intNum1;
                        intNum1 = 0;
                    }

                    // Sort the array (I just searched 'how to sort an array')
                    int temp;
                    for (int i = 1; i < arrayInt.length; i++) 
                    {
                        for (int j = i; j > 0; j--) 
                        {
                            if (arrayInt[j] < arrayInt[j - 1]) 
                            {
                                temp = arrayInt[j];
                                arrayInt[j] = arrayInt[j - 1];
                                arrayInt[j - 1] = temp;
                            }
                        }
                    }

                    // Output the sorted array
                    System.out.print("\nSorted Input: ");
                    for(int i = 0; i < arrayInt.length; i++)
                    {
                        if(i < arrayInt.length - 1)
                        {
                            System.out.print(arrayInt[i] + ", ");
                        }

                        else
                        {
                            System.out.print(arrayInt[i] + "\n");
                        }
                    }

                    // Output the lowest and highest
                    System.out.println("\nLowest: " + arrayInt[0]);
                    System.out.println("Highest: " + arrayInt[arraySize1-1]);

                    obj.pause();

                break;

                case "2": obj.goodbye(); break;
                default: obj.invalidInput();
            }
        }
    }
}