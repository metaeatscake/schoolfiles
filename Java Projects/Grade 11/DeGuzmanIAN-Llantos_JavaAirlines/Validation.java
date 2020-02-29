public class Validation extends Account
{
    private boolean loginCheck = false;
    private boolean flightCheck = false;

    public void setLoginCheck(boolean loginCheck)
    {
        this.loginCheck = loginCheck;
    }
    public void setFlightCheck(boolean flightCheck)
    {
        this.flightCheck = flightCheck;
    }

    public boolean getLoginCheck()
    {
        return this.loginCheck;
    }
    public boolean getFlightCheck()
    {
        return this.flightCheck;
    }
}