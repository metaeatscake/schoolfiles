#include <iostream>
#include <conio.h>

using namespace std;

int main(void){
	
	//declaring array type variable
	int arrayVariable[5] = {10,20,30,40,50};
	//array with 5 same data type initial values 10,20,30,40,50
	
	//accessing array values using index
	cout << "\n\tValue for arrayVariable[0] : " <<  arrayVariable[0];
	cout << "\n\tValue for arrayVariable[1] : " <<  arrayVariable[1];
	cout << "\n\tValue for arrayVariable[2] : " <<  arrayVariable[2];
	cout << "\n\tValue for arrayVariable[3] : " <<  arrayVariable[3];
	cout << "\n\tValue for arrayVariable[4] : " <<  arrayVariable[4];
	
	//changing the value of array using index
	 arrayVariable[0] = 600;
	 
	 cout << "\n\n\tChanged value for arrayVariable[0] : " <<  arrayVariable[0];
	
	getch();
}
