#include <iostream>
#include <cmath>

using namespace std;

main(){
	int num;
	
	system("echo This program counts the number of digits from an input");
	system("echo Note: Up to 6 digits only.");
	cout << "Input a number: ";
	cin >> num;
	
	if (num >= 0){ // Counts digits of POSITIVE numbers
		if (num >=0 && num <= 9){
			cout << "The number " << num << " has 1 digit";
		}	
		else if (num >=10 && num <= 99){
			cout << "The number " << num << " has 2 digits";
		}	
		else if (num >=100 && num <= 999){
			cout << "The number " << num << " has 3 digits";
		}
		else if (num >=1000 && num <=9999){
			cout << "The number " << num << " has 4 digits";
		}	
		else if (num >=10000 && num <=99999){
			cout << "The number " << num << " has 5 digits";
		}	
		else if(num >=100000 && num <=999999){
			cout << "The number " << num << " has 6 digits";
		}
		else{
			cout << "\nInvalid Input";
		}
	}
	else if (num < 0){ // Counts digits of NEGATIVE numbers
		if (num < 0 && num >= -9){
			cout << "The number " << num << " has 1 digit";
		}	
		else if (num <= -10 && num >= -99){
			cout << "The number " << num << " has 2 digits";
		}	
		else if (num <= -100 && num >= -999){
			cout << "The number " << num << " has 3 digits";
		}
		else if (num <= -1000 && num >= -9999){
			cout << "The number " << num << " has 4 digits";
		}	
		else if (num <= -10000 && num >= -99999){
			cout << "The number " << num << " has 5 digits";
		}	
		else if (num <= -100000 && num >= -999999){
			cout << "The number " << num << " has 6 digits";
		}
		else{
			cout << "\nInvalid Input";
		}
	}
	
}

