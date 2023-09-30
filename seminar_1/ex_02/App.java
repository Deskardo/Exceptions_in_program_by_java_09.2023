package seminar_1.ex_02;

import java.util.Scanner;

public class App {

    public static int checkArrayCorrect(Integer[] array, int value, int minimalSize) {
        if (array == null) {
            return -3;
        } else if (array.length < minimalSize) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
            return -2;
        }
    }

    public static void Printer(int metod) {
        if (metod == -3) {
            System.out.println("Указанный массив является пустым, укажите корректный массив");
        } else if (metod == -2) {
            System.out.println("Указанный Вами элемент не найден в заданном массиве");
        } else if (metod == -1) {
            System.out.println("Длина массива меньше минимального значения");
        } else {
            System.out.println("Указанный элемент находится на позиции с индексом " + metod);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int size = 6;

        System.out.println("Введите число для поиска");
        int value = scan.nextInt();

        Printer(checkArrayCorrect(array, value, size));
        scan.close();
    }
}
