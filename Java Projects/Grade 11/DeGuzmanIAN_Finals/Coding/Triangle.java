public class Triangle extends Measurements
{
    public Triangle(){}

    public void perimeter()
    {
        double perim = getSide() + getLength() + getWidth();
        System.out.println("\nPerimeter: " + perim);
    }

    public double area()
    {
        double area = (getBase()*getHeight()) / 2.0;
        return area;
    }
}