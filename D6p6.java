import java.util.Scanner;

class Shape1 {
    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }
}

class Square1 extends Shape1 {
    private double side;

    public Square1() {
        side = 0;
    }

    public Square1(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Rectangle1 extends Shape1 {
    private double length;
    private double width;

    public Rectangle1() {
        length = 0;
        width = 0;
    }

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle1 extends Shape1 {
    private double radius;

    public Circle1() {
        radius = 0;
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class D6p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        double side = sc.nextDouble();
        Shape1[] shapes = new Shape1[3];
        shapes[0] = new Square1(side);

        System.out.print("Enter the length and width of rectangle : ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        shapes[1] = new Rectangle1(length, width);

        System.out.print("Enter the radius of circle : ");
        double radius = sc.nextDouble();
        shapes[2] = new Circle1(radius);
        for (Shape1 shape : shapes) {
            System.out.println("Area of shape " +1+" : " + shape.calculateArea());
            System.out.println("Perimeter of shape " +1+" : " + shape.calculatePerimeter());
            System.out.println();
        }
        sc.close();
    }
}
