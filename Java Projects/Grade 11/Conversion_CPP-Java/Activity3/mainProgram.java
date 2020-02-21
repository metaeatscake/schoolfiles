package Activity3;

import java.io.*;

class mainProgram extends universal
{
    static mainProgram mP = new mainProgram();

    void item1()
    {
        int num1, num2;
        int sum, diff, prod;

        mP.desci1();

        System.out.print("Enter a value for num1: ");
        num1 = mP.intInput();
        System.out.print("Enter a value for num2: ");
        num2 = mP.intInput();

        sum = num1 + num2;
        diff = Math.abs(num1 - num2);
        prod = num1 * num2;

        if(sum > diff && sum > prod)
        {
            System.out.println("\nHighest: Sum (" + sum + ")");

        } else if(diff > sum && diff > prod){
            
            System.out.println("\nHighest: Difference (" + diff + ")");

        } else if(prod > sum && prod > diff){

            System.out.println("\nHighest: Product (" + prod + ")");

        } else {

            System.out.println("\nThere is no absolute highest among the three processes");
        
        }

    }

    void item2()
    {
        String employeeName;
        double basicSalary, overtime;

        // im too lazy. i'll finish this later.
    }

    public static void main(String[] args) throws IOException, InterruptedException
    {
        String menuChoice = "";

        while(!menuChoice.equals("3"));
        {
            mP.clearScreen();
            mP.menu();
            menuChoice = sc.nextLine();

            switch(menuChoice.toLowerCase())
            {
                case "1": case "i1":

                    mP.clearScreen();
                    mP.desci1();
                    mP.item1();
                    mP.pause();

                break;

                case "2": case "i2":

                    mP.clearScreen();
                    mP.desci2();
                    mP.item2();
                    mP.pause();

                break;

                case "3":

                    mP.goodbye();

                break;

                default:
            }

        }

    }

}