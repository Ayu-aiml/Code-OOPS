#include<iostream>
using namespace std;
class A{
    public:int value;
    void operator++(){
        ++value;
    }
    A operator++(int){
        A obj;
        obj.value=value++;
        return obj;
    }
    void operator--(){
        --value;
    }
    A operator--(int){
        A obj;
        obj.value=value--;
        return obj;
    }
};
int main(){
    A num1,num2,num3,num4,num5,num6;
    cout<<"Enter number :";
    cin>>num1.value;
    cout<<"Pre increment of number 1 :";
    ++num1;
    cout<<num1.value;
    cout<<"\nEnter number :";
    cin>>num2.value;
    cout<<"Post increment of number 2 :";
    num3=num2++;
    cout<<num3.value;
    cout<<"\nEnter number :";
    cin>>num4.value;
    cout<<"Pre decrement of number 3 :";
    --num4;
    cout<<num4.value;
    cout<<"\nEnter number :";
    cin>>num5.value;
    cout<<"Post decrement of number 4 :";
    num6=num5--;
    cout<<num6.value;
    cout<<endl;
    return 0;
}