public class Flight
{
    private String flightCode;
    private String flightLocation;
    private double flightPrice;

    //Input verification variables
    private boolean fullString;
    private boolean numeric;

    public Flight(){}
    public Flight(String flightCode, String flightLocation, double flightPrice)
    {
        this.flightCode = flightCode;
        this.flightLocation = flightLocation;
        this.flightPrice = flightPrice;
    }

    public void setFlightLocation(String flightLocation)
    {
        this.fullString = true;

        // trim() removes any extra spaces, isEmpty() tests if there is still a letter after removing all spaces.
        if(flightLocation == null || flightLocation.trim().isEmpty())
        {
            this.fullString = false;
        }

        // If the input is not blank, set it as the new location.
        if(this.fullString == true)
        {
            this.flightLocation = flightLocation;
        }
        else
        {
            // If the given input is blank (" " or "     " is the same), set nothing.
        }
    }
    public void setFlightPrice(String flightPrice)
    {
        // Default. Assuming no errors, input will be numeric.
        this.numeric = true;
        double num=0;
        
        try
        {
            // If the input price contained a letter or space in between the numbers, error.
            num = Double.parseDouble(flightPrice.trim());
        }
        catch(NumberFormatException e)
        {
            // The error will make the tester variable false.
            this.numeric = false;
        }

        // Set the price if the input is actually a number.
        if(this.numeric == true)
        {
            this.flightPrice = num;
        }
        else
        {
            // If the given input is not a number, set nothing.
        }
    }
    
    public String getFlightCode()
    {
        return this.flightCode;
    }
    public String getFlightLocation()
    {
        return this.flightLocation;
    }
    public double getFlightPrice()
    {
        return this.flightPrice;
    }

    public void flightMenuOption(int optionNumber)
    {
        System.out.println("["+optionNumber+"] (" + getFlightCode() + ") " + getFlightLocation() + " <Price: " + getFlightPrice() + ">");
    }
    public boolean isInputValid()
    {
        // Simulations
        //      Numeric     fullString  Outcome
        //--------------------------------------
        //      TRUE        TRUE        TRUE
        //      FALSE       TRUE        FALSE
        //      TRUE        FALSE       FALSE
        //      FALSE       FALSE       FALSE
        //--------------------------------------
        // The admin changes are only valid if both LOCATION
        // AND PRICE are acceptable.

        return this.numeric && this.fullString;
    }

}