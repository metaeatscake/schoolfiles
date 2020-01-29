#include <iostream>
#include <cmath>
using namespace std;

main(){
	double num;
	
	system("echo This program determines if a number is positive, negative or zero");
	cout << "\nInput a number: ";
	cin >> num;
	
	if (num < 0){
		cout << "\nThis number is negative";
	}
	 
	if (num == 0){
		cout << "\nThis number is zero";
	}
	
	if (num > 0){
		cout << "\nThis number is positive";
	}
}
