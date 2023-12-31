package home_work_3_final_work.human_library.ui;

import home_work_3_final_work.human_library.core.ParametersSetting;
import home_work_3_final_work.human_library.core.Presenter;
import home_work_3_final_work.human_library.core.View;

public class App {

    public App() {
    }

    /**
     * Метод сохранения собранного контакта в файл по указанному пути.
     */
    public void start() {
        ParametersSetting ps = new ParametersSetting();
        Presenter p = new Presenter();
        View view = new View();
        String path = "D:\\Курсы\\GeekBrains аналитика\\7_0_Java_errors&exceptions\\home_work_3_final_work\\human_library\\contacts\\";

        int choice = 0;
        while (choice != 2) {
            System.out.println("Выберите действие: \n1. Создать новый контакт \n2. Выход");
                String str = view.getString("Пожалуйста введите желаемое значение 1/2: ");
                if(ps.isNumber(str)){
                    choice = Integer.parseInt(str);
                }      
            switch (choice) {
                case 1:
                    p.createContact().writeContact(path);
                    break;
                case 2:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверный выбор, значение должно быть числом 1, или 2.");
            }
        }

    }
}
