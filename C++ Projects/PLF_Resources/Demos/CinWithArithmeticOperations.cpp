//Libraries (Header Files)
#include <iostream> // cin >> inputs, cout << outputs
#include <conio.h> //  getch();

//std::cout --> cout
//std::cin --> cin
using namespace std;

int main(void){
	
	//declaration / iniatialization of variables
	float a = 0, b = 0;
	float sum = 0, difference = 0, product = 0, quotient = 0;
	
	cout << "\n\tInput a value for variable a : ";
	cin >> a;//Input for the value of variable a
	
	cout << "\n\tInput a value for variable b : ";
	cin >> b; //Input for the value of variable b
	
	sum = a + b;
	difference = a - b;
	product = a * b;
	quotient = a / b;
	
	cout << "\n\tSum is " << sum;
	cout << "\n\tDifference is " << difference;
	cout << "\n\tProduct is " << product;
	cout << "\n\tQuotient is " << quotient;
	
	getch();
}
