#include<iostream>
#include<string.h>
using namespace std;
class Exception{
    public:char *msg;
        Exception(const char *m) {
        msg = new char[strlen(m) + 1];
        strcpy(msg, m);
    }
    ~Exception() {
        delete[] msg;
    }
    void display() {
        cout << msg << endl;
    }
};
class Account{
    private:char name[30],address[50],type[20];
    int balance;
    public:Account(){
        cout<<"Enter the customer's name :";
        cin.getline(name,30);
        cout<<"Enter the address :";
        cin.getline(address,50);
        cout<<"Enter the balance :";
        cin>>balance;
        cin.ignore();
        cout<<"Enter the account's type :";
        cin.getline(type,20);
    }
    void print(){
        cout<<"Customer's ->\nName :"<<name<<"\naddress :"<<address
        <<"\nbalance :"<<balance<<"\naccount type :"<<type<<endl;
    }
    void deposit(){
        int money;
        cout<<"Enter the amount to deposit :";
        cin>>money;
        balance+=money;
        cout<<"Update balance is :"<<balance<<endl;
    }
    void withdraw(){
        int money;
        cout<<"Enter the amount to withdraw :";
        cin>>money;
        try{
            if(balance-money<3000)
                throw Exception("minimum balance of 3000 should be maintain ");
        }catch(Exception &e){
            e.display();
            exit(1);
        }
        balance-=money;
        cout<<"Update balance is :"<<balance<<endl;
    }
    void loan(){
        int money;
        try{
            if(type != "saving")
                throw Exception("Account should be a saving type to take loan");
        }catch(Exception &e){
            e.display();
            exit(1);
        }
        cout<<"Enter the amount for loan :";
        cin>>money;
        cout<<"Amount "<<money<<" is granted for loan."<<endl;
    }
};
int main(){
    Account act1;
    act1.print();
    act1.deposit();
    act1.withdraw();
    act1.loan();
    return 0;
}