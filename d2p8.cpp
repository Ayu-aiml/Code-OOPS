#include<iostream>
using namespace std;
class student{
    public:int id ,marks;
    char name[50];
    void id_details(){
        cout<<"Enter the id and Name of student : ";
        cin>>id>>name;
        cout<<"enter the marks of student : ";
        cin>>marks;
    }
    void display(){
        cout<<"Student details \nid: "<<id<<"\nname: "<<name<<"\nmarks: "<<marks<<endl;
    }
    void grade(){
        if(marks>90)
            cout<<"Grade is O"<<endl;
        else if(marks>80)
            cout<<"Grade is E"<<endl;
        else if(marks>70)
            cout<<"Grade is A"<<endl;
        else if(marks>60)
            cout<<"Grade is B"<<endl;
        else if(marks>50)
            cout<<"Grade is C"<<endl;
        else if(marks>40)
            cout<<"Grade is D"<<endl;
        else
             cout<<"Grade is F"<<endl;
    }
    friend class teacher;
};
class teacher{
    public:void update(student &s){
        cout<<"Enter the updated id and Name of student : ";
        cin>>s.id>>s.name;
        cout<<"enter the marks of student : ";
        cin>>s.marks;
        s.grade();
    }
};
int main(){
    student s;
    teacher t;
    s.id_details();
    s.display();
    s.grade();
    t.update(s);
    s.display();
    return 0;
}