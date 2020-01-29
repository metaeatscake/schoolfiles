#include <iostream>
#include <conio.h>

using namespace std;

int main(void){
	
	int num = 5;
	
	//Loop with conditional statement is true
	while(num > 0){
		cout << "\n\tNumber : " << num;
		num --;
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
