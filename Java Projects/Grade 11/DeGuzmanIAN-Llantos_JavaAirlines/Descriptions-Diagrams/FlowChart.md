```@startuml
start

    partition initializeObjects{

        :Menu menu = new Menu()}
        :Validation valid = new Validation()}
        :Payment pay = new Payment()}
        :Account admin = new Account("admin", "admin", "admin")}
        :Account user = new Account("user", "user", "user", "Warren", "Philippines", "694204206", "1234567890", "2", "2021")}
        :Flight plane1 = new Flight("L43Z6F", "Seoul, South Korea", 5000)}
        :Flight plane2 = new Flight("5PNB61", "Akihabara, Japan", 4500)}
        :Flight plane3 = new Flight("1KL78H","Beijing, China",4000)}

    }

    repeat 

        partition startingMenu{

            :menu.clearScreen()]
            :Print menu.startingMenu()/
            :Input for menu.setLoginMenuChoice()/
            :switch(menu.getLoginMenuChoice());

        }        

        if(case "1") then (yes)

            partition loginLoop{

                :valid.resetAttempts()]
                :valid.setAttemptsLimit(3)]
                :int i = 1 (for loop)}

                repeat

                    :menu.clearScreen()]
                    :Print menu.loginAttemptsCounter()/
                    :Print "Enter username: "/
                    :Input for valid.setUsername()/
                    :Print "Enter password: "/
                    :Input for valid.setPassword()/

                    if(valid.getUsername().equals(**admin**.getUsername()) &&\nvalid.getPassword().equals(**admin**.getPassword()) &&\nvalid.getAttempts() < valid.getAttemptsLimit()) then (true)

                        :valid.setAccountType("admin")]
                        :valid.setLoginCheck(true)]

                    else if(valid.getUsername().equals(**user**.getUsername()) &&\nvalid.getPassword().equals(**user**.getPassword()) &&\nvalid.getAttempts() < valid.getAttemptsLimit()) then (true)

                        :valid.setAccountType("user")]
                        :valid.setLoginCheck(true)]

                    else (false)

                        :valid.setAttempts(i)]
                        :i++]

                    endif

                repeat while(valid.getLoginCheck() == false &&\nvalid.getAttempts() < valid.getAttemptsLimit()) is (true)
                -> false;
            }

            if(valid.getAccountType.equals("admin") &&\n valid.getLoginCheck() == true) then (true)

                repeat

                    partition adminMenu{

                        :menu.clearScreen()]
                        :Print menu.adminMenu()/
                        :Print "Enter choice: "/
                        :Input for menu.setAdminMenuChoice()/
                        :switch(menu.getAdminMenuChoice());
                    }

                    if(case "1") then (yes)

                        repeat

                            partition adminFlightEditMenu{

                                :menu.clearScreen()]
                                :Print menu.flightMenuTitle()/
                                :Print plane1.flightMenuOption(1)/
                                :Print plane2.flightMenuOption(2)/
                                :Print plane3.flightMenuOption(3)/
                                :Print menu.flightMenuExit()/
                                :Print "Enter choice: "/
                                :Input for menu.setFlightMenuChoice()/
                                :switch(menu.getFlightMenuChoice());

                            }

                            partition adminFlightEditProcess{

                                if(case "1") then (yes)

                                    :Print "Enter new flight location: "/
                                    :Input for valid.setFlightLocation()/
                                    :Print "Enter new flight price: "/
                                    :Input for valid.setFlightPrice()/
                                    :Input Verification Process]

                                    if(menu.isInputValid()) then (true)

                                        :Print menu.printFlightChanges()/
                                        :plane1.setFlightLocation(valid.getFlightLocation())]
                                        :plane1.setFlightPrice(Double.toString(valid.getFlightPrice()))]
                                        :menu.pause()]

                                    else (false)

                                        :Print menu.invalid("Invalid Input.\nGiven location may be blank and/or\ngiven price may not be a number")/

                                    endif

                                elseif (case "2") then (yes)

                                    :Print "Enter new flight location: "/
                                    :Input for valid.setFlightLocation()/
                                    :Print "Enter new flight price: "/
                                    :Input for valid.setFlightPrice()/
                                    :Input Verification Process]

                                    if(menu.isInputValid()) then (true)

                                        :Print menu.printFlightChanges()/
                                        :plane2.setFlightLocation(valid.getFlightLocation())]
                                        :plane2.setFlightPrice(Double.toString(valid.getFlightPrice()))]
                                        :menu.pause()]

                                    else (false)

                                        :Print menu.invalid("Invalid Input.\nGiven location may be blank and/or\ngiven price may not be a number")/

                                    endif

                                elseif (case "3") then (yes)

                                    :Print "Enter new flight location: "/
                                    :Input for valid.setFlightLocation()/
                                    :Print "Enter new flight price: "/
                                    :Input for valid.setFlightPrice()/
                                    :Input Verification Process]

                                    if(menu.isInputValid()) then (true)

                                        :Print menu.printFlightChanges()/
                                        :plane3.setFlightLocation(valid.getFlightLocation())]
                                        :plane3.setFlightPrice(Double.toString(valid.getFlightPrice()))]
                                        :menu.pause()]

                                    else (false)

                                        :Print menu.invalid("Invalid Input.\nGiven location may be blank and/or\ngiven price may not be a number")/

                                    endif

                                elseif (case "4") then (yes)

                                    :Print menu.goodbye()/
                                    :menu.pause()]

                                else (no)

                                    :Print menu.invalid("Invalid Input.")/
                                    
                                endif
                            }
                        repeat while(!menu.getFlightMenuChoice().equals("4")) is (true)
                        -> false;

                    elseif(case "2") then (yes)

                        partition admin_logout{

                            :Print menu.goodbye()/
                            :menu.pause()]
                            :valid.setLoginCheck(false)]

                        }
                            
                    else(no)
                        :Print menu.invalid("Invalid Input.")/
                    endif

                repeat while(!menu.getAdminMenuChoice().equals("2")) is (true)
                -> false;

            else if(valid.getAccountType.equals("user") &&\n valid.getLoginCheck() == true) then (true)

                repeat

                    partition userMenu{

                        :menu.clearScreen()]
                        :Print menu.userMenu()/
                        :Print "Enter choice: "/
                        :Input for menu.setUserMenuChoice()/
                        :switch(menu.getUserMenuChoice());

                    }

                    if(case "1") then (yes)

                        partition user_viewAccount{

                            :menu.clearScreen()]
                            :Print user.viewAccountDetails()/
                            :menu.pause()]

                        }

                    elseif (case "2") then (yes)

                        repeat

                            partition user_editAccount{

                                :menu.clearScreen()]
                                :Print menu.accountEditMenu()/
                                :Print "Enter choice: "/
                                :Input for menu.setAccountEditMenuChoice()/
                                :switch(menu.getAccountEditMenuChoice());

                            }

                            partition user_editAccount_process{

                                if(case "1") then (yes)
                                    
                                    :Print "Enter new username: "/
                                    :Input for valid.setUsername()/
                                    :Input Verification Process]

                                    if(valid.isStringFull()) then (true)

                                        :Print menu.printAccountEdits()/
                                        :user.setUsername(valid.getUsername())]
                                        :menu.pause()]

                                    else (false)

                                        :Print menu.invalid("The input is blank. Changes denied.")/

                                    endif

                                elseif (case "2") then (yes)
                                    
                                    :Print "Enter new password: "/
                                    :Input for valid.setPassword()/
                                    :Input Verification Process]

                                    if(valid.isStringFull()) then (true)

                                        :Print menu.printAccountEdits()/
                                        :user.setPassword(valid.getPassword())]
                                        :menu.pause()]

                                    else (false)

                                        :Print menu.invalid("The input is blank. Changes denied.")/
                                        
                                    endif

                                elseif (case "3") then (yes)
                                    
                                    :Print "Enter new name: "/
                                    :Input for valid.setName()/
                                    :Input Verification Process]

                                    if(valid.isStringFull()) then (true)

                                        :Print menu.printAccountEdits()/
                                        :user.setName(valid.getName())]
                                        :menu.pause()]

                                    else (false)

                                        :Print menu.invalid("The input is blank. Changes denied.")/
                                        
                                    endif

                                elseif (case "4") then (yes)
                                    
                                    :Print "Enter new address: "/
                                    :Input for valid.setAddress()/
                                    :Input Verification Process]

                                    if(valid.isStringFull()) then (true)

                                        :Print menu.printAccountEdits()/
                                        :user.setAddress(valid.getAddress())]
                                        :menu.pause()]

                                    else (false)

                                        :Print menu.invalid("The input is blank. Changes denied.")/
                                        
                                    endif

                                elseif (case "5") then (yes)
                                    
                                    :Print "Enter new contact number: "/
                                    :Input for valid.setContactNumber()/
                                    :Input Verification Process]

                                    if(valid.isStringFull()) then (true)

                                        :Print menu.printAccountEdits()/
                                        :user.setContactNumber(valid.getContactNumber())]
                                        :menu.pause()]

                                    else (false)

                                        :Print menu.invalid("The input is blank. Changes denied.")/
                                        
                                    endif

                                elseif (case "6") then (yes)

                                    :Print menu.goodbye()/
                                    :menu.pause()]

                                else (no)

                                    :Print menu.invalid("Invalid input")/

                                endif
                            }

                        repeat while(!menu.getAccountEditMenuChoice().equals("6")) is (true)
                        -> false;

                    elseif (case "3") then (yes)

                        partition user_viewFlight{

                            if(valid.getFlightCheck) then (true)

                                :menu.clearScreen()]
                                :Print user.viewFlightDetails()/
                                :menu.pause()]

                            else (false)

                                :Print menu.invalid("You have not booked a flight.")/

                            endif

                        }

                    elseif (case "4") then (yes)

                        if(valid.getFlightCheck()) then (true)

                            repeat

                                partition user_editFlightMenu_booked{
                                    
                                    :menu.clearScreen()]
                                    :Print menu.flightMenuTitle()/
                                    :Print plane1.flightMenuOption(1)/
                                    :Print plane2.flightMenuOption(2)/
                                    :Print plane3.flightMenuOption(3)/
                                    :Print menu.flightMenuExit()/
                                    :Print "Enter choice: "/
                                    :Input for menu.setFlightMenuChoice()/
                                    :switch(menu.getFlightMenuChoice());
                                }

                                partition user_editFlightMenu_booked_process{

                                    if(case "1") then (yes)

                                        :Print menu.printUserFlight()/
                                        :user.setFlight(plane1)]
                                        :menu.pause()]

                                    elseif (case "2") then (yes)

                                        :Print menu.printUserFlight()/
                                        :user.setFlight(plane2)]
                                        :menu.pause()]

                                    elseif (case "3") then (yes)

                                        :Print menu.printUserFlight()/
                                        :user.setFlight(plane3)]
                                        :menu.pause()]

                                    elseif (case "4") then (yes)

                                        :Print menu.goodbye()/
                                        :menu.pause()]

                                    else (no)

                                        :Print menu.invalid("Invalid input.")/

                                    endif

                                }

                            repeat while(!menu.getFlightMenuChoice().equals("1") &&\n!menu.getFlightMenuChoice().equals("2") &&\n!menu.getFlightMenuChoice().equals("3") &&\n!menu.getFlightMenuChoice().equals("4")) is (true)
                            -> false;

                        else (false)

                            repeat

                                partition user_editFlightMenu_noFlight{
                                    
                                    :menu.clearScreen()]
                                    :Print menu.flightMenuTitle()/
                                    :Print plane1.flightMenuOption(1)/
                                    :Print plane2.flightMenuOption(2)/
                                    :Print plane3.flightMenuOption(3)/
                                    :Print menu.flightMenuExit()/
                                    :Print "Enter choice: "/
                                    :Input for menu.setFlightMenuChoice()/
                                    :switch(menu.getFlightMenuChoice());

                                }

                                partition user_editFlightMenu_noFlight_process{

                                    if(case "1") then (yes)

                                        :Print menu.printUserFlight()/
                                        :user.setFlight(plane1)]
                                        :valid.setFlightCheck(true)]
                                        :menu.pause()]

                                    elseif (case "2") then (yes)

                                        :Print menu.printUserFlight()/
                                        :user.setFlight(plane2)]
                                        :valid.setFlightCheck(true)]
                                        :menu.pause()]

                                    elseif (case "3") then (yes)

                                        :Print menu.printUserFlight()/
                                        :user.setFlight(plane3)]
                                        :valid.setFlightCheck(true)]
                                        :menu.pause()]

                                    elseif (case "4") then (yes)

                                        :Print menu.goodbye()/
                                        :menu.pause()]

                                    else (no)

                                        :Print menu.invalid("Invalid input.")/

                                    endif
                                    
                                }

                            repeat while(!menu.getFlightMenuChoice().equals("1") &&\n!menu.getFlightMenuChoice().equals("2") &&\n!menu.getFlightMenuChoice().equals("3") &&\n!menu.getFlightMenuChoice().equals("4")) is (true)
                            -> false;
                        endif

                    elseif (case "5") then (yes)

                        if(valid.getFlightCheck()) then (true)

                            repeat

                                partition user_paymentMenu{
                                    
                                    :pay.setFlight(user.getFlight())]
                                    :menu.clearScreen()]
                                    :Print menu.paymentMenu()/
                                    :Print "Enter choice: "/
                                    :Input for menu.setPaymentMenuChoice()/
                                    :switch(menu.getPaymentMenuChoice());

                                }

                                    
                                if(case "1") then (yes)

                                    partition user_paymentMenu_cardPayment{
                                        
                                        :Print flight destination and price\nmenu.flightPayment()/
                                        :Print "Enter card number: "/
                                        :Input for valid.setCardNumber()/
                                        :Print "Enter card expiration month: "/
                                        :Input for valid.setMonth()/
                                        :Print "Enter card expiration year: "/
                                        :Input for valid.setYear()/

                                        if(pay.creditCardPayment(...)) then (true)

                                            :Print menu.flightPaymentReceipt()/
                                            :menu.pause()]

                                        else (false)
                                            
                                            :Print menu.invalid("Payment denied. Invalid card details")/

                                        endif
                                    }

                                elseif (case "2") then (yes)

                                    partition user_paymentMenu_cashPayment{
                                        
                                        :Print flight destination and price\nmenu.flightPayment()/
                                        :Print "Enter payment: "/
                                        :Input for pay.setCash()/
                                        :Input Verification Process]

                                        if(pay.isCashInputValid) then (true)

                                            if(pay.cashPayment(...)) then (true)

                                                :Print menu.flightPaymentReceipt()/
                                                :menu.pause()]
                                                
                                            else(false)

                                                :Print menu.invalid("Payment denied. The cash input is less than flight price.")/

                                            endif

                                        else (false)

                                            :Print menu.invalid("Payment denied. The cash input is not a number.")/

                                        endif
                                    }

                                elseif (case "3") then (yes)

                                    :Print menu.goodbye()/
                                    :menu.pause()]

                                else (no)

                                    :Print menu.invalid("Invalid Input.")/

                                endif
                                

                            repeat while(!menu.getPaymentMenuChoice().equals("1") &&\n!menu.getPaymentMenuChoice().equals("2") &&\n!menu.getPaymentMenuChoice().equals("3")) is (true)
                            -> false;

                        else (false)

                            :Print menu.invalid("No booked flight to pay.")/

                        endif

                    elseif (case "6") then (yes)

                        partition user_logout{

                            :Print menu.goodbye()/
                            :menu.pause()]
                            :valid.setLoginCheck(false)]

                        }
                            
                    else (no)

                        :Print menu.invalid("Invalid Input")/
                    
                    endif

                repeat while(!menu.getUserMenuChoice().equals("6")) is (true)
                -> false;

            else (false)

                :Print menu.invalid("Invalid login after (3) attempts...")/

            endif
        else if(case "2") then (yes)

        else (no)
            :Print menu.invalid("Invalid Input.")/
        endif

    repeat while (!menu.getLoginMenuChoice().equals("2")) is (true)
    ->false;
        :Print menu.goodbye()/

stop
```@enduml