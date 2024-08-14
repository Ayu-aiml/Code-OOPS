import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        double area = length * breadth;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side); 
    }

    public double calculateArea() {
        double area = super.calculateArea(); 
        return area;
    }

    public double calculatePerimeter() {
        double perimeter =  super.calculatePerimeter(); 
        return perimeter;
    }
}

public class d6p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and width of rectangle : ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);

        System.out.print("Enter the side of square : ");
        double side = sc.nextDouble();
        Square square = new Square(side);
        double squareArea = square.calculateArea();
        double squarePerimeter = square.calculatePerimeter();
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Perimeter of Square: " + squarePerimeter);

        sc.close();
    }
}



// import java.util.Scanner;

// class Rectangle {
//     private double length;
//     private double breadth;

//     public Rectangle(double length, double breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public double calculateArea() {
//         double area = length * breadth;
//         System.out.println("Area of Rectangle: " + area);
//     }

//     public double calculatePerimeter() {
//         double perimeter = 2 * (length + breadth);
//         System.out.println("Perimeter of Rectangle: " + perimeter);
//     }
// }

// class Square extends Rectangle {
//     public Square(double side) {
//         super(side, side); 
//     }

//     public void calculateArea() {
//         double area = super.calculateArea(); 
//         System.out.println("Area of Square: " + area);
//     }

//     public void calculatePerimeter() {
//         double perimeter = super.calculatePerimeter(); 
//         System.out.println("Perimeter of Square: " + perimeter);
//     }
// }

// public class d6p5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length and width of rectangle : ");
//         double length = sc.nextDouble();
//         double width = sc.nextDouble();
//         Rectangle rectangle = new Rectangle(length, width);
//         rectangle.calculateArea();
//         rectangle.calculatePerimeter();

//         System.out.print("Enter the side of square : ");
//         double side = sc.nextDouble();
//         Square square = new Square(side);
//         square.calculateArea();
//         square.calculatePerimeter();
//         sc.close();
//     }
// }

