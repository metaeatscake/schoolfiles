public class Validation extends Account
{
    private boolean loginCheck = false;
    private boolean flightCheck = false;

    private int attemptsCtr;

    public void setLoginCheck(boolean loginCheck)
    {
        this.loginCheck = loginCheck;
    }
    public void setFlightCheck(boolean flightCheck)
    {
        this.flightCheck = flightCheck;
    }
    public void setAttempts(int counter)
    {
        this.attemptsCtr = counter;
    }

    public boolean getLoginCheck()
    {
        return this.loginCheck;
    }
    public boolean getFlightCheck()
    {
        return this.flightCheck;
    }
    public int getAttempts()
    {
        return this.attemptsCtr;
    }

    public void resetAttempts()
    {
        this.attemptsCtr = 1;
    }
    
}