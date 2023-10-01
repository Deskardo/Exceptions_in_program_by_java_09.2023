package seminar_3.ex_002;

class Counter implements AutoCloseable {
    private Integer count = 0;

    Counter() {
        this.count = 0;
    }

    public Integer getCount() {
        if (this.count == null) {
            throw new UnsupportedOperationException("Unimplemented method 'close'");
        }
        return count;
    }

    public void add() {
        if (this.count == null) {
            throw new UnsupportedOperationException("Unimplemented method 'close'");
        }
        this.count++;
    }

    @Override
    public void close() throws Exception {
        if (this.count != null) {
            this.count = null;
        } else {
            throw new UnsupportedOperationException("Unimplemented method 'close'");
        }
    }
}

public class App {
    public static void main(String[] args) {
        try (Counter count = new Counter()) {
            count.add();
            System.out.println(count.getCount());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
// Задание №2
// Создайте класс Счетчик, у которого есть метод add(), увеличивающий
// значение внутренней int переменной на 1.Сделайте так, чтобы с объектом
// такого типа можно было работать в блоке try-with-resources. Нужно бросить
// исключение, если работа с объектом типа счетчик была не в ресурсном try
// и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
// лучше всего.