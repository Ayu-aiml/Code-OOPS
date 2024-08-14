#include<iostream>
#include<string.h>
using namespace std;
class time2{
    public:int h,m,s;
    void setdata(){
        cout<<"Enter the hour,min,sec : ";
        cin>>h>>m>>s;
    }
    time2 operator+(time2 &a){
        time2 b;
        b.h=h+a.h;
        b.m=m+a.m;
        b.s=s+a.s;
        if(b.s>=60){
            b.m+=b.s/60;
            b.s%=60;
        }
        if(b.m>=60){
            b.h+=b.m/60;
            b.m%=60;
        }
        return b;
    }
    void display(){
        cout<<"Time = "<<h<<":"<<m<<":"<<s<<endl;
    }
};
int main(){
    time2 t1,t2,t3;
    t1.setdata();
    t1.display();
    t2.setdata();
    t2.display();
    t3=t1+t2;
    t3.display();
    return 0;
}