import java.io.*;

public class menuRWoP extends processRWoP
{
    public static void main(String args[]) throws IOException, InterruptedException
    {
        ins.methodType = "Return type Without Parameters";

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
                    rwop.in1 = ins.scanInt();
                    System.out.print("Enter a value for num2: ");
                    rwop.in2 = ins.scanInt();
                    System.out.print("Enter a value for num3: ");
                    rwop.in3 = ins.scanInt();

                    ins.dividerLine();

                    System.out.println(rwop.item1());
                    
                    ins.pause();
                break;

                case "2": case "item 2":
                    ins.clearScreen();
                    ins.desc2();

                    System.out.print("\nEnter amount of hours: ");
                    rwop.workHours = ins.scanDouble();
                    System.out.print("Enter your pay per hour: ");
                    rwop.workRate = ins.scanDouble();
                    System.out.print("Enter your deductions: ");
                    rwop.deductions = ins.scanDouble();

                    ins.dividerLine();

                    System.out.println(rwop.item2());

                    ins.pause();
                break;

                case "3": case "item 3":
                    ins.clearScreen();
                    ins.desc3();

                    System.out.print("\nEnter midterm grades: ");
                    rwop.midterm = ins.scanDouble();
                    System.out.print("Enter final exams grade: ");
                    rwop.finalExam = ins.scanDouble();

                    ins.dividerLine();

                    System.out.println(rwop.item3());

                    ins.pause();
                break;

                case "4": case "item 4":
                    ins.clearScreen();
                    ins.desc4();

                    System.out.print("\nEnter Course Title: ");
                    rwop.courseTitle = sc.nextLine();
                    System.out.print("Enter number of enrollees: ");
                    rwop.enrollees = ins.scanInt();

                    ins.dividerLine();

                    System.out.println(rwop.item4());

                    ins.pause();
                break;

                case "5": case "item 5":
                    ins.clearScreen();
                    ins.desc5();

                    System.out.print("\nEnter your name: ");
                    rwop.name = sc.nextLine();
                    System.out.print("Enter your basic salary: ");
                    rwop.basicSalary = ins.scanDouble();
                    System.out.print("Enter your years of service: ");
                    rwop.serviceTime = ins.scanDouble();

                    ins.dividerLine();

                    System.out.println(rwop.item5());

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