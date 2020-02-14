import java.util.*;
public class Cage
{
    private int length;
    private int width;
    private int height;
    private boolean clean;
    private boolean covered;
    
    private static Scanner sc = new Scanner(System.in);
    
    public Cage()
    {
        this.length = 0;
        this.width = 0;
        this.height = 0;
        this.clean = false;
        this.covered = false;
    }
    
    public void setLength(int length)
    {
        this.length = length;
    }
    public void setWidth(int width)
    {
        this.width = width;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public int getLength()
    {
        return this.length;
    }
    public int getWidth()
    {
        return this.width;
    }
    public int getHeight()
    {
        return this.height;
    }
    
    public void cleaned()
    {
        this.clean = true;
    }
    public boolean isClean()
    {
        return this.clean;
    }
    public boolean isCovered()
    {
        return this.covered;
    }
    
    public void printAll()
    {
        //lenght, width, height, clean, covered
        System.out.println("\n---Zoo Cage Details---");
        System.out.println("Cage Length: " + getLength());
        System.out.println("Cage Width: " + getWidth());
        System.out.println("Cage Height: " + getHeight());
        System.out.println("Clean: " + isClean());
        System.out.println("Covered: " + isCovered());
    }
    public void inputAll()
    {
        System.out.println("\n---Zoo Cage Setup---");
        System.out.print("Enter cage length: ");
        setLength(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter cage width: ");
        setWidth(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter cage height: ");
        setHeight(Integer.parseInt(sc.nextLine()));
    }
    
}