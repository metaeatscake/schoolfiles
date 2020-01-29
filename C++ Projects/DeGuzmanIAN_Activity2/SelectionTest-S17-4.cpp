#include <iostream>
#include <cmath>
using namespace std;

main(){
	double call, text, callextra, textextra, bill;
	
	cout << "Enter your total call time (in minutes): ";
	cin >> call;
	cout << "Enter your total texts: ";
	cin >> text;
	
	callextra = call - 20;
	textextra = text - 500;
	bill = 500;
	
	if(call <=20){ 
		if (text <=500){ // Case 1: No extra calls, no extra texts
			cout << "\nYour bill is 500";
		}
		else{ // Case 2: No extra calls, there's extra texts
			cout << "\nYour bill is " << bill + textextra << " with " << textextra << " excess texts";
		}
	}
	else{ 
		if (text <=500){ // Case 3: There is extra calls, no extra texts
			cout << "\nYour bill is " << bill + (6*callextra) << " with " << callextra << " minutes of excess calls";
		}
		else{ // Case 4: There is extra calls and extra texts
			cout << "\nYour bill is " << bill + (6*callextra) + textextra << " with " << textextra << " excess texts and " << callextra << " minutes of excess calls"; 
		}
	}
}
