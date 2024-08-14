class Array1 {
    private int size;
    private int int_value;
    private int incre;

    public Array1(int size, int int_value, int incre) {
        this.size = size;
        this.int_value = int_value;
        this.incre = incre;
    }

    public int[] initialize() {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = int_value + (i * incre);
        }
        return arr;
    }
}

public class D5p2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error: Please provide exactly 3 arguments.");
            return;
        }
        int size = Integer.parseInt(args[0]);
        int int_value = Integer.parseInt(args[1]);
        int incre = Integer.parseInt(args[2]);
        Array1 intl_arr = new Array1(size, int_value, incre);
        int[] arr = intl_arr.initialize();
        System.out.println("Array is:");
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
// class Array1 {
//     private int size;
//     private int int_value;
//     private int incre;

//     public Array1(int size, int int_value, int incre) {
//         this.size = size;
//         this.int_value = int_value;
//         this.incre = incre;
//     }

//     public int[] initialize() {
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = int_value + (i * incre);
//         }
//         return arr;
//     }
// }

// public class d5p2 {
//     public static void main(String[] args) {
//         if (args.length != 3) {
//             System.out.println("Error: Please provide exactly 3 arguments.");
//             return;
//         }
//         int size = Integer.parseInt(args[0]);
//         int int_value = Integer.parseInt(args[1]);
//         int incre = Integer.parseInt(args[2]);
//         Array1 intl_arr = new Array1(size, int_value, incre);
//         int[] arr = intl_arr.initialize();
//         System.out.println("Array is:");
//         for (int e : arr) {
//             System.out.print(e + " ");
//         }
//         System.out.println();
//     }
// }

// class Array1{
// private int size;
// private int int_value;
// private int incre;
// public Array1(int size,int int_value,int incre){
// this.size=size;
// this.int_value=int_value;
// this.incre=incre;
// }
// public int[] initialize(){
// int []arr=new int[size];
// for(int i=0;i<size;i++){
// arr[i]=int_value+(i*incre);
// }
// return arr;
// }
// }
// public class d5p2 {
// public static void main(String[] args) {
// if(args.length != 3){
// System.out.println("Error: Please provide exactly 3 argument");
// return;
// }
// int size=Integer.parseInt(args[0]);
// int int_value=Integer.parseInt(args[1]);
// int incre=Integer.parseInt(args[2]);
// Array1 intl_arr = new Array1(size, int_value, incre);
// int []arr =intl_arr.initialize();
// System.out.println("Array is :");
// for(int e:arr){
// System.out.print(e+" ");
// }
// System.out.println();
// }
// }
