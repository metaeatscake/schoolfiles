public class Validation extends Account
{
    private boolean loginCheck = false;
    private boolean flightCheck = false;

    private int attemptsCtr;
    private int attemptsLimit;

    public void setLoginCheck(boolean loginCheck)
    {
        this.loginCheck = loginCheck;
    }
    public void setFlightCheck(boolean flightCheck)
    {
        this.flightCheck = flightCheck;
    }
    public void setAttempts(int attemptsCtr)
    {
        this.attemptsCtr = attemptsCtr;
    }
    public void setAttemptsLimit(int attemptsLimit)
    {
        this.attemptsLimit = attemptsLimit;
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
    public int getAttemptsLimit()
    {
        return this.attemptsLimit;
    }

    public void resetAttempts()
    {
        this.attemptsCtr = 0;
    }
    
}