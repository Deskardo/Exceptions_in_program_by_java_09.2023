package seminar_3.ex_001;

public class App {

    public static void doSomthing() throws Exception {

    }

    public static void main(String[] args) {
        try {
            doSomthing();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

// Задание №1
// Создайте метод doSomething(), который может быть источником одного из
// типов checked exceptions (тело самогометода прописывать не обязательно).
// Вызовите этот метод из main и обработайте в нем исключение, которое
// вызвалметод doSomething().
