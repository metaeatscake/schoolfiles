#include <iostream>
#include <cmath>
using namespace std;

main()
{
	int varA, varB, varC, varD;
	
	cout << "Enter a value for varA: ";
	cin >> varA ;
	cout << "Enter a value for varB: ";
	cin >> varB ;
	
	varC = pow(varA, 2) + pow(varB, 2) ;
	varD = varA - 10 ;
	
	cout << "\nValue of VarC (A^2 + B^2): " << varC;
	cout << "\nValue of VarD (A - 10): " << varD;
}
