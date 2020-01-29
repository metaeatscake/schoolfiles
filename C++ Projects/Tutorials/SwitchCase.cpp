#include <iostream>
#include <cmath>
#include <conio.h>

using namespace std;
// Calendar Menu program

main(){
	
	int month;
	
	cout << "\n\n\t\tMonth Menu";
	cout << "\n\n\t\t[1] January";
	cout << "\n\n\t\t[2] February";
	cout << "\n\n\t\t[3] March";
	cout << "\n\n\t\t[4] April";
	cout << "\n\n\t\t[5] May";
	cout << "\n\n\t\t[6] June";
	cout << "\n\n\t\t[7] July";
	cout << "\n\n\t\t[8] August";
	cout << "\n\n\t\t[9] September";
	cout << "\n\n\t\t[10] October";
	cout << "\n\n\t\t[11] November";
	cout << "\n\n\t\t[12] December";
	
	cout << "\n\n\n\t\tEnter selected month: ";
	cin >> month;
	
	switch (month){
		case 1: system("cls");
				cout << "\nJanuary has 31 days";
			break;
		case 2: system("cls");
				cout << "\nFebruary has 28 days, 29 days if leap year.";
			break;
		case 3: system("cls");
				cout << "\nMarch has 31 days.";
			break;
		case 4: system("cls");
				cout << "\nApril has 30 days.";
			break;
		case 5: system("cls");
				cout << "\nMay has 31 days.";
			break;
		case 6: system("cls");
				cout << "\nJune has 30 days.";
			break;
		case 7: system("cls");
				cout << "\nJuly has 31 days.";
			break;
		case 8: system("cls");
				cout << "\nAugust has 31 days.";
			break;
		case 9: system("cls");
				cout << "\nSeptember has 30 days.";
			break;
		case 10: system("cls");
				cout << "\nOctober has 31 days.";
			break;
		case 11: system("cls");
				cout << "\nNovember has 30 days.";
			break;
		case 12: system("cls");
				cout << "\nDecember has 31 days.";
			break;
		default: system("cls");
				cout << "\nInvalid Input.";
	} 
}
