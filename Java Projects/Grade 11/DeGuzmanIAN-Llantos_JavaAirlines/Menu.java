import java.io.*;

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
    }

    public void adminMenu()
    {
        System.out.println("\n--Admin Menu--");
        System.out.println("[1] Edit Flights");
        System.out.println("[2] Logout");
    }

    public void userMenu(boolean flightCheck)
    {
        System.out.println("\n--User Menu--");
        System.out.println("[1] View Account");
        System.out.println("[2] View Flight");
        
        if(flightCheck == true)
        {
            System.out.println("[3] Edit Flight");
        }
        else
        {
            System.out.println("[3] Book Flight");
        }

        System.out.println("[4] Payment");
        System.out.println("[5] Logout");
    }

    public void paymentMenu()
    {
        System.out.println("\n--Payment Menu--");
        System.out.println("[1] Credit Card Payment");
        System.out.println("[2] Cash Payment");
        System.out.println("[3] Back");
    }

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

}