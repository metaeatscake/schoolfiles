import java.io.*;
import java.util.*;
public class Menu
{
    private String loginMenuChoice;
    private String adminMenuChoice;
    private String userMenuChoice;
    private String flightMenuChoice;
    private String paymentMenuChoice;
    private String accountEditMenuChoice;

    public void setLoginMenuChoice(String loginMenuChoice)
    {
        this.loginMenuChoice = loginMenuChoice;
    }
    public void setAdminMenuChoice(String adminMenuChoice)
    {
        this.adminMenuChoice = adminMenuChoice;
    }
    public void setUserMenuChoice(String userMenuChoice)
    {
        this.userMenuChoice = userMenuChoice;
    }
    public void setFlightMenuChoice(String flightMenuChoice)
    {
        this.flightMenuChoice = flightMenuChoice;
    }
    public void setPaymentMenuChoice(String paymentMenuChoice)
    {
        this.paymentMenuChoice = paymentMenuChoice;
    }
    public void setAccountEditMenuChoice(String accountEditMenuChoice)
    {
        this.accountEditMenuChoice = accountEditMenuChoice;
    }

    public String getLoginMenuChoice()
    {
        return this.loginMenuChoice;
    }
    public String getAdminMenuChoice()
    {
        return this.adminMenuChoice;
    }
    public String getUserMenuChoice()
    {
        return this.userMenuChoice;
    }
    public String getFlightMenuChoice()
    {
        return this.flightMenuChoice;
    }
    public String getPaymentMenuChoice()
    {
        return this.paymentMenuChoice;
    }
    public String getAccountEditMenuChoice()
    {
        return this.accountEditMenuChoice;
    }

    public void startingMenu()
    {
        System.out.println("\n--Java Airlines Login Menu--");
        System.out.println("[1] Login");
        System.out.println("[2] Exit");
        System.out.print("\nEnter Choice: ");
    }

    public void adminMenu()
    {
        System.out.println("\n--Admin Menu--");
        System.out.println("[1] Edit Flights");
        System.out.println("[2] Logout");
        System.out.print("\nEnter Choice: ");
    }

    public void userMenu(boolean flightCheck)
    {
        System.out.println("\n--User Menu--");
        System.out.println("[1] View Account");
        System.out.println("[2] Edit Account");
        System.out.println("[3] View Flight ");

        if (flightCheck == true) {

            System.out.println("[4] Edit Flight");

        } else 
        {
            System.out.println("[4] Book Flight");
        }

        System.out.println("[5] Payment");
        System.out.println("[6] Logout");
        System.out.print("\nEnter Choice: ");
    }

    public void paymentMenu()
    {
        System.out.println("\n--Payment Menu--");
        System.out.println("[1] Credit Card Payment");
        System.out.println("[2] Cash Payment");
        System.out.println("[3] Back");
        System.out.print("\nEnter Choice: ");
    }

    

      //                  //
     //  CUSTOM METHODS  //
    //                  //

    // Objects

        private Scanner scanner = new Scanner(System.in);

    //

    // Console Control

