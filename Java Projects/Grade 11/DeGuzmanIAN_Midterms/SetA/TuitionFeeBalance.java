import java.io.*;

class TuitionFeeBalance extends programFormat
{
    static void problemDesc()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Create a menu type program that asks for student name,");
        System.out.println("year code, and the number of units enrolled.");
        System.out.println("Computations are as follows: ");
        System.out.println("Tuition fee = number of units * rate per unit");
        System.out.println("Balance = tuition fee - downpayment");
        System.out.println("The rate per unit is based on the following: ");
        System.out.println("Year code\tYear Name\t\tRate per unit");
        System.out.println("1\t\tFreshman\t\t400.00");
        System.out.println("2\t\tSophomore\t\t350.00");
        System.out.println("3\t\tJunior\t\t\t300.00");
        System.out.println("4-5\t\tSenior\t\t\t250.00");
        System.out.println("And the downpayment is based on the following:");
        System.out.println("#ofUnits\t\tDownPayment");
        System.out.println("1-9\t\t\t1000");
        System.out.println("10-15\t\t\t1500");
        System.out.println("16-20\t\t\t2000");
        System.out.println("Above 21\t\t2500");
        System.out.println("Output the student name, year name, number of units enrolled, tuition fee, down payment and balance.");
        System.out.println("*Be wary of the invalid inputs of some variables and procedures. \nPrompt an invalid or error message then loop back.");
        System.out.println("*Should have 3 options and 1 option for exit.");
        System.out.println("*First option will do the inputs and computations.");
        System.out.println("*Second option will display the information or the output needed, \nwill prompt a no enrollment information if there is no enrollee yet.");
        System.out.println("*Third option will prompt a successful print and will reassign the variables to their default values, \nand will prompt a no data found if no enrollee yet.");

    }

    static void ratePerUnitChart()
    {
        System.out.println("Year Code\tYear Name\tRate per unit");
        System.out.println("1\t\tFreshman\t400");
        System.out.println("2\t\tSophomore\t350");
        System.out.println("3\t\tJunior\t\t300");
        System.out.println("4 and 5\t\tSenior\t\t250");
    }

    static void downPaymentChart()
    {
        System.out.println("Number of units\t\tDown Payment");
        System.out.println("1-9\t\t\t1000");
        System.out.println("10-15\t\t\t1500");
        System.out.println("16-21\t\t\t2000");
        System.out.println("Above 21\t\t2500");
    }

    public static void main(String args[]) throws IOException, InterruptedException
    {
        // Inputs
        String studentName = "";
        int yearCode = 0, units = 0;

        // Menu
        String choice = "";
        boolean enrolled = false;
        String[] enrolledState = {"", "(No enrolled student)"};
        String chosenState;

        // Process
        String yearName[] = {"Freshman", "Sophomore", "Junior", "Senior"};
        String chosenYearName = "";
        //                      [0]   [1]  [2]  [3]
        double ratePerUnit[] = {400, 350, 300, 250};
        double downPayment[] = {1000, 1500, 2000, 2500};
        double chosenRPU = 0, chosenDP = 0;
        double tuitionFee = 0, balance = 0;

        while(!choice.equals("4"))
        {

            // To be displayed in the menu
            if(enrolled == true)
            {
                chosenState = enrolledState[0];
            }
            
            else
            {
                chosenState = enrolledState[1];
            }
            
            obj.clearScreen();

            System.out.println("--(Java Midterms: Set A, Number 1)--");
            System.out.println("Student Tuition Fee and Balance Calculator\n");

            System.out.println("Current Enrollee: " + studentName + "\n");

            System.out.println("[1][I]nput student information ");
            System.out.println("[2][D]isplay student information " + chosenState);
            System.out.println("[3][P]rint information and reset data " + chosenState);
            System.out.println("[4]Exit the program");
            System.out.println("*note: Exit key is only '4'");

            System.out.print("\nEnter choice(letter or number): ");
            choice = sc.nextLine();
            
            switch(choice.toLowerCase())
            {
                case "1": case "i": case "input": 
                    
                    if(enrolled == true)
                    {
                        
                        System.out.println("\nThere is already someone enrolled here.");
                        System.out.println("Please print/reset their information first before enrolling");
                        obj.pause();
                    
                    }

                    else
                    {
                        obj.clearScreen();
                        System.out.println("--Enrollment Menu--");

                        System.out.print("\nEnter Student Name: ");
                        studentName = sc.nextLine();

                        obj.clearScreen();
                        System.out.println("Name: " + studentName + "\n");
                        ratePerUnitChart();
                        System.out.print("\nEnter Year Code: ");
                        yearCode = Integer.parseInt(sc.nextLine());

                        obj.clearScreen();
                        System.out.println("Name: " + studentName);
                        System.out.println("Year Code: " + yearCode + "\n");
                        downPaymentChart();
                        System.out.print("\nEnter number of units: ");
                        units = Integer.parseInt(sc.nextLine());
                    
                        while(yearCode < 1 || yearCode > 5)
                        {
                            obj.clearScreen();
                            System.out.println("\nSorry, the year code you have provided is not valid.");
                            System.out.println("Please refer to this table: ");
                            ratePerUnitChart();

                            System.out.print("\nEnter a VALID year code: ");
                            yearCode = Integer.parseInt(sc.nextLine());

                        }

                        while(units < 1)
                        {
                            obj.clearScreen();
                            System.out.println("\nSorry, the number of units you have provided is not valid.");
                            System.out.println("Please refer to this table: ");
                            downPaymentChart();

                            System.out.print("\nPlease enter a VALID number of units: ");
                            units = Integer.parseInt(sc.nextLine());
                        }
                        
                        if(yearCode == 1){

                            chosenYearName = yearName[0];
                            chosenRPU = ratePerUnit[0];

                        } else if(yearCode == 2){

                            chosenYearName = yearName[1];
                            chosenRPU = ratePerUnit[1];

                        } else if(yearCode == 3){

                            chosenYearName = yearName[2];
                            chosenRPU = ratePerUnit[2];

                        } else {

                            chosenYearName = yearName[3];
                            chosenRPU = ratePerUnit[3];

                        }

                        if(units >= 1 && units <= 9){

                            chosenDP = downPayment[0];

                        } else if(units >= 10 && units <= 15){

                            chosenDP = downPayment[1];

                        } else if(units >= 16 && units <= 21){

                            chosenDP = downPayment[2];

                        } else {

                            chosenDP = downPayment[3];

                        }

                        tuitionFee = units * chosenRPU;
                        balance = tuitionFee - chosenDP;
                        enrolled = true;

                        if(balance < 0)
                        {
                            balance = 0;
                        }

                        obj.clearScreen();
                        System.out.println("\nEnrollment Complete!\n");
                        System.out.println("Name: " + studentName);
                        System.out.println("Year Code: " + yearCode);
                        System.out.println("Number of Units: " + units);
                        obj.pause();
                    }

                break;
                
                case "d": case "2": case "display":

                    if(enrolled == false){

                        System.out.println("\nThere is no enrollment data to display. Please enroll first.");
                        obj.pause();

                    } else {

                        obj.clearScreen();
                        System.out.println("\n--Displaying Enrollee Information--");
                        
                        System.out.println("\nStudent Name: " + studentName);
                        System.out.println("Year Name: " + chosenYearName + " (Code: " + yearCode + ")");
                        System.out.println("Enrolled Units: " + units);
                        System.out.println("Tuition Fee: " + tuitionFee);
                        System.out.println("Down Payment: " + chosenDP);
                        System.out.println("Balance: " + balance);

                        obj.pause();
                    }

                break;
                
                case "p": case "3": case "print":
                    
                    // I don't know how to use java.io.FileWriter yet. So for now, 'Print' does nothing.
                    if(enrolled == false){

                        System.out.println("\nThere is no data to print! Please enroll first.");
                        obj.pause();

                    } else {

                        obj.clearScreen();
                        System.out.println("\n--Displaying Enrollee Information--");
                        
                        System.out.println("\n\nStudent Name: " + studentName);
                        System.out.println("Year Name: " + chosenYearName + " (Code: " + yearCode + ")");
                        System.out.println("Enrolled Units: " + units);
                        System.out.println("Tuition Fee: " + tuitionFee);
                        System.out.println("Down Payment: " + chosenDP);
                        System.out.println("Balance: " + balance);

                        studentName = "";
                        yearCode = 0;
                        units = 0;

                        chosenYearName = "";
                        chosenDP = 0;
                        chosenRPU = 0;

                        balance = 0;
                        tuitionFee = 0;

                        enrolled = false;

                        System.out.println("\nEnrollee information has been removed. Returning to main menu...");
                        obj.pause();
                    }

                break;
                
                case "4":

                    System.out.println("\nGoodbye!");
                
                break;
                
                default:
                    System.out.println("\nInvalid Input.");
                    obj.pause();
            }

        }
            
            
    }
    
}