public class Account extends CreditCard
{
    private String username;
    private String password;
    private String accountType;
    private String name;
    private String address;
    private String contactNumber;
    private Flight flight;

    private boolean fullString;

    public Account(){}
    public Account(String username, String password, String accountType)
    {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }
    public Account( String username,    String password,    String accountType,
                    String name,        String address,     String contactNumber,
                    String cardNumber,  String month,       String year)
    {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        setCardNumber(cardNumber);
        setMonth(month);
        setYear(year);
    }

    public void setUsername(String username)
    {
        this.fullString = true;

        if(username == null || username.trim().isEmpty())
        {
            this.fullString = false;
        }

        if(this.fullString == true)
        {
            this.username = username;
        }
    }

    public void setPassword(String password)
    {
        this.fullString = true;

        if(password == null || password.trim().isEmpty())
        {
            this.fullString = false;
        }

        if(this.fullString == true)
        {
            this.password = password;
        }
    }

    // Does not need verification
    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }

    public void setName(String name)
    {
        this.fullString = true;

        if(name == null || name.trim().isEmpty())
        {
            this.fullString = false;
        }

        if(this.fullString == true)
        {
            this.name = name;
        }
    }

    public void setAddress(String address)
    {
        this.fullString = true;

        if(address == null || address.trim().isEmpty())
        {
            this.fullString = false;
        }

        if(this.fullString == true)
        {
            this.address = address;
        }
    }

    public void setContactNumber(String contactNumber)
    {
        this.fullString = true;

        if(contactNumber == null || contactNumber.trim().isEmpty())
        {
            this.fullString = false;
        }

        if(this.fullString == true)
        {
            this.contactNumber = contactNumber;
        }
    }
    
    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }

    public String getUsername()
    {
        return this.username;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getAccountType()
    {
        return this.accountType;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAddress()
    {
        return this.address;
    }
    public String getContactNumber()
    {
        return this.contactNumber;
    }
    public Flight getFlight()
    {
        return this.flight;
    }

    public void viewAccountDetails()
    {
        System.out.println("\n---Account Details---");
        System.out.println("Username: " + getUsername());
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact Number: " + getContactNumber());
    }

    public void viewFlightDetails()
    {
        System.out.println("\n---Flight Details---");
        System.out.println("Code: " + flight.getFlightCode());
        System.out.println("Location: " + flight.getFlightLocation());
        System.out.println("Price: " + flight.getFlightPrice());
    }

    public boolean isStringFull()
    {
        return this.fullString;
    }
}