public class Flight
{
    private String flightCode;
    private String flightLocation;
    private double flightPrice;

    public boolean inputIgnored = false;

    public Flight(){}
    public Flight(String flightCode, String flightLocation, double flightPrice)
    {
        this.flightCode = flightCode;
        this.flightLocation = flightLocation;
        this.flightPrice = flightPrice;
    }

    public void setFlightLocation(String flightLocation)
    {
        boolean blank = false;

        // trim() removes any extra spaces, isEmpty() tests if there is still a letter after removing all spaces.
        if(flightLocation == null || flightLocation.trim().isEmpty())
        {
            blank = true;
        }

        // If the input is not blank, set it as the new location.
        if(blank == false)
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
        boolean numeric = true;

        try
        {
            // If the input price contained a letter or space in between the numbers, error.
            double num = Double.parseDouble(flightPrice.trim());
        }
        catch(NumberFormatException e)
        {
            // The error will make the tester variable false.
            numeric = false;
        }

        // Set the price if the input is actually a number.
        if(numeric == true)
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

    public void flightMenu(int menuNum)
    {
        System.out.println("["+menuNum+"] (" + getFlightCode() + ") " + getFlightLocation() + " <Price: " + getFlightPrice() + ">");
    }

}