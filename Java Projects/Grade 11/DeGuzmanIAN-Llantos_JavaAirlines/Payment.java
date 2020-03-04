public class Payment
{
    private Account account;
    private Flight flight;
    private double cash;

    public void setAccount(Account account)
    {
        this.account = account;
    }
    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }
    public void setCash(double cash)
    {
        this.cash = cash;
    }

    public double getCash()
    {
        return this.cash;
    }

    public boolean creditCardPayment(String cardNumber, String month, String year)
    {
        // Put the whole condition as the return. Test all of these, and if 
        // ANY of them are false, the return is false.
        return
        (
            cardNumber.equals(account.getCardNumber()) && 
            month.equals(account.getMonth()) && 
            year.equals(account.getYear())
        );
        
    }

    public boolean cashPayment(double cash)
    {
        // Boolean methods can have the condition in the return.
        return(cash >= flight.getFlightPrice());   
    }

}