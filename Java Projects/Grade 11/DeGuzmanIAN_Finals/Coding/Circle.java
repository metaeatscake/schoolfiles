public class Circle extends Measurements
{
    private final double pi = 3.14;

    public Circle(){}

    public void circumference()
    {
        double circumference = 2*pi*getRadius();
        System.out.println("\nCircumference: " + circumference);
    }

    public double area()
    {
        return pi * Math.pow(getRadius(), 2);
    }
}