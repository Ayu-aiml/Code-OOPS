import java.util.Scanner;

interface College {
    String getCollegeName();
    String getCollegeCode();
    void display();
}

class Department {
    String deptName;
    String deptHead;

    public Department(String deptName, String deptHead) {
        this.deptName = deptName;
        this.deptHead = deptHead;
    }

    public void displayDept() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
}

class Student1 extends Department implements College {
    String studentName;
    String regNo;
    double avgMarks;

public Student1(String studentName,String regNo,double avgMarks,String deptName,String deptHead) {
        super(deptName, deptHead);
        this.studentName = studentName;
        this.regNo = regNo;
        this.avgMarks = avgMarks;
    }

    public String getCollegeName() {
        return "Heritage Insitute of Technology";
    }

    public String getCollegeCode() {
        return "HIT001";
    }

    public void display() {
        System.out.println("College Name: " + getCollegeName());
        System.out.println("College Code: " + getCollegeCode());
    }

    public void displayStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Average Marks: " + avgMarks);
    }
}

public class D7p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student details : ");
        System.out.print("Enter the reg. no : ");
        String r1 = sc.next();
        System.out.print("Enter the name : ");
        String s1 = sc.next();
        System.out.print("Enter the department name: ");
        String dn = sc.next();
        System.out.print("Enter the department head: ");
        String dh = sc.next();
        System.out.print("Enter the average marks: ");
        double m1 = sc.nextDouble();
        Student1 student = new Student1(s1, r1, m1, dn, dh);
        System.out.println("---------------------------------------");
        student.display();
        student.displayDept();
        student.displayStudent();
        sc.close();
    }
}
