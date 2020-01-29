import java.util.*;

public class CaseSwitchChar
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        
        char choiss;
        
        System.out.print("\nEnter a vowel: ");
        choiss = sc.nextLine().charAt(0);
        
        switch(choiss)
        {
            case 'A': case 'a':
                System.out.println("u succ AAAAA");
            break;
            
            case 'E': case 'e':
                System.out.println("u succ EEEEEEEEE");
            break;
            
            case 'I': case 'i':
                System.out.println("u succ IIIIIII");
            break;
            
            case 'O': case 'o':
                System.out.println("u succ OOOOOOOOO");
            break;
            
            case 'U': case 'u':
                System.out.println("u succ Uuuuuuuuuu");
            break;
            
            default:
                System.out.println("u cool");
        }
    }
}
