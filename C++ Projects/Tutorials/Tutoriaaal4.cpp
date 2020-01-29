#include <iostream>
using namespace std;

int main() // return type
{
	int num1, num2 ;
	int sum;										// initialization
	char name[5];
	
	cout << "PUT A FIVE LETTER NAME: ";
	cin >> name;
	
	cout << "Enter value for num1: ";				// Input label
	cin >> num1;									// Input num 1
	cout << "Enter value for num2: ";				// Input label
	cin >> num2;									// Input num 2
	
	
	cout << "Result: " << num1 + num2 << endl << name << endl;		// Process inside output
	
	system("echo Steeeve");
	
	// Alternate process
	// sum = num1 + num2;
	// cout << "Result: " << sum;
	
	return 0;
}
