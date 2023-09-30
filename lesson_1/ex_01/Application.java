package ex_01;

// import java.io.File;

public class Application {
    public static void main(String[] args) {
        System.out.println(divide(10,0));
    }

    // public static void a() {
    // b();
    // }

    // public static void b() {
    // c();
    // }

    // public static void c() {
    // int[] ints = new int[10];
    // System.out.println(ints[9]);
    // }

    public static int divide(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Нельзя делить на ноль");
        }
        return a1 / a2;
    }

    // public static long getFileSize(File file){
    // if(!file.exists()){
    // return -1;
    // }
    // return file.length();
    // }
}