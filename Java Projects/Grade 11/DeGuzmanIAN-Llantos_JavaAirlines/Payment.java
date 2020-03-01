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
        boolean condition;

        if(cardNumber.equals(account.getCardNumber()) && month.equals(account.getMonth()) && year.equals(account.getYear()))
        {
            condition = true;
        }
        else
        {
            condition = false;
        }

        return condition;
    }

    public boolean cashPayment(double cash)
    {
        boolean condition;

        if(cash >= flight.getFlightPrice())
        {
            condition = true;
        }
        else
        {
            condition = false;
        }

        return condition;
    }

}