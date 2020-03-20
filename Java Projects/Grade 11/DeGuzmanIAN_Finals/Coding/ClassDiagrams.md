```@startuml
    
    class Measurements{
        -side : double
        -length : double
        -width : double
        -base : double
        -height : double
        -radius : double
        -diameter : double
        ..Constructor..
        +Measurements()
        ..Mutators..
        +setSide(side : double) : void
        +setLength(length : double) : void
        +setWidth(width : double) : void
        +setBase(base : double) : void
        +setHeight(height : double) : void
        +setRadius(radius : double) : void
        +setDiameter(diameter : double) : void
        ..Accessors..
        +getSide() : double
        +getLength() : double
        +getWidth() : double
        +getBase() : double
        +getHeight() : double
        +getRadius() : double
        +getDiameter() : double
    }

    class Square{
        +Square()
        +perimeter() : void
        +area() : double
    }

    class Triangle{
        +Triangle()
        +perimeter() : void
        +area() : double
    }

    class Circle{
        +Circle()
        +circumference() : void
        +area() : double
    }

    Measurements <|-- Square
    Measurements <|-- Triangle
    Measurements <|-- Circle

```@enduml