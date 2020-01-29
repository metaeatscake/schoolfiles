import java.util.*;

public class CaseSwitchString
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        
        String choice;
        
        System.out.print("Enter a day: ");
        choice = sc.nextLine();
        
        switch(choice.toLowerCase())
        //.toLowerCase()
        //.toUpperCase()
        {
            case "monday":
                System.out.println("PE Dehhhy");
            break;
                
            case "tuesday":
                System.out.println("zero twosday");
            break;
            
            case "wednesday":
                System.out.println("its wednesday my doods");
            break;
            
            case "thursday":
                System.out.println("thorsdei");
            break;
            
            case "friday" :
                System.out.println("it's friday, friday, gonna get down on friday");
            break;
            
            case "saturday":
                System.out.println("satuday by rebeka blacc");
            break;
            
            case "sunday":
                System.out.println("very sunny dei");
            break;
            
            default:
                System.out.println("that aint a day dumdum");
        }
    }
}