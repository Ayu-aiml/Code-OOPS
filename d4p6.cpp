#include<iostream>
#include "namspace_time.cpp"
using namespace std;
int main() {
    using namespace TestNamespace;
    time2 t1,t2,t3;
    cout<<"Enter the starting time --> "<<endl;
    t1.setdata();
    t1.display();
    cout<<"Enter the Ending time --> "<<endl;
    t2.setdata();
    t2.display();
    if(t1.h<t2.h){
        cout<<"Resultant time :"<<endl;
        t3=calculateDuration(t1,t2);
        t3.display();
    }
    else{
        cout<<"Error!! Wrong starting and ending time"<<endl;
    }
    return 0;
}
