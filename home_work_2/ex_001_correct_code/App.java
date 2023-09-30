package home_work_2.ex_001_correct_code;

public class App {
    public static void main(String[] args) {
        try {
            int d = 0; // divide by zero 
            int[] intArray = {}; // без объявления массива, код даже не скомпилируется
            double catchedRes1 = intArray[8] / d; // здесь out of bounds
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (RuntimeException e) { // заменил на RuntimeException, чтоб можно было обработать оба исключения
            System.out.println("Catching exception: " + e.getMessage()); // добавил getMessage, чтоб вывести информацию о ошибке
        }

    }
}
