import java.io.*;

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
            // Loop until either the input matches with any of the accepted deposits,
            // or until it goes through all of them and remains false.
            for(int i = 0; i < acceptedDeposit.length || valid == true; i++)
            {
                if(input == acceptedDeposit[i])
                {
                    valid = true;
                }
            }
        }

        // Boolean check for Withdrawals go here.
        // Second condition added to avoid redundant logging.
        else if(transactionType.equals("Withdrawal") && validWithdrawal(input, balance) == true)
        {
            for(int i = 0; i < acceptedWithdraw.length || valid == true; i++)
            {
                if(input == acceptedWithdraw[i])
                {
                    valid = true;
                }
            }
        }

        return valid;
    }

    // Check for withdrawals exceeding limit
    static boolean validWithdrawal(double input,double balance)
    {
        boolean valid = false;

        if(input > balance)
        {
            valid = false;
        }

        else if(input < 0)
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

        for(int i = 0; i < acceptedExits.length || valid == true; i++)
        {
            if(menuInput.equals(acceptedExits[i]))
            {
                valid = true;
            }
        }

        return valid;
    }

    public static void main(String args[]) throws IOException, InterruptedException
    {
        // Starting balance for this account
        double balance = 10000;

        // Transaction Logging
        int logLimit = 500;
        String transactionTime[] = new String[logLimit];
        String transactionType[] = new String[logLimit];
        String transactionValid[] = new String[logLimit];
        String inputAmount[] = new String[logLimit];
        String preBalance[] = new String[logLimit];
        String newBalance[] = new String[logLimit];
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
                    if(validWithdrawal(input, balance) == false)
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("No amount was deducted from your balance.");
                        System.out.println("Please enter an amount that this ATM can output.");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Withdrawal";
                        transactionValid[ctr] = "Invalid (Negative input or Exceeding Limit)";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance;
                        ctr++;

                        obj.pause();
                    }

                    // Withdrawing Nothing. Technically doesn't need to be an error.
                    else if(input == 0)
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("You tried to withdraw nothing.");
                        System.out.println("No amount was deducted from your balance.");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Withdrawal";
                        transactionValid[ctr] = "Invalid (Withdrawing Nothing)";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance;
                        ctr++;

                        obj.pause();
                    }

                    // Not withdrawing an acceptable amount
                    else if(validTransaction("Withdrawal", input, balance) == false)
                    {
                        System.out.println("Transaction Denied.");
                        System.out.println("This ATM cannot output your desired amount.");
                        System.out.println("No amount was deducted from your balance.");

                        transactionTime[ctr] = obj.currentTime();
                        transactionType[ctr] = "Withdrawal";
                        transactionValid[ctr] = "Invalid (Unsupported Amount)";
                        inputAmount[ctr] = input;
                        preBalance[ctr] = balance;
                        newBalance[ctr] = balance;
                        ctr++;

                        obj.pause();
                    }

                    // Finally, it goes through.
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
                    

                break;

                case "3": case "v": case "view" : case "view balance": case "bal":

                break;

                case "4": case "e" : case "exit":
                    obj.goodbye();
                break;

                default: obj.invalidInput();
            }
        }

    }

}