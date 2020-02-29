public class CreditCard extends Flight
{
    private String cardNumber;
    private String month;
    private String year;

    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }
    public void setMonth(String month)
    {
        this.month = month;
    }
    public void setYear(String year)
    {
        this.year = year;
    }

    public String getCardNumber()
    {
        return this.cardNumber;
    }
    public String getMonth()
    {
        return this.month;
    }
    public String getYear()
    {
        return this.year;
    }
}