package home_work_3_final_work.human_library.exceptions;

public class WrongSimbolInput extends RuntimeException{
    public WrongSimbolInput() {
        super("Введены некорректные символы.");
    }
}
