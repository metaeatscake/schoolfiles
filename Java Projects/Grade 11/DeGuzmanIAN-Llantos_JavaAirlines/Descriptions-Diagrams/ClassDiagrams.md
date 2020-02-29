```@startuml
class Menu
{
    -loginMenuChoice : **String**
    -adminMenuChoice : **String**
    -flightMenuChoice : **String**
    -paymentMenuChoice : **String**
    
    --
    ..Mutators..
    +setLoginMenuChoice(loginMenuChoice : **String**) : void
    +setAdminMenuChoice(adminMenuChoice : ** String**) : void
    +setFlightMenuChoice(flightMenuChoice : **String**) : void
    +setPaymentMenuChoice(paymentMenuChoice : **String**) : void
    ..Accessors..
    +getLoginMenuChoice() : **String**
    +getAdminMenuChoice() : **String**
    +getFlightMenuChoice() : **String**
    +getPaymentMenuChoice() : **String**
    ..Custom Methods..
    +startingMenu() : void
    +adminMenu() : void
    +userMenu(flightCheck : boolean) : void
    +paymentMenu() : void
    ..Extra Custom Methods..
    +**clearScreen() : void**
    +**pause() : void**
    +**scanner : Scanner(System.in)**
    +**stringInput() : String**
    +**doubleInput() : double**
}

class Payment
{
    -account : Account
    -cash : double
    -**flight : Flight**
    --
    ..Mutators..
    +setAccount(account : Account) : void
    +**setFlight(flight : Flight) : void**
    +setCash(cash : double) : void
    ..Accessors..
    +getCash() : double
    ..Custom Methods..
    +creditCardPayment(cardNumber : String, month : String, year : String) : boolean
    +cashPayment(cash : double) : boolean
}

class Flight
{
    -flightCode : String
    -flightLocation : String
    -flightPrice : double
    --
    ..Constructors..
    +Flight()
    +Flight(flightCode : String, flightLocation : String, flightPrice : double)
    ..Mutators..
    +setFlightLocation(flightLocation : String) : void
    +setFlightPrice(flightPrice : double) : void
    ..Accessors..
    +getFlightCode() : String
    +getFlightLocation() : String
    +getFlightPrice() : double
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
    +getUserName() : String
    +getPassword() : String
    +getAccountType() : String
    +getName() : String
    +getAddress() : String
    +getContactNumber() : String
    +getFlight() : Flight
    ..Custom Methods..
    +viewAccountDetails() : void
    +viewFlightDetails() : void
}

class Validation
{
    -loginCheck = false : boolean
    -flightCheck = false : boolean
    -**attemptsCtr : int**
    --
    ..Mutators..
    +setLoginCheck(loginCheck : boolean) : void
    +setFlightCheck(flightCheck : boolean) : void
    +**setAttempts(counter : int) : void**
    ..Accessors..
    +getLoginCheck() : boolean
    +getFlightCheck() : boolean
    +**getAttempts() : int**
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

```@enduml