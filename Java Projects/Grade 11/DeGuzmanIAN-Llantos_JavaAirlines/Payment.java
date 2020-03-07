import java.util.Arrays;
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

    public boolean matchMonthInput(Account account,String input)
    {
        String monthInput = input.trim().toLowerCase();
        int inputMatchIndex = 69;
        int cardMatchIndex = 6969;

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

            if(Arrays.asList(monthFullWord).contains(account.getMonth()))
            {
                cardMatchIndex = Arrays.asList(monthFullWord).indexOf(account.getMonth());
            }
            else if(Arrays.asList(monthShortenedWord).contains(account.getMonth()))
            {
                cardMatchIndex = Arrays.asList(monthShortenedWord).indexOf(account.getMonth());
            }
            else if(Arrays.asList(monthNumA).contains(account.getMonth()))
            {
                cardMatchIndex = Arrays.asList(monthNumA).indexOf(account.getMonth());
            }
            else if(Arrays.asList(monthNumB).contains(account.getMonth()))
            {
                cardMatchIndex = Arrays.asList(monthNumB).indexOf(account.getMonth());
            }
            else
            {
                cardMatchIndex = 13;
            }

        //

        // Find the index of the input month
        
            if(Arrays.asList(monthFullWord).contains(monthInput))
            {
                inputMatchIndex = Arrays.asList(monthFullWord).indexOf(monthInput);
            }
            else if(Arrays.asList(monthShortenedWord).contains(monthInput))
            {
                inputMatchIndex = Arrays.asList(monthShortenedWord).indexOf(monthInput);
            }
            else if(Arrays.asList(monthNumA).contains(monthInput))
            {
                inputMatchIndex = Arrays.asList(monthNumA).indexOf(monthInput);
            }
            else if(Arrays.asList(monthNumB).contains(monthInput))
            {
                inputMatchIndex = Arrays.asList(monthNumB).indexOf(monthInput);
            }
            else
            {
                inputMatchIndex = 12;
            }
        
        //

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