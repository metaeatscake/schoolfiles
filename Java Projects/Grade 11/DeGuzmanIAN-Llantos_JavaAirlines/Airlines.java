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

        // Loop 0: Login Menu
        while(!menu.getLoginMenuChoice().equals("2"))
        {
            menu.clearScreen();
            menu.startingMenu();
            menu.setLoginMenuChoice(menu.stringInput());

            switch(menu.getLoginMenuChoice())
            {

                case "1":
                    
                    // Loop 1: Login Verification
                    valid.resetAttempts();
                    for(int i = 0; valid.getLoginCheck() == false && valid.getAttempts() < 3;i++)
                    {
                        menu.clearScreen();
                        // Testing the attempts OOP
                        System.out.println("(Testing: OOP Attempts Accumulator Loop)");
                        System.out.println("Count of Attempts: " + valid.getAttempts());

                        menu.inputLabel("username");
                        valid.setUsername(menu.stringInput());
                        menu.inputLabel("password");
                        valid.setPassword(menu.stringInput());

                        if(valid.getUsername().equals(admin.getUsername()) && valid.getPassword().equals(admin.getPassword()) && valid.getAttempts() < 3)
                        {
                            valid.setAccountType("admin");
                            valid.resetAttempts();
                            valid.setLoginCheck(true);
                        }
                        else if(valid.getUsername().equals(user.getUsername()) && valid.getPassword().equals(user.getPassword()) && valid.getAttempts() < 3)
                        {
                            valid.setAccountType("user");
                            valid.resetAttempts();
                            valid.setLoginCheck(true);
                        }
                        else
                        {
                            //valid.setLoginCheck(false);
                            valid.setAttempts(i);
                        }
                    }

                    if(valid.getLoginCheck() == true && valid.getAccountType().equals("admin"))
                    {
                        // Loop 2: Admin Menu
                        while(!menu.getAdminMenuChoice().equals("2"))
                        {
                            menu.clearScreen();
                            menu.adminMenu();
                            menu.setAdminMenuChoice(menu.stringInput());

                            switch(menu.getAdminChoice())
                            {
                                case "1":

                                break;

                                case "2": 
                                    menu.goodbye(); 
                                    menu.pause(); 
                                break;

                                default: 
                                    menu.invalid("Invalid Input"); 
                                    menu.pause();
                                break;
                            }
                        }
                    }

                    else if(valid.getLoginCheck() == true && valid.getAccountType().equals("user"))
                    {
                        // Loop 3: User Menu
                        while(!menu.getUserMenuChoice().equals("5"))
                        {
                            menu.clearScreen();
                            menu.userMenu(valid.getFlightCheck());
                            menu.setUserMenuChoice(menu.stringInput());

                            switch(menu.getUserMenuChoice())
                            {
                                case "1":

                                break;

                                case "2":

                                break;

                                case "3":

                                break;

                                case "4":

                                break;

                                case "5":
                                    menu.goodbye();
                                    menu.pause();
                                break;

                                default: 
                                    menu.invalid("Invalid Input");
                                    menu.pause();
                                break;
                            }
                        }
                    }

                break;

                case "2":
                    menu.goodbye();
                break;

                default: 
                    menu.invalid("Invalid Input"); 
                    menu.pause();
            }
        }
    }
}