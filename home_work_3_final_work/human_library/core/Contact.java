package home_work_3_final_work.human_library.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/**
 * Класс, позволяющий создавать объекты с типом Contact и последующей записью их
 * в файл
 */
public class Contact {
    public String firstName;
    public String lastName;
    public String patronymic;
    public String dateOfBirth;
    public String phone;

    /**
     * Базовый конструктор класса Contact
     * 
     * @param firstName   Имя контакта (имя латинскими буквами)
     * @param lastName    Фамилия контакта (фамилия латинскими буквами)
     * @param patronymic  Отчество контакта (отчество латинскими буквами)
     * @param dateOfBirth Дата рождения (дата в формате дд.мм.гггг)
     * @param phone       Номер телефона (в формате 89998887766)
     */
    public Contact(String firstName, String lastName, String patronymic, String dateOfBirth, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    /**
     * Метод для записи контакта в файл
     * метод создает файл, в качестве названия указывает фамилию контакта
     * если файл с такой фамилией существует, то проверяет, не является ли
     * указанный контакт дубликатом, если является, то пропускает запись
     * если не является, то дописывает новый контакт в новую строку.
     * @param path путь сохранения файлов с контактами
     */
    public void writeContact(String path) {
        String filePath = path + getLastName();
        File file = new File(filePath);

        try {
            // Проверка на дубликаты
            if (file.exists()) {
                List<String> lines = Files.readAllLines(file.toPath());
                String newContact = lastName + " " + firstName + " " + patronymic + " " + dateOfBirth + " " + phone;
                if (lines.contains(newContact)) {
                    System.out.println("Дубликат контакта, запись не произведена.");
                    return;
                }
            }

            // Запись контакта
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write(lastName + " ");
                bw.write(firstName + " ");
                bw.write(patronymic + " ");
                bw.write(dateOfBirth + " ");
                bw.write(phone);
                bw.newLine(); // Добавляем новую строку для следующей записи
            }

        } catch (IOException e) {
            System.out.println("Указан неверный путь к сохранению файла, укажите нужный в переменной path в классе App.");
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
