#include <iostream>
#include <cmath>

using namespace std;

main()
{
	string name;
	double hrWorked, hrRate, salary;
	
	cout << "Enter your name: ";
	getline(cin, name);
	cout << "Enter the amount of hours worked: ";
	cin >> hrWorked;
	cout << "Enter the hourly rate or pay per hour: ";
	cin >> hrRate;
	
	salary = hrWorked * hrRate;
	
	cout << "\nName: " << name;
	cout << "\nSalary: " << salary; 
}
