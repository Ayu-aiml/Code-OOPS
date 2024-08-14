import java.util.Scanner;

class Time1 {
    private int hr;
    private int min;
    private int sec;
    Scanner sc = new Scanner(System.in);

    public Time1() {
        System.out.println("Enter the Hour,minutes and Second : ");
        hr = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
    }

    public void add(Time1 t2) {
        Time1 t3 = new Time1();
        t3.hr = hr + t2.hr;
        t3.min = min + t2.min;
        t3.sec = sec + t2.sec;
        if (t3.sec >= 60) {
            t3.min += t3.sec / 60;
            t3.sec %= 60;
        }
        if (t3.min >= 60) {
            t3.hr += t3.min / 60;
            t3.min %= 60;
        }
        System.out.println("Resultant Time : " + t3.hr + ":" + t3.min + ":" + t3.sec);
    }

    public void display() {
        System.out.println("Time : " + hr + ":" + min + ":" + sec);
    }
}

public class d5p5 {
    public static void main(String[] args) {
        Time1 t1 = new Time1();
        t1.display();
        Time1 t2 = new Time1();
        t2.display();
        t1.add(t2);
    }
}

// import java.util.Scanner;

// class Time1 {
// private int hr;
// private int min;
// private int sec;

// public Time1() {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter hours: ");
// hr = sc.nextInt();
// System.out.print("Enter minutes: ");
// min = sc.nextInt();
// System.out.print("Enter seconds: ");
// sec = sc.nextInt();
// }

// public void add(Time1 t2) {
// Time1 t3 = new Time1(); // Create a new Time1 object to store the result
// t3.hr = hr + t2.hr;
// t3.min = min + t2.min;
// t3.sec = sec + t2.sec;

// if (t3.sec >= 60) {
// t3.min += t3.sec / 60;
// t3.sec %= 60;
// }
// if (t3.min >= 60) {
// t3.hr += t3.min / 60;
// t3.min %= 60;
// }

// System.out.println("Resultant Time : " + t3.hr + ":" + t3.min + ":" +
// t3.sec);
// }

// public void display() {
// System.out.println("Time : " + hr + ":" + min + ":" + sec);
// }
// }

// public class d5p5 {
// public static void main(String[] args) {
// Time1 t1 = new Time1();
// Time1 t2 = new Time1();
// t1.display();
// t2.display();
// t1.add(t2);
// }
// }
