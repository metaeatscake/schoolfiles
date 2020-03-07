public class Payment
{
    private Flight flight;
    private double cash;

    private boolean numericInput;

    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }
    public void setCash(String cash)
    {
        this.numericInput = true;
        double num = 0;

        try
        {
            num = Double.parseDouble(cash.trim());
        }
        catch(NumberFormatException e)
        {
            this.numericInput = false;
        }

        if(this.numericInput == true)
        {
            this.cash = num;
        }
        
    }

    public double getCash()
    {
        return this.cash;
    }

    public boolean matchMonthInput(Account account,String monthInput)
    {
        boolean cardMonthMatch = false;
        boolean inputMonthMatch = false;
        int inputMatchIndex = 12;
        int cardMatchIndex = 12;

        String monthFullWord[] = {
            "january", "february", "march", 
            "april", "may", "june", 
            "july", "august", "september",
            "october", "november", "december"
        };

        String monthShortenedWord[] = {
            "jan", "feb", "mar",
            "apr", "may", "jun",
            "jul", "aug", "sep",
            "oct", "nov", "dec"
        };

        String monthNumA[] = {
            "1","2","3","4","5","6","7","8","9","10","11","12"
        };

        String monthNumB[] = {
            "01","02","03","04","05","06","07","08","09","10","11","12"
        };

        // Find the index of the card
        for (int i = 0; cardMonthMatch == false && i < monthNumA.length; i++) 
        {
            if(
                account.getMonth() == monthNumA[i] ||
                account.getMonth() == monthNumB[i] ||
                account.getMonth().toLowerCase() == monthFullWord[i] ||
                account.getMonth().toLowerCase() == monthShortenedWord[i]
            ){
                cardMonthMatch = true;
                cardMatchIndex = i;
            }
        }

        // Find the index of the input month
        for (int i = 0; inputMonthMatch == false && i < monthNumA.length; i++) 
        {
            if(monthInput.trim() == monthNumA[i])
            {
                inputMonthMatch = true;
                inputMatchIndex = i;
            }
            else if(monthInput.trim() == monthNumB[i])
            {
                inputMonthMatch = true;
                inputMatchIndex = i;
            }
            else if(monthInput.trim().toLowerCase() == monthFullWord[i])
            {
                inputMonthMatch = true;
                inputMatchIndex = i;
            }
            else if(monthInput.trim().toLowerCase() == monthShortenedWord[i])
            {
                inputMonthMatch = true;
                inputMatchIndex = i;
            }
        }

        // True or False : Input month = Card month?
        return (inputMatchIndex == cardMatchIndex);
    }

    public boolean creditCardPayment(Account account, String cardNumber, String month, String year)
    {
        // Put the whole condition as the return. Test all of these, and if 
        // ANY of them are false, the return is false.
        return
        (
            cardNumber.equals(account.getCardNumber()) && 
            matchMonthInput(account,month) && 
            year.equals(account.getYear())
        );
        
    }

    public boolean cashPayment(double cash)
    {
        // Boolean methods can have the condition in the return.
        return(cash >= flight.getFlightPrice());   
    }

    public boolean isCashInputValid()
    {
        return this.numericInput;
    }
}