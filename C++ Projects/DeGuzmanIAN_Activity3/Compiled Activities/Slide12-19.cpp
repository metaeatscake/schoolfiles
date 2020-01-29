#include <iostream>
#include <cmath>

using namespace std;

main(){
	int menuchoice;
	
	// the following variables break the code if I declare them within their cases,so they're here.
	string c3name;
	string c6name;
	string name, pos;
	double c5pi = 3.14159;
	
	system("echo This program compiles every activity from slide 12 to slide 19");
	cout << "\n\n---Activity 1, Sequence Control Structure---";
	cout << "\n[1] Slide 12";
	cout << "\n[2] Slide 13";
	cout << "\n[3] Slide 14";
	cout << "\n[4] Slide 15, number 1";
	cout << "\n[5] Slide 15, number 2";
	cout << "\n[6] Slide 15, number 3";
	
	cout << "\n\n---Activity 2, Selection Control Structure---";
	cout << "\n[7] Slide 16, number 1";
	cout << "\n[8] Slide 16, number 2";
	cout << "\n[9] Slide 17, number 1";
	cout << "\n[10] Slide 17, number 2";
	
	cout << "\n\n---Activity 3, Switch Case Statement--- (not including menu activities)";
	cout << "\n[11] Slide 18";
	cout << "\n[12] Slide 19";
	
	cout << "\n\nGo To: ";
	cin >> menuchoice;
	
	switch(menuchoice){
		case 1:
			system("cls");
			int c1num1, c1num2;
			double c1cube, c1product, c1fiveroot;
	
			system("echo (You have selected Slide 12.)");
			system("echo Asks for two integers and computes the following:");
			system("echo a. Product of the two integers");
			system("echo b. Cube of the difference of the two integers");
			system("echo c. Fifth root of the square of the sum of these two integers");
			
			cout << "\n\nEnter num1: ";
			cin >> c1num1;
			cout << "Enter num2: ";
			cin >> c1num2;
	
			c1product = c1num1 * c1num2;
			c1cube = pow(c1num1-c1num2, 3);
			c1fiveroot = pow(pow(c1num1+c1num2, 2), 1.0/5.0);
	
			cout << "\nProduct of num1 and num2: " << c1product;
			cout << "\nCube of difference of num1 and num2: " << c1cube;
			cout << "\nFifth root of sum of num1 and num2: " << c1fiveroot;
		break;
		case 2:
			system("cls");
			int c2minIn, c2hours, c2minOut;
	
			system("echo You have selected Slide 13.");
			system("echo This program converts minutes to hours and minutes");
			
			cout << "\nEnter a number of minutes: ";
			cin >> c2minIn;
	
			c2hours = c2minIn / 60;
			c2minOut = c2minIn % 60;
	
			cout << "\nHours: " << c2hours;
			cout << "\nMinutes: " << c2minOut;
		break;
		case 3:
			system("cls");
			double c3quiz1, c3quiz2, c3quiz3, c3quiz4, c3minorA, c3classPos, c3midexam, c3midgrade ;
	
			system("echo (You have selected Slide 14.)");
			system("echo This program computes for your midterm grade");
	
			cout << "Input name: ";
			cin.ignore();
			getline(cin, c3name);
			cout << "Input Quiz 1 score: ";
			cin >> c3quiz1;
			cout << "Input Quiz 2 score: ";
			cin >> c3quiz2;
			cout << "Input Quiz 3 score: ";
			cin >> c3quiz3;
			cout << "Input Quiz 4 score: ";
			cin >> c3quiz4;
			cout << "Input Minor A score: ";
			cin >> c3minorA;
			cout << "Input Class Position: ";
			cin >> c3classPos;
			cout << "Input Midterms score: ";
			cin >> c3midexam;
	
			c3midgrade = (((c3quiz1 + c3quiz2 + c3quiz3 + c3quiz4)/4)*0.2) + (c3minorA * 0.2) + (c3classPos * 0.1) + (c3midexam * 0.5);
	
			cout << "\n\nName: " << c3name;
			cout << "\nMidterm Grade: " << c3midgrade;
		break;
		case 4:
			system("cls");
			
			int c4varA, c4varB, c4varC, c4varD;
	
			system("echo (You have selected Slide 15, Problem 1.)");
			system("echo This asks for VarA and VarB. Then it computes and displays VarC (A squared + B squared) and VarD (A - 10)");
			
			cout << "\n\nEnter a value for varA: ";
			cin >> c4varA ;
			cout << "Enter a value for varB: ";
			cin >> c4varB ;
	
			c4varC = pow(c4varA, 2) + pow(c4varB, 2) ;
			c4varD = c4varA - 10 ;
	
			cout << "\nValue of VarC (A^2 + B^2): " << c4varC;
			cout << "\nValue of VarD (A - 10): " << c4varD;
		break;
		case 5:
			system("cls");
			double c5rect_l, c5rect_w, c5rect_peri;
			double c5tri_b, c5tri_h, c5tri_area;
			double c5cyl_r, c5cyl_h, c5cyl_vol;
			
			int c5menu;

			system("echo (You have selected Slide 15, Problem 2.)");
			system("echo This solves for rectangle perimeter, triangle area, and cylinder volume");
			system("echo I converted it to a switch case just because it would look cleaner");
			
			cout << "\n\nCalculator Menu-within-menu thingy";
			cout << "\n[1] Rectangle Perimeter";
			cout << "\n[2] Triangle Area";
			cout << "\n[3] Cylinder Volume";
			
			cout << "\n\nEnter your choice: ";
			cin >> c5menu;
			
			switch(c5menu){
				case 1:
					//system("cls");
					cout << "\n\nEnter length of rectangle: ";
					cin >> c5rect_l;
					cout << "Enter width of rectangle: ";
					cin >> c5rect_w;				
					
					c5rect_peri = 2*(c5rect_l + c5rect_w);
					
					cout << "\nPerimeter of rectangle: " << c5rect_peri << " Units";
				break;
				case 2:
					//system("cls");
					cout << "\n\nEnter base of triangle: ";
					cin >> c5tri_b;
					cout << "Enter height of triangle: ";
					cin >> c5tri_h;
					
					c5tri_area = (c5tri_b*c5tri_h) / 2;
					
					cout << "\nArea of Triangle: " << c5tri_area << " sq.Units";
				break;
				case 3:
					//system("cls");
					cout << "\n\nEnter radius of cylinder: ";
					cin >> c5cyl_r;
					cout << "Enter height of cylinder: ";
					cin >> c5cyl_h;
	
					c5cyl_vol = c5pi * pow(c5cyl_r, 2) * c5cyl_h;
	
					cout << "\nVolume of Cylinder: " << c5cyl_vol << " cubic units";
				break;
				default:
					cout << "Invalid Input lol";						
			}	
		break;
		case 6: 
			double c6hrWorked, c6hrRate, c6salary;
	
			system("cls");
			system("echo (You have selected Slide 15, Problem 3.)");
			system("echo This calculates your basic salary using hours worked and the pay per hour.");
			
			cout << "\n\nEnter your name: ";
			cin.ignore();
			getline(cin, c6name);
			cout << "Enter the amount of hours worked: ";
			cin >> c6hrWorked;
			cout << "Enter the hourly rate or pay per hour: ";
			cin >> c6hrRate;
	
			c6salary = c6hrWorked * c6hrRate;
	
			cout << "\nName: " << c6name;
			cout << "\nSalary: " << c6salary; 
		break;
		case 7: 
			double c7num;
	
			system("cls");
			system("echo (You have selected Slide 16, Problem 1.)");
			system("echo This program determines if a number is positive, negative or zero");
			
			cout << "\n\nInput a number: ";
			cin >> c7num;
	
			if (c7num < 0){
				cout << "\nThis number is negative";
			}
			if (c7num == 0){
				cout << "\nThis number is zero";
			}
			if (c7num > 0){
				cout << "\nThis number is positive";
			}
		break;
		case 8:
			double c8age;
	
			system("cls");
			system("echo (You have selected Slide 16, Problem 2.)");
			system("echo This program asks for an age and displays a remark");
			
			cout << "\n\nInput an age: ";
			cin >> c8age;
	
			if (c8age <= 0){
				cout << "\nNo, that c8age is not valid.";
			}
			if (c8age >= 1 && c8age <= 2){
				cout << "\nThe age " << c8age << " years old is considered as 'Baby'";
			}
			if (c8age >=3 && c8age <=4){
				cout << "\nThe age " << c8age << " years old is considered as 'Toddler'";
			}
			if (c8age >=5 && c8age <=9){
				cout << "\nThe age " << c8age << " years old is considered as 'Kid'";
			}
			if (c8age >=10 && c8age <=12){
				cout << "\nThe age " << c8age << " years old is considered as 'Adolescent'";
			}
			if (c8age >=13 && c8age <=19){
				cout << "\nThe age " << c8age << " years old is considered as 'Teenager'";
			}
			if (c8age >=20 && c8age <=25){
				cout << "\nThe age " << c8age << " years old is considered as 'Young Adult'";
			}
			if (c8age >=26){
				cout << "\nThe age " << c8age << " years old is considered as 'Adult'";
			}
		break;
		case 9:
			int c9num;
	
			system("cls");
			system("echo (You have selected Slide 17, Problem 1.)");
			system("echo This program counts the number of digits from an input");
			system("echo Note: Up to 6 digits only.");
	
			cout << "\n\nInput a number: ";
			cin >> c9num;
	
			if (c9num >= 0){ // Counts digits of POSITIVE numbers
				if (c9num >=0 && c9num <= 9){
					cout << "The number " << c9num << " has 1 digit";
				}	
				else if (c9num >=10 && c9num <= 99){
					cout << "The number " << c9num << " has 2 digits";
				}	
				else if (c9num >=100 && c9num <= 999){
					cout << "The number " << c9num << " has 3 digits";
				}
				else if (c9num >=1000 && c9num <=9999){
					cout << "The number " << c9num << " has 4 digits";
				}	
				else if (c9num >=10000 && c9num <=99999){
					cout << "The number " << c9num << " has 5 digits";
				}	
				else if(c9num >=100000 && c9num <=999999){
					cout << "The number " << c9num << " has 6 digits";
				}
				else{
					cout << "\nInvalid Input";
				}
			}
			else if (c9num < 0){ // Counts digits of NEGATIVE numbers
				if (c9num < 0 && c9num >= -9){
					cout << "The number " << c9num << " has 1 digit";
				}	
				else if (c9num <= -10 && c9num >= -99){
					cout << "The number " << c9num << " has 2 digits";
				}	
				else if (c9num <= -100 && c9num >= -999){
					cout << "The number " << c9num << " has 3 digits";
				}
				else if (c9num <= -1000 && c9num >= -9999){
					cout << "The number " << c9num << " has 4 digits";
				}	
				else if (c9num <= -10000 && c9num >= -99999){
					cout << "The number " << c9num << " has 5 digits";
				}	
				else if (c9num <= -100000 && c9num >= -999999){
					cout << "The number " << c9num << " has 6 digits";
				}
				else{
					cout << "\nInvalid Input";
				}
			}
		break;
		case 10: // From here, the variable renaming stops
			double call, text, callextra, textextra, bill;
	
			system("cls");
			system("echo (You have selected Slide 17, Problem 2.)");
			system("echo This program calculates for your cell phone bill, with a fixed rate of 500");
			
			cout << "\n\nEnter your total call time (in minutes): ";
			cin >> call;
			cout << "Enter your total texts: ";
			cin >> text;
	
			callextra = call - 20;
			textextra = text - 500;
			bill = 500;
	
			if(call <=20){ 
				if (text <=500){ // Case 1: No extra calls, no extra texts
					cout << "\nYour bill is 500";
				}
				else{ // Case 2: No extra calls, there's extra texts
					cout << "\nYour bill is " << bill + textextra << " with " << textextra << " excess texts";
				}
			}
			else{ 
				if (text <=500){ // Case 3: There is extra calls, no extra texts
					cout << "\nYour bill is " << bill + (6*callextra) << " with " << callextra << " minutes of excess calls";
				}
				else{ // Case 4: There is extra calls and extra texts
					cout << "\nYour bill is " << bill + (6*callextra) + textextra << " with " << textextra << " excess texts and " << callextra << " minutes of excess calls"; 
				}
			} 
		break;
		case 11: 
			system("cls");
			system("echo (You have selected Slide 18.)");
			system("echo This finds the sum, difference and product of two numbers and finds which of them is the highest.");
			
			double num1, num2, sum, diff, prod;
			
			cout << "\n\nEnter num1: ";
			cin >> num1;
			cout << "\nEnter num2: ";
			cin >> num2;
	
			sum = num1 + num2;
			diff = num1 - num2;
			prod = num1 * num2;
	
			cout << "\nThe sum is: " << sum;
			cout << "\nThe difference is: " << diff;
			cout << "\nThe product is: " << prod;
	
			if (sum > diff && sum > prod){
				cout << "\n\nHighest: Sum";
			}
			else if (diff > sum && diff > prod){
				cout << "\n\nHighest: Difference";
			}
			else if (prod > sum && prod > diff){
				cout << "\n\nHighest: Product";
			}
			else {
				cout << "\n\nThere is no highest; Invalid input.";
			}
		break;
		case 12:
			system("cls");
			system("echo (You have selected Slide 19.)");
			system("echo This is the Gross Pay Calculator.");
			
			double bpay, gpay, npay, otimehr, otimepay, wtax, taxrate;
			
			cout << "\nEnter your name: ";
			cin.ignore();
			getline(cin, name);
			cout << "\nEnter your basic salary: ";
			cin >> bpay;
			cout << "\nEnter your overtime hours: ";
			cin >> otimehr;
			
			otimepay = (bpay*0.01) * otimehr;
			gpay = bpay + otimepay;
			
			if (bpay >=10000 && bpay <=30000){
				taxrate = 0.1;
				pos = "Rank & File";
				wtax = gpay * taxrate;
				npay = gpay - wtax;
				
				cout << "\nName: " << name;
				cout << "\nPosition: " << pos;
				cout << "\nGross Pay: " << gpay;
				cout << "\nOvertime Pay: " << otimepay;
				cout << "\nWithholding Tax: " << wtax;
				cout << "\nNet Pay: " << npay;
			} 
			else if (bpay >= 30000 && bpay <= 45000){
				taxrate = 0.15;
				pos = "Manager";
				wtax = gpay * taxrate;
				npay = gpay - wtax;
				
				cout << "\nName: " << name;
				cout << "\nPosition: " << pos;
				cout << "\nGross Pay: " << gpay;
				cout << "\nOvertime Pay: " << otimepay;
				cout << "\nWithholding Tax: " << wtax;
				cout << "\nNet Pay: " << npay;
			}
			else if (bpay >= 45000 && bpay <= 65000){
				taxrate = 0.18;
				pos = "Vice President";
				wtax = gpay * taxrate;
				npay = gpay - wtax;
				
				cout << "\nName: " << name;
				cout << "\nPosition: " << pos;
				cout << "\nGross Pay: " << gpay;
				cout << "\nOvertime Pay: " << otimepay;
				cout << "\nWithholding Tax: " << wtax;
				cout << "\nNet Pay: " << npay;
			}
			else if (bpay >= 65000){
				taxrate = 0.2;
				pos = "President";
				wtax = gpay * taxrate;
				npay = gpay - wtax;
				
				cout << "\nName: " << name;
				cout << "\nPosition: " << pos;
				cout << "\nGross Pay: " << gpay;
				cout << "\nOvertime Pay: " << otimepay;
				cout << "\nWithholding Tax: " << wtax;
				cout << "\nNet Pay: " << npay;
			}
			else {
				cout << "The basic pay is too low; invalid input";
			}
		break;
		default:
			cout << "Invalid Input";
	}
	
	
}
