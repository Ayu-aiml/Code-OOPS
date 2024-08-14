import java.util.Scanner;

class Shape {
    public int calculateArea(int side) {
        return side * side;
    }

    public int calculatePerimeter(int side) {
        return 4 * side;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}

public class d6p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s1 = new Shape();
        System.out.print("Enter the side of square : ");
        int side = sc.nextInt();
        System.out.println("Square Area: " + s1.calculateArea(side));
        System.out.println("Square Perimeter: " + s1.calculatePerimeter(side));

        System.out.print("Enter the length and width of rectangle : ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println("Rectangle Area: " + s1.calculateArea(length, width));
        System.out.println("Rectangle Perimeter: " + s1.calculatePerimeter(length, width));

        System.out.print("Enter the radius of rectangle : ");
        double radius = sc.nextDouble();
        System.out.println("Circle Area: " + s1.calculateArea(radius));
        System.out.println("Circle Circumference: " + s1.calculatePerimeter(radius));

        sc.close();
    }
}
