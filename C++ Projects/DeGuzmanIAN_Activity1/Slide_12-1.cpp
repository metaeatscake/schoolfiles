#include <iostream>
#include <cmath>

using namespace std;

main()
{
	int num1, num2;
	double cube, product, fiveroot;
	
	cout << "Enter num1: ";
	cin >> num1;
	cout << "Enter num2: ";
	cin >> num2;
	
	product = num1 * num2;
	cube = pow(num1-num2, 3);
	fiveroot = pow(pow(num1+num2, 2), 1.0/5.0);
	
	cout << "\nProduct of num1 and num2: " << product;
	cout << "\nCube of difference of num1 and num2: " << cube;
	cout << "\nFifth root of sum of num1 and num2: " << fiveroot;
	
}
