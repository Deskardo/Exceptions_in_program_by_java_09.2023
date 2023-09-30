package seminar_2.ex_001;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = scanner.nextInt();
        if (index >= 10 || index < 0) {
            System.out.println("Указан индекс за пределами массива");
        } else {
            arr[index] = 1;
        }
        scanner.close();
    }
}