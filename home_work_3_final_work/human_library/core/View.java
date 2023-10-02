package home_work_3_final_work.human_library.core;

import java.util.Scanner;

/**
 * Класс для ввода инфорамции в листы с контактами
 *
 */
public class View {
    Scanner in = new Scanner(System.in);

    /**
     * метод для ввода строки, принимает строку для отображения нужного параметра
     * 
     * @param title строка с требованием ввода
     * @return возвращет сканер для ввода строки
     */
    public String getString(String title) {
        System.out.printf("%s", title);
        return in.nextLine();
    }

    /**
     * метод для ввода числа, принимает строку для отображения нужного параметра
     * 
     * @param title строка с требованием ввода
     * @return возвращет сканер для ввода целого числа
     */
    public Integer getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }
}
