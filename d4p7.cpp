#include<iostream>
#include<string.h>
using namespace std;
namespace outer{
    int n,*arr;
    void set_data(){
        cout<<"Enter the size :";
        cin>>n;
        arr=new int[n];
        cout<<"Enter the elemnts :";
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
    }
    namespace inner{
        void sort(int *arr2,int n){
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-1;j++){
                    if(arr2[j]>arr2[j+1]){
                        int temp=arr2[j];
                        arr2[j]=arr2[j+1];
                        arr2[j+1]=temp;
                    }
                }
            }
        }
        void display(int *arr,int n){
            cout<<"Array is :"<<endl;
            for(int i=0;i<n;i++)
                cout<<arr[i]<<" ";
            cout<<endl;
        }
        void split(int *arr,int l,int m,int r){
            int n1=m-l+1;
            int n2=r-m;
            int *la,*ra;
            la= new int[n1];
            ra=new int[n2];
            for(int i=0;i<n1;i++)
                la[i]=arr[l+i];
            for(int j=0;j<n2;j++)
                ra[j]=arr[m+1+j];
            sort(la,n1);
            display(la,n1);
            sort(ra,n2);
            display(ra,n2);
        }
    }
}
using namespace outer;
int main(){
    set_data();
    int m=n/2;
    inner::split(arr,0,m-1,n-1);
    return 0;
}