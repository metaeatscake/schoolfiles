```@startuml
    object menu
    object test
    object pay
    object admin {
        username = "admin"
        password = "admin"
        accountType = "admin"
    }
    object user {
        username = "user"
        password = "user"
        accountType = "user"
        name = "Warren"
        address = "Philippines"
        contactNumber = 694204206
        cardNumber = 1234567890
        month = 2
        year = 2021
    }
    object plane1 {
        flightCode = "L43Z6F"
        flightLocation = "Seoul, South Korea"
        flightPrice = 5000
    }
    object plane2 {
        flightCode = "5PNB61"
        flightLocation = "Akihabara, Japan"
        flightPrice = 4500
    }
    object plane3 {
        flightCode = "1KL78H"
        flightLocation = "Beijing, China"
        flightPrice = 4000
    }
```@enduml