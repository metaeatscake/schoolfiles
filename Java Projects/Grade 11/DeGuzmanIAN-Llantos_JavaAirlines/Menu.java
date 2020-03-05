import java.io.*;
import java.util.*;
public class Menu
{
    private String loginMenuChoice;
    private String adminMenuChoice;
    private String userMenuChoice;
    private String flightMenuChoice;
    private String paymentMenuChoice;

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
        System.out.println("[2] View Flight");
        
        if(flightCheck() == true)
        {
            System.out.println("[3] Edit Flight");
        }
        else
        {
            System.out.println("[3] Book Flight");
        }

        System.out.println("[4] Payment");
        System.out.println("[5] Logout");
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

    // CUSTOM STUFF
    private Scanner scanner = new Scanner(System.in);
    
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
    public String stringInput()
    {
        return scanner.nextLine();
    }
    public double doubleInput()
    {
        return Double.parseDouble(scanner.nextLine());
    }
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
        System.out.print("Enter Choice: ");
    }
    public void printFlightChanges(Flight holderObject, Flight targetObject)
    {
        System.out.println("\nChanges Applied Successfully...");
        
        System.out.println("\nOriginal Values:");
        System.out.println("\n\tLocation: " + targetObject.getFlightLocation());
        System.out.println("\n\tPrice: " + targetObject.getFlightPrice());

        System.out.println("\nNew Values: ");
        System.out.println("\n\tLocation: " + holderObject.getFlightLocation());
        System.out.println("\n\tPrice: " + holderObject.getFlightPrice());
    }
}