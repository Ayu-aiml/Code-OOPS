import java.util.Scanner;

class TriangleException extends Exception {
    public TriangleException(String message) {
        super(message);
    }
}

class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateArea() throws TriangleException {
        if (a + b <= c || b + c <= a || c + a <= b) {
throw new TriangleException("Invalid triangle: The sum of any two sides must be greater than the third.");
        }

        // Calculate the area of the triangle using Heron's formula
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Triangle is valid.");
        System.out.println("Area of the triangle: " + area);
    }
}

public class D7p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the side of triangle : ");
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.calculateArea();
        } catch (TriangleException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
