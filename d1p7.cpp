#include<iostream>
using namespace std;

class Employee{
    private: int salary;
    public:
        Employee(){
            cout<<"Enter the salary : ";
            cin>>salary;
            cout<<"Salary : "<<salary<<endl;
        }
        friend class Boss;
};

class Boss{
    public:
    void update(Employee e1){
        cout<<"Enter the new salary of employee by boss : ";
        cin>>e1.salary;
        cout<<"Updated Salary : "<<e1.salary<<endl;
    }
};

int main(){
    Boss b;Employee e;
    b.update(e);
    return 0;
}