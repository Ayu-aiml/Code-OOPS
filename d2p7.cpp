#include<iostream>
#include<string.h>
using namespace std;
class time2{
    public:int h,m,s;
    void setdata(){
        cout<<"Enter the hour,min,sec : ";
        cin>>h>>m>>s;
    }
    void display(){
        cout<<"Time = "<<h<<":"<<m<<":"<<s<<endl;
    }
    friend time2 operator+(time2 &a,time2 &b);
};
time2 operator+(time2 &a,time2 &b){
        time2 c;
        c.h=b.h+a.h;
        c.m=b.m+a.m;
        c.s=b.s+a.s;
        if(c.s>=60){
            c.m+=c.s/60;
            c.s%=60;
        }
        if(c.m>=60){
            c.h+=c.m/60;
            c.m%=60;
        }
        return c;
    }
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