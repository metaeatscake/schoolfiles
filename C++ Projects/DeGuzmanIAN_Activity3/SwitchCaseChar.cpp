#include <iostream>
#include <conio.h>
#include <cmath>

using namespace std;

main(){
	
	double num1, num2, sum, diff;
	double quotient, prod, expanswer, rootans; 
	
	char choice[1];
	
	cout << "Simple Calculator Menu";
	cout << "\n[A] Addition";
	cout << "\n[S] Subtraction";
	cout << "\n[D] Division";
	cout << "\n[M] Multiplication";
	cout << "\n[E] Exponentiation";
	cout << "\n[R] Root Value";
	
	cout << "\nEnter choice: ";
	cin.getline(choice, 2);
	
	switch(choice[0]){
		case 'A': case 'a':
			system("cls");
			system("echo Addition Operation");
			
			cout << "\nEnter first number: ";
			cin >> num1;
			cout << "\nEnter second number: ";
			cin >> num2;
			
			sum = num1 + num2;
			
			cout << "\nSum is " << sum;
			cout << "\n" << num1 << " + " << num2 << " = " << sum;
		break;
		case 'S': case 's':
			system("cls");
			system("echo Subtraction Operation");
			
			cout << "\nEnter first number: ";
			cin >> num1;
			cout << "\nEnter second number: ";
			cin >> num2;
			
			diff = num1 - num2;
			
			cout << "\nDifference is " << diff;
			cout << "\n" << num1 << " - " << num2 << " = " << diff;
		break;
		case 'D': case 'd':
			system("cls");
			system("echo Division Operation");
			
			cout << "\nEnter number to divide: ";
			cin >> num1;
			cout << "\nEnter divisor: ";
			cin >> num2;
			
			quotient = num1 / num2;
			
			cout << "\nThe Quotient is " << quotient;
			cout << "\n" << num1 << " / " << num2 << " = " << quotient;
		break;
		case 'M': case 'm':
			system("cls");
			system("echo Multiplication Operation");
			
			cout << "\nEnter num1: ";
			cin >> num1;
			cout << "\nEnter num2: ";
			cin >> num2;
			
			prod = num1 * num2;
			
			cout << "Product is " << prod;
		break;
		case 'E': case 'e':
			system("cls");
			system("echo Exponentiation Operation");
			
			cout << "\nEnter the base number: ";
			cin >> num1;
			cout << "\nEnter the power to raise the base with: ";
			cin >> num2;
			
			expanswer = pow(num1, num2);
			
			cout << "\nResult: " << expanswer;
		break;
		case 'R': case 'r':
			system("cls");
			system("echo Root Operation");
			
			cout << "\nEnter base number: ";
			cin >> num1;
			cout << "\nEnter root: ";
			cin >> num2;
			
			rootans = pow(num1, 1/num2);
			
			cout << "\nAnswer is " << rootans;
		break;
		default: 
			cout << "Invalid Input";
	}
}
