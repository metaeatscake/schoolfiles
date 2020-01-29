#include <iostream>
#include <conio.h> 

using namespace std;

int main(void){
	
   int num1=0, num2=0;
   float quo=0;
   
   num1 = 5;
   num2 = 2;
   
   //cast operation 
   quo = (float)num1/num2; //force the operation result integer type change to float type
   
   cout << "\n\tQuotient: " << quo;
   
   getch();   
}
