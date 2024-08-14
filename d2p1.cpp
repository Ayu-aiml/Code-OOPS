#include<iostream>
using namespace std;

class stringcount{
    private: 
        string str;
        int uppercount;
        int lowercount;
        int vowelcount;
        int consonantscount;
        void count(){
            uppercount=0;
            lowercount=0;
            vowelcount=0;
            consonantscount=0;
            char ch;
            int len=str.size();
            for(int i=0;i<len;i++){
                ch=str[i];
                if(ch>='A' && ch<='Z'){
                    uppercount++;
                }
                else{
                    lowercount++;
                }
            }
            for(int i=0;i<len;i++){
                ch=str[i];
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    vowelcount++;
                }
                else
                {
                    consonantscount++;
                }              
            }
        }
    public:
        stringcount(){
            cout<<"Enter the string : ";
            cin>>str;
            count();
        }
        stringcount(string input){
            str = input;
            count();
        }
        ~stringcount(){
            cout<<"Destructor called for : "<<str<<endl;
        }
        //copy constructor
        stringcount(stringcount &other){
            str = other.str;
            uppercount = other.uppercount;
            lowercount = other.lowercount;
            vowelcount = other.vowelcount;
            consonantscount = other.consonantscount;
        }
        //display status
        void display() const{
            cout<<"String : "<<str<<endl;
            cout<<"Number of Uppercase : "<<uppercount<<endl;
            cout<<"Number of lowercase : "<<lowercount<<endl;
            cout<<"Number of vowels : "<<vowelcount<<endl;
            cout<<"Number of Consonants : "<<consonantscount<<endl;
        }
};
main(){
    stringcount str1;
    str1.display();
    stringcount str2("Good Morning");
    str2.display();
    stringcount str3 = str2;
    str3.display();
}