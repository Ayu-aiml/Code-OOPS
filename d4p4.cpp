#include <iostream>
#include <string.h>
using namespace std;
class Sq_root_Exception {
public:
    char *msg;
    Sq_root_Exception(const char *m) {
        msg = new char[strlen(m) + 1];
        strcpy(msg, m);
    }
    ~Sq_root_Exception() {
        delete[] msg;
    }
    void display() {
        cout << msg << endl;
    }
};
template <class T>
class Square {
public:
    T n;
    Square() {
        cout << "Enter the number : ";
        cin >> n;
    }
    T sq_root() {
        try {
            if (n < 0 || typeid(n) == typeid(float) || typeid(n) == typeid(char)) {
                throw Sq_root_Exception("Invalid input for square root calculation.");
            }
        } catch (Sq_root_Exception &e) {  
            e.display();
            return 0;
        }
        if (n < 2)
            return n;
        T x = n;
        T y = (x + (n / x)) / 2;
        while (abs(x - y) >= 0.00001) {
            x = y;
            y = (x + (n / x)) / 2;
        }
        return y;  
    }
};
int main() {
    Square<double> obj;
    double result = obj.sq_root();
    if (result != 0) {
        cout << "Square root of given number is : " << result << endl;
    }
    return 0;
}






// #include <iostream>
// #include<string.h>
// using namespace std;

// class Sq_root_Exception{
// public:char *msg;
//     Sq_root_Exception(char * m){
//         strcpy(msg,m);
//     }
//     void display(){
//         cout << msg << endl;
//     }
// };

// template <class T>
// class Square
// {
// public:
//     T n;

//     Square()
//     {
//         cout << "Enter the number : ";
//         cin >> n;
//     }

//     T sq_root()
//     {
//         try
//         {
//             if (n < 0 || typeid(n)==typeid(float) || typeid(n)==typeid(char))
//             {
//                 throw Sq_root_Exception("Invalid input for square root calculation.");
//             }
//         }
//         catch (Sq_root_Exception e)
//         {
//             e.display();
//             return 0;  
//         }

//         if (n < 2)
//             return n;

//         T x = n;
//         T y = (x + (n / x)) / 2;

//         while (abs(x - y) >= 0.00001)
//         {
//             x = y;
//             y = (x + (n / x)) / 2;
//         }

//         return y;  // Return the calculated square root
//     }
// };

// int main()
// {
//     Square<double> obj;  
//     if (obj.sq_root() != 0)
//     {
//         cout << "Square root of given number is : " << obj.sq_root() << endl;
//     }
//     return 0;
// }




// #include <iostream>
// using namespace std;
// template <class T>
// class Square
// {
// public:
//     T n;
//     Square()
//     {
//         cout << "Enter the number : ";
//         cin >> n;
//     }
//     T sq_root()
//     {
//         try
//         {
//             if (n < 0)
//             {
//                 throw "You have entered the negative number";
//             }
//         }
//         catch (char *msg)
//         {
//             cout << msg << endl;
//             return 0;
//         }
//         if (n < 2)
//             return n;
//         T x = n;
//         T y = (x + (n / x)) / 2;
//         while (abs(x - y) >= 0.00001)
//         {
//             x = y;
//             y = (x + (n / x)) / 2;
//         }
//         return n;
//     }
// };
// int main()
// {
//     Square<int> obj;
//     cout << "Square root of given number is : " << obj.sq_root<int>() << endl;
//     return 0;
// }