package main.java.activity1;

import java.util.*;

public final class midtermGrade
{
    private double midtermGrade;
    private double minorAScore;
    private double midtermScore;

    public midtermGrade(){}

    public void setMinorAScore(double minorAScore)
    {
        this.minorAScore = minorAScore;
    }

    public void setMidtermScore(double midtermScore)
    {
        this.midtermScore = midtermScore;
    }

    public double getMidtermGrade()
    {
        double weightOfMinorA = 1.0/3.0;
        double weightOfMidterm = 2.0/3.0;

        this.midtermGrade = (midtermScore * weightOfMidterm) + (minorAScore * weightOfMinorA);

        return this.midtermGrade;
    }
}