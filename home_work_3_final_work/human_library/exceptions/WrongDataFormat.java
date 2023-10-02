package home_work_3_final_work.human_library.exceptions;

public class WrongDataFormat extends RuntimeException{
    public WrongDataFormat() {
        super("Введенная строка не является датой.");
    }
}
