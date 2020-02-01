import java.io.*;
import java.util.Arrays;

public class ATM extends programFormat
{

    // Edit this to change acceptable withdrawal amounts
    static double acceptedWithdraw[] = 
    {
        200,
        300,
        500,
        1000
    };
    

    // Edit this to change acceptable deposit amounts
    static double acceptedDeposit[] = 
    {
        500,
        1000,
        2000,
        5000,
        10000
    };
    

    static boolean validTransaction(String transactionType, double input, double balance)
    {
        boolean valid = false;

        // Boolean check for Deposits go here.
        if(transactionType.equals("Deposit"))
        {
            if(Arrays.asList(acceptedDeposit).contains(input))
            {
                valid = true;
            }
        }

        // Boolean check for Withdrawals go here.
        // Second condition added to avoid redundant logging.
        else if(transactionType.equals("Withdrawal") && validWithdrawal(input, balance) == true)
        {
            
            if(Arrays.asList(acceptedWithdraw).contains(input))
            {
                valid = true;
            }
            
        }

        return valid;
    }

    // Check for withdrawals exceeding limit
    static boolean validWithdrawal(double input,double balance)
    {
        boolean valid = false;

        if(input > balance && input > 0)
        {
            valid = false;
        }

        else
        {
            valid = true;
        }

        return valid;
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
        double inputAmount[] = new double[logLimit];
        double preBalance[] = new double[logLimit];
        double newBalance[] = new double[logLimit];
        int ctr = 0;

        while(validExit(menuChoice.toLowerCase()) == false)
        {
            obj.clearScreen();
            double input = 0;

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

                    // Negatives or Exceeding limit.
                    if(validTransaction("Withdrawal", input, balance) == false)
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("No amount was deducted from your balance.");
                        System.out.println("Please enter an amount that this ATM can output.");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Withdrawal";
                        transactionValid[ctr] = "Invalid (Unsupported Amount)";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance;
                        ctr++;

                        obj.pause();
                    }

                    // Valid
                    else if(validTransaction("Withdrawal", input, balance) == true)
                    {
                        System.out.println("Transaction Accepted.");
                        System.out.println(input +" was deducted from your balance");

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

                    // For unaccounted errors.
                    else
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("You did something weird.");
                        System.out.println("No amount was deducted from your balance");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Withdrawal";
                        transactionValid[ctr] = "Invalid (Unknown Error)";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance;
                        ctr++;

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

                    // Valid input goes here
                    if(validTransaction("Deposit", input, balance) == true)
                    {

                        System.out.println("Transaction Accepted.");
                        System.out.println(input + "has been added to your balance.");

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

                    // Negatives
                    else if(input < 0)
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("You tried to deposit a negative amount.");
                        System.out.println("No amount was added to your balance");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Deposit";
                        transactionValid[ctr] = "Invalid (Negative Input)";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance;
                        ctr++;

                        obj.pause();
                    }

                    // Zero
                    else if(input == 0)
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("You did something weird.");
                        System.out.println("No amount was added to your balance");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Deposit";
                        transactionValid[ctr] = "Invalid (Depositing nothing)";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance;
                        ctr++;

                        obj.pause();
                    }

                    // Unsupported amount
                    else if(validTransaction("Deposit", input, balance) == false)
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("You did not input a supported amount");
                        System.out.println("No amount was added to your balance");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Deposit";
                        transactionValid[ctr] = "Invalid (Unsupported Amount)";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance;
                        ctr++;

                        obj.pause();
                    }

                    // Unaccounted Errors
                    else
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("You did something weird.");
                        System.out.println("No amount was added to your balance");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Withdrawal";
                        transactionValid[ctr] = "Invalid (Unknown Error)";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance;
                        ctr++;

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
                        System.out.println("---Log [" + ctr + "]---");
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
                                if(transactionType[0].equals(""))
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
                                        if(!transactionType[i].equals(""))
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

                default: obj.invalidInput();
            }
        }

    }

}