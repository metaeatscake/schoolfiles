import java.io.*;

public class menuVWoP extends processVWoP
{
    public static void main(String args[]) throws IOException, InterruptedException
    {
        ins.methodType = "Void type Without Parameters";

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
                    vwop.item1();
                    ins.pause();
                break;

                case "2": case "item 2":
                    ins.clearScreen();
                    vwop.item2();
                    ins.pause();
                break;

                case "3": case "item 3":
                    ins.clearScreen();
                    vwop.item3();
                    ins.pause();
                break;

                case "4": case "item 4":
                    ins.clearScreen();
                    vwop.item4();
                    ins.pause();
                break;

                case "5": case "item 5":
                    ins.clearScreen();
                    vwop.item5();
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