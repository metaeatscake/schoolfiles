#include <iostream>
#include <cmath>

using namespace std;

main(){
	
	// Menu, Array, and Index
		double menu; 									// system breaks if entering a decimal value 
		int i, i1, i2;
		double i3;
		int array = 500;
	// ==============================================
	
	// Sequence Control Structure (seq_)
		double seq_input;
		double seq_numholder[array];
		double seq_outputs[array];
		
		string seq_inputname;
		string seq_nameholder[array];
		string seq_outputname[array];
		
		const double seq_pi =  3.14159;
	//===============================================
	
	// Selection Control Structure (sel_) (basically just reskinned Sequence variables.)
		double sel_numin;
		double sel_numbox[array];
		double sel_numout[array];
		
		string sel_namein;
		string sel_namebox[array];
		string sel_nameout[array];
	//===============================================
	
	// Repetition Control Structure (r_)
		double r_input;
		double r_holder[array];
		double r_output[array];
		
		string r_inputname;
		string r_holdername[array];
		string r_outputname[array];
	//===============================================
	
	// I don't know why I declared the same six variables thrice. There's already so much lines that I don't want to change it.
		
	
	for(menu = 0; menu!= 17;){
		
		for(i = 0; i < array; i++){ //Reset all data
			
			seq_input = 0;
			seq_numholder[i] = 0;
			seq_outputs[i] = 0;
			seq_inputname = "";
			seq_nameholder[i] = "";
			seq_outputname[i] = "";
			
			sel_numin = 0;
			sel_numbox[i] = 0;
			sel_numout[i] = 0;
			sel_namein = "";
			sel_namebox[i] = "";
			sel_nameout[i] = "";
			
			r_input = 0;
			r_holder[i] = 0;
			r_output[i] = 0;
			r_inputname = "";
			r_holdername[i] = "";
			r_outputname[i] = "";
		}
		
		system("cls");
		
		cout << "Ultimate Flowcharting Program";
		cout << "\nContains literally every problem in the powerpoint, in (condensed) code form";
		cout << "\nNote: You can enter 1 or 0000001, same thing.";
		
		cout << "\n\n======Sequence Control Structure======";
		cout << "\n|[01] Slide 12 | Practice Problem 1  |";
		cout << "\n|[02] Slide 13 | Practice Problem 2  |";
		cout << "\n|[03] Slide 14 | Practice Problem 3  |";
		cout << "\n======================================";
		cout << "\n|[04] Slide 15 | Exercise Problem 1  |";
		cout << "\n|[05] Slide 15 | Exercise Problem 2  |";
		cout << "\n|[06] Slide 15 | Exercise Problem 3  |";
		cout << "\n======================================\n";
		
		cout << "\n=====Selection Control Structure======";
		cout << "\n|[07] Slide 16 | Practice Problem 1  |";
		cout << "\n|[08] Slide 16 | Practice Problem 2  |";
		cout << "\n|[09] Slide 17 | Practice Problem 3a |";
		cout << "\n|[10] Slide 17 | Practice Problem 3b |";
		cout << "\n======================================";
		cout << "\n|[11] Slide 18 | Exercise Problem 1  |";
		cout << "\n|[12] Slide 19 | Exercise Problem 2  |";
		cout << "\n======================================\n";
		
		cout << "\n=====Repetition Control Structure=====";
		cout << "\n|[13] Slide 20 | Practice Problem 1  |";
		cout << "\n|[14] Slide 20 | Practice Problem 2  |";
		cout << "\n======================================";
		cout << "\n|[15] Slide 21 | Exercise Problem 1  |";
		cout << "\n|[16] Slide 21 | Exercise Problem 2  |";
		cout << "\n======================================\n";
		
		cout << "\n[17] EXIT";
		
		cout << "\n\nEnter Choice: ";
		cin >> menu;
		
		//==================================//
		//----------------------------------//
		//----------SEQUENCE CASES----------//
		//----------------------------------//
		//==================================//
		if(menu == 1){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\n\nDesign a flowchart that will ask for two integers. Compute and display the following:";
			cout << "\nA. Product of these two integers";
			cout << "\nB. Cube of the difference of these two integers";
			cout << "\nC. Fifth root of the square of the sum of these two integers";
			
			cout << "\n\nEnter num1: ";
			cin >> seq_input;
			seq_numholder[0] = seq_input;
			seq_input = 0;
			
			cout << "\nEnter num2: ";
			cin >> seq_input;
			seq_numholder[1] = seq_input;
			seq_input = 0;
			
			seq_outputs[0] = seq_numholder[0] * seq_numholder[1];
			seq_outputs[1] = pow(seq_numholder[0] - seq_numholder[1] , 3.0);
			seq_outputs[2] = pow(pow(seq_numholder[0] + seq_numholder[1], 2.0), 1.0/5.0);
			
			cout << "\nA = " << seq_numholder[0] << "*" << seq_numholder[1];
			cout << "\nB = " << "(" << seq_numholder[0] << "-" << seq_numholder[1] << ")^3";
			cout << "\nC = " << "(((" << seq_numholder[0] << "+" << seq_numholder[1] << ")^2)^(1/5))\n";
			
			cout << "\n=========================================";
			cout << "\nA = " << seq_outputs[0];
			cout << "\nB = " << seq_outputs[1];
			cout << "\nC = " << seq_outputs[2] << "\n\n";
			
			system("pause");
		}
		
		else if(menu == 2){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nDesign a flowchart that will ask for a number of minutes. Compute and display the equivalent number of hours and minutes.";
			
			cout << "\n\nEnter amount of minutes: ";
			cin >> seq_input;
			seq_numholder[0] = seq_input;
			seq_input = 0;
			
			seq_outputs[0] = (int)seq_numholder[0] / 60; // will have decimal on double
			seq_outputs[1] = (int)seq_numholder[0] % 60; // Modulo division does not work on double
			
			cout << "\n=========================================================";
			cout << "\n" << seq_numholder[0] << " minutes is equal to " << seq_outputs[0] << " hours and " << seq_outputs[1] << " minutes.\n\n";
			system("pause");
		}
		
		else if(menu == 3){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nDesign a flowchart that will ask for a student name and ratings for four quizzes, minor exam A, class standing and midterm exam.";
			cout << "\nCompute the midterm grade of the student by the formula:";
			cout << "\nmidterm grade = 20% of quiz average + 20% of minor exam A + 10% of class standing + 50% of midterm exam";
			cout << "\nDisplay the name and midterm grade of the student";
			cout << "\nNote: for accurate results, convert the scores to percent first then enter the values without the percent sign.";
			
			cout << "\n\nEnter name: ";
			cin.ignore();
			getline(cin, seq_inputname);
			seq_nameholder[0] = seq_inputname;
			seq_inputname = "";
			
			for(i = 0; i < 7;i++){
				
				if(i <= 3){ // [0] to [3] are quizzes
					cout << "\nEnter rating for Quiz " << i+1 << ": ";
					cin >> seq_input;
					seq_numholder[i] = seq_input;
					seq_input = 0;
				}
				
				else if(i == 4){ // [4] is Minor A
					cout << "\nEnter rating for Minor A: ";
					cin >> seq_input;
					seq_numholder[i] = seq_input;
					seq_input = 0;
				}
				
				else if(i == 5){ // [5] is Class Standing
					cout << "\nEnter rating for Class Standing: ";
					cin >> seq_input;
					seq_numholder[i] = seq_input;
					seq_input = 0;
				}
				
				else{ // [6] is Midterms
					cout << "\nEnter rating for Midterms: ";
					cin >> seq_input;
					seq_numholder[i] = seq_input;
					seq_input = 0;
				}
			}
	
			seq_outputs[0] = seq_numholder[0] + seq_numholder[1] + seq_numholder[2] + seq_numholder[3]; // Total Quiz
			seq_outputs[1] = (seq_outputs[0] / 4.0) * 0.2; 												// Weighted Quiz
			seq_outputs[2] = seq_numholder[4] * 0.2; 													// Weighted Minor A
			seq_outputs[3] = seq_numholder[5] * 0.1; 													// Weighted Class Standing
			seq_outputs[4] = seq_numholder[6] * 0.5; 													// Weighted Midterms
			seq_outputs[5] = seq_outputs[1] + seq_outputs[2] + seq_outputs[3] + seq_outputs[4]; 		// Midterm grade
			
			cout << "\n==============================================";
			cout << "\nName: " << seq_nameholder[0];
			cout << "\nMidterm Grade: " << seq_outputs[5] << "\n\n";
			system("pause");
		}
		
		else if(menu == 4){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nInput a value for variables A and B.";
			cout << "\nVariable C is equal to the sum of the squares of A and B,";
			cout << "\nAnd Variable D is equal to 10 less than the value of A.";
			cout << "\nDisplay the values of C and D.";
			
			cout << "\n\nEnter value for varA: ";
			cin >> seq_input;
			seq_numholder[0] = seq_input;
			seq_input = 0;
			
			cout << "\nEnter value for varB: ";
			cin >> seq_input;
			seq_numholder[1] = seq_input;
			seq_input = 0;
			
			seq_outputs[0] = pow(seq_numholder[0], 2) + pow(seq_numholder[1], 2);
			seq_outputs[1] = seq_numholder[0] - 10;
			
			cout << "\n=================================================================";
			cout << "\nC = (" << seq_numholder[0] << "^2)+(" << seq_numholder[1] << "^2)";
			cout << "\nVar C: " << seq_outputs[0] << "\n";
			
			cout << "\nD = " << seq_numholder[0] << "-10";
			cout << "\nVar D: " << seq_outputs[1] << "\n\n";
			system("pause");
		}
		
		else if(menu == 5){
			
			for(menu = 0; menu != 5;){
				
				for(i = 0; i < array; i++){ //Reset all data
			
					seq_input = 0;
					seq_numholder[i] = 0;
					seq_outputs[i] = 0;
					seq_inputname = "";
					seq_nameholder[i] = "";
					seq_outputname[i] = "";
				}
			
				system("cls");
				cout << "(Description of Problem)";
				cout << "\nCompute and Display the following: ";
				cout << "\n[1] Perimeter of a Rectangle";
				cout << "\n[2] Area of a Triangle";
				cout << "\n[3] Volume of a Cylinder\n";
				cout << "\n[4] (Do all of these at once)";
				cout << "\n[5] Exit";
				
				cout << "\n\nEnter Choice: ";
				cin >> menu;
				
				if(menu == 1){
					
					//system("cls");
					
					cout << "\nSelected 'Perimeter of a Rectangle'";
					cout << "\nEnter length: ";
					cin >> seq_input;
					seq_numholder[0] = seq_input;
					seq_input = 0;
					
					cout << "\nEnter width: ";
					cin >> seq_input;
					seq_numholder[1] = seq_input;
					seq_input = 0;
					
					seq_outputs[0] = 2 * (seq_numholder[0] + seq_numholder[1]);
					
					cout << "\n=========================================";
					cout << "\nPerimeter: " << seq_outputs[0] << "\n\n";
					system("pause");
				}
				
				else if(menu == 2){
					
					//system("cls");
					
					cout << "\nSelected 'Area of a Triangle'";
					cout << "\nEnter base: ";
					cin >> seq_input;
					seq_numholder[0] = seq_input;
					seq_input = 0;
					
					cout << "\nEnter height: ";
					cin >> seq_input;
					seq_numholder[1] = seq_input;
					seq_input = 0;
					
					seq_outputs[0] = (seq_numholder[0] * seq_numholder[1]) / 2.0;
					
					cout << "\n=========================================";
					cout << "\nArea: " << seq_outputs[0] << "\n\n";
					system("pause");
				}
				
				else if(menu == 3){
					
					//system("cls");
					
					cout << "\nSelected 'Volume of a Cylinder'";
					cout << "\nEnter radius: ";
					cin >> seq_input;
					seq_numholder[0] = seq_input;
					seq_input = 0;
					
					cout << "\nEnter height: ";
					cin >> seq_input;
					seq_numholder[1] = seq_input;
					seq_input = 0;
					
					seq_outputs[0] = seq_pi * pow(seq_numholder[0], 2) * seq_numholder[1];
					
					cout << "\n=========================================";
					cout << "\nVolume: " << seq_outputs[0] << "\n\n";
					system("pause");
				}
				
				else if(menu == 4){
					
					//system("cls");
					
					cout << "\nSelected ALL\n";
					cout << "\n--Rectangle Perimeter";	
					cout << "\nEnter length: ";
					cin >> seq_input;
					seq_numholder[0] = seq_input;
					seq_input = 0;
					
					cout << "\nEnter width: ";
					cin >> seq_input;
					seq_numholder[1] = seq_input;
					seq_input = 0;
					
					cout << "\n--Triangle Area";
						
					cout << "\nEnter base: ";
					cin >> seq_input;
					seq_numholder[2] = seq_input;
					seq_input = 0;
						
					cout << "\nEnter height: ";
					cin >> seq_input;
					seq_numholder[3] = seq_input;
					seq_input = 0;
						
					cout << "\n--Cylinder Volume";
						
					cout << "\nEnter radius: ";
					cin >> seq_input;
					seq_numholder[4] = seq_input;
					seq_input = 0;
						
					cout << "\nEnter height: ";
					cin >> seq_input;
					seq_numholder[5] = seq_input;
					seq_input = 0;
						
					seq_outputs[0] = 2 * (seq_numholder[0] + seq_numholder[1]);
					seq_outputs[1] = 0.5 * (seq_numholder[2] * seq_numholder[3]); 
					seq_outputs[2] = seq_pi * pow(seq_numholder[4], 2) * seq_numholder[5];
					
					cout << "\n=========================================";
					cout << "\nRectangle Perimeter: " << seq_outputs[0];
					cout << "\nTriangle Area: " << seq_outputs[1];
					cout << "\nCylinder Volume: " << seq_outputs[2] << "\n\n";
					system("pause");					
				}
				
				else{
					// nothing.
				}
			}
		}
		
		else if(menu == 6){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nInput an employee name, number of hours worked and hourly rate.";
			cout << "\nCompute his pay where pay is equal to the product of his rate and hours worked.";
			cout << "\nDisplay the employee name and his pay.";
			
			cout << "\n\nEnter name: ";
			cin.ignore();
			getline(cin, seq_inputname);
			seq_nameholder[0] = seq_inputname;
			seq_inputname = "";
			
			cout << "\nEnter amount of hours: ";
			cin >> seq_input;
			seq_numholder[0] = seq_input;
			seq_input = 0;
			
			cout << "\nEnter rate per hour: ";
			cin >> seq_input;
			seq_numholder[1] = seq_input;
			seq_input = 0;
			
			seq_outputs[0] = seq_numholder[0] * seq_numholder[1];
			
			cout << "\n=============================================================================";
			cout << "\nName: " << seq_nameholder[0];
			cout << "\nPay: " << seq_outputs[0] << "\n\n";
			system("pause");
		}
		// End of Sequence Cases
		
		//==================================//
		//----------------------------------//
		//----------SELECTION CASES---------//
		//----------------------------------//
		//==================================//
		else if(menu == 7){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nDesign a flowchart that will determine if the input number is positive, negative, or zero.";
			
			cout << "\n\nEnter a number: ";
			cin >> sel_numin;
			sel_numbox[0] = sel_numin;
			sel_numin = 0;
			
			sel_namebox[0] = "Positive";
			sel_namebox[1] = "Negative";
			sel_namebox[2] = "Zero";
			
			if(sel_numbox[0] > 0){
				
				sel_nameout[0] = sel_namebox[0];
			}
			
			else if(sel_numbox[0] < 0){
				
				sel_nameout[0] = sel_namebox[1];
			}
			
			else{
				
				sel_nameout[0] = sel_namebox[2];
			}
			
			cout << "\n===============================================================";
			cout << "\nThe number " << sel_numbox[0] << " is " << sel_nameout[0] << "\n\n";
			system("pause");
		}
		
		else if(menu == 8){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nDesign a flowchart that will ask for an age and will display the respective remarks as follows: ";
			cout << "\n=============================";
			cout << "\n  Age  || Remarks";
			cout << "\n=============================";
			cout << "\n  1-2  ||  Baby";
			cout << "\n  3-4  ||  Toddler";
			cout << "\n  5-9  ||  Kid";
			cout << "\n 10-12 ||  Adolescent";
			cout << "\n 13-19 ||  Teenager";
			cout << "\n 20-25 ||  Young Adult";
			cout << "\n  26+  ||  Adult";
			cout << "\n=============================";
			
			cout << "\n\nEnter age: ";
			cin >> sel_numin;
			sel_numbox[0] = sel_numin;
			sel_numin = 0;
			
			sel_namebox[0] = "Baby";
			sel_namebox[1] = "Toddler";
			sel_namebox[2] = "Kid";
			sel_namebox[3] = "Adolescent";
			sel_namebox[4] = "Teenager";
			sel_namebox[5] = "Young Adult";
			sel_namebox[6] = "Adult";
			sel_namebox[7] = "Invalid (Zero or Negative Age)";
			
			if(sel_numbox[0] >= 1 && sel_numbox[0] <= 2){
				
				sel_nameout[0] = sel_namebox[0];
			}
			
			else if(sel_numbox[0] >= 3 && sel_numbox[0] <= 4){
				
				sel_nameout[0] = sel_namebox[1];
			}
			
			else if(sel_numbox[0] >= 5 && sel_numbox[0] <= 9){
				
				sel_nameout[0] = sel_namebox[2];
			}
			
			else if(sel_numbox[0] >= 10 && sel_numbox[0] <= 12){
				
				sel_nameout[0] = sel_namebox[3];
			}
			
			else if(sel_numbox[0] >= 13 && sel_numbox[0] <= 19){
				
				sel_nameout[0] = sel_namebox[4];
			}
			
			else if(sel_numbox[0] >= 20 && sel_numbox[0] <= 25){
				
				sel_nameout[0] = sel_namebox[5];
			}
			
			else if(sel_numbox[0] > 25){
				
				sel_nameout[0] = sel_namebox[6];
			}
			
			else{
				
				sel_nameout[0] = sel_namebox[7];
			}
			
			cout << "\n==========================================";
			cout << "\nGiven Age: " << sel_numbox[0];
			cout << "\nRemarks: " << sel_nameout[0] << "\n\n";
			system("pause");
		}
		
		else if(menu == 9){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nDesign a flowchart that will determine the number of digits from an INTEGER input.";
			cout << "\nAssume that the maximum number of digits is 6.";
			
			cout << "\n\nEnter an integer: ";
			cin >> sel_numin;
			sel_numbox[0] = (int) sel_numin;
			sel_numin = 0;
			
			sel_namebox[0] = "1 digit";
			sel_namebox[1] = "2 digits";
			sel_namebox[2] = "3 digits";
			sel_namebox[3] = "4 digits";
			sel_namebox[4] = "5 digits";
			sel_namebox[5] = "6 digits";
			sel_namebox[6] = "too many digits for this program to count.";
			
			// Positive Integers (and Zero)
			if(sel_numbox[0] >= 0 && sel_numbox[0] <= 9){
				
				sel_nameout[0] = sel_namebox[0];
			}
			
			else if(sel_numbox[0] >= 10 && sel_numbox[0] <= 99){
				
				sel_nameout[0] = sel_namebox[1];
			}
			
			else if(sel_numbox[0] >= 100 && sel_numbox[0] <= 999){
				
				sel_nameout[0] = sel_namebox[2];
			}
			
			else if(sel_numbox[0] >= 1000 && sel_numbox[0] <= 9999){
				
				sel_nameout[0] = sel_namebox[3];
			}
			
			else if(sel_numbox[0] >= 10000 && sel_numbox[0] <= 99999){
				
				sel_nameout[0] = sel_namebox[4];
			}
			
			else if(sel_numbox[0] >= 100000 && sel_numbox[0] <= 999999){
				
				sel_nameout[0] = sel_namebox[5];
			}
			
			else if(sel_numbox[0] >= 1000000){
				
				sel_nameout[0] = sel_namebox[6];
			}
			
			// Negative Integers
			else if(sel_numbox[0] < 0 && sel_numbox[0] >= -9){
				
				sel_nameout[0] = sel_namebox[0];
			}
			
			else if(sel_numbox[0] <= -10 && sel_numbox[0] >= -99){
				
				sel_nameout[0] = sel_namebox[1];
			}
			
			else if(sel_numbox[0] <= -100 && sel_numbox[0] >= -999){
				
				sel_nameout[0] = sel_namebox[2];
			}
			
			else if(sel_numbox[0] <= -1000 && sel_numbox[0] >= -9999){
				
				sel_nameout[0] = sel_namebox[3];
			}
			
			else if(sel_numbox[0] <= -10000 && sel_numbox[0] >= -99999){
				
				sel_nameout[0] = sel_namebox[4];
			}
			
			else if(sel_numbox[0] <= -100000 && sel_numbox[0] >= -999999){
				
				sel_nameout[0] = sel_namebox[5];
			}
			
			else if(sel_numbox[0] <= -1000000){
				
				sel_nameout[0] = sel_namebox[6];
			}
			
			else{
				// nothing.
			}
			
			cout << "\n======================================================================";
			cout << "\nThe number " << sel_numbox[0] << " has " << sel_nameout[0] << "\n\n";
			system("pause");
		}
		
		else if(menu == 10){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nDesign a flowchart that will determine the total cell phone bill as follows: ";
			cout << "\n...a fixed rate of 500.00 with free 20 minute airtime and 500 worth of text";
			cout << "\n...an additional charge of 6.00 per min in excess of 20 minutes";
			cout << "\n...an additional charge of 1.00 per text in excess of 500 texts";
			
			cout << "\n\nEnter amount of texts: ";
			cin >> sel_numin;
			sel_numbox[0] = sel_numin;			// numbox[0] = in_text
			sel_numin = 0;
			
			cout << "\nEnter minutes of calls: ";
			cin >> sel_numin;
			sel_numbox[1] = sel_numin;			// numbox[1] = in_calls
			sel_numin = 0; 
			
			sel_numbox[2] = 500;				// numbox[2] = limit_text
			sel_numbox[3] = 20;					// numbox[3] = limit_calls
			
			// Check Call time for overflow
			if(sel_numbox[1] > sel_numbox[3]){
				
				// Excess calls, excess texts.
				if(sel_numbox[0] > sel_numbox[2]){
					
					sel_numout[0] = 500 + ((sel_numbox[1] - sel_numbox[3]) * 6) + (sel_numbox[0] - sel_numbox[2]);
				}
				
				// Excess calls, no excess texts
				else{
					
					sel_numout[0] = 500 + ((sel_numbox[1] - sel_numbox[3]) * 6);
				}
			}
			
			// Go here if calls are not over the limit
			else{ 
				
				// No Excess calls, but there's excess texts.
				if(sel_numbox[0] > sel_numbox[2]){ 
					
					sel_numout[0] = 500 + (sel_numbox[0] - sel_numbox[2]);
				}
				
				// No excess calls, and no excess texts.
				else{
					
					sel_numout[0] = 500;
				}
			}
			
			cout << "\n========================================================";
			cout << "\nPhone Bill: " << sel_numout[0] << "\n\n";
			system("pause");
		}
		
		else if(menu == 11){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nCompute for the sum, difference, and product of two integers.";
			cout << "\nDetermine whichever is the highest and display the computed value of the highest and the remark 'Highest'.";
			
			cout << "\n\nEnter num1: ";
			cin >> sel_numin;
			sel_numbox[0] = sel_numin;
			sel_numin = 0;
			
			cout << "\nEnter num2: ";
			cin >> sel_numin;
			sel_numbox[1] = sel_numin;
			sel_numin = 0;
			
			sel_numout[0] = sel_numbox[0] + sel_numbox[1];
			sel_numout[1] = sel_numbox[0] - sel_numbox[1];
			sel_numout[2] = sel_numbox[0] * sel_numbox[1];
			
			sel_namebox[0] = "Sum";
			sel_namebox[1] = "Difference";
			sel_namebox[2] = "Product";
			sel_namebox[3] = "None";
			
			if(sel_numout[0] > sel_numout[1] && sel_numout[0] > sel_numout[2]){
				
				// numout 3 for the highest value, nameout 0 for the label
				sel_numout[3] = sel_numout[0];
				sel_nameout[0] = sel_namebox[0];
			}
			
			else if(sel_numout[1] > sel_numout[0] && sel_numout[1] > sel_numout[2]){
				
				sel_numout[3] = sel_numout[1];
				sel_nameout[0] = sel_namebox[1];
			}
			
			else if(sel_numout[2] > sel_numout[0] && sel_numout[2] > sel_numout[1]){
				
				sel_numout[3] = sel_numout[2];
				sel_nameout[0] = sel_namebox[2];
			}
			
			else{ // In cases where two processes produces the same result
				
				sel_numout[3] = 0;
				sel_nameout[0] = sel_namebox[3];
			}
			
			cout << "\n(Sum) : " << sel_numbox[0] << "+" << sel_numbox[1] << " = " << sel_numout[0];
			cout << "\n(Diff): " << sel_numbox[0] << "-" << sel_numbox[1] << " = " << sel_numout[1];
			cout << "\n(Prod): " << sel_numbox[0] << "*" << sel_numbox[1] << " = " << sel_numout[2] << "\n";
			
			if(sel_nameout[0] == sel_namebox[3]){
				
				cout << "\n========================================================";
				cout << "\nThere is no absolute highest value\n\n";
				system("pause");
			}
			
			else{
				
				cout << "\n========================================================";
				cout << "\nHighest: " << sel_numout[3] << " (" << sel_nameout[0] << ")\n\n";
				system("pause");
			}
		}
		
		else if(menu == 12){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nInput an employee name, basic salary and no. of overtime hrs. Computation is as follows:";
			cout << "\n\tGross Pay = Basic Salary + Overtime Pay";
			cout << "\n\tOvertime Pay/hr = 1% of Basic Salary";
			cout << "\n\tWithholding Tax = Gross Pay * Tax Rate";
			cout << "\n\tNet Pay = Gross Pay - Withholding Tax";
			cout << "\nDisplay the employee name, position, gross pay, overtime pay, withholding tax, and net pay";
			cout << "\n========================================================";
			cout << "\nBasic Salary        || Position          || Tax Rate";
			cout << "\n========================================================";
			cout << "\n10,000 - 30,000     || Rank & File       || 10%";
			cout << "\n30,001 - 45,000     || Manager           || 15%";
			cout << "\n45,001 - 65,000     || Vice President    || 18%";
			cout << "\nAbove 65,000        || President         || 20%";
			cout << "\n========================================================";
			
			// Here is where one, arrayed, variables get real hard to read. (if it wasn't hard enough already)
			cout << "\n\nEnter name: ";
			cin.ignore();
			getline(cin, sel_namein);
			sel_namebox[0] = sel_namein;										// namebox 0 = Input Name [For Final Output]
			sel_namein = "";
			
			cout << "\nEnter Basic Salary: ";
			cin >> sel_numin;
			sel_numbox[0] = sel_numin;											// numbox 0 = Basic Salary
			sel_numin = 0;
			
			cout << "\nEnter amount of overtime hrs: ";
			cin >> sel_numin;
			sel_numbox[1] = sel_numin;											// numbox 1 = Overtime hours
			sel_numin = 0;
			
			sel_namebox[1] = "Rank & File";										// namebox 1-4 = Position index
			sel_namebox[2] = "Manager";											// nameout 0 = matched position [For Final Output]
			sel_namebox[3] = "Vice President";
			sel_namebox[4] = "President";
			sel_namebox[5] = "(Invalid Salary)";								// Error trigger
			
			sel_numout[0] = sel_numbox[0] * 0.01;								// numout 0 = Overtime pay per hour
			sel_numout[1] = sel_numout[0] * sel_numbox[1];						// numout 1 = Overtime Pay [For Final Output]
			sel_numout[2] = sel_numbox[0] + sel_numout[1];						// numout 2 = Gross Pay [For Final Output]
			
			sel_numbox[2] = 0.1;												// numbox 2-5 = tax rates index
			sel_numbox[3] = 0.15;												// numbox 6 = matched tax rate
			sel_numbox[4] = 0.18;
			sel_numbox[5] = 0.2;
			
			if(sel_numbox[0] >= 10000 && sel_numbox[0] <= 30000){
				
				sel_nameout[0] = sel_namebox[1];
				sel_numbox[6] = sel_numbox[2];
			}
			
			else if(sel_numbox[0] > 30000 && sel_numbox[0] <= 45000){
				
				sel_nameout[0] = sel_namebox[2];
				sel_numbox[6] = sel_numbox[3];
			}
			
			else if(sel_numbox[0] > 45000 && sel_numbox[0] <= 65000){
				
				sel_nameout[0] = sel_namebox[3];
				sel_numbox[6] = sel_numbox[4];
			}
			
			else if(sel_numbox[0] > 65000){
				
				sel_nameout[0] = sel_namebox[4];
				sel_numbox[6] = sel_numbox[5];
			}
			
			else{
				
				// If basic pay is less than 10000, trigger an error in the final output
				sel_nameout[0] = sel_namebox[5];
				sel_numbox[6] = 0;
			}
			
			sel_numout[3] = sel_numout[2] * sel_numbox[6]; 							// numout 3 = Withholding tax [For Final Output]
			sel_numout[4] = sel_numout[2] - sel_numout[3];							// numout 4 = Net Pay [For Final Output]
			
			if(sel_nameout[0] == sel_namebox[5]){
				
				cout << "\n========================================================";
				cout << "\nInvalid. The entered basic Salary is too low.\n\n";
				system("pause");
			}
			
			else{
				
				// Valid Final Output
				cout << "\n========================================================";
				cout << "\nName: " << sel_namebox[0];
				cout << "\nPosition: " << sel_nameout[0];
				cout << "\nOvertime Pay: " << sel_numout[1];
				cout << "\nGross Pay: " << sel_numout[2];
				cout << "\nWithholding Tax: " << sel_numout[3];
				cout << "\nNet Pay: " << sel_numout[4] << "\n\n";
				system("pause");
			}
		}
		// End of Selection Cases
		
		//==================================//
		//----------------------------------//
		//----------REPETITION CASES--------//
		//----------------------------------//
		//==================================//
		else if(menu == 13){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nDesign a flowchart that will ask for an integer and will display the factorial of that integer.";
			cout << "\nNote that the factorial of 0  and 1 are both equal to 1. NEGATIVE INPUT IS INVALID.";
				
			cout << "\n\nEnter a number: ";
			cin >> r_input;
			
			for(r_input; r_input < 0;){
				
				system("cls");
				cout << "(Description of Problem)";
				cout << "\nDesign a flowchart that will ask for an integer and will display the factorial of that integer.";
				cout << "\nNote that the factorial of 0  and 1 are both equal to 1. NEGATIVE INPUT IS INVALID.";
				
				cout << "\n\nEnter a number: ";
				cin >> r_input;
			}
			
			r_holder[0] = r_input;
			r_output[0] = 1.0;
			r_input = 0;
			
			for(i3 = 1.0; i3 <= r_holder[0]; i3++){
				r_output[0] *= i3;
			}
			
			// There seems to be a technical limit where starting from 10!, the answers will be shown in scientific notation (e+6 or something)
			cout << "\n========================================================";
			cout << "\n" << r_holder[0] << "! = " << r_output[0] << "\n\n";
			system("pause");
		}
		
		else if(menu == 14){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nDesign a flowchart that will ask for the item price and the number of that item being purchased.";
			cout << "\nProcessing should stop when the last item price has been added.";
			cout << "\nThe bill should contain the total amount due the customer, the amount paid by the customer and the change of the customer, if any.";
			
			cout << "\n\nHow many items are you purchasing?: ";
			cin >> r_input;
			r_holder[0] = r_input;
			r_input = 0;
			
			for(i = 0; i < r_holder[0]; i++){
				cout << "\nEnter the price for item [" << i+1 << "]: ";
				cin >> r_input;
				r_output[0] += r_input;
			}
			
			r_input = 0;
			
			cout << "\nTotal: " << r_output[0];
			cout << "\nPlease enter your payment: ";
			cin >> r_input;
			
			r_output[1] = r_input - r_output[0];
			
			cout << "\n========================================================";
			cout << "\n                       RECEIPT";
			cout << "\n========================================================";
			cout << "\nGrand Total: " << r_output[0];
			cout << "\nPayment: " << r_input;
			cout << "\nChange: " << r_output[1] << "\n\n";
			system("pause");
		}
		
		else if(menu == 15){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nDesign a flowchart that will ask for an integer and will display all odd numbers from 1 up to the value of the integer entered, inclusive.";
			
			cout << "\n\nEnter a number: ";
			cin >> r_input;
			r_holder[0] = r_input;
			
			cout << "\nDisplaying all odd numbers from 1 to " << r_holder[0] << "\n";
			
			for (i = 1; i <= r_holder[0];i++){
				
				if(i == 1){
		
					cout << "\n[" << i << "] :: ";
					i++;
				}
				
				else if(i == 3){
					
					cout << i;
					i++;
				}
				
				else if(i == r_holder[0]){
					
					cout << " :: [" << i << "]";
				}
				
				else{
		
					cout << " :: " << i;
					i++;
				}
			}
			
			r_output[0] = (int) r_holder[0] % 2;
			
			if (r_output[0] == 0){
				
				cout << " :: [" << r_holder[0] << "]";	
			} 
			
			cout << "\n\n";
			system("pause");
		}
		
		else if(menu == 16){
			
			system("cls");
			cout << "(Description of Problem)";
			cout << "\nDesign a flowchart that will ask for a code and will input and display the corresponding requirements as follows: ";
			cout << "\nCode  Requirements";
			cout << "\n 1      Input name,age, and display";
			cout << "\n 2      Input address, phone number, and display";
			cout << "\n 3      Exit";
			cout << "\n(Fun fact: This is the only part of the program where the inputting process isn't printed along with this description)\n\n";
			system("pause");
			
			// I'm not really sure if the whole thing is just "input some stuff, display it afterwards...then input another set again"
			// That's what I coded anyway.
			
			for(menu = 0; menu != 3;){
				
				system("cls");
				cout << "Simple Input and Display Menu";
				cout << "\n[1] Input Name, Age, & Display";
				cout << "\n[2] Input Address, Phone Number, & Display";
				cout << "\n[3] Exit";
				
				cout << "\n\nEnter Choice: ";
				cin >> menu;
				
				if(menu == 1){
					
					system("cls");
					
					cout << "\nEnter your name: ";
					cin.ignore();
					getline(cin, r_inputname);
					r_holdername[0] = r_inputname;
					r_inputname = "";
					
					cout << "\nEnter your age: ";
					cin >> r_input;
					r_holder[0] = r_input;
					r_input = 0;
					
					cout << "\nEnter your display (name?): ";
					cin.ignore();
					getline(cin, r_inputname);
					r_holdername[1] = r_inputname;
					r_inputname = "";
					
					cout << "\n========================================================";
					cout << "\nName: " << r_holdername[0];
					cout << "\nAge: " << r_holder[0];
					cout << "\nDisplay: " << r_holdername[1] << "\n\n";
					system("pause");
				}
				
				else if(menu == 2){
					
					system("cls");
					
					cout << "\nEnter your address: ";
					cin.ignore();
					getline(cin, r_inputname);
					r_holdername[0] = r_inputname;
					r_inputname = "";
					
					cout << "\nEnter your Phone number: ";
					getline(cin, r_inputname);
					r_holdername[1] = r_inputname;
					r_inputname = "";
					
					cout << "\nEnter your Display: ";
					getline(cin, r_inputname);
					r_holdername[2] = r_inputname;
					r_inputname = "";
					
					cout << "\n========================================================";
					cout << "\nAddress: " << r_holdername[0];
					cout << "\nPhone Number: " << r_holdername[1];
					cout << "\nDisplay: " << r_holdername[2] << "\n\n";
					system("pause");
				}
			}
			
		}
		// End of Repetition Cases
		
		// Suuper Secret Extraaaas.
		else if(menu == 17){
			cout << "\nGoodbye, World.";
		}
		
		else if(menu == 69){
			cout << "\nWow, you chose the sex number. I'm so proud.\n\n";
			system("pause");
		}
	}
	
}
