#include<iostream>
using namespace std;
class Myclass{
    public:char *ptr;
    static int count;
    Myclass(){
        ptr=NULL;
        count++;
    }
    Myclass(char *msg){
        ptr=msg;
        count++;
    }
    ~Myclass(){
        cout<<"Destructor is called !!"<<endl;
    }
    void display(){
        cout<<"Pointer --> "<<ptr<<endl;
    }
};
int Myclass::count=0;
Myclass global("Global object created");
int main(){
    static Myclass local("Local object created");
    global.display();
    local.display();
    Myclass nameless("ABCDEFGHIJ");
    cout<<"Number of variable are : "<<global.count<<endl;
    return 0;
}