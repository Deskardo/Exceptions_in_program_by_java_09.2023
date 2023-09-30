package home_work_1.ex_01;

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = new int[1];
        System.out.println(arr[2]);

    }

    public static void divisionByZero() {
        int a = 1 / 0;
        System.out.println(a);
    }

    public static void numberFormatException() {
        String text = " ";
        int sum = Integer.parseInt(text);
        System.out.println(sum);

    }
}

public class Printer {
    public static void main(String[] args) {
        // Answer ans = new Answer();
        try {
            Answer.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            Answer.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            Answer.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}