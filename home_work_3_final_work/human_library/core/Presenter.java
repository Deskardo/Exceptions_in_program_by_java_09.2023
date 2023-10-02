package home_work_3_final_work.human_library.core;

import home_work_3_final_work.human_library.exceptions.IncorrectPhoneNumber;
import home_work_3_final_work.human_library.exceptions.NullInput;
import home_work_3_final_work.human_library.exceptions.OutOfBoundsDatetime;
import home_work_3_final_work.human_library.exceptions.WrongDataFormat;
import home_work_3_final_work.human_library.exceptions.WrongSimbolInput;

/**
 * класс подготовки и ввода данных для последующего сохранения
 */
public class Presenter {
    private ParametersSetting ps = new ParametersSetting();

    public Presenter() {
    }

    /**
     * Конструктор записи в файл, запускает циклические проверки корректности ввода данных
     * в результате всех проверок создается экземпляр класса Contact
     * 
     * @return возвращает готовый к сохранению экземпляр класса Contact.
     */
    public Contact createContact() {
        boolean flag = true;
        String lastName = "";
        String firstName = "";
        String patronymic = "";
        String dateOfBirth = "";
        String phone = "";
        while (flag) {
            try {
                System.out.println("Фамилия вводится латинскими буквами");
                lastName = ps.createName("Введите Фамилию контакта: ");
                flag = false;
            } catch (NullInput e) {
                System.out.println(e.getMessage());
            } catch (WrongSimbolInput e) {
                System.out.println(e.getMessage());
            }
        }
        while (!flag) {
            try {
                System.out.println("Имя вводится латинскими буквами");
                firstName = ps.createName("Введите Имя контакта: ");
                flag = true;
            } catch (NullInput e) {
                System.out.println(e.getMessage());
            } catch (WrongSimbolInput e) {
                System.out.println(e.getMessage());
            }
        }
        while (flag) {
            try {
                System.out.println("Отчество вводится латинскими буквами");
                patronymic = ps.createName("Введите Отчество контакта: ");
                flag = false;
            } catch (NullInput e) {
                System.out.println(e.getMessage());
            } catch (WrongSimbolInput e) {
                System.out.println(e.getMessage());
            }
        }
        while (!flag) {
            try {
                System.out.println("Дата вводится в формате дд.мм.гггг");
                dateOfBirth = ps.createDate("Введите дату рождения контакта: ");
                flag = true;

            } catch (NullInput e) {
                System.out.println(e.getMessage());
            } catch (WrongDataFormat e) {
                System.out.println(e.getMessage());
            } catch (OutOfBoundsDatetime e) {
                System.out.println(e.getMessage());
            } 
        }
        while (flag) {
            try {
                System.out.println("телефон вводится цифрами, без дополнительных символов в формате 89998887766");
                phone = ps.createPhoneNumber("Введите телефон контакта: ");
                flag = false;
            } catch (NullInput e) {
                System.out.println(e.getMessage());
            } catch (IncorrectPhoneNumber e) {
                System.out.println(e.getMessage());
            }
        }
        Contact contact = new Contact(firstName, lastName, patronymic, dateOfBirth, phone);
        return contact;
    }
}
