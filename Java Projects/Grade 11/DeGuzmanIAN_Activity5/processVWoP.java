public class processVWoP extends universal
{
    // ALL OF THESE ARE VOID WITHOUT PARAMETERS
    // copy pasted activity 2, moved all scanners inside parse methods.
    public static processVWoP vwop = new processVWoP();
    
    public void item1() 
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Create a program that will input three values and will test which of the three is the highest");
        System.out.println("Print the value and remark 'Highest'.");
        System.out.println("Assume that there will be no equal values entered.");

        int in1, in2, in3;

        System.out.print("\nEnter a value for num1: ");
        in1 = Integer.parseInt(sc.nextLine());

        System.out.print("\nEnter a value for num2: ");
        in2 = Integer.parseInt(sc.nextLine());

        System.out.print("\nEnter a value for num3: ");
        in3 = Integer.parseInt(sc.nextLine());

        if(in1 > in2 && in1 > in3)
        {
            System.out.print("\nHighest: " + in1 + " (Num 1)");
        }

        else if(in2 > in1 && in2 > in3)
        {
            System.out.print("\nHighest: " + in2 + " (Num 2)");
        }

        else if(in3 > in1 && in3 > in2)
        {
            System.out.print("\nHighest: " + in3 + " (Num 3)");
        }

        else
        {
            System.out.println("\nThere is no highest number. Please do not enter equal values.");
        }
    }
    
    public void item2()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Create a program that will input the number of hours worked by an employee,");
        System.out.println("their hourly rate, and the total deductions");
        System.out.println("Compute and print the net pay of the employee.");
        System.out.println("Assume that time-and-a-half is paid to any employee for those hours worked");
        System.out.println("over 40 hours but not greater than 50 hours.");
        System.out.println("If the employee worked for more than 50 hours, he gets double time for those");
        System.out.println("hours plus 10 hours of time-and-a-half and forty times the regular rate for");
        System.out.println("the first 40 hours.");

        double workHours, workRate, deductions, netPay = 0;

        System.out.print("\nEnter your number of hours: ");
        workHours = Double.parseDouble(sc.nextLine());

        System.out.print("Enter your pay rate per hour: ");
        workRate = Double.parseDouble(sc.nextLine());

        System.out.print("Enter your deductions: ");
        deductions = Double.parseDouble(sc.nextLine());

        if(workHours <= 0)
        {
            System.out.println("\nYou did not work a valid amount of hours.");
            netPay = 0;
        }

        else if(workHours > 0 && workHours <=  40)
        {
            netPay = (workHours * workRate) - deductions;
        }

        else if(workHours > 40 && workHours <= 50)
        {
            netPay = ((workHours * 1.5) * workRate) - deductions;
        }

        else
        {
            //     = (extra hours * 2)                  + (41 - 50 hrs * 1.5 )  + (first 40 is normal)
            netPay = (((workHours - 50) * workRate * 2) + (workRate * 1.5 * 10) + (workRate * 40)) - deductions;
        }

        System.out.println("\nNet Pay: " + netPay);

    }

    public void item3()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Input ratings for midterm and final exams.");
        System.out.println("Compute the grade, where the grade is equal to 40% of midterm and 60% of final.");
        System.out.println("Output the grade and the corresponing remark:");
        System.out.println("Grade\t\tRemark");
        System.out.println("91-100\t\tExcellent");
        System.out.println("81-90\t\tGood");
        System.out.println("71-80\t\tFair");
        System.out.println("61-70\t\tPass");
        System.out.println("Below 61\tFail");

        double midterm, finalExam, grades;
        String[] Remarks = 
        {
            "Excellent",    // [0]
            "Good",         // [1]
            "Fair",         // [2]
            "Pass",         // [3]
            "Fail",         // [4]
        };
        String chosenRemark;

        System.out.print("\nEnter midterm score: ");
        midterm = Double.parseDouble(sc.nextLine());

        System.out.print("Enter finals exam score: ");
        finalExam = Double.parseDouble(sc.nextLine());

        grades = (midterm * 0.4) + (finalExam * 0.6);

        if(grades < 61)
        {
            chosenRemark = Remarks[4];
        }

        else if(grades > 60 && grades <= 70)
        {
            chosenRemark =  Remarks[3];
        }

        else if(grades > 70 && grades <= 80)
        {
            chosenRemark = Remarks[2];
        }

        else if(grades > 80 && grades <= 90)
        {
            chosenRemark = Remarks[1];
        }

        else if(grades > 90 && grades <= 100)
        {
            chosenRemark = Remarks[0];
        }

        else
        {
            chosenRemark = "Invalid";
        }

        System.out.println("Final Grade: " + grades + " (" + chosenRemark + ")");
    }

    public void item4()
    {
        System.out.println("\nDescription of the problem: ");
        System.out.println("Input the course title and the number of enrollees.");
        System.out.println("Output the corresponding remark based on the following: ");
        System.out.println("Number of enrollees\tRemark");
        System.out.println("3 and below        \tDissolved");
        System.out.println("4-9                \tOpen");
        System.out.println("10                 \tClosed");
        System.out.println("Above 10           \tInvalid");

        String courseTitle;
        int enrollees;

        String[] Remarks = 
        {
            "Dissolved",    // [0]
            "Open",         // [1]
            "Closed",       // [2]
            "Invalid",      // [3]
        };
        String chosenRemarks;

        System.out.print("\nEnter the Course Title: ");
        courseTitle = sc.nextLine();

        System.out.print("Enter number of enrollees: ");
        enrollees = Integer.parseInt(sc.nextLine());

        if(enrollees <= 3 )
        {
            chosenRemarks = Remarks[0];
        }

        else if(enrollees >= 4 && enrollees <= 9)
        {
            chosenRemarks = Remarks[1];
        }

        else if(enrollees == 10)
        {
            chosenRemarks = Remarks[2];
        }

        else
        {
            chosenRemarks = Remarks[3];
        }

        System.out.println("\nCourse Title: " + courseTitle);
        System.out.println("Number of Enrollees: " + enrollees);
        System.out.println("Status/Remarks: " + chosenRemarks);
    }

    public void item5()
    {
        System.out.println("Description of the Problem:");
        System.out.println("Input the employee name, basic salary, and the length of service in years.");
        System.out.println("Compute for the separation pay as follows:");
        System.out.println("Length of Service(years)\t\t\tSeparation Pay");
        System.out.println("5 and below\t\t\t1.5 of salary * lenght of service");
        System.out.println("Above 5 to 10\t\t\t2.0 of salary * lenght of service");
        System.out.println("Above 10 to 15\t\t\t2.5 of salary * length of service");
        System.out.println("Above 15\t\t\t3.0 of salary * length of service");

        String name;
        double separationPay, serviceTime, basicSalary;

        System.out.print("\nEnter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your basic salary: ");
        basicSalary = Double.parseDouble(sc.nextLine());

        System.out.print("Enter your service time(in years): ");
        serviceTime = Double.parseDouble(sc.nextLine());

        if(serviceTime <= 5)
        {
            separationPay = (1.5 * basicSalary) * serviceTime;
        }

        else if(serviceTime > 5 && serviceTime <= 10)
        {
            separationPay = (2.0 * basicSalary) * serviceTime;
        }

        else if(serviceTime > 10 && serviceTime <= 15)
        {
            separationPay = (2.5 * basicSalary) * serviceTime;
        }

        else
        {
            separationPay = (3.0 * basicSalary) * serviceTime;
        }

        System.out.println("\nName: " + name);
        System.out.println("Service time: " + serviceTime + " years");
        System.out.println("Separation pay: " + separationPay);

    }
}