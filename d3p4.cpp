#include<iostream>
#include<string.h>
using namespace std;
class string1{
    public:char str[20];
    void setdetail(){
        cout<<"Enter the string : ";
        cin.getline(str,20);
    }
    void display(){
        cout<<"String is : "<<str<<endl;
    }
    string1 operator+(string1 &a){
        string1 r;
        int count=0;
        for(int i=0;i<strlen(str);i++){
            r.str[i]=str[i];
            count++;
        }
        for(int i=0;i<strlen(a.str);i++){
            r.str[count]=a.str[i];
            count++;
        }
        r.str[count]='\0';
        return r;
    }
    void operator==(string1 &a){
        int i=0,j=0,count=0;
        while(i<strlen(str) && j<strlen(a.str)){
            if(str[i]==a.str[j])
                count++;
            i++;
            j++;
        }
        if(count==strlen(str))
            cout<<"Both are equal"<<endl;
        else
            cout<<"Both are equal"<<endl;
    }
};
int main(){
    string1 str1,str2,str3,str4;
    str1.setdetail();
    str1.display();
    str2.setdetail();
    str2.display();
    str3=str1+str2;
    str3.display();
    str4.setdetail();
    str4.display();
    str3==str4;
    return 0;
}