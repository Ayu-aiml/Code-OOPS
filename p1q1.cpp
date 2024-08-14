#include<iostream>
using namespace std;

template<class T>
T add(T a,T b){
    T sum = a + b;
    return sum;
}
main(){
    int a=8,b=9;
    float x=5.98,y=3.67;
    double m=8.06,n=4.7;
    cout<<"Sum of "<<a<<" and "<<b<<" is : "<<add<int>(a,b)<<endl;
    cout<<"Sum of "<<x<<" and "<<y<<" is : "<<add<float>(x,y)<<endl;
    cout<<"Sum of "<<m<<" and "<<n<<" is : "<<add<double>(m,n)<<endl;
}