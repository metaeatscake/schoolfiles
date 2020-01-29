#include <iostream>
#include <conio.h>

using namespace std;

int main(void){
	
	int num = 0;
	
	cout << "\n\tInput a number : ";
	cin >> num;
	
	switch(num){
		case 1: //code here
			cout << "\n\tOne";
			break;
		case 2: //code here
			cout << "\n\tTwo";
			break;
		case 3: //code here
			cout << "\n\tThree";
			break;
		default: // any number not 1,2,3
			cout << "\n\tNumbers except 1, 2 and 3";
			break;			
	}
	
	getch();
	
}
