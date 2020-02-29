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


}