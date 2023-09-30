package lesson_2;

// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// import java.util.Collections;

// import javax.management.RuntimeErrorException;

// import java.util.Collection;
// import java.util.Collections;
// import java.util.List;

public class App {
    public static void main(String[] args) {
        // String name = null;
        // System.out.println(name.length()); // NullPointerException потому что
        // значение переменной name = null.

        // Object object = new String("123");
        // File file = (File) object;
        // System.out.println(file); // java.lang.ClassCastException объект типа String
        // не может быть преобразован к объекту File.

        // String number = "123fq";
        // int result = Integer.parseInt(number); // java.lang.NumberFormatException при
        // попытке спарсить строку, которая не является числом.
        // System.out.println(result);

        // List<Object> emptyList = Collections.emptyList();
        // emptyList.add(new Object()); // java.lang.UnsupportedOperationException в
        // emptyList нельзя добавлять объекты

        // int number = 1; // обработка ошибок с помощью блока кода try-catch
        // try {
        // number = 10/2;
        // String test = null;
        // System.out.println(test.length());
        // Collections.emptyList().add(new Object());
        // } catch (ArithmeticException e) { // пример работы блока try-catch
        // System.out.println("Opperation divide by zero not supported");
        // } catch (NullPointerException e) {
        // System.out.println("nullpointer exception");
        // } catch (Exception e){
        // System.out.println("over exception");
        // }
        // System.out.println(number);

        FileReader test = null;
        try {
            test = new FileReader("test"); // пример unchecked exception
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally { // данный блок гарантирует выполнение встроенного кода, даже если было
                    // исключение в предыдущем блоке
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
        }
        System.out.println("finally finish");

    }
}