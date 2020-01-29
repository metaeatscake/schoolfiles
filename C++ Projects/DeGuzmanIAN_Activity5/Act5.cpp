#include <iostream>
#include <cmath>

using namespace std;

main(){

	//Accounts
		string user[2] = {
			"admin",			// [0]
			"registrar",		// [1]
		};
		
		string password[2] = {
			"admin",			// [0]
			"registrar",		// [1]
		};
		
		string in_password, in_user;
		bool login = false;
	//=================================================
	
	//Menu and Index
		int menuchoice;
		int i,i2,i3;
	//=================================================
	
	//Student Enrollment
		string studentname[5], in_studentname;
		
		int in_yearcode;
		
		int yearcode[5];
			
		string yearname[5];
		
		string yearnameindex[5] = {
			"Freshman",			// [0] 
			"Sophomore",		// [1]
			"Junior",			// [2]
			"Senior",			// [3]
			"Senior",			// [4]
		};
		
		int enrolledunits[5], in_enrolledunits;

		double unitrateindex[5] = {
			400.00,				// [0]
			350.00,				// [1]
			300.00,				// [2]
			250.00,				// [3]
			250.00,				// [4]
		};
		
		double unitrate[5], tuition[5], balance[5], downpayment[5];
		
		double downpaymentindex[5] = {
			1000.00,			// [0] 1-9 units
			1500.00,			// [1] 10-15 units
			2000.00,			// [2] 16-21 units
			2500.00,			// [3] 21+ units
		};
		
		bool uniquestudent = false;
		bool fullenroll = false;
		int enrollctr = 0;
	//====================================================		
	
	for(i = 0; i < 5; i++){ // Data Clean
		studentname[i] = "";
		yearname[i] = "";
		tuition[i] = 0.0;
		balance[i] = 0.0;
		enrolledunits[i] = 0;
		downpayment[i] = 0.0;
		yearcode[i] = 0;
	}
	
	for(menuchoice = 0; menuchoice != 2;){
		
		system("cls");
		
		cout << "==LOGIN MENU==";
		cout << "\n[1] Login";
		cout << "\n[2] Exit";
		
		cout << "\n\nEnter Choice: ";
		cin >> menuchoice;
		
		if (menuchoice == 1){
		
			string in_user = "",in_password = "";
			system("cls");
			
			cout << "\nEnter username: ";
			cin.ignore();
			getline(cin, in_user);
			cout << "\nEnter password: ";
			getline(cin, in_password);
			
			for(i = 0; i != 2 && login == false;){
				if(in_user == user[i] && in_password == password[i]){
					login = true;
					cout << "\nLogin Success!" << "\n\n";
					system("pause");
				}
				else{
					i++;
				}
			}
			
			if(login == true){ 
				if (user[i] == "admin"){ // ADMIN CONTROLS
					for(menuchoice = 0; menuchoice != 4;){
						system("cls");
						
						cout << "Hello, admin!";
						cout << "\n[1] View All Enrollees";
						cout << "\n[2] Delete Enrollee";
						cout << "\n[3] Edit Information (Registrar Account)";
						cout << "\n[4] Logout";
						
						cout << "\n\nEnter Choice: ";
						cin >> menuchoice;
						
						if(menuchoice == 1){
							system("cls");
							cout << "Listing All Enrollees...\n\n";
							
							for(i2 = 0; i2 < 5; i2++){
								cout << "\nStudent [" << i2 + 1 << "]: " << studentname[i2];
								cout << "\nYear Name: " << yearname[i2];
								cout << "\nNumber of Units: " << enrolledunits[i2];
								cout << "\nTuition Fee: " << tuition[i2];
								cout << "\nDown Payment: " << downpayment[i2];
								cout << "\nBalance: " << balance[i2] << "\n\n";
							}
							
							system("pause");
						}
						
						else if(menuchoice == 2){
							for(menuchoice = 0; menuchoice != 6;){
							
								system("cls");
								cout << "Enrollee Account Deletion Menu";
								cout << "\n\n===List of Students===";
							
								for(i2 = 0; i2 < 5; i2++){
									cout << "\n[" << i2+1 << "] '" << studentname[i2] <<"'";
								}
								
								cout << "\n======================";
								cout << "\n[6] Cancel";
								cout << "\n\nEnter target: ";
								cin >> menuchoice;
								
								i3 = 0;
								
								if(menuchoice < 6 && menuchoice > 0){
									
									i3 = menuchoice - 1;
															
									studentname[i3] = "";
									yearname[i3] = "";
									tuition[i3] = 0.0;
									balance[i3] = 0.0;
									enrolledunits[i3] = 0;
									downpayment[i3] = 0.0;
									yearcode[i3] = 0;
									
									cout << "\n==========================";
									cout << "\nAccount Deleted!" << "\n\n"; 
									system("pause");
									
								}
								
								else if(menuchoice > 6 || menuchoice <= 0){
									cout << "\nInvalid Input." << "\n\n";
									system("pause");
								}
								
								else{
									cout << "\n\nReturning to admin menu..." << "\n\n";
									system("pause");
								}
							}
						}
						
						else if(menuchoice == 3){
							system("cls");
							cout << "Registrar Account Editing Menu";
							cout << "\nPlease enter the current registrar account details";
							
							cout << "\n\nUsername: ";
							cin.ignore();
							getline(cin, in_user);
							cout << "\nPassword: ";
							getline(cin, in_password);
							
							if(in_user == user[1] && in_password == password[1]){ 
								cout << "\n~~Verification Complete~~\n";
								cout << "\nPlease enter the new login details.";
								cout << "\n\nNew username: ";
								getline(cin, in_user);
								cout << "\nNew password: ";
								getline(cin, in_password);
								
								if(in_user != user[0] && in_password != password[0]){ // Check for admin login conflict
									user[1] = in_user;
									password[1] = in_password;
								
									cout << "\nRegistrar Account changed! Printing new login information..."; // unnecessary, but just to check if getline is eating the first character.
									cout << "\n\nUsername: " << user[1];
									cout << "\nPassword: " << password[1] << "\n\n";
									system("pause");
								}
								
								else{
									cout << "\n'admin' is not a valid username or password. Returning to Admin menu." << "\n\n";
									system("pause");
								}
							}
							
							else{
								cout << "\nInvalid username/password. Returning to Admin Menu." << "\n\n";
								system("pause");
							}
							
						}
						
						else if(menuchoice == 4){
							//system("cls");
							cout << "\nLogging Out..." << "\n\n";
							system("pause");
							login = false;
						}
					}
				}
				
				else{	// REGISTRAR CONTROLS
					for(menuchoice = 0; menuchoice != 4;){
						system("cls");
						
						cout << "Hello " << user[1];
						cout << "\n[1] Enroll";
						cout << "\n[2] View Information";
						cout << "\n[3] Print (Data reset)";
						cout << "\n[4] Logout";
						
						cout << "\n\nEnter Choice: ";
						cin >> menuchoice;
						
						if(menuchoice == 1){
							
							enrollctr = 0;	
							fullenroll = false;
							
							for(i = 0; fullenroll == false && i != 5; i++){ // Check if slots are full
								
								if(studentname[i] != ""){ 
									enrollctr++; 
								}
								
								if(enrollctr == 5){
									fullenroll = true;
								}
								
								else{
									fullenroll = false;
								}
							}
							
							if(fullenroll == false){
											
								uniquestudent = false;
									
								system("cls");
								cout << "Student Enrollment Process";
								cout << "\n\nEnter a name: ";
								cin.ignore();
								getline(cin, in_studentname);
								
								for(i2 = 0; uniquestudent == false && i2 != 5;){ // Check if entered name is valid
									
									if(in_studentname != studentname[i2] && studentname[i2] == ""){
										uniquestudent = true;
									}
									
									else{
										i2++;
									}							
								}
								
								for(i3 = 0; uniquestudent == true && i3 != 5;){ // final level of verification because the first loop sucks.
									if(in_studentname == studentname[i3]){
										uniquestudent = false;
									}
									else{
										i3++;
									}
								} 
								
								if (uniquestudent == true){
									system("cls");
									
									for(in_yearcode; in_yearcode < 1 || in_yearcode > 5;){
										system("cls");
										cout << "\nStudent name: " << in_studentname;
				
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
										cin >> in_yearcode;
									}
									
									for(in_enrolledunits; in_enrolledunits < 1;){
										system("cls");
										cout << "\nStudent Name: " << in_studentname;
										cout << "\nYear Code: " << in_yearcode;
					
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
										cin >> in_enrolledunits;
									}
									
									system("cls");
									cout << "Enrollment Success! Here is a review of the entered details: ";
									cout << "\n\nName: " << in_studentname;
									cout << "\nYearcode: " << in_yearcode;
									cout << "\nEnrolled Units: " << in_enrolledunits << "\n\n";
									system("pause");
									
									// Maths
									studentname[i2] = in_studentname;
									yearcode[i2] = in_yearcode;
									enrolledunits[i2] = in_enrolledunits;
									
									yearname[i2] = yearnameindex[in_yearcode - 1];
									unitrate[i2] = unitrateindex[in_yearcode - 1];
									
									tuition[i2] = enrolledunits[i2] * unitrate[i2];
									
									if(in_enrolledunits >= 1 && in_enrolledunits <= 9){
										downpayment[i2] = downpaymentindex[0];
									}
									
									else if(in_enrolledunits >= 10 && in_enrolledunits <= 15){
										downpayment[i2] = downpaymentindex[1];
									}
									
									else if(in_enrolledunits >= 16 && in_enrolledunits <= 21){
										downpayment[i2] = downpaymentindex[2];
									}
									
									else{
										downpayment[i2] = downpaymentindex[3];
									}
									
									balance[i2] = tuition[i2] - downpayment[i2];
									
									in_studentname = "";
									in_yearcode = 0;
									in_enrolledunits = 0;
									uniquestudent = false;
						
								}
								
								else{
									cout << "\n\nError. Either this user already exists, or no name was entered.\n\n";
									system("pause");
								}
							}
								
							else{
								cout << "\n\nSorry, The slots are full. Please delete an account.\n\n";
								system("pause");
							}
							
						}
						
						else if(menuchoice == 2){
							for(menuchoice = 0; menuchoice != 6;){
								system("cls");
								cout << "Student Information Menu";
								cout << "\n\n===List of Students===";
							
								for(i2 = 0; i2 < 5; i2++){
									cout << "\n[" << i2+1 << "] '" << studentname[i2] <<"'";
								}
								
								cout << "\n======================";
								cout << "\n[6] Cancel";
								cout << "\n\nEnter target: ";
								cin >> menuchoice;
								
								i3 = 0;
								
								if(menuchoice > 0 && menuchoice < 6){
								
									i3 = menuchoice - 1;
								
									system("cls");
									cout << "Displaying information of Student '" << studentname[i3] << "'";
								
									cout << "\n\nName: " << studentname[i3];
									cout << "\nYear: " << yearname[i3] << " (Code " << yearcode[i3] << ")";
									cout << "\nNumber of Units: " << enrolledunits[i3];
									cout << "\nTuition Fee: " << tuition[i3];
									cout << "\nDown Payment: " << downpayment[i3];
									cout << "\nBalance: " << balance[i3] << "\n\n";
								
									system("pause");
										
								}
								
								else if (menuchoice <= 0 || menuchoice > 6){
									cout << "\nInvalid input." << "\n\n";
									system("pause");
								}
								
								else{
									cout << "\nReturning to Registrar Menu..." << "\n\n";
									system("pause");
								}
							}
						}
						
						else if(menuchoice == 3){
							for(menuchoice = 0; menuchoice != 6;){
								system("cls");
								cout << "Student Entry Deletion Menu";
								cout << "\n\n===List of Students===";
							
								for(i2 = 0; i2 < 5; i2++){
									cout << "\n[" << i2+1 << "] '" << studentname[i2] <<"'";
								}
								
								cout << "\n======================";
								cout << "\n[6] Cancel";
								cout << "\n\nEnter target: ";
								cin >> menuchoice;
								
								i3 = 0;
								
								if(menuchoice > 0 && menuchoice < 6){
								
									i3 = menuchoice - 1;
								
									system("cls");
									cout << "Printing information of Student '" << studentname[i3] << "'";
								
									cout << "\n\nName: " << studentname[i3];
									cout << "\nYear: " << yearname[i3] << " (Code " << yearcode[i3] << ")";
									cout << "\nNumber of Units: " << enrolledunits[i3];
									cout << "\nTuition Fee: " << tuition[i3];
									cout << "\nDown Payment: " << downpayment[i3];
									cout << "\nBalance: " << balance[i3];
								
									studentname[i3] = "";
									yearname[i3] = "";
									tuition[i3] = 0.0;
									balance[i3] = 0.0;
									enrolledunits[i3] = 0;
									downpayment[i3] = 0.0;
									yearcode[i3] = 0;
									
									cout << "\n=======================================";
									cout << "\n\nEntry Deleted!" << "\n\n";
									system("pause");
									
									
								}
								
								else if (menuchoice <= 0 || menuchoice > 6){
									cout << "\nInvalid input." << "\n\n";
									system("pause");
								}
								
								else{
									cout << "\nReturning to Registrar Menu..." << "\n\n";
									system("pause");
								}
							}
						}
						
						else if(menuchoice == 4){
							//system("cls");
							cout << "\nLogging Out..." << "\n\n";
							system("pause");
							login = false;
						}
					}
				}
			}
			
			else{
				cout << "\n\nInvalid Username/Password." << "\n\n";
				system("pause");  
			}
					
		} 

	} 
	
} 
