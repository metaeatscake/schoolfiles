#include <iostream>
#include <conio.h>

using namespace std;

int main(void){
	
	//initialize variable
	int num = 10;
	int * variableP;
	
	//address of variable
	cout << "\n" << &num;
	
	//address value
	variableP = &num;
	
	//using address value, pointing to its value in computer memory (* pointer operator)
	cout << "\n" << *variableP;
	
	getch();
	
}
