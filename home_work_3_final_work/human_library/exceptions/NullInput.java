package home_work_3_final_work.human_library.exceptions;

public class NullInput extends RuntimeException{
    public NullInput() {
        super("Некорректный ввод, строка не может быть пустой");
    }
}
