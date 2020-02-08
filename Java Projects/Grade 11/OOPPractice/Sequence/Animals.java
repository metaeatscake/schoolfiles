public class Animals
{
    //Instance variables
    //All variables are private
    private String eyeColor;
    private String skinColor;
    private String breed;
    private String gender;
    
    // All methods are public
    //Constuctor (default)
    public Animals()
    {
        eyeColor = "Blue";
        skinColor = "Brown";
        breed = "chihuahua";
        gender = "Male";
    }
    //Overloaded constructor
    public Animals(String eyeColor, String skinColor, String breed, String gender)
    {
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.breed = breed;
        this.gender = gender;
    }
    
    //Mutator (void) 'set' prefix
    public void setEyeColor(String eyeColor)
    {
        this.eyeColor = eyeColor;
    }
    public void setSkinColor(String skinColor)
    {
        this.skinColor = skinColor;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    //Accessor (Return) 'get' prefix
    public String getEyeColor()
    {
        return this.eyeColor;
    }
    public String getSkinColor()
    {
        return this.skinColor;
    }
    public String getBreed()
    {
        return this.breed;
    }
    public String getGender()
    {
        return this.gender;
    }
    
    // Custom
    public String printDetails()
    {
        return
        (
            "\nEye Color: " + getEyeColor() +
            "\nSkin Color: " + getSkinColor() +
            "\nBreed: " + getBreed() +
            "\nGender: " + getGender()
        );
    }
}