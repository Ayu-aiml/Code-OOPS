#include <iostream>
using namespace std;
class shape{
public:
    virtual void surface_area() = 0;
    virtual void volume() = 0;
};
class rectangle : public shape{
public:
    int l, b, h;
    rectangle(){
        cout<<"Rectangle : "<<endl;
        cout << "Enter the length , breath and height: ";
        cin >> l >> b >> h;
    }
    void surface_area(){
        cout << "Surface Area of rectangle : " <<2*(l*b+b*h+h*l)<<endl;
    }
    void volume(){
        cout << "Volume of rectangle : " << l * b * h<<endl;
    }
};
class square : public shape{
public:
    int a;
    square(){
        cout<<"Square : "<<endl;
        cout << "Enter the side : ";
        cin >> a;
    }
    void surface_area(){
        cout << "Surface Area of square : " << 6 * a * a<<endl;
    }
    void volume(){
        cout << "Volume of square : " << a * a * a<<endl;
    }
};
class cylinder : public shape{
public:
    int r,h;
    cylinder(){
        cout<<"Cylinder : "<<endl;
        cout << "Enter the radius and height :";
        cin>>r>>h;
    }
    void surface_area(){
        cout<<"Surface Area of cylinder : "<<2*3.14*r*(r + h)<<endl;
    }
    void volume(){
        cout << "Volume of cylinder : " << 3.14 * r * r * h<<endl;
    }
};
int main(){
    shape *obj;
    rectangle r1;
    obj = &r1;
    obj->surface_area();
    obj->volume();
    square s1;
    obj = &s1;
    obj->surface_area();
    obj->volume();
    cylinder c1;
    obj = &c1;
    obj->surface_area();
    obj->volume();
    return 0;
}