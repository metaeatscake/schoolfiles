#include <iostream>
using namespace std;

main()  // Oooooh no semicolons yeet
{
	int num1, num2																																						; // whoops, you found it lol
	int sum = 0, diff = 0, prod = 0																																		;
	double quotient = 0																																					;
	
	cout 	<< 	"Enter value for num 1: "																																;
	cin 	>> 	num1																																					;
	cout 	<< 	"Enter value for num 2: "																																;
	cin 	>> 	num2																																					;
	
	sum 		= 			num1 + num2																																	;
	diff 		= 			num1 - num2																																	;
	prod 		= 			num1 * num2																																	;
	quotient 	= (double) 	num1 / num2																																	;
	
	cout 	<< "Sum: " 			<< sum 			<< endl																													;
	cout 	<< "Difference: " 	<< diff 		<< endl																													;
	cout 	<< "Product: " 		<< prod 		<< endl																													;
	cout 	<< "Quotient: " 	<< quotient 	<< endl																													;
}

{
	// review
		// cout means console output, use <<
		// cin means console input, use >>
		// int is any non-decimal, whole number
		// float and double are for really big real numbers
		// 
}
