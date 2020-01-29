#include <iostream>
#include <conio.h>

using namespace std;

int main(void){
	
	//Three fields inside parathesis separated by semicolon
	//first --> initialization for variable num (accessible on inside the scope {})
	//second --> conditional statement
	//third --> increment / decrement
	for(int num=5; num>0; num--){
		cout << "\n\tNumber : " << num;
	}
	/*
	(num)5 > 0 --> true --> 5-1 (num--)
	(num)4 > 0 --> true --> 4-1 (num--)
	(num)3 > 0 --> true --> 3-1 (num--)
	(num)2 > 0 --> true --> 2-1 (num--)
	(num)1 > 0 --> true --> 1-1 (num--)
	(num)0 > 0 --> false --> 0-1 (num--) end of loop
	*/
	getch();
}
