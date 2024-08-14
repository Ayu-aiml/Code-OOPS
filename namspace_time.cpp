#include <iostream>
using namespace std;
namespace TestNamespace
{
    class time2{
    public:
        int h, m, s;
        void setdata(){
            cout << "Enter the hour,min,sec : ";
            cin >> h >> m >> s;
        }
        void display(){
            cout << "Time = " << h << ":" << m << ":" << s << endl;
        }
        friend time2 calculateDuration(time2 &a, time2 &b);
    };
    time2 calculateDuration(time2 &a, time2 &b){
        time2 c;
        c.h = b.h - a.h;
        c.m = b.m - a.m;
        c.s = b.s - a.s;
        if (c.s < 0){
            c.s += 60;
            c.m--;
        }
        if (c.m < 0){
            c.m += 60;
            c.h--;
         }
        if (c.h < 0){
            c.h += 24;
        }
        return c;
    } 
}


// #include <iostream>
// using namespace std;
// namespace TestNamespace
// {
//     class time2
//     {
//     public:
//         int h, m, s;
//         void setdata()
//         {
//             cout << "Enter the hour,min,sec : ";
//             cin >> h >> m >> s;
//         }
//         void display()
//         {
//             cout << "Time = " << h << ":" << m << ":" << s << endl;
//         }
//         friend time2 calculateDuration(time2 &a, time2 &b);
//     };
//     time2 calculateDuration(time2 &a, time2 &b)
//     {
//         time2 c;
//         c.h = b.h - a.h;
//         c.m = b.m - a.m;
//         c.s = b.s - a.s;
        
//         if (c.s <= 0)
//         {
//             c.s = 60-c.s;
//             c.m = c.m-1;
//             c.m+=c.s/60;
//             c.s%=60;
//         }
//         if (c.m <= 0)
//         {
//             c.m = 60-c.m;
//             c.h = c.h-1;
//             c.h+=c.m/60;
//             c.m%=60;
//         }
//         return c;
//     }
    
// }
