import java.util.*;

public class CaseSwitchInt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int choys;
        
        System.out.println("\nEnter a number from 1-5: ");
        choys = sc.nextInt();
        
        switch(choys)
        {
            case 1:
                System.out.println("You have chosen death");
            break;
            
            case 2:
                System.out.println("You have chosen 2");
            break;
            
            case 3:
                System.out.println("3 3 3 3 3 3 3 3 3 3 3 3");
            break;
            
            case 4:
                System.out.println("4444444444444444");
            break;
                
            case 5:
                System.out.println("this is 5, yay");
            break;
                
            default:
                System.out.println("hey I said 1 to 5, dummy");
            
        }
    }
}