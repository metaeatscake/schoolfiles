#include <iostream>

using namespace std;

main(){
	string inuser, inpass;
	string username[3] = {"user", "admin", "guest"};
	string password[3] = {"user", "admin", "guest"};
	int menu;
	bool loginresult = false;
	
	do{
		system("cls");
		
		cout << "\n[1]Login";
		cout << "\n[2]Exit";
		cout << "\n\nEnter choice: ";
		cin >> menu;
		
		if(menu == 1){
			system("cls");
			cout << "--Login--";
			cout << "\n\nEnter username: ";
			cin >> inuser;
			cout << "\n\nEnter password: ";
			cin >> inpass;
			
			for (int i = 0; i < 3 && loginresult != false; i++){
				if(inpass == username[i] && inpass == password[i]){
					cout << "Login Success!" << "\n\n";
					loginresult = true;
				}
			}
			
			if (loginresult == false){
				cout << "Invalid username/password";
			}
			
			system("pause");
			
		}
	} while (menu != 2);
	
}
