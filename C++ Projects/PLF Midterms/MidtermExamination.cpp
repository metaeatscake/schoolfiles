#include <iostream>
#include <conio.h>
using namespace std;

main()
{
	int oneK, fiveH, twoH, oneH, fifty, twenty, ten, five, one, money;
	int code;
	int num;
	string course;
	int numEnrollee;
	int num1, num2, sum;
	int fCtr;
	string empName;
	int years;
	double salary;
	double sepPay;
	int sec, min, hrs;
	do
	{
		int ctr = 1, highest = 0, lowest = 0;
		system("cls");
		cout << "Midterm Examination" << endl;
		cout << "[1]Set A" << endl;
		cout << "[2]Set B" << endl;
		cout << "[3]Exit" << endl;
		cout << "\nInput choice: ";
		cin >> code;
		switch(code)
		{
			case 1:
			do
			{
				int ctr = 1, highest = 0, lowest = 0;
				system("cls");
				cout << "Set A problems" << endl;
				cout << "[1]Problem 1" << endl;
				cout << "[2]Problem 2" << endl;
				cout << "[3]Problem 3" << endl;
				cout << "[4]Problem 4" << endl;
				cout << "[5]Back" << endl;
				cout << "\nInput choice: ";
				cin >> code;	
				switch(code)
				{
					case 1:
					do
					{
						system("cls");
						cout << "Input money value: ";	
						cin >> money;
						oneK = money / 1000;
						money %= 1000;
						fiveH = money / 500;
						money %= 500;
						twoH = money / 200;
						money %= 200;
						oneH = money / 100;
						money %= 100;
						fifty = money / 50;
						money %= 50;
						twenty = money / 20;
						money %= 20;
						ten = money / 10;
						money %= 10;
						five = money / 5;
						money %= 5;
						one = money;
								
						cout << "\n1000: " << oneK << endl;
						cout << "500: " << fiveH << endl;
						cout << "200: " << twoH << endl;
						cout << "100: " << oneH << endl;
						cout << "50: " << fifty << endl;
						cout << "20: " << twenty << endl;
						cout << "10: " << ten << endl;
						cout << "5: " << five << endl;
						cout << "1: " << one << endl;
						getch();
						}
						while(money < 0);
					break;
					case 2:
						system("cls");
						do
						{
							cout << "Enter an even number[" << ctr << "]: ";
							cin >> num;
							lowest = num;
							highest = num;
							if(num % 2 == 0)
							{
							ctr++;
							}
							else
							{
								cout << "Invalid. Should be an even number." << endl;
							}
						}
						while(num % 2 != 0);
						do
						{
							do
							{
								cout << "Enter an even number[" << ctr << "]: ";
								cin >> num;
								if(num % 2 == 0)
								{
								ctr++;
								}
								else
								{
									cout << "Invalid. Should be an even number." << endl;
								}	
							}
							while(num % 2 != 0);
							if(num < lowest && num > highest)
							{
								lowest = num;
								highest = num;
							}
							else if(num > highest)
							{
								highest = num;
							}
							else if(num < lowest)
							{
								lowest = num;
							}
							else
							]
							}
						}
						while(ctr != 6);
						cout << "\nLowest: " << lowest;
						cout << "\nHighest: " << highest;
						getch();
					break;
					case 3:
						system("cls");
						for(num = 0;num % 2 == 0;num)
						{
							cout << "Input an odd integer: ";
							cin >> num;
							if(num % 2 == 1)
							{
								if(num % 3 == 0)
								{
									cout << endl << num << " is divisible by 3" << endl;
									getch();
								}
								else
								{
									cout << endl << num << " is not divisible by 3" << endl;
									getch();
								}
							}
							else
							{
								cout << "Not an odd integer." << endl;
							}
						}
					break;
					case 4:
						system("cls");
						cout << "Enter course title: ";
						cin >> course;
						do
						{
							cout << "Enter number of enrollees: ";
							cin >> numEnrollee;
							if(numEnrollee < 0)
							{
								cout << "Invalid number of enrollees. Please try again." << endl;
							}
						}
						while(numEnrollee < 0);
						if(numEnrollee >= 0 && numEnrollee <= 3)
						{
							cout << endl << course << " is Dissolved." << endl;
						}
						else if(numEnrollee >= 4 && numEnrollee <= 9)
						{
							cout << endl << course << " is Open." << endl;
						}
						else if(numEnrollee == 10)
						{
							cout << endl << course << " is Closed." << endl;
						}
						else
						{
							cout << endl << course << " is Invalid." << endl;
						}
						getch();
					break;
					case 5:
					break;
					default:
						cout << "\nInvalid choice.";
						getch();	
				}
			}
			while(code != 5);
			break;
			case 2:
				do
				{
					system("cls");
					cout << "Set B problems" << endl;
					cout << "[1]Problem 1" << endl;
					cout << "[2]Problem 2" << endl;
					cout << "[3]Problem 3" << endl;
					cout << "[4]Problem 4" << endl;
					cout << "[5]Back" << endl;
					cout << "\nInput choice: ";
					cin >> code;
					switch(code)
					{
						case 1:
							sum = 0;
							system("cls");
							cout << "Input first integer: ";
							cin >> num1;
							cout << "Input second integer: ";
							cin >> num2;
							if(num1 == num2)
							{
								sum = num1;
							}
							else if(num1 > num2)
							{
								do
								{
									sum += num1;
									num1--;
								}
								while(num1 >= num2);
							}
							else
							{
								do
								{
									sum += num1;
									num1++;
								}
								while(num1 <= num2);
							}
							cout << "\nTotal sum: " << sum;
							getch();
						break;
						case 2:
							fCtr = 0;
							ctr = 1;
							system("cls");
							do
							{
								cout << "Input a positive integer: ";
								cin >> num;
								if(num > 0)
								{
									do
									{
										if(num % ctr == 0)
										{
											fCtr++;
										}
										else
										{
										}
										ctr++;
									}
									while(ctr <= num);
								}
								else
								{
									cout << "\nInvalid input. Should be a positive integer." << endl;
								}
							}
							while(num <= 0);
							if(fCtr <= 2)
							{
								cout << endl << num << " is a Prime number.";
							}
							else
							{
								cout << endl << num << " is a Composite number.";
							}
							getch();
						break;
						case 3:
							empName = "";
							years = 0;
							salary = 0;
							sepPay = 0;
							system("cls");
							cout << "Enter employee's name: ";
							cin.ignore();
							getline(cin, empName);
							cout << "Enter employee's basic salary: ";
							cin >> salary;
							cout << "Enter length of service in years: ";
							cin >> years;
							if(years < 5)
							{
								sepPay = 1.5 * salary * years;
							}
							else if(years < 5)
							{
								sepPay = 2.0 * salary * years;
							}
							else if(years < 5)
							{
								sepPay = 2.5 * salary * years;
							}
							else
							{
								sepPay = 3.0 * salary * years;
							}
							cout << "\n\nEmployee's name: " << empName << endl;
							cout << "Length of service: " << years << endl;
							cout << "Separation Pay: " << sepPay;
							getch();
						break;
						case 4:
							hrs = 0;
							min = 0;
							sec = 0;
							system("cls");
							cout << "Enter number of seconds: ";
							cin >> sec;
							hrs = sec / 3600;
							sec %= 3600;
							min = sec / 60;
							sec %= 60;
							cout << "Equivalent to (hrs:min:sec): " << hrs << ":" << min << ":" << sec;
							getch();
						break;
						case 5:g
						break;
						default:
						cout << "\nInvalid choice.";
						getch();
					}	
				}
				while(code != 5);
			break;
			case 3:
				cout << "\nGoodluck on your exam.";
			break;
			default:
				cout << "\nInvalid choice.";
				getch();
		}
	}
	while(code != 3);
}
