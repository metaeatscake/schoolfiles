import java.io.*;

public class Airlines
{
    public static void main(String args[]) throws IOException, InterruptedException
    {
        Menu menu = new Menu();
        Validation valid = new Validation();
        Payment pay = new Payment();
        Account admin = new Account("admin", "admin", "admin");
        Account user = new Account("user", "user", "user", 
                                    "Warren", "Philippines", "694204206",
                                    "1234567890", "2", "2021");
        Flight plane1 = new Flight("L43Z6F", "Seoul, South Korea", 5000);
        Flight plane2 = new Flight("5PNB61", "Akihabara, Japan", 4500);
        Flight plane3 = new Flight("1KL78H","Beijing, China",4000);

        while(!menu.getLoginMenuChoice().equals("2"))
        {
            menu.clearScreen();
            menu.startingMenu();
            menu.setLoginMenuChoice(menu.stringInput());

            switch(menu.getLoginMenuChoice())
            {
                case "1":

                    valid.resetAttempts();
                    for(int i = 0; valid.getLoginCheck() == false && valid.getAttempts() < 3;i++)
                    {
                        menu.clearScreen();
                        // Testing the attempts OOP
                        System.out.println("(Testing: OOP Attempts Accumulator Loop)");
                        System.out.println("Count of Attempts: " + valid.getAttempts());

                        System.out.print("\nEnter username: ");
                        menu.setLoginInputUsername(menu.stringInput());
                        System.out.print("Enter password: ");
                        menu.setLoginInputPassword(menu.stringInput());

                        if(menu.getLoginInputUsername().equals(admin.getUsername()) && menu.getLoginInputPassword().equals(admin.getPassword()) && valid.getAttempts() < 3)
                        {
                            valid.setLoginCheck(true);
                            valid.resetAttempts();
                        }
                        else if(menu.getLoginInputUsername().equals(user.getUsername()) && menu.getLoginInputPassword().equals(user.getPassword()) && valid.getAttempts() < 3)
                        {
                            valid.setLoginCheck(true);
                            valid.resetAttempts();
                        }
                        else
                        {
                            valid.setLoginCheck(false);
                            valid.setAttempts(i);
                        }
                    }

                break;

                case "2":
                    menu.goodbye();
                break;

                default: menu.invalid("Invalid Input");
            }
        }
    }
}