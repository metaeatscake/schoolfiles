import java.io.*;
import java.util.Arrays;

public class ATM extends programFormat
{

    // Edit this to change acceptable withdrawal amounts
    static int acceptedWithdraw[] = 
    {
        200,
        300,
        500,
        1000
    };
    

    // Edit this to change acceptable deposit amounts
    static int acceptedDeposit[] = 
    {
        500,
        1000,
        2000,
        5000,
        10000
    };
    
    // Final stuff to do
    // Figure out how to make the log work.

    static boolean[] validWithArray(int input, double balance)
    {
        boolean condition1 = false;
        boolean condition2 = false;
        boolean condition3 = false;
        boolean condition4 = false;
 
        // Negative check: Input has to be positive
        if(input > 0)
        {
            condition1 = true;
        }

        // Zero check: Input cannot be zero
        if(input != 0)
        {
            condition2 = true;
        }

        // Exceeding limit check: Input cannot exceed balance
        if(input <= balance)
        {
            condition3 = true;
        }

        // Acceptable amount check: Input has to be a printable amount.
        if(Arrays.asList(acceptedWithdraw).contains(input))
        {
            condition4 = true;
        }

        // In the input process, check if any of these contain a false.
        // if there is one false, it is invalid.
        return new boolean[] 
        {
            condition1, 
            condition2, 
            condition3,
            condition4
        };
    }

    // Same as the method above.
    static boolean[] validDepArray(int input, double balance)
    {
        boolean condition1 = false;
        boolean condition2 = false;
        boolean condition3 = false;

        if(input > 0)
        {
            condition1 = true;
        }

        if(input != 0)
        {
            condition2 = true;
        }

        if(Arrays.asList(acceptedDeposit).contains(input))
        {
            condition3 = true;
        }

        return new boolean[]
        {
            condition1,
            condition2,
            condition3
        };
    }

    // A test for multiple program terminating inputs.
    static boolean validExit(String menuInput)
    {
        boolean valid = false;

        // Edit acceptable inputs here.
        String acceptedExits[] = 
        {
            "4",
            "e",
            "exit"
        };

        
        if(Arrays.asList(acceptedExits).contains(menuInput))
        {
            valid = true;
        }
        

        return valid;
    }

