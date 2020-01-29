#include <iostream>
#include <cmath>
using namespace std;

main(){
	// Menus
	bool enrollstate = false;
	int mainmenu;

	// Maths
	double yearcode = 0;		
	string studentname,yearname;
	double enrolledunits,tuition,dpay,unitrate,balance;
	
	do{	
	
		system ("cls");
		
		cout << "Enrollment Magic Program";
		cout << "\n[1]Enroll";					// Finished
		cout << "\n[2]View Information";		// Finished
		cout << "\n[3]Print (Reset Data)";		// No progress
		cout << "\n[4]EXIT";
		cout << "\n\nEnter choice: ";
		cin >> mainmenu;
	    
	    //----------//
	    //	Case 1	//
	    //----------//
		if(mainmenu == 1){
	   		system("cls");
	   		cout << "---Enrollment Menu---";
	   		cout << "\n\nEnter Student Name: ";
	   		cin.ignore();
			getline(cin, studentname);
			
			do{
				system("cls");
				cout << "\nStudent name: " << studentname;
				
				cout << "\n\nHere are the year codes, and their correspoding year name and rate per unit";
				cout << "\n[-------------------------]";
				cout << "\n[Year :: YearName  :: Rate]";
				cout << "\n[-------------------------]";
				cout << "\n[  1  :: Freshman  :: 400 ]";
				cout << "\n[  2  :: Sophomore :: 350 ]";
				cout << "\n[  3  :: Junior    :: 300 ]";
				cout << "\n[ 4&5 :: Senior    :: 250 ]";
				cout << "\n[-------------------------]";
			
				cout << "\n\nEnter Year Code: ";
				cin >> yearcode;
			} while (yearcode < 1 || yearcode > 5);
			
			do{
				system("cls");
				cout << "\nStudent Name: " << studentname;
				cout << "\nYear Code: " << yearcode;
				
				cout << "\n\nHere are the downpayment rates per unit enrolled:";
				cout << "\n[--------------------]";
				cout << "\n[Units :: Downpayment]";
				cout << "\n[--------------------]";
				cout << "\n[ 1-9  ::   1000.00  ]";
				cout << "\n[10-15 ::   1500.00  ]";
				cout << "\n[16-21 ::   2000.00  ]";
				cout << "\n[ 22+  ::   2500.00  ]";
				cout << "\n[--------------------]";
				
				cout << "\n\nEnter Number of Units: ";
				cin >> enrolledunits;
			} while (enrolledunits < 1);
			
			enrollstate = true;
			system("cls");
			cout << "\n\nEnrollment Success! Returning to main menu." << "\n\n";
			cout << "\n--Enrolee Information--";
			cout << "\n\tStudent Name: " << studentname;
			cout << "\n\tYear Code: " << yearcode;
			cout << "\n\tUnits Enrolled: " << enrolledunits << "\n\n";
			system("pause");
			
			if(yearcode == 1){
	   			yearname = "Freshman";
				unitrate = 400;	
			}
			else if (yearcode == 2){
				yearname = "Sophomore";
				unitrate = 350;
			}
			else if (yearcode == 3){
				yearname = "Junior";
				unitrate = 300;
			}
			else if (yearcode >= 4 && yearcode <= 5){
				yearname = "Senior";
				unitrate = 250;
			}
			else {
				// 
			}
				
			if (enrolledunits >=1 && enrolledunits <= 9){
				dpay = 1000;
			}
			else if (enrolledunits >=10 && enrolledunits <= 15){
				dpay = 1500;
			}
			else if (enrolledunits >=16 && enrolledunits <= 21){
				dpay = 2000;
			}
			else if (enrolledunits > 21){
				dpay = 2500;
			}
			else {
				// dunno
			}
				
			tuition = enrolledunits * unitrate;
			balance = tuition - dpay;
				
	   }
	   
	   //-----------//
	   //	Case 2	//
	   //-----------//
	   else if(mainmenu == 2){
	   		if(enrollstate == false){
	   			cout << "\n\nThere's no data to view. Please enroll." << "\n\n";
	   			system ("pause");
			}
	   		else{
				system("cls");
				cout << "--Viewing Enrolee Information--";
				cout << "\nStudent Name: " << studentname;
				cout << "\nYear Name: " << yearname;
				cout << "\nNumber of Units: " << enrolledunits;
				cout << "\n\nTuition Fee: " << tuition;
				cout << "\nDown Payment: " << dpay;
				cout << "\nBalance: " << balance << "\n\n";
				
				system("pause");
			}
	   }
	   
	   //-----------//
	   //	Case 3	//
	   //-----------//
	   else if (mainmenu == 3){
	   		if (enrollstate == true){
				system("cls");
	   			system("echo Resetting data...");

				cout << "\n\n--Previous Data--";
				cout << "\nStudent Name: " << studentname;
				cout << "\nYear Name: " << yearname;
				cout << "\nNumber of Units: " << enrolledunits;
				cout << "\n\nTuition Fee: " << tuition;
				cout << "\nDown Payment: " << dpay;
				cout << "\nBalance: " << balance;
				
				enrollstate = false;
				studentname = "";
				yearname = "";
				enrolledunits = 0;
				dpay = 0;
				balance = 0;
				tuition = 0;
			
				cout << "\n\nData reset! Returning to main menu." << "\n\n";
				system("pause");
			}
			else{
				cout <<  "\nThere's no account enrolled." << "\n\n";
				system("pause");
			}
	   }
	   
	   // Extra : case 4
	   else if (mainmenu == 4){
	   		cout << "\nExiting Program..." << "\n\n";
	   } 
	   
	   // Extra : Invalid inputs
	   else {
	   		cout << "\nInvalid input. Please pick from 1 to 4 only." << "\n\n";
	   		system("pause");
	   		system("cls");
	   }
	
	}while (mainmenu != 4);
}
