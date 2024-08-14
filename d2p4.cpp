#include<iostream>
#include<string.h>
using namespace std;
class complex{
    public:float real,imag;
    void setdata(){
        cout<<"Enter real and imaginary part : ";
        cin>>real>>imag;
    }
    void display(){
        cout<<"complex number is : "<<real<<" + i"<<imag<<endl;
    }
    complex operator+(complex &a){
        complex r;
        r.real=real+a.real;
        r.imag=imag+a.imag;
        return r;
    }
    complex operator-(complex &a){
        complex r;
        r.real=real-a.real;
        r.imag=imag-a.imag;
        return r;
    }
    complex operator*(complex &a){
        complex r;
        r.real=real*a.real;
        r.imag=imag*a.imag;
        return r;
    }
    complex operator/(complex &a){
        complex r;
        r.real=real/a.real;
        r.imag=imag/a.imag;
        return r;
    }
};
int main(){
    complex c1,c2,c3;
    c1.setdata();
    c1.display();
    c2.setdata();
    c2.display();
    c3=c1+c2;
    cout<<"Addition : "<<endl;
    c3.display();
    c3=c1-c2;
    cout<<"Subtraction : "<<endl;
    c3.display();
    c3=c1*c2;
    cout<<"Multiplication : "<<endl;
    c3.display();
    c3=c1/c2;
    cout<<"Division : "<<endl;
    c3.display();
    return 0;
}