    public static void main(String args[]) throws IOException, InterruptedException, NullPointerException
    {
        // Starting balance for this account
        double balance = 10000;

        // Transaction Logging
        int logLimit = 500;
        String transactionTime[] = new String[logLimit];
        String transactionType[] = new String[logLimit];
        String transactionValid[] = new String[logLimit];
        int inputAmount[] = new int[logLimit];
        double preBalance[] = new double[logLimit];
        double newBalance[] = new double[logLimit];
        int ctr = 0;

        // Un-nullification of array
        // Arrays.fill(array, value); would have done the same.
        for(int i = 0; i < logLimit; i++)
        {
            transactionTime[i] = " ";
            transactionType[i] = " ";
            transactionValid[i] = " ";
            inputAmount[i] = 0;
            preBalance[i] = 0;
            newBalance[i] = 0;
        }

        while(validExit(menuChoice.toLowerCase()) == false)
        {
            obj.clearScreen();
            int input = 0;

            System.out.println("--(Midterms: Java Set B, Number 1)--");
            System.out.println("ATM Machine (With logging instead of invalid loop)");

            System.out.println("\nCurrent Balance: " + balance);

            System.out.println("[1][W]ithdraw");
            System.out.println("[2][D]eposit");
            System.out.println("[3][V]iew Balance/Logs");
            System.out.println("[4][E]xit");

            System.out.print("\nEnter choice(number/letter/word): ");
            menuChoice = sc.nextLine();

            switch(menuChoice.toLowerCase())
            {
                case "1": case "w": case "withdraw":
                    obj.clearScreen();

                    System.out.println("--Withdrawal Menu--\n");
                    System.out.println("Supported Amounts:");
                    System.out.println(Arrays.toString(acceptedWithdraw));

                    System.out.print("\nEnter amount to withdraw: ");
                    input = obj.doubleInput();

                    System.out.println("\n");

                    // Insert the method to a local array variable.
                    boolean withdrawArray[] = validWithArray(input, balance);

                    // If there is one false in the array, the input is invalid.
                    if(Arrays.asList(withdrawArray).contains(false))
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("No amount was deducted from your balance");
                        System.out.println("Possible reasons why the input was invalid:");
                        System.out.println("--Entering a negative value");
                        System.out.println("--Entering only 0");
                        System.out.println("--Entering an amount exceeding your balance");
                        System.out.println("--Entering an amount unsupported by the ATM");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Withdrawal";
                        transactionValid[ctr] = "Invalid";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance;
                        ctr++;

                        obj.pause();
                    }

                    // If it does not contain a false, it is valid.
                    else
                    {
                        System.out.println("Transaction Accepted.");
                        System.out.println(input +" was deducted from your balance.");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Withdrawal";
                        transactionValid[ctr] = "Valid";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance - input;
                        ctr++;

                        balance -= input;

                        obj.pause();
                    }
                break;

                case "2": case "d": case "deposit":
                    obj.clearScreen();

                    System.out.println("--Deposit Menu--\n");
                    System.out.println("Supported Amounts:");
                    System.out.println(Arrays.toString(acceptedDeposit));

                    System.out.print("\nEnter amount to deposit: ");
                    input = obj.doubleInput();

                    System.out.println("\n");

                    boolean depositArray[] = validDepArray(input, balance);

                    if(Arrays.asList(depositArray).contains(false))
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("No amount has been added to your balance.");
                        System.out.println("Possible reasons why your input was invalid:");
                        System.out.println("--Entering a negative input");
                        System.out.println("--Entering only 0");
                        System.out.println("--Entering an amount unsupported by the ATM");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Deposit";
                        transactionValid[ctr] = "Invalid";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance + input;
                        ctr++;

                        obj.pause();
                    }

                    else
                    {
                        System.out.println("Transaction Accepted.");
                        System.out.println(input + " has been added to your balance.");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Deposit";
                        transactionValid[ctr] = "Valid";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance + input;
                        ctr++;

                        balance += input;

                        obj.pause();
                    }


                break;

                case "3": case "v": case "view" : case "view balance": case "bal":
                        
                    while(obj.yesNoMenu(subMenu) == false)
                    {
                        obj.clearScreen();
                        
                        System.out.println("--Balance--");
                        System.out.println("\nCurrent Balance: " + balance);

                        System.out.println("\nLatest Transaction: ");
                        System.out.println("---Log [" + (ctr-1) + "]---");
                        System.out.println("Time: " + transactionTime[ctr]);
                        System.out.println("Transaction: " + transactionType[ctr]);
                        System.out.println("Valid?: " + transactionValid[ctr]);
                        System.out.println("Inputted Amount: " + inputAmount[ctr]);
                        System.out.println("Previous Balance: " + preBalance[ctr]);
                        System.out.println("New Balance: " + newBalance[ctr]);

                    
                        System.out.println("\nWould you like to see all of the logs?");
                        System.out.print("(yes/no): ");
                        subMenu = sc.nextLine();

                        switch(subMenu.toLowerCase())
                        {
                            case "y": case "yes":

                                //obj.clearScreen();

                                // NO LOGS TO OUTPUT
                                if(transactionType[0].equals(" "))
                                {
                                    System.out.println("\nSorry, there's no logs yet.");
                                }

                                // There's at least one log.
                                else
                                {
                                    obj.clearScreen();
                                    // descending output:
                                    //  int i = logLimit - 1; i >= 0; i--
                                    // ascending output:
                                    //  int i = 0; i < logLimit; i++
                                    for(int i = logLimit - 1; i >= 0; i--)
                                    {
                                        // Show data with actual values
                                        if(!transactionType[i].equals(" "))
                                        {
                                            System.out.println("\nLog ["+i+"]");
                                            System.out.println("Time: " + transactionTime[i]);
                                            System.out.println("Transaction: " + transactionType[i]);
                                            System.out.println("Valid?: " + transactionValid[i]);
                                            System.out.println("Inputted Amount: " + inputAmount[i]);
                                            System.out.println("Previous Balance: " + preBalance[i]);
                                            System.out.println("New Balance: " + newBalance[i]);
                                        }   
                                    }

                                    obj.pause();
                                }

                            break;

                            case "n": case "no":
                                System.out.println("\nReturning to main menu...");
                                obj.pause();
                            break;

                            default: 
                                System.out.println("\nYes/No only please.");
                                obj.pause();
                        }
                    }
                break;

                case "4": case "e" : case "exit":
                    obj.goodbye();
                break;

                default: obj.invalidInput(); obj.pause();
            }
        }

    }

}