#include <iostream>
#include <cmath>
using namespace std;

main()
{
	char name[200];
	double quiz1, quiz2, quiz3, quiz4, minorA, classPos, midexam, midgrade ;
	
	cout << "Input name: ";
	cin.getline(name, 200); 
	cout << "Input Quiz 1 score: ";
	cin >> quiz1;
	cout << "Input Quiz 2 score: ";
	cin >> quiz2;
	cout << "Input Quiz 3 score: ";
	cin >> quiz3;
	cout << "Input Quiz 4 score: ";
	cin >> quiz4;
	cout << "Input Minor A score: ";
	cin >> minorA;
	cout << "Input Class Position: ";
	cin >> classPos;
	cout << "Input Midterms score: ";
	cin >> midexam;
	
	midgrade = (((quiz1 + quiz2 + quiz3 + quiz4)/4)*0.2) + (minorA * 0.2) + (classPos * 0.1) + (midexam * 0.5);
	
	cout << "\n\nName: " << name;
	cout << "\nMidterm Grade: " << midgrade;
}
