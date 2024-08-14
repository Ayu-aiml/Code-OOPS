import java.util.Scanner;

class Member {
    public String Name;
    public int Age;
    public long PhoneNumber;
    public String Address;
    public int Salary;
    public Member() {
        Age = Salary = 0;
        PhoneNumber = 0;
        Name = Address = " ";
    }
    public Member(String Name, int Age, long PhoneNumber, String Address, int Salary) {
        this.Name = Name;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.Salary = Salary;
    }
    public static Member initializeMember(String Name, int Age, long PhoneNumber, String Address, int Salary) {
        Member member = new Member();
        member.Name = Name;
        member.Age = Age;
        member.PhoneNumber = PhoneNumber;
        member.Address = Address;
        member.Salary = Salary;
        return member;
    }
    public void printSalary() {
        System.out.println("Salary : Rs. " + Salary);
    }
}

class Employee extends Member {
    String specialization;
    public Employee() {
        super();
        specialization = " ";
    }
    public Employee(String Name, int Age, long PhoneNumber, String Address, int Salary, String specialization) {
        super(Name, Age, PhoneNumber, Address, Salary);
        this.specialization = specialization;
    }
    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Address: " + Address);
        printSalary();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    String department;
    public Manager() {
        super();
        department = " ";
    }
    public Manager(String Name, int Age, long PhoneNumber, String Address, int Salary, String department) {
        super(Name, Age, PhoneNumber, Address, Salary);
        this.department = department;
    }
    public void display() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Address: " + Address);
        printSalary();
        System.out.println("Department: " + department);
    }
}

public class d6p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee details : ");
        System.out.print("Enter the name of employee : ");
        String emp_name = sc.nextLine();
        System.out.print("Enter the age of employee : ");
        int emp_age = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the phone number of employee : ");
        long emp_ph_no = sc.nextLong();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the Address of employee : ");
        String emp_add = sc.nextLine();
        System.out.print("Enter the salary of employee : ");
        int emp_salary = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the Specialization of employee : ");
        String emp_sepl = sc.nextLine();
        Employee employee = new Employee(emp_name, emp_age, emp_ph_no, emp_add, emp_salary, emp_sepl);
        employee.display();

        System.out.println("Enter the Manager details : ");
        System.out.print("Enter the name of manager : ");
        String mng_name = sc.nextLine();
        System.out.print("Enter the age of manager : ");
        int mng_age = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the phone number of manager : ");
        long mng_ph_no = sc.nextLong();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the Address of manager : ");
        String mng_add = sc.nextLine();
        System.out.print("Enter the salary of manager : ");
        int mng_salary = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the department of manager : ");
        String mng_dept = sc.nextLine();
        Manager manager = new Manager(mng_name, mng_age, mng_ph_no, mng_add, mng_salary, mng_dept);
        manager.display();

       Member emp1 = Member.initializeMember(emp_name, emp_age, emp_ph_no, emp_add, emp_salary);
       emp1.printSalary();
        sc.close();
    }
}
