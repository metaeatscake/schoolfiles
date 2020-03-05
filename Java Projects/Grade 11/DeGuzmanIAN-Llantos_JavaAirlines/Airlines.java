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
        do
        {
            menu.clearScreen();
            menu.startingMenu();
            menu.setLoginMenuChoice(menu.stringInput());

            switch(menu.getLoginMenuChoice().trim())
            {

                case "1":
                    
                    // Loop 1: Login Verification
                    valid.resetAttempts();
                    for(int i = 1; valid.getLoginCheck() == false && valid.getAttempts() < 3;i++)
                    {
                        menu.clearScreen();
                        
                        menu.loginAttemptsCounter(valid);

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
                            valid.setAttempts(i);
                        }
                    }

                    if(valid.getLoginCheck() == true && valid.getAccountType().equals("admin"))
                    {
                        // Loop 2: Admin Menu
                        do
                        {
                            menu.clearScreen();
                            menu.adminMenu();
                            menu.setAdminMenuChoice(menu.stringInput());

                            switch(menu.getAdminMenuChoice().trim())
                            {
                                case "1":
                                    
                                    // Loop 3: Admin Flight Editor
                                    do
                                    {
                                        menu.clearScreen();
                                        menu.flightMenuTitle("admin");
                                        plane1.flightMenuOption(1);
                                        plane2.flightMenuOption(2);
                                        plane3.flightMenuOption(3);
                                        menu.flightMenuExit();
                                        menu.setFlightMenuChoice(menu.stringInput());

                                        switch(menu.getFlightMenuChoice().trim())
                                        {
                                            case "1":

                                                menu.inputLabel("new flight location");
                                                valid.setFlightLocation(menu.stringInput());
                                                menu.inputLabel("new flight price");
                                                valid.setFlightPrice(menu.stringInput());

                                                if(valid.isInputValid() == true)
                                                {
                                                    menu.printFlightChanges(valid, plane1);
                                                    plane1.setFlightLocation(valid.getFlightLocation());
                                                    plane1.setFlightPrice(Double.toString(valid.getFlightPrice()));
                                                    menu.pause();
                                                }
                                                else
                                                {
                                                    menu.invalid("Changes Denied. \nLocation may be blank and/or the new price may not be a number.");
                                                }

                                            break;

                                            case "2":
                                                
                                                menu.inputLabel("new flight location");
                                                valid.setFlightLocation(menu.stringInput());
                                                menu.inputLabel("new flight price");
                                                valid.setFlightPrice(menu.stringInput());

                                                if(valid.isInputValid() == true)
                                                {
                                                    menu.printFlightChanges(valid, plane2);
                                                    plane2.setFlightLocation(valid.getFlightLocation());
                                                    plane2.setFlightPrice(Double.toString(valid.getFlightPrice()));
                                                    menu.pause();
                                                }
                                                else
                                                {
                                                    menu.invalid("Changes Denied. \nLocation may be blank and/or the new price may not be a number.");
                                                }

                                            break;

                                            case "3":
                                                
                                                menu.inputLabel("new flight location");
                                                valid.setFlightLocation(menu.stringInput());
                                                menu.inputLabel("new flight price");
                                                valid.setFlightPrice(menu.stringInput());

                                                if(valid.isInputValid() == true)
                                                {
                                                    menu.printFlightChanges(valid, plane3);
                                                    plane3.setFlightLocation(valid.getFlightLocation());
                                                    plane3.setFlightPrice(Double.toString(valid.getFlightPrice()));
                                                    menu.pause();
                                                }
                                                else
                                                {
                                                    menu.invalid("Changes Denied. \nLocation may be blank and/or the new price may not be a number.");
                                                }

                                            break;

                                            case "4": 
                                                menu.goodbye();
                                                menu.pause();
                                            break;

                                            default: 
                                                menu.invalid("Invalid Input.");
                                        }

                                    } while(!menu.getFlightMenuChoice().equals("4"));

                                break;

                                case "2": 
                                    menu.goodbye(); 
                                    menu.pause();
                                    valid.setLoginCheck(false); 
                                break;

                                default: 
                                    menu.invalid("Invalid Input"); 
                                break;
                            }

                        } while(!menu.getAdminMenuChoice().trim().equals("2"));
                    }

                    else if(valid.getLoginCheck() == true && valid.getAccountType().equals("user"))
                    {
                        // Loop 3: User Menu
                        do
                        {
                            menu.clearScreen();
                            menu.userMenu(valid.getFlightCheck());
                            menu.setUserMenuChoice(menu.stringInput());

                            switch(menu.getUserMenuChoice().trim())
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
                                    valid.setLoginCheck(false);
                                break;

                                default: 
                                    menu.invalid("Invalid Input");
                                break;
                            }

                        } while(!menu.getUserMenuChoice().trim().equals("5"));
                    }

                    else
                    {
                        menu.invalid("Invalid login after three attempts...Returning to starting Menu...");
                    }

                break;

                case "2":
                    menu.goodbye();
                break;

                default: 
                    menu.invalid("Invalid Input"); 
            }

        } while(!menu.getLoginMenuChoice().trim().equals("2"));
    }
}