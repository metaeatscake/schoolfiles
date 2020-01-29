#include <iostream>
#include <cmath>

using namespace std;

main(){
	int menuchoice;
	
	do{
		
		//==================//
		//		MENU		//
		//==================//
		system("cls");
		cout << "---Activity 4 Programs Menu---";
		cout << "\n[1] Consecutive Numbers Addition thing";		
		cout << "\n[2] Seconds to Hours,Mins,Seconds calculator";	
		cout << "\n[3] Long Multiplication Calculator";				
		cout << "\n[4] 'Odd Number Divisible by 3' Tester";			
		cout << "\n[5] EXIT";
		
		cout << "\n\nEnter choice: ";
		cin >> menuchoice;
		
		//==================//
		//		CASE 1		//
		//==================//
		if(menuchoice == 1){
			double c1num1, c1num2;
			double c1ans = 0;
			double c1ctr = 0;
				
			system("cls");
			system("echo This program adds everything between two numbers. (ex. 4 and 2 ; 4+3+2 ; 9)");
				
			cout << "\nEnter a number: ";
			cin >> c1num1;
			cout << "\nEnter another number: ";
			cin >> c1num2;
				
			if(c1num1 > c1num2){ 
				for (c1ctr = c1num1 ; c1ctr >= c1num2 ; c1ctr--){
					c1ans += c1ctr;
				}
			}
			else if (c1num2 > c1num1){
				for (c1ctr = c1num2 ; c1ctr >= c1num1 ; c1ctr--){
					c1ans += c1ctr;
				}
			}
			else {
				//c1ans = c1num1 + c1num2; // if activity needs to add them anyway
				c1ans = 0; // assuming there's no need to add if there's no numbers in between. 
			}
				
			cout << "Answer: " << c1ans << "\n";
			system("pause");
		}
		
		//==================//
		//		CASE 2		//
		//==================//
		else if (menuchoice == 2){
			int c2secin;
			int c2hour,c2min,c2sec;			
			
			do{
				system("cls");
				system("echo This converts seconds to Hours:Minutes:Seconds");
			
				cout << "\n\nEnter amount of seconds: ";
				cin >> c2secin;
			} while (c2secin < 0); // negative number filter
			
				// Copied from midterms exam code. (thank you sir)
				c2hour = c2secin / 3600;
				c2secin %= 3600;
				c2min = c2secin / 60;
				c2secin %= 60;
				c2sec = c2secin;
				
				cout << "\nAnswer (hours:minutes:seconds): " << c2hour << ":" << c2min << ":" << c2sec << "\n\n";
				system("pause");
		}
		
		//==================//
		//		CASE 3		//
		//==================//
		else if (menuchoice == 3){
			double c3base, c3multiplier, c3ctr = 0, c3ans = 0;
			
			system("cls");
			cout << "\nMultiplication function is broken, This uses repeated addition.";
			cout << "\n\nEnter the number to multiply: ";
			cin >> c3base;
			cout << "\nEnter the multiplier: ";
			cin >> c3multiplier;
			
			if(c3multiplier > 0){ // Positive multipliers.
				for (c3ctr = c3multiplier; c3ctr > 0; c3ctr--){
					c3ans += c3base;
				}
			}
			else if (c3multiplier < 0){ // Negative multipliers. 
				for (c3ctr = c3multiplier; c3ctr < 0; c3ctr++){
					c3ans += -c3base;
				}
			}
			else {
				c3ans = 0;
			}
			
			cout << "\nAnswer: " << c3ans << "\n\n";
			system("pause");
		}
		
		//==================//
		//		CASE 4		//
		//==================//
		else if (menuchoice == 4){
			int c4odd = 0;
	
			for(c4odd = 0; c4odd % 2 == 0;){
			//do{		
				system("cls");
				system("echo Item 4.");
				cout << "\nEnter an ODD number: ";
				cin >> c4odd;
			//} while (c4odd % 2 == 0);
			}
				
			if(c4odd % 3 == 0){ // Odd numbers that can be divided by 3
				cout << "\nThe number " << c4odd << " is divisible by 3" << "\n\n";
			}
			else{ // Odd nums that can't be divided by 3
				cout << "\nThe number " << c4odd << " is not divisible by 3" << "\n\n";
			}
		
			system("pause");
		}
		
		//----Extra: case 5----
		else if (menuchoice == 5){
			cout << "\nExiting Program...";
		}
		
		//----Extra: invalid cases----
		else {
			cout << "\n\nPlease select from 1 to 5 only" << "\n\n";
			system("pause");
			system("cls");
		}
	
	} while (menuchoice != 5);
}
