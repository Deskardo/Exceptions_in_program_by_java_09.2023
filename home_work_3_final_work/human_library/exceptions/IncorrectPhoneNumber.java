package home_work_3_final_work.human_library.exceptions;

public class IncorrectPhoneNumber extends RuntimeException{
    public IncorrectPhoneNumber() {
        super("Введен некорректный номер телефона.");
    }
}
