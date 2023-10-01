package seminar_3.ex_004;

class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Указанный массив не является квадратным массивом 4Х4");
    }
}

class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException() {
        super("Значение не является числом");
    }

    public MyArrayDataException(String[][] str, int i, int j) {
        super("Значение: " + str[i][j] + " расположенное в: " + i + "," + j + " не является числом");
    }
}

public class App {

    public static boolean isNumber(String[][] str, int i, int j) {
        try {
            Integer.parseInt(str[i][j]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Integer massSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        Integer sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 || arr[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (isNumber(arr, i, j)) {
                    sum += Integer.parseInt(arr[i][j]);
                } else {
                    throw new MyArrayDataException(arr, i, j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] str = { { "1", "2", "3", "4" }, { "1", "2", "3", "4" }, { "1", "2", "3", "4" },
                { "1", "2", "3", "4" } };
        try {
            System.out.println(massSum(str));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

}
// Задание №4
// 1. Напишите метод, на вход которого подаётся двумерный строковый массив
// размером 4х4. При подаче массива другого размера необходимо бросить
// исключение MyArraySizeException.
// 2. Далее метод должен пройтись по всем элементам массива, преобразовать в
// int и просуммировать. Если в каком-то элементе массива преобразование
// не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в
// какой именно ячейке лежат неверные данные.
// 3. В методе main() вызвать полученный метод, обработать возможные
// исключения MyArraySizeException и MyArrayDataException и вывести
// результат расчета (сумму элементов,при условии что подали на вход
// корректный массив).