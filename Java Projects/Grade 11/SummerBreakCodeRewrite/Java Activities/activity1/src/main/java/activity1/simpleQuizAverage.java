package main.java.activity1;

import java.util.*;

public final class simpleQuizAverage
{
    private double score[];
    private double average;

    private Scanner sc = new Scanner(System.in);

    // Default Constructor
    public simpleQuizAverage()
    {
        setScoreArray(4);
    }

    // Custom Constructor
    public simpleQuizAverage(int scoreArraySize)
    {
        setScoreArray(scoreArraySize);
    }

    private void setScoreArray(int scoreArraySize)
    {
        this.score = new double[scoreArraySize];
    }

    private void setScore(int index, double value)
    {
        this.score[index] = value;
    }

    public void scoreInput()
    {
        for(int i = 0; i < score.length; i++)
        {
            System.out.println("Enter value for Quiz [" + (i+1) + "]: ");
            setScore(i, Double.parseDouble(sc.nextLine()));
        }
    }

    public double getAverage()
    {
        double sum = 0;

        for(int i = 0; i < score.length; i++)
        {
            sum += score[i];
        }
        
        this.average = sum / score.length;

        return this.average;
    }

}