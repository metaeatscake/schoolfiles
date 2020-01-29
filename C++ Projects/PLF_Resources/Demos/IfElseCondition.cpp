#include <iostream>
#include <conio.h>

using namespace std;

int main(void){
	
	int num = 0;
	
	cout << "\n\tInput a value_";
	cin >> num;
	
	if(num > 0){ // condition --> num greater than 0 --> 1, 2, ...
		cout << "\nPositive"; 	
	}
	else if(num < 0){ // condition --> num less than 0 --> -1, -2, ...
		cout << "\nNegative"; 
	}
	else{ // no condition --> all possible value for num that does not met previous conditions --> 0
		cout << "\nZero"; 
	}
	
	getch();
}
