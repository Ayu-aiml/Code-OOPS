import java.util.Scanner;

class Student {
    protected int Roll_number;
    protected String Student_Name;
    static String College_Name = "HITK";

    public Student(){
        Roll_number=0;
        Student_Name=" ";
    }

    public Student(int Roll_number, String Student_Name) {
        this.Roll_number = Roll_number;
        this.Student_Name = Student_Name;
    }

    public void showdata() {
        System.out.println("Student Roll Number: " + Roll_number);
        System.out.println("Student Name: " + Student_Name);
        System.out.println("College Name: " + College_Name);
    }
}

class Exam extends Student {
    private int marks1, marks2, marks3;

 public Exam(int Roll_number, String Student_Name, int marks1, int marks2, int marks3) {
        super(Roll_number, Student_Name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void showresult() {
        showdata();
        double average = (marks1 + marks2 + marks3) / 3.0;
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Average Marks: " + average);
    }
}

public class d6p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the student details : ");
        System.out.print("Enter the roll no : ");
        int r1=sc.nextInt();
        System.out.print("Enter the name : ");
        String s1=sc.next();
        System.out.print("Enter the marks of subject 1: ");
        int m1=sc.nextInt();
        System.out.print("Enter the marks of subject 2: ");
        int m2=sc.nextInt();
        System.out.print("Enter the marks of subject 3: ");
        int m3=sc.nextInt();
        Exam student1 = new Exam(r1,s1,m1,m2,m3);      
        System.out.println("Student 1 Details:");
        student1.showresult();
        sc.close();
    }
}

