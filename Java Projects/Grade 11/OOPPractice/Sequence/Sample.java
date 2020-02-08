// Class Diagram
class Person
{
    // Instance vars. NOT STATIC
    String objectNumber = "";
    String name = "";
    int age = 0;
    String height = "";
    String weight = "";
    String race = "";
    String gender = "";
    
    String printAll()
    {
        return(
            "\nOBJECT: " + objectNumber +
            "\nName: " + name +
            "\nAge: " + age +
            "\nHeight: " + height +
            "\nWeight: " + weight +
            "\nRace: " + race +
            "\nGender: " + gender
        );
    }
}

public class Sample
{
    public static void main(String args[])
    {
        // Instance creation
        Person peeWan = new Person();
        Person peeToh = new Person();
        
        peeWan.objectNumber = "First";
        peeWan.name = "Magenta";
        peeWan.age = 17;
        peeWan.height = "172cm";
        peeWan.weight = "69kg";
        peeWan.race = "Racist";
        peeWan.gender = "Unknown";
        
        peeToh.objectNumber = "Second";
        peeToh.name = "Purple";
        peeToh.age = 18;
        peeToh.height = "156cm";
        peeToh.weight = "55kg";
        peeToh.race = "Asian";
        peeToh.gender = "straight wayt meyl";
        
        System.out.println(peeWan.printAll());
        System.out.println(peeToh.printAll());
    }
}