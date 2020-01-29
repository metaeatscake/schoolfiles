#include <iostream>
using namespace std;

main()
{
	string name;
	string address;
	
	cout << "Enter your name: ";
	getline(cin, name);
	cout << "Enter your address: ";
	cin.ignore(0);
	getline(cin, address);
	
	cout << "\nHere's your name: " << name;
	cout << "\nHere's your address: " << address;
}
