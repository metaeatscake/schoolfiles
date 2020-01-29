public class processVWP extends universal
{
    // ALL OF THESE ARE VOID WITH PARAMETERS
    public static processVWP vwp = new processVWP();

    public void item1(int in1, int in2, int in3) 
    {
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
    
    public void item2(double workHours, double workRate, double deductions)
    {
        double netPay = 0;

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

    public void item3(double midterm, double finalExam)
    {
        double grades;
        String[] Remarks = 
        {
            "Excellent",    // [0]
            "Good",         // [1]
            "Fair",         // [2]
            "Pass",         // [3]
            "Fail",         // [4]
        };
        String chosenRemark;

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

        System.out.println("\nFinal Grade: " + grades + " (" + chosenRemark + ")");
    }

    public void item4(String courseTitle, int enrollees)
    {
        String[] Remarks = 
        {
            "Dissolved",    // [0]
            "Open",         // [1]
            "Closed",       // [2]
            "Invalid",      // [3]
        };
        String chosenRemarks;

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

    public void item5(String name, double basicSalary, double serviceTime)
    {
        double separationPay;
        
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