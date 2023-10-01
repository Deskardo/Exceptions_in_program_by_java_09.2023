package lesson_3.ex_000;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Чтение и перезапись файла
public class App {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader(
                "D:\\\\Курсы\\\\GeekBrains аналитика\\\\7_0_Java_errors&exceptions\\\\lesson_3\\\\ex_000\\\\test.txt");
                FileWriter writer = new FileWriter("D:\\Курсы\\GeekBrains аналитика\\7_0_Java_errors&exceptions\\lesson_3\\ex_000\\test2.txt")){
                    while(reader.ready()){
                        writer.write(reader.read());
                    }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("copy successfully");
        }
    }
}