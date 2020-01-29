import java.io.*;

public class menuRWP extends processRWP
{
    public static void main(String args[]) throws IOException, InterruptedException
    {
        ins.methodType = "Return type With Parameters";

        // ITEM 1
            int in1, in2, in3;
        // ITEM 2
            double workHours, workRate, deductions;
        // ITEM 3
            double midterm, finalExam;
        // ITEM 4
            String courseTitle;
            int enrollees;
        // ITEM 5
            String name;
            double basicSalary, serviceTime;
        //

        while(!ins.menuchoice.equals("6"))
        {
            ins.clearScreen();
            ins.menu();
            System.out.print("\nEnter choice: ");
            ins.menuchoice = sc.nextLine();

            switch(ins.menuchoice.toLowerCase())
            {
                case "1": case "item 1":
                    ins.clearScreen();
                    ins.desc1();

                    System.out.print("\nEnter a value for num1: ");
                    in1 = ins.scanInt();
                    System.out.print("Enter a value for num2: ");
                    in2 = ins.scanInt();
                    System.out.print("Enter a value for num3: ");
                    in3 = ins.scanInt();

                    ins.dividerLine();

                    System.out.println(rwp.item1(in1, in2, in3));

                    ins.pause();
                break;

                case "2": case "item 2":
                    ins.clearScreen();
                    ins.desc2();

                    System.out.print("\nEnter number of hours: ");
                    workHours = ins.scanDouble();
                    System.out.print("Enter your rate per hour: ");
                    workRate = ins.scanDouble();
                    System.out.print("Enter your deductions: ");
                    deductions = ins.scanDouble();

                    ins.dividerLine();

                    System.out.println(rwp.item2(workHours, workRate, deductions));

                    ins.pause();
                break;

                case "3": case "item 3":
                    ins.clearScreen();
                    ins.desc3();

                    System.out.print("\nEnter midterms score: ");
                    midterm = ins.scanDouble();
                    System.out.print("Enter final exams score: ");
                    finalExam = ins.scanDouble();

                    ins.dividerLine();

                    System.out.println(rwp.item3(midterm, finalExam));

                    ins.pause();
                break;

                case "4": case "item 4":
                    ins.clearScreen();
                    ins.desc4();

                    System.out.print("\nEnter Course Title: ");
                    courseTitle = sc.nextLine();
                    System.out.print("Enter number of enrollees: ");
                    enrollees = ins.scanInt();

                    ins.dividerLine();

                    System.out.println(rwp.item4(courseTitle, enrollees));

                    ins.pause();
                break;

                case "5": case "item 5":
                    ins.clearScreen();
                    ins.desc5();

                    System.out.print("\nEnter your name: ");
                    name = sc.nextLine();
                    System.out.print("Enter your basic salary: ");
                    basicSalary = ins.scanDouble();
                    System.out.print("Enter your years of service: ");
                    serviceTime = ins.scanDouble();

                    ins.dividerLine();

                    System.out.println(rwp.item5(name, basicSalary, serviceTime));

                    ins.pause();
                break;

                case "6":
                    ins.goodbye();
                break;

                default:
                    ins.invalidInput();
                
            }
        }
    }
}