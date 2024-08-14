import java.util.Scanner;

import p1.D7p3;


public class Marks extends D7p3 { //D7p3 ---->"Student"
    private int subject1;
    private int subject2;
    private int subject3;

    public Marks(String name,int roll,int subject1, int subject2, int subject3) {
        super(name,roll);
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public void displayMarks() {
        System.out.println("Marks in Subject 1: " + subject1);
        System.out.println("Marks in Subject 2: " + subject2);
        System.out.println("Marks in Subject 3: " + subject3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();       
        System.out.print("Enter Roll Number: ");
        int roll_no = scanner.nextInt();

        System.out.print("Enter Marks in Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter Marks in Subject 3: ");
        int subject3 = scanner.nextInt();
        Marks student = new Marks(name, roll_no,subject1, subject2, subject3);
        System.out.println("\nStudent Details:");
        student.display();
        student.displayMarks();
        scanner.close();
    }
}
