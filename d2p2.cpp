#include<iostream>
#include<string.h>
using namespace std;
class array{
    public:int*arr,n;
    void setdata(){
        cout<<"Enter size";
        cin>>n;
        arr=new int[n];
        for(int i=0;i<n;i++)
            cin>>arr[i];
    }
    void sort(){
        cout<<"Sorted array is :-\n";
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void display(){
        for(int i=0;i<n;i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }
};
int main(){
    array a1;
    a1.setdata();
    a1.display();
    a1.sort();
    a1.display();
    return 0;
}