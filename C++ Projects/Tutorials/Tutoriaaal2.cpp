#include <iostream>

using namespace std;
main()
{
	short num1 = 10;									// Declare variables and their values
	int num2 = 20;
	long num3 = 30;
	int ansA = 0, ansB = 0, ansC = 0;
	
	ansA = num1 + num2; 								// Processes
	ansB = num1 * num3;
	ansC = num2 / num1;
	
	cout << "Num1: " << num1 << endl; 					// Print all numbers
	cout << "Num2: " << num2 << endl;
	cout << "Num3: " << num3 << endl << endl;
	
	cout << "N1 plus N2: " << ansA << endl;				// Print the processes
	cout << "N1 multiplied to N3: " << ansB << endl;
	cout << "N2 divided by N1: " << ansC << endl << endl;
	
	ansB = (ansA <= ansC) ? 69:420;						// Ternary statement test
	cout << "Testing: " << ansB << endl;
	
}