        public void clearScreen() throws IOException, InterruptedException 
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }

        public void pause() throws IOException
        {
            System.out.println("\n------------------------");
            System.out.println("Press Enter to Continue.");
            System.out.println("------------------------\n");
            System.in.read();
        }

    //

    // Input Process (through Scanner)

        public String stringInput()
        {
            return scanner.nextLine();
        }

        public double doubleInput()
        {
            return Double.parseDouble(scanner.nextLine());
        }

    //

    // Misc Special Methods

        public String hidePassword(String password)
        {
            String output = "";

            for (int i = 0; i < password.length(); i++) 
            {
                output += "*";
            }
            return output;
        }

    //

    // General Print Methods

        public void goodbye()
        {
            System.out.println("\n+----------+");
            System.out.println("| Goodbye! |");
            System.out.println("+----------+");
        }

        public void invalid(String invalidMessage) throws IOException
        {
            System.out.println("\n" + invalidMessage);
            pause();
        }

        public void inputLabel(String inputLabel)
        {
            System.out.print("\nEnter " + inputLabel + ": ");
        }

    //

    // Special Print Methods

        public void loginAttemptsCounter(Validation valid)
        {
            System.out.println("Attempts: " + valid.getAttempts());
        }

        public void flightMenuTitle(String accountType)
        {
            String menuLabel = "";

            if(accountType.equals("user"))
            {
                menuLabel = "Booking";
            }
            else if(accountType.equals("admin"))
            {
                menuLabel = "Editor";
            }
            System.out.println("\n---Flight " + menuLabel + " Menu---");
            System.out.println("Please select a flight...");
        }

        public void flightMenuExit()
        {
            System.out.println("[4] Exit");
            System.out.print("\nEnter Choice: ");
        }

        public void printFlightChanges(Flight holderObject, Flight targetObject)
        {
            System.out.println("\nChanges Applied Successfully...");

            System.out.println("\nOriginal Values:");
            System.out.println("\tLocation: " + targetObject.getFlightLocation());
            System.out.println("\tPrice: " + targetObject.getFlightPrice());

            System.out.println("\nNew Values: ");
            System.out.println("\tLocation: " + holderObject.getFlightLocation());
            System.out.println("\tPrice: " + holderObject.getFlightPrice());
        }

        public void printUserFlight(Flight oldFlight, Flight newFlight)
        {
            System.out.println("\nFlight Changed Successfully...");

            System.out.println("\nPrevious Flight Details: ");
            System.out.println("\tCode: " + oldFlight.getFlightCode());
            System.out.println("\tDestination: " + oldFlight.getFlightLocation());
            System.out.println("\tPrice: " + oldFlight.getFlightPrice());

            System.out.println("\nNew Flight Details:");
            System.out.println("\tCode: " + newFlight.getFlightCode());
            System.out.println("\tDestination: " + newFlight.getFlightLocation());
            System.out.println("\tPrice: " + newFlight.getFlightPrice());
        }

        public void printUserFlight(Flight newFlight)
        {
            System.out.println("\nFlight Booked Successfully...");

            System.out.println("\nFlight Details: ");
            System.out.println("\tCode: " + newFlight.getFlightCode());
            System.out.println("\tDestination: " + newFlight.getFlightLocation());
            System.out.println("\tPrice: " + newFlight.getFlightPrice());
        }
        
        public void accountEditMenu(Account account)
        {
            System.out.println("\n--Account Editing Menu--");
            System.out.println("[1] Edit Username <" + account.getUsername() + ">");
            System.out.println("[2] Edit Password <" + hidePassword(account.getPassword()) + ">");
            System.out.println("[3] Edit Name <" + account.getName() + ">");
            System.out.println("[4] Edit Address <" + account.getAddress() + ">");
            System.out.println("[5] Edit Contact Number <" + account.getContactNumber() + ">");
            System.out.println("[6] Exit");
            System.out.print("\nEnter Choice: ");
        }

        public void printAccountEdits(Account holderObject, Account targetObject, String changedVariable)
        {
            System.out.println("\nChanges Applied Successfully...");

            if(changedVariable.equals("username")) {
                
                System.out.println("\tOld Username: " + targetObject.getUsername());
                System.out.println("\tNew Username: " + holderObject.getUsername());

            } else if(changedVariable.equals("password")){
                
                System.out.println("\tOld Password: " + hidePassword(targetObject.getPassword()));
                System.out.println("\tNew Password: " + hidePassword(holderObject.getPassword()));
            
            } else if(changedVariable.equals("name")){

                System.out.println("\tOld Name: " + targetObject.getName());
                System.out.println("\tNew Name: " + holderObject.getName());

            } else if(changedVariable.equals("address")){

                System.out.println("\tOld Address: " + targetObject.getAddress());
                System.out.println("\tMew Address: " + holderObject.getAddress());

            } else if(changedVariable.equals("contactNumber")){

                System.out.println("\tOld Contact Number: " + targetObject.getContactNumber());
                System.out.println("\tNew Contact Number: " + holderObject.getContactNumber());

            } else{

                System.out.println("\t(This given variable is not valid...)");

            }

        }

        public void flightPayment(Flight flight)
        {
            System.out.println("\n--Cash Payment for Flight [" + flight.getFlightCode() + "]--");
            System.out.println("Price: " + flight.getFlightPrice());
        }

        public void flightPayment(Flight flight, Account payer)
        {
            System.out.println("\n--Card Payment for Flight [" + flight.getFlightCode() + "]--");
            System.out.println("Price: " + flight.getFlightPrice());
            System.out.println("Account Holder: " + payer.getName());
        }

        public void flightPaymentReceipt()
        {
            System.out.println("\nFlight Successfully Paid...");
        }
    //

}