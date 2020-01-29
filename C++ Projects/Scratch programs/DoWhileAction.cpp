#include <iostream>

using namespace std;

main(){
	
	double choice;
	string username, password;
	
	do{
		system("cls");
		cout << "\nMain Menu";	
		cout << "\n[1] Login";
		cout << "\n[2] Exit";
		
		cout << "\n\nEnter choice: ";
		cin >> choice;
		
		if(choice == 1){
			system("cls");
			cout << "\nLOGIN MENU";
			
			cout << "\nEnter username: ";
			cin.ignore();
			getline(cin, username);
		
			cout << "\nEnter password: ";	
			cin.ignore(0);
			getline(cin, password);
			
			if (username == "user" && password == "password"){
				cout << "Login Success" << "\n\n";
				system("pause");
				
				do{
					system("cls");
					cout << "\nDo you want to logout? Press 1." << "\n\n";
					cin >> choice;
					
					if(choice == 1){
						system("cls");
					}
					else{
						cout << "\n\nInvalid A." << "\n\n";
						system("pause");
					}
			
				} while (choice != 1);
				
			}
			
		}
		
	} while(choice != 2);
	
	cout << "\n\nYay you're done with the program";
}
