package seminar_3.ex_003;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class DivisonByZero extends ArithmeticException {

    public DivisonByZero() {
        super("Деление на ноль запрещено"); // создание собственного класса исключений
    }
}

class IndexOfBound extends ArrayIndexOutOfBoundsException {

    public IndexOfBound() {
        super("Выход за пределы массива"); // собственный класс исключений.
    }

    public IndexOfBound(int arg) {
        super("Выход за пределы массива, при обращении к аргументу с индексом: " + arg);
    }
}

class FileNotFound extends FileNotFoundException {
    public FileNotFound() {
        super("Указанный файл не существует.");
    }

    public FileNotFound(String path) {
        super("Указанный файл не найден." + path);
    }
}

public class App {

    public static int div(int a, int b) {
        if (b == 0) {
            throw new DivisonByZero(); // пробрасываение собственного класса исключений
        }
        return a / b;
    }

    public static void indexCheck(int arrLen, int index) {
        if (index >= arrLen)
            throw new IndexOfBound(index);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // int a = 1;
        // int b = 0;
        // try {
        // int c = div(a, b);
        // } catch (ArithmeticException e) {
        // System.out.println(e.getMessage()); // теперь при печати сообщения будет
        // сообщение написанное в собственном классе.
        // }

        // int[] arr = { 1, 2, 3, 4 };

        // try {
        // for (int i = 0; i < 5; i++) {
        // indexCheck(arr.length, i);
        // System.out.println(arr[i]);
        // }

        // } catch (IndexOfBound e) {
        // System.out.println(e.getMessage());
        // }

        try (FileReader file = new FileReader("1234.txt")) {
        } catch (FileNotFoundException e) {
            throw new FileNotFound("1234.txt");
        }
    }
}

// Задание №3

// 1. Создайте класс исключения, который будет выбрасываться при делении на 0.
// Исключение должно отображать понятное для пользователя сообщение
// об ошибке.

// 2. Создайте класс исключений, котороебудет возникатьпри обращении к
// пустому элементув массиве ссылочного типа. Исключение должно
// отображать понятное для пользователя сообщение об ошибке

// 3. Создайте класс исключения, которое будет возникать при попытке открыть
// несуществующий файл. Исключение должно отображать понятное для
// пользователя сообщение об ошибке.