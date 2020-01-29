#include <iostream>
#include <cmath>

using namespace std;

main(){
	int number[5] = {10,20,30,40,50};
	
	cout << "1st number: " << number[0];
	cout << "\n2nd number: " << number[1];
	cout << "\n3rd number: " << number[2];
	cout << "\n4th number: " << number[3];
	cout << "\n5th number: " << number[4];
	
	string name[3] = {"PogiA", "PogiB", "PogiC"};
	
	cout << "\nName 1: " << name[0];
	cout << "\nName 2: " << name[1];
	cout << "\nName 3: " << name[2];
	
	// Variables as index
	
	int getindex;
	int quiz[getindex];
	double sum;
	double quizave;
	
	cout << "\n\nHow many quizzes can you prepare? ";
	cin >> getindex;
	
	for (int indexctr = 0; indexctr <= getindex-1; indexctr++){
		cout << "Enter quiz " << indexctr + 1 << ": ";
		cin >> quiz[indexctr];
		sum += quiz[indexctr]; 
	}	
	
	quizave = sum / getindex;
	
	cout << "\n\nAverage: " << quizave;
}

