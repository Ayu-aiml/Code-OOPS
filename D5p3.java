import java.util.Scanner;

class Box {
    private int width;
    private int height;
    private int length;

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int volume() {
        int volume = length * height * width;
        return volume;
    }
}

public class D5p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box box = new Box();
        int vol1 = box.volume();
        System.out.println("Volume of box : " + vol1);

        System.out.print("Enter the length , width and height : ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        Box box2 = new Box(width, length, height);
        int vol2 = box2.volume();
        System.out.println("Volume of box : " + vol2);
        sc.close();
    }
}
