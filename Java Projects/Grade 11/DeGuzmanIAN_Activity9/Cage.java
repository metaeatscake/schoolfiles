public class Cage
{
    private int length;
    private int width;
    private int height;
    private boolean clean;
    private boolean covered;

    public Cage()
    {
        this.length = 0;
        this.width = 0;
        this.height = 0;
        this.clean = false;
        this.covered = false;
    }
    public Cage(int length, int width, int height, boolean clean, boolean covered)
    {
        this.length = length;
        this.width = width;
        this.height = height;
        this.clean = clean;
        this.covered = covered;
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
    
    public void cleaned(boolean clean)
    {
        this.clean = clean;
    }
    public void covered(boolean covered)
    {
        this.covered = covered;
    }
    
    public boolean isClean()
    {
        return this.clean;
    }
    public boolean isCovered()
    {
        return this.covered;
    }
}