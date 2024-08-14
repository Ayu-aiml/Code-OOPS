import java.util.Scanner;

class Box2 {
    private int width;
    private int height;
    private int length;

    public Box2() {
        width = 0;
        height = 0;
        length = 0;
    }

    public Box2(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public boolean equals(Box2 otherBox) {
        return this.width == otherBox.width
                && this.height == otherBox.height &&
                this.length == otherBox.length;
    }
}

public class D5p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Box 1:");
        System.out.print("Enter the length, width, and height for box 1: ");
        int length1 = sc.nextInt();
        int width1 = sc.nextInt();
        int height1 = sc.nextInt();
        Box2 box1 = new Box2(width1, length1, height1);

        System.out.println("\nBox 2:");
        System.out.print("Enter the length, width, and height for box 2: ");
        int length2 = sc.nextInt();
        int width2 = sc.nextInt();
        int height2 = sc.nextInt();
        Box2 box2 = new Box2(width2, length2, height2);

        if (box1.equals(box2)) {
            System.out.println("Box 1 is identical to Box 2.");
        } else {
            System.out.println("Box 1 is not identical to Box 2.");
        }
        sc.close();
    }
}
