import java.util.Scanner;

class Matrix1 {
    int row, col;
    int[][] arr;
    Scanner sc = new Scanner(System.in);

    public void setdata() {
        System.out.print("Enter the row and column: ");
        row = sc.nextInt();
        col = sc.nextInt();
        arr = new int[row][col];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt(); 
            }
        }
    }

    public void product(Matrix1 m2) {
        System.out.println("Resultant Matrix is:");
        int[][] result = new int[row][m2.col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < m2.col; j++) {
                int sum1 = 0; 
                for (int k = 0; k < m2.row; k++) {
                    sum1 += arr[i][k] * m2.arr[k][j];
                }
                result[i][j] = sum1;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < m2.col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); 
        }
    }

    public void display() {
        System.out.println("Matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

public class D5p1 {
    public static void main(String[] args) {
        Matrix1 m1 = new Matrix1();
        Matrix1 m2 = new Matrix1();
        m1.setdata();
        m1.display();
        m2.setdata();
        m2.display();
        m1.product(m2);
    }
}
