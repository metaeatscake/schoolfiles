#include <iostream>
#include <cmath>
using namespace std;
main(){
	double age;
	
	cout << "Input an age: ";
	cin >> age;
	
	if (age <= 0){
		cout << "\nNo, that age is not valid.";
	}
	
	if (age >= 1 && age <= 2){
		cout << "\nThe age " << age << " years old is considered as 'Baby'";
	}
	
	if (age >=3 && age <=4){
		cout << "\nThe age " << age << " years old is considered as 'Toddler'";
	}
	
	if (age >=5 && age <=9){
		cout << "\nThe age " << age << " years old is considered as 'Kid'";
	}
	
	if (age >=10 && age <=12){
		cout << "\nThe age " << age << " years old is considered as 'Adolescent'";
	}
	
	if (age >=13 && age <=19){
		cout << "\nThe age " << age << " years old is considered as 'Teenager'";
	}
	
	if (age >=20 && age <=25){
		cout << "\nThe age " << age << " years old is considered as 'Young Adult'";
	}
	
	if (age >=26){
		cout << "\nThe age " << age << " years old is considered as 'Adult'";
	}
}
