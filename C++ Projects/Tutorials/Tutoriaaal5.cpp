#include <iostream>
using namespace std;

int main()
{
	char name[200];
	char gender[200];
	
	cout << "Enter your name: ";
	cin.getline(name, 200);
	cout << "Enter your gender (m/f): ";
	cin.getline(gender, 200);
	
	cout << "\nName: " << name;
	cout << "\nGender: " << gender; 

	return 69;
	
}
