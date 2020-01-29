//Libraries (Header Files)
#include <iostream> // cin >> inputs, cout << outputs
#include <conio.h> //  getch();
#include <string.h> // String functions strlen() , strcpy() 

//std::cout --> cout
//std::cin --> cin
using namespace std;

int main(void){
	
	//declaration / initialization of variables
	char string1[32] = ""; // character type
	
	cout << "\n\tInput your name : ";
	//cin / input for string/characters with spaces compared with (cin >> input) don't accept spaces
	cin.getline(string1,32);
	//number of characters 
	cout << "\n\tNumber of characters (and spaces) : " << strlen(string1);
	
	getch();
}
