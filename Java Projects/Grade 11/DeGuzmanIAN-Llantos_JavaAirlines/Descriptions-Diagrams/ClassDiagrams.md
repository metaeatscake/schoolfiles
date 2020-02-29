```@startuml
class Menu
{
    -loginMenuChoice : <b>String</b>
    -adminMenuChoice : <b>String</b>
    -flightMenuChoice : <b>String</b>
    -paymentMenuChoice : <b>String</b>
    --
    ..Mutators..
    +setLoginMenuChoice(loginMenuChoice : <b>String</b>) : void
    +setAdminMenuChoice(adminMenuChoice : <b>String</b>) : void
    +setFlightMenuChoice(flightMenuCHoice : <b>String</b>) : void
    +setPaymentMenuChoice(paymentMenuChoice : <b>String</b>) : void
    ..Accessors..
    +getLoginMenuChoice() : <b>String</b>
    +getAdminMenuChoice() : <b>String</b>
    +getFlightMenuChoice() : <b>String</b>
    +getPaymentMenuChoice() : <b>String</b>
    ..Custom Methods..
    +startingMenu() : void
    +adminMenu() : void
    +userMenu(flightCheck : boolean) : void
    +paymentMenu() : void
}

class Payment
{
    -account : Account
    -cash : double
    --
    ..Mutators..
    +setAccount(account : Account) : void
    +setCash(cash : Double) : void
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
    -flightPrice : String
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
    --
    ..Mutators..
    +setLoginCheck(loginCheck : boolean) : void
    +setFlightCheck(flightCheck : boolean) : void
    ..Accessors..
    +getLoginCheck() : boolean
    +getFlightCheck() : boolean
}

class Airlines
{
    ==Main Program==
    +{static}main(args[] : String) : void
    ==
}



```@enduml