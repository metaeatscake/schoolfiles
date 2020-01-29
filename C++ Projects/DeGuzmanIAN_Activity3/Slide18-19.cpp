#include <iostream>
#include <cmath>

using namespace std;

main(){
	int choice;
	string name, pos;

	cout << "\nMenu thingy";
	cout << "\n[1] Slide 18: Find the highest among Sum/Diff/Prod of two numbers";
	cout << "\n[2] Slide 19: Gross Pay calculator";
	
	cout << "\n\nEnter choice: ";
	cin >> choice;
	
	switch(choice){
		case 1:
			system("cls");
			
			double num1, num2, sum, diff, prod;
			
			cout << "\nEnter num1: ";
			cin >> num1;
			cout << "\nEnter num2: ";
			cin >> num2;
	
			sum = num1 + num2;
			diff = num1 - num2;
			prod = num1 * num2;
	
			cout << "\nThe sum is: " << sum;
			cout << "\nThe difference is: " << diff;
			cout << "\nThe product is: " << prod;
	
			if (sum > diff && sum > prod){
				cout << "\n\nHighest: Sum";
			}
			else if (diff > sum && diff > prod){
				cout << "\n\nHighest: Difference";
			}
			else if (prod > sum && prod > diff){
				cout << "\n\nHighest: Product";
			}
			else {
				cout << "\n\nThere is no highest; Invalid input.";
			}
		break;
		case 2:
			system("cls");
			
			double bpay, gpay, npay, otimehr, otimepay, wtax, taxrate;
			
			cout << "\nEnter your name: ";
			cin.ignore();
			getline(cin, name);
			cout << "\nEnter your basic salary: ";
			cin >> bpay;
			cout << "\nEnter your overtime hours: ";
			cin >> otimehr;
			
			otimepay = (bpay*0.01) * otimehr;
			gpay = bpay + otimepay;
			
			if (bpay >=10000 && bpay <=30000){
				taxrate = 0.1;
				pos = "Rank & File";
				wtax = gpay * taxrate;
				npay = gpay - wtax;
				
				cout << "\nName: " << name;
				cout << "\nPosition: " << pos;
				cout << "\nGross Pay: " << gpay;
				cout << "\nOvertime Pay: " << otimepay;
				cout << "\nWithholding Tax: " << wtax;
				cout << "\nNet Pay: " << npay;
			} 
			else if (bpay >= 30000 && bpay <= 45000){
				taxrate = 0.15;
				pos = "Manager";
				wtax = gpay * taxrate;
				npay = gpay - wtax;
				
				cout << "\nName: " << name;
				cout << "\nPosition: " << pos;
				cout << "\nGross Pay: " << gpay;
				cout << "\nOvertime Pay: " << otimepay;
				cout << "\nWithholding Tax: " << wtax;
				cout << "\nNet Pay: " << npay;
			}
			else if (bpay >= 45000 && bpay <= 65000){
				taxrate = 0.18;
				pos = "Vice President";
				wtax = gpay * taxrate;
				npay = gpay - wtax;
				
				cout << "\nName: " << name;
				cout << "\nPosition: " << pos;
				cout << "\nGross Pay: " << gpay;
				cout << "\nOvertime Pay: " << otimepay;
				cout << "\nWithholding Tax: " << wtax;
				cout << "\nNet Pay: " << npay;
			}
			else if (bpay >= 65000){
				taxrate = 0.2;
				pos = "President";
				wtax = gpay * taxrate;
				npay = gpay - wtax;
				
				cout << "\nName: " << name;
				cout << "\nPosition: " << pos;
				cout << "\nGross Pay: " << gpay;
				cout << "\nOvertime Pay: " << otimepay;
				cout << "\nWithholding Tax: " << wtax;
				cout << "\nNet Pay: " << npay;
			}
			else {
				cout << "The basic pay is too low; invalid input";
			}
		break;
		default:
			cout << "Invalid Input";
	}

}
