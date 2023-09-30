package seminar_2.ex_002;

public class App {

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try{
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
                } catch (Exception e){
                    System.out.println(arr[i][j] + " Не является числом.");
                }
            }
        }
        return sum;
    }
}
