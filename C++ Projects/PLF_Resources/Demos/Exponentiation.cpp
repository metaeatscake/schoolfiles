//Libraries (Header Files)
#include <iostream> // cin >> inputs, cout << outputs
#include <conio.h> //  getch();
#include <math.h> // mathematical functions ex. pow()

//std::cout --> cout
//std::cin --> cin
using namespace std;

int main(void){
	
	//declaration / initialization of variables
	int a = 0;
	int square = 0;
	
	//performing exponentiation using pow function --> pow() (must include math.h header file)
	//a --> base number
	//2 --> exponent
	// a ^ 2
	square = pow(a, 2);
	
	//Output   - first output  -  second output
	std::cout << "\n\tSquare is " << square;
	
	getch();
}
