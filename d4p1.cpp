#include <iostream>
#include <cstring>
using namespace std;
class student{
public:
    int roll_no;
    char branch[30], subject[25];
    void setdetail(){
        cout << "Enter the rollno of student:";
        cin >> roll_no;
        cin.ignore();
        cout << "Enter the branch of student:";
        cin.getline(branch, 30);
        cout << "Enter the subject :";
        cin.getline(subject, 25);
    }
};
class InternalMarks : virtual public student{
public:
    int attendance, performance, labcopy;
    void set_internalmarks(){
        cout << "Enter the attendence marks of student :";
        cin >> attendance;
        cout << "Enter the performance marks of student :";
        cin >> performance;
        cout << "Enter the lab-copy marks of student :";
        cin >> labcopy;
    }
};
class ExternalMarks : virtual public student{
public:
    int labexam, viva;
    void set_externalmark(){
        cout << "Enter the Lab exam marks of student :";
        cin >> labexam;
        cout << "Enter the viva marks of student :";
        cin >> viva;
    }
};
class result : public InternalMarks, public ExternalMarks{
public:
    int total_marks;
    void get_total(){
        total_marks=attendance+performance+labcopy+labexam+viva;
    }
    void display(){
        cout<<"Student -:\nRoll no :"<<roll_no<<"\nBranch :"
        <<branch <<"\nSubject :"<<subject<<endl;
        cout<<"Total marks obtained by student :"<<total_marks<<endl;
    }
};
int main(){
    result s1;
    s1.setdetail();
    s1.set_internalmarks();
    s1.set_externalmark();
    s1.get_total();
    s1.display();
    return 0;
}








// #include <iostream>
// #include<string.h>
// using namespace std;

// class student
// {
// public:
//     int roll_no;
//     char branch[30], subject[25];
//     void setdetail()
//     {
//         cout << "Enter the rollno of student:";
//         cin >> roll_no;
//         cin.ignore();
//         cout << "Enter the branch of student:";
//         cin.getline(branch, 30);
//         cout << "Enter the subject :";
//         cin.getline(subject, 25);
//     }
// };
// class InternalMarks : public virtual student
// {
// public:
//     int attendance, performance, labcopy;
//     void set_internalmarks()
//     {
//         cout << "Enter the attendence marks of student :";
//         cin >> attendance;
//         cout << "Enter the performance marks of student :";
//         cin >> performance;
//         cout << "Enter the lab-copy marks of student :";
//         cin >> labcopy;
//     }
// };
// class ExternalMarks : public virtual student
// {
// public:
//     int labexam, viva;
//     void set_externalmark()
//     {
//         cout << "Enter the Lab exam marks of student :";
//         cin >> labexam;
//         cout << "Enter the viva marks of student :";
//         cin >> viva;
//     }
// };
// class result : public InternalMarks, ExternalMarks
// {
// public:
//     int total_marks;
//     void get_total()
//     {
//         total_marks = attendance + performance + labcopy + labexam + viva;
//     }
//     void display()
//     {
//         cout << "Student -:\nRoll no :" << roll_no << "\nBranch :" << branch << "\nSubject :" << subject << endl;
//         cout << "Total marks obtained by suudent :" << total_marks;
//     }
// };
// int main()
// {
//     result s1;
//     s1.setdetail();
//     s1.set_internalmarks();
//     s1.set_externalmark();
//     s1.get_total();
//     s1.display();
//     return 0;
// }


