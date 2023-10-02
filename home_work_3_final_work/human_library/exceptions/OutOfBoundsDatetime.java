package home_work_3_final_work.human_library.exceptions;

public class OutOfBoundsDatetime extends RuntimeException {
    public OutOfBoundsDatetime() {
        super("Указанная дата не может быть датой рождения контакта, так как находится за пределами допустимого диапазона дат.");
    }
}
