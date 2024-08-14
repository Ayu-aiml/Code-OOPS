#include <iostream>
#include <string.h>
using namespace std;
class father{
public:
    char name[30];
    int age;
    father(){
        cout << "Enter the Father's Name :";
        cin.getline(name, 30);
        cout << "Enter the Father's Age :";
        cin >> age;
        cin.ignore();
    }
    virtual void show(){//(i)without using virtual (ii)using virtual
        cout << "Father's Name :" << name << endl;
        cout << "father's Age :" << age << endl;
    }
};
class Son : public father{
public:
    char name[30];
    int age;
    Son(){
        cout << "Enter the Son's Name :";
        cin.getline(name, 30);
        cout << "Enter the Son's Age :";
        cin >> age;
        cin.ignore();
    }
    void show(){
        cout << "Son's Name :" << name << endl;
        cout << "Son's Age :" << age << endl;
    }
};
int main(){
    Son s1;
    father *fptr = &s1;
    fptr->show();
    return 0;
}