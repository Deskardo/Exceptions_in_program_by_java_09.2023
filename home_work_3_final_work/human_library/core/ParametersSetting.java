package home_work_3_final_work.human_library.core;

import home_work_3_final_work.human_library.exceptions.IncorrectPhoneNumber;
import home_work_3_final_work.human_library.exceptions.NullInput;
import home_work_3_final_work.human_library.exceptions.OutOfBoundsDatetime;
import home_work_3_final_work.human_library.exceptions.WrongDataFormat;
import home_work_3_final_work.human_library.exceptions.WrongSimbolInput;

/**
 * класс собирающий параметры для класса Contact
 * методы включают проброс Exception и проверку на корректность ввода
 */
public class ParametersSetting {
    private View view = new View();

    /**
     * Метод проверяет является ли введенная строка строкой на английском без лишних
     * символов
     * 
     * @param string Принимает на вход строку
     * @return возвращает булево значение
     */
    public static boolean isText(String string) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char item : string.toLowerCase().toCharArray()) {
            if (!alphabet.contains(String.valueOf(item))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод проверяет является ли введенная строка числом
     * 
     * @param string Принимает на вход строку
     * @return возвращает булево значение
     */
    public static boolean isNumber(String string) {
        String str = "0123456789";
        for (char item : string.toCharArray()) {
            if (!str.contains(String.valueOf(item))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод проверяет является ли введенная строка номером телефона
     * 
     * @param string Принимает на вход строку
     * @return возвращает булево значение
     */
    public static boolean isPhoneNumber(String string) {
        String regex = "^89\\d{9}$";
        return string.matches(regex);
    }

    /**
     * Метод проверяет является ли введенная строка корректной датой
     * 
     * @param string Принимает на вход строку
     * @return возвращает булево значение
     */
    public static boolean isDate(String string) {
        if (string == null || !string.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            return false;
        }
        String[] parts = string.split("\\.");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (month == 2) {
            if (isLeapYear(year) && day > 29 || !isLeapYear(year) && day > 28) {
                return false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                return false;
            }
        }
        return true;
    }

    /**
     * проверяет указанный год на високосность
     * 
     * @param string Принимает на вход число (год)
     * @return возвращает булево значение
     */
    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

    /**
     * Метод создания строки для ФИО
     * в теле метода вводится строка через сканер вызываемый классом view
     * выполняется проверка на NULL и на корректность ввода
     * 
     * @param string Принимает подсказку для ввода
     * @return возвращает введенную строку
     */
    public String createName(String string) {
        String text = view.getString(string);
        if (text == null || text.length() == 0 || " ".equals(text)) {
            throw new NullInput();
        } else if (!isText(text)) {
            throw new WrongSimbolInput();
        } else {
            return text;
        }
    }

    /**
     * Метод создания даты рождения
     * в теле метода вводится строка через сканер вызываемый классом view
     * выполняется проверка на null, на корректность ввода, а также, что возраст
     * подходит для контакта
     * 
     * @param string Принимает подсказку для ввода
     * @return возвращает введенную строку
     */
    public String createDate(String string) {
        String text = view.getString(string);
        if (text == null || text.length() == 0 || " ".equals(text)) {
            throw new NullInput();
        } else if (!isDate(text)) {
            throw new WrongDataFormat();
        } else if (Integer.parseInt(text.substring(text.length() - 4)) < 1930
                || Integer.parseInt(text.substring(text.length() - 4)) > 2017) {
            throw new OutOfBoundsDatetime();
        } else {
            return text;
        }
    }

    /**
     * Метод создания номера телефона
     * в теле метода вводится строка через сканер вызываемый классом view
     * выполняется проверка на null и на корректность ввода
     * 
     * @param string Принимает подсказку для ввода
     * @return возвращает введенную строку
     */
    public String createPhoneNumber(String string) {
        String text = view.getString(string);
        if (text == null || text.length() == 0 || " ".equals(text)) {
            throw new NullInput();
        } else if (!isPhoneNumber(text)) {
            throw new IncorrectPhoneNumber();
        } else {
            return text;
        }
    }

}
