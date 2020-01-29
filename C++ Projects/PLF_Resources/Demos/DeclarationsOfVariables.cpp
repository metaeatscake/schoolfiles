//Libraries (Header Files)
#include <iostream> // cin >> inputs, cout << outputs
#include <conio.h> //  getch();

//std::cout --> cout
//std::cin --> cin
using namespace std;

int main(void){
	
	//declaration / initialization of variables
	int number=90, age=19; // integer type (multiple variable can be declare with same data type separated with comma)
	int numberOfStudents=5; // integer type
	float grade=74.49; //float type 
	bool okay=true; //boolean type (accepts only true or false / 1 => true, 0 => false)
	//bool okay=1;
	
	cout << "\n\tValue of number variable: ["<< number << "]";
    cout << "\n\tNumber of Students: " << numberOfStudents;
	cout << "\n\tYour Grade is: " << grade;
	cout << "\n\tAre you okay?: " << okay;
      
      
    getch();
}
