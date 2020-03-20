public class Square extends Measurements
{
    public Square(){}

    public void perimeter()
    {
        double perim = 4*getSide();
        System.out.println("\nPerimeter: " + perim);
    }

    public double area()
    {
        return Math.pow(getSide(),2);
    }
}