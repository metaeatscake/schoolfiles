#include <iostream>
#include <cmath>
using namespace std;

main()
{
	int minIn, hours, minOut;
	
	system("echo This program converts minutes to hours and minutes");
	cout << "\nEnter a number of minutes: ";
	cin >> minIn;
	
	hours = minIn / 60;
	minOut = minIn % 60;
	
	cout << "\nHours: " << hours;
	cout << "\nMinutes: " << minOut;
}
