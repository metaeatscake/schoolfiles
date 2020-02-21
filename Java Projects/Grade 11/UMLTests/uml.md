```@startuml
class extras
{
    -zooanimal : ZooAnimal
    -cage : Cage
    -zookeeper : ZooKeeper
    {field}-zoo : JavaZoo = JavaZoo()
    {field}-sc : Scanner = Scanner(System.in)
    -menuChoice : String
    -exitKey : String

    +extras()
    +extras(zooanimal : ZooAnimal, cage : Cage, zookeeper : ZooKeeper)
    +setZooAnimal(zooanimal : ZooAnimal) : void
    +setCage(cage : Cage) : void
    +setZooKeeper(zookeeper : ZooKeeper) : void
    +clearScreen() : void throws IOException, InterruptedException
    +pause() : void throws IOException
    +printAnimal() : void
    +printZooKeeper() : void
    +printCage() : void
    +setMenuChoice(menuChoice : String) : void
    +getMenuChoice() : String
    +setExitKey(exitKey : String) : void
    +getExitKey() : String
    +mainMenu() : void
    -choiceSelector(menuChoice : String) : void throws IOException, InterruptedException
}

```@enduml