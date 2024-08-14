// --------------- THIS CHATGPT MODIFIED VERSION OF (WRONG ONE) ---------------->

#include<iostream>
#include<vector>
using namespace std;
class Vector {
public:vector<int> *arr;
    int n, a;
    Vector() {
        arr = nullptr;
    }
    void setdetail() {
        cout << "Enter the size of array: ";
        cin >> n;
        arr = new vector<int>[n];
        for (int i = 0; i < n; i++) {
            cout << "Enter the element " << i + 1 << " of array: ";
            cin >> a;
            arr[i].push_back(a);
        }
    }
    void display() {
        if (arr) {
            vector<int>::iterator it;
            cout << "Elements of arr are: \n";
            for (int i = 0; i < n; i++) {
                for (it = arr[i].begin(); it != arr[i].end(); it++) {
                    cout << *it << " ";
                }
            }
            cout << "\n";
        }
    }
    Vector& operator=(const Vector &a) {
        if (this == &a) {
            return *this;
        }
        if (arr) {
            delete[] arr;
        }
        n = a.n;
        arr = new vector<int>[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a.arr[i].size(); j++) {
                arr[i].push_back(a.arr[i][j]);
            }
        }
        return *this;
    }
    ~Vector() {
        if (arr) {
            delete[] arr;
        }
    }
};
int main() {
    Vector v1, v2;
    v1.setdetail();
    v1.display();
    v2 = v1;
    v2.display();
    return 0;
}


//  ------------ THIS IS WRONG ONE -------------->


// #include<iostream>
// #include<vector>
// using namespace std;
// class Vector{
//     public: vector<int> *arr;
//     int n,a;
//     void setdetail(){
//         cout<<"Enter the size of array : ";
//         cin>>n;
//         arr=new vector<int>[n];
//         for(int i=0;i<n;i++){
//             cout<<"Enter the element "<<i+1<<" of array : ";
//             cin>>a;
//             arr->push_back(a);
//         }
//     }
//     void display(){
//         vector<int>::iterator it;
//         cout<<"Element of arr are : \n";
//         for(it = arr->begin();it !=arr->end();it++){
//             cout<<*it<<" ";
//         }
//         cout<<"\n";
//     }
//     Vector operator=(Vector &a){
//         Vector r;
//         r.n=a.n;
//         r.arr=new vector<int>[r.n];
//         vector<int>::iterator it;
//         int b;
//         for(it = a.arr->begin();it != a.arr->end();it++){
//             b=*it;
//             r.arr->push_back(b);
//         }
//         return r;
//     }
// };
// int main(){
//     Vector v1,v2;
//     v1.setdetail();
//     v1.display();
//     v2=v1;
//     v2.display();
//     return 0;
// }
