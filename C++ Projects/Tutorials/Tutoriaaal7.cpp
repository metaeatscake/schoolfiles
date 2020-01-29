#include <iostream>
#include <cmath>

using namespace std;

main()
{
	double result, root;
	
	result = pow(7, 2); // pow(base, exponent)
	// 7 ^ 2 = 49
	root = pow(49, 0.5); // roots can be written in decimal or fraction. Use fraction form in repeating decimals
	// sqrt(49) = 7
	
	cout << "\n7*7 = " << result;
	cout << "\nSquare root of 49: " << root; 
}
