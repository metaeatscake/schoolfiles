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

        // Change this to control amount of acceptable login attempts
        valid.setAttemptsLimit(3);

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
                    
                    for(int i = 1; valid.getLoginCheck() == false && valid.getAttempts() < valid.getAttemptsLimit();i++)
                    {
                        menu.clearScreen();
                        
                        menu.loginAttemptsCounter(valid);

                        menu.inputLabel("username");
                        valid.setUsername(menu.stringInput());
                        menu.inputLabel("password");
                        valid.setPassword(menu.stringInput());

                        if(valid.getUsername().equals(admin.getUsername()) && valid.getPassword().equals(admin.getPassword()) && valid.getAttempts() < valid.getAttemptsLimit())
                        {
                            valid.setAccountType("admin");
                            valid.resetAttempts();
                            valid.setLoginCheck(true);
                        }
                        else if(valid.getUsername().equals(user.getUsername()) && valid.getPassword().equals(user.getPassword()) && valid.getAttempts() < valid.getAttemptsLimit())
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

                    //==================//
                    //  ADMIN OPTION    //
                    //==================//
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
                                        menu.flightMenuTitle(admin.getAccountType());
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
                                                    plane1.setFlightLocation(valid.getFlightLocation().trim());
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
                                                    plane2.setFlightLocation(valid.getFlightLocation().trim());
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
                                                    plane3.setFlightLocation(valid.getFlightLocation().trim());
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

                    //==============//
                    //  USER OPTION //
                    //==============//
                    else if(valid.getLoginCheck() == true && valid.getAccountType().equals("user"))
                    {
                        // Loop 4: User Menu
                        do
                        {
                            menu.clearScreen();
                            menu.userMenu(valid.getFlightCheck());
                            menu.setUserMenuChoice(menu.stringInput());

                            switch(menu.getUserMenuChoice().trim())
                            {
                                case "1":

                                    menu.clearScreen();
                                    user.viewAccountDetails();
                                    menu.pause();

                                break;

                                case "2":

                                    // Loop 5: Account Edit Menu
                                    do
                                    {
                                        menu.clearScreen();
                                        menu.accountEditMenu(user);
                                        menu.setAccountEditMenuChoice(menu.stringInput());

                                        switch(menu.getAccountEditMenuChoice().trim())
                                        {
                                            case "1":

                                                menu.inputLabel("new username");
                                                valid.setUsername(menu.stringInput());

                                                if(valid.isStringFull() == true)
                                                {
                                                    menu.printAccountEdits(valid, user, "username");
                                                    user.setUsername(valid.getUsername());
                                                    menu.pause();
                                                } 
                                                else
                                                {
                                                    menu.invalid("Changes Denied.\nThe given username is blank.");
                                                }

                                            break;

                                            case "2":

                                                menu.inputLabel("new password");
                                                valid.setPassword(menu.stringInput());

                                                if(valid.isStringFull() == true)
                                                {
                                                    menu.printAccountEdits(valid, user, "password");
                                                    user.setPassword(valid.getPassword());
                                                    menu.pause();
                                                }
                                                else
                                                {
                                                    menu.invalid("Changes denied.\nThe given password is blank");
                                                }
                                              
                                            break;

                                            case "3":

                                                menu.inputLabel("new name");
                                                valid.setName(menu.stringInput());

                                                if(valid.isStringFull() == true)
                                                {
                                                    menu.printAccountEdits(valid, user, "name");
                                                    user.setName(valid.getName());
                                                    menu.pause();
                                                }
                                                else
                                                {
                                                    menu.invalid("Changes denied.\nThe given name is blank.");
                                                }

                                            break;

                                            case "4":

                                                menu.inputLabel("new address");
                                                valid.setAddress(menu.stringInput());

                                                if(valid.isStringFull() == true)
                                                {
                                                    menu.printAccountEdits(valid, user, "address");
                                                    user.setAddress(valid.getAddress());
                                                    menu.pause();
                                                }
                                                else
                                                {
                                                    menu.invalid("Changes denied.\nThe given address is blank.");
                                                }

                                            break;

                                            case "5":

                                                menu.inputLabel("new contact number: ");
                                                valid.setContactNumber(menu.stringInput());

                                                if(valid.isStringFull() == true)
                                                {
                                                    menu.printAccountEdits(valid, user, "contactNumber");
                                                    user.setContactNumber(valid.getContactNumber());
                                                    menu.pause();
                                                }
                                                else
                                                {
                                                    menu.invalid("Changes denied.\nThe given contact number is blank.");
                                                }

                                            break;

                                            case "6":
                                                menu.goodbye();
                                                menu.pause();
                                            break;

                                            default: 
                                                menu.invalid("Invalid Input.");
                                        }

                                    } while(!menu.getAccountEditMenuChoice().trim().equals("6"));

                                break;

                                case "3":

                                    // A flight is booked. show details.
                                    if(valid.getFlightCheck() == true)
                                    {
                                        menu.clearScreen();
                                        user.viewFlightDetails();
                                        menu.pause();
                                    }

                                    // A flight is not yet booked. show this message.
                                    else
                                    {
                                        menu.invalid("You have not booked a flight yet...");
                                    }

                                break;

                                case "4":

                                    // A flight is booked. Show a menu to change it.
                                    if(valid.getFlightCheck() == true)
                                    {
                                        // Loop 6A : User Flight Menu (Changing Booked Flight)
                                        do
                                        {
                                            menu.clearScreen();
                                            menu.flightMenuTitle(user.getAccountType());
                                            plane1.flightMenuOption(1);
                                            plane2.flightMenuOption(2);
                                            plane3.flightMenuOption(3);
                                            menu.flightMenuExit();
                                            menu.setFlightMenuChoice(menu.stringInput());

                                            switch(menu.getFlightMenuChoice().trim())
                                            {
                                                case "1":
                                                    menu.printUserFlight(user.getFlight(), plane1);
                                                    user.setFlight(plane1);
                                                    menu.pause();
                                                break;

                                                case "2":
                                                    menu.printUserFlight(user.getFlight(), plane2);
                                                    user.setFlight(plane2);
                                                    menu.pause();
                                                break;

                                                case "3":
                                                    menu.printUserFlight(user.getFlight(), plane3);
                                                    user.setFlight(plane3);
                                                    menu.pause();
                                                break;

                                                case "4":
                                                    menu.goodbye();
                                                    menu.pause();
                                                break;

                                                default: 
                                                    menu.invalid("Invalid Input.");
                                            }

                                        } while(
                                            !menu.getFlightMenuChoice().trim().equals("1") &&
                                            !menu.getFlightMenuChoice().trim().equals("2") &&
                                            !menu.getFlightMenuChoice().trim().equals("3") &&
                                            !menu.getFlightMenuChoice().trim().equals("4")
                                        );

                                    }

                                    else
                                    {
                                        // Loop 6B : User Flight Menu (Pick a flight to book)
                                        do
                                        {
                                            menu.clearScreen();
                                            menu.flightMenuTitle(user.getAccountType());
                                            plane1.flightMenuOption(1);
                                            plane2.flightMenuOption(2);
                                            plane3.flightMenuOption(3);
                                            menu.flightMenuExit();
                                            menu.setFlightMenuChoice(menu.stringInput());
                                            
                                            switch(menu.getFlightMenuChoice().trim())
                                            {
                                                case "1":
                                                    menu.printUserFlight(plane1);
                                                    user.setFlight(plane1);
                                                    valid.setFlightCheck(true);
                                                    menu.pause();
                                                break;

                                                case "2":
                                                    menu.printUserFlight(plane2);
                                                    user.setFlight(plane2);
                                                    valid.setFlightCheck(true);
                                                    menu.pause();
                                                break;

                                                case "3":
                                                    menu.printUserFlight(plane3);
                                                    user.setFlight(plane3);
                                                    valid.setFlightCheck(true);
                                                    menu.pause();
                                                break;

                                                case "4":
                                                    menu.goodbye();
                                                    menu.pause();
                                                break;

                                                default:
                                                    menu.invalid("Invalid Input.");
                                            }

                                        } while(
                                            !menu.getFlightMenuChoice().trim().equals("1") &&
                                            !menu.getFlightMenuChoice().trim().equals("2") &&
                                            !menu.getFlightMenuChoice().trim().equals("3") &&
                                            !menu.getFlightMenuChoice().trim().equals("4")
                                        );

                                    }

                                break;

                                case "5":

                                    if(valid.getFlightCheck() == true)
                                    {
                                        do
                                        {
                                            pay.setFlight(user.getFlight());
                                            menu.clearScreen();
                                            menu.paymentMenu();
                                            menu.setPaymentMenuChoice(menu.stringInput());

                                            switch(menu.getPaymentMenuChoice().trim())
                                            {
                                                case "1": 

                                                    menu.flightPayment(user.getFlight(), user);
                                                    menu.inputLabel("Card Number");
                                                    valid.setCardNumber(menu.stringInput());
                                                    menu.inputLabel("Card Expiration Month");
                                                    valid.setMonth(menu.stringInput());
                                                    menu.inputLabel("Card Expiration Year");
                                                    valid.setYear(menu.stringInput());

                                                    if(pay.creditCardPayment(user,valid.getCardNumber(), valid.getMonth(), valid.getYear()) == true)
                                                    {
                                                        menu.flightPaymentReceipt();
                                                        menu.pause();
                                                    }
                                                    else
                                                    {
                                                        menu.invalid("Payment Denied.\nInvalid card details.");
                                                    }

                                                break;

                                                case "2":

                                                    menu.flightPayment(user.getFlight());
                                                    menu.inputLabel("payment: ");
                                                    pay.setCash(menu.stringInput());

                                                    if(pay.isCashInputValid() == true)
                                                    {
                                                        if(pay.cashPayment(pay.getCash()) == true)
                                                        {
                                                            menu.flightPaymentReceipt();
                                                            menu.pause();
                                                        }
                                                        else
                                                        {
                                                            menu.invalid("Payment Denied.\nThe payment is not enough to pay for this flight...");
                                                        }
                                                    }
                                                    else
                                                    {
                                                        menu.invalid("Payment Denied.\nThe cash input is not valid number.");
                                                    }

                                                break;

                                                case "3":

                                                    menu.goodbye();
                                                    menu.pause();

                                                break;

                                                default:

                                                    menu.invalid("Invalid Input.");
                                            }

                                        } while(
                                            !menu.getPaymentMenuChoice().trim().equals("3") &&
                                            !menu.getPaymentMenuChoice().trim().equals("2") &&
                                            !menu.getPaymentMenuChoice().trim().equals("1")
                                        );
                                    }

                                    else
                                    {
                                        menu.invalid("Cannot Proceed. No booked flight yet.");
                                    }

                                break;

                                case "6":
                                    menu.goodbye();
                                    menu.pause();
                                    valid.setLoginCheck(false);
                                break;

                                default: 
                                    menu.invalid("Invalid Input");
                                break;
                            }

                        } while(!menu.getUserMenuChoice().trim().equals("6"));
                    }

                    else
                    {
                        menu.invalid("Invalid login after "+ valid.getAttemptsLimit() + " attempts...Returning to starting Menu...");
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