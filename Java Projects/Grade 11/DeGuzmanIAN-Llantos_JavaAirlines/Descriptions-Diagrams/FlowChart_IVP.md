```@startuml

start

    if(what to test) then (string)

        partition stringBlankTest{
            
            :String input}
            :boolean fullString = true}

            if(input == null || input.trim().isEmpty()) then (true)

                :fullString = false}

            else (false)

            endif

            :return fullString]
        }

    else(number)

        partition numberNoLettersTest{
            
            :String input}
            :boolean validNumber = true}
            :double num}

            :try num = Double.parseDouble(input)]
            if(InputMismatchException) then (true)
                :validNumber = false]
            else(false)
                
            endif

            :return validNumber]
        }

    endif

stop
```@enduml