package seminar_1.ex_03;

public class App {
    public static int arraySum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                throw new RuntimeException("Массив не квадратный " + array.length + "X" + array[i].length);
            } else {
                for (int j = 0; j < array[0].length; j++) {
                    if (array[i][j] > 1 || array[i][j] < 0) {
                        throw new RuntimeException("Массив дожен состоять из нулей и единиц. Элемент " + array[i][j]
                                + " на позиции " + i + "X" + j + " не соответствует условию");
                    }
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 1, 0, 1 }, { 1, 0, 0, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };

        System.out.println(arraySum(array));

    }
}
