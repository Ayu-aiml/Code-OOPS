import java.util.Scanner;
abstract class ThreeDObject {
    abstract double surfaceArea();
    abstract double volume();
}
class Box1 extends ThreeDObject {
    private double length;
    private double width;
    private double height;
    public Box1(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
    double volume() {
        return length * width * height;
    }
}
class Cube extends Box1 {
    public Cube(double side) {
        super(side, side, side);
    }
}
class Cylinder extends ThreeDObject {
    private double radius;
    private double height;

    public Cylinder() {
        radius = height = 0;
    }
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    double volume() {
        return Math.PI * radius * radius * height;
    }
}
class Cone extends ThreeDObject {
    private double radius;
    private double height;
    public Cone() {
        radius = height = 0;
    }
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    double surfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }
    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}
public class D7p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of cube : ");
        int side = sc.nextInt();
        Cube cube = new Cube(side);
        System.out.print("Enter the radius and height of cylinder : ");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.print("Enter the radius and height of cone : ");
        double radius1 = sc.nextDouble();
        double height1 = sc.nextDouble();
        Cone cone = new Cone(radius1, height1);
        System.out.println("Cube:");
        System.out.println("Surface Area: " + cube.surfaceArea());
        System.out.println("Volume: " + cube.volume());
        System.out.println("\nCylinder:");
        System.out.println("Surface Area: " + cylinder.surfaceArea());
        System.out.println("Volume: " + cylinder.volume());
        System.out.println("\nCone:");
        System.out.println("Surface Area: " + cone.surfaceArea());
        System.out.println("Volume: " + cone.volume());
        sc.close();
    }
}
