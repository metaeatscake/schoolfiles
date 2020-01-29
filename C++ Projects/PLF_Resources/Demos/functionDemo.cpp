//Header Files
#include <iostream>
#include <conio.h>

using namespace std;
//function prototype
float computeForSum(float add1, float add2);
float computeForDifference(float diff1, float diff2);

int main(void){
	
	float a=0, b=0;
	int option=0;
	
	cout << "\n\tPlease input a first number _ ";
	cin >> a;
	cout << "\n\tPlease input a second number _ ";
	cin >> b;
	
	cout << "\n\t\tSample Menu";
	cout << "\n\t[1]Sum";
	cout << "\n\t[2]Difference";
	cout << "\n\t[3]Product";
	cout << "\n\t[4]Quotient";
	
	cout << "\n\n\tPlease choose an option _";
	cin >> option;
	
	if((option<1) || (option>4)){
		cout << "\n\tInvalid Input";
	}else{
		switch(option){
			case 1: cout << "\n\tSum : " << computeForSum(a,b);
					break;
			case 2: cout << "\n\tDifference : " << computeForDifference(a,b);
					break;
			case 3: cout << "Product";
					break;
			case 4: cout << "Quotient";
					break;
		}
	}
	getch();
}
//function definition
float computeForSum(float add1, float add2){
	//local variables for function computeForSum
	float sum = 0;
	
	sum = add1 + add2;
	return sum;
}
float computeForDifference(float diff1, float diff2){
		//local variables for function computeForDifference
		float difference = 0;
		
		difference = diff1 - diff2;
		return difference;
}
