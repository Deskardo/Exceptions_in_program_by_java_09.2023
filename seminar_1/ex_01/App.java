package seminar_1.ex_01;

public class App {

    public static int arrayLength(Integer[] array, int size) {
        if (array.length < size) {
            return array.length;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
       Integer[] array = {1, 2, 3, 4, 5};
        int size = 6;

        System.out.println(arrayLength(array, size));

    }
}
