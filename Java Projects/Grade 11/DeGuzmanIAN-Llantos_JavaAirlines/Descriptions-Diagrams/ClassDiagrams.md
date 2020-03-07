```@startuml
class Menu
{
    -loginMenuChoice : **String**
    -adminMenuChoice : **String**
    -flightMenuChoice : **String**
    -paymentMenuChoice : **String**
    -**accountEditMenuChoice : String**
    ..**Extra Objects**..
    -{field}**scanner : Scanner(System.in)**
    --
    ..Mutators..
    +setLoginMenuChoice(loginMenuChoice : **String**) : void
    +setAdminMenuChoice(adminMenuChoice : ** String**) : void
    +setFlightMenuChoice(flightMenuChoice : **String**) : void
    +setPaymentMenuChoice(paymentMenuChoice : **String**) : void
    +**setAccountEditMenuChoice(accountEditMenuChoice : String)**
    ..Accessors..
    +getLoginMenuChoice() : **String**
    +getAdminMenuChoice() : **String**
    +getFlightMenuChoice() : **String**
    +getPaymentMenuChoice() : **String**
    +**getAccountEditMenuChoice() : String**
    ..Custom Methods..
    +startingMenu() : void
    +adminMenu() : void
    +userMenu(flightCheck : boolean) : void
    +paymentMenu() : void
    --Extra Custom Methods--
    ..Console Modifications..
    +**clearScreen() : void**
    +**pause() : void**
    ..Input Methods..
    +**stringInput() : String**
    +**doubleInput() : double**
    ..Misc Local Methods..
    +**hidePassword(password : String)**
    ..General Print Methods..
    +**goodbye() : void**
    +**invalid(invalidMessage : String) : void**
    +**inputLabel(inputLabel : String) : void**
    ..Special Print Methods..
    +**loginAttemptsCounter(valid : Validation) : void**
    +**flightMenuTitle(accountType : String) : void**
    +**flightMenuExit() : void**
    +**printFlightChanges(holderObject : Flight, targetObject : Flight)**
    +**printUserFlight(oldFlight : Flight, newFlight : Flight)**
    +**printUserFlight(newFlight : Flight)**
    +**accountEditMenu(account : Account) : void**
    +**printAccountEdits(holderObject : Account, targetObject : Account, changedVariable : String)**
    +**flightPayment(flight : Flight)**
    +**flightPayment(flight : Flight, payer : Account)**
    +**flightPaymentReceipt() : void**
}

class Payment
{
    -account : Account
    -cash : double
    -**flight : Flight**
    -**numericInput : boolean**
    --
    ..Mutators..
    +setAccount(account : Account) : void
    +**setFlight(flight : Flight) : void**
    +setCash(cash : **String**) : void
    ..Accessors..
    +getCash() : double
    ..Custom Methods..
    +creditCardPayment(cardNumber : String, month : String, year : String) : boolean
    +cashPayment(cash : double) : boolean
    +**isCashInputValid() : boolean**
}

class Flight
{
    -flightCode : String
    -flightLocation : String
    -flightPrice : double
    ..**Input Verification Variables**..
    -**fullString : boolean**
    -**numeric : boolean**
    --
    ..Constructors..
    +Flight()
    +Flight(flightCode : String, flightLocation : String, flightPrice : double)
    ..**Customized** Mutators..
    +setFlightLocation(flightLocation : String) : void
    +setFlightPrice(flightPrice : **String**) : void
    ..Accessors..
    +getFlightCode() : String
    +getFlightLocation() : String
    +getFlightPrice() : double
    ..Extra Custom Methods..
    +**flightMenuOption() : void**
    +**isInputValid() : boolean**
}

class CreditCard
{
    -cardNumber : String
    -month : String
    -year : String
    --
    ..Mutators..
    +setCardNumber(cardNumber : String) : void
    +setMonth(month : String) : void
    +setYear(year : String) : void
    ..Accessors..
    +getCardNumber() : String
    +getMonth() : String
    +getYear() : String
}

class Account
{
    -username : String
    -password : String
    -accountType : String
    -name : String
    -address : String
    -contactNumber : String
    -flight : Flight
    -**fullString : boolean**
    --
    ..Constructors..
    +Account()
    +Account(username : String, password : String, accountType : String)
    +Account(username : String, password : String, accountType : String, 
    name : String, address : String, contactNumber : String, cardNumber : String, month : String, year : String)
    ..Mutators..
    +setUsername(username : String) : void
    +setPassword(password : String) : void
    +setAccountType(accountType : String) : void
    +setName(name : String) : void
    +setAddress(address : String) : void
    +setContactNumber(contactNumber : String) : void
    +setFlight(flight : Flight) : void
    ..Accessors..
    +getUsername() : String
    +getPassword() : String
    +getAccountType() : String
    +getName() : String
    +getAddress() : String
    +getContactNumber() : String
    +getFlight() : Flight
    ..Custom Methods..
    +viewAccountDetails() : void
    +viewFlightDetails() : void
    +**isStringFull() : boolean**
}

class Validation
{
    -loginCheck = false : boolean
    -flightCheck = false : boolean
    -**attemptsCtr : int**
    -**attemptsLimit : int**
    --
    ..Mutators..
    +setLoginCheck(loginCheck : boolean) : void
    +setFlightCheck(flightCheck : boolean) : void
    +**setAttempts(attemptsCtr : int) : void**
    +**setAttemptsLimit(attemptsLimit : int) : void**
    ..Accessors..
    +getLoginCheck() : boolean
    +getFlightCheck() : boolean
    +**getAttempts() : int**
    +**getAttemptsLimit() : int**
    ..Extra Custom Methods..
    +**resetAttempts() : void**
}

class Airlines
{
    ==Main Program==
    +{static}main(args[] : String) : void
    ==
}

Flight <|-- CreditCard 
CreditCard <|-- Account
Account <|-- Validation

Account <|.. Payment
Flight <|.. Account

Menu <|.. Airlines
Validation <|.. Airlines
Payment <|.. Airlines
Account <|.. Airlines
Flight <|.. Airlines

Flight <|.. Menu
Validation <|.. Menu
Account <|.. Menu
```@enduml