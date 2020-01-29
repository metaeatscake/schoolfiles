#include <iostream>
#include <conio.h>

using namespace std;

int main(void){
	
	int num = 5;
	
	//execute program code at first loop even if condition not met (compared with While Loop) 
	do{
		cout << "\n\tNumber : " << num;
		num --;
	}while(num > 0);
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
