package home_work_2.ex_000_float_number;

import java.util.Scanner;

public class App {

    public static boolean isNumber(String string) {
        try {
            Float.parseFloat(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static float getNumber() {
        String line = "";
        float number = 0;
        Scanner scan = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Please input float number");
                line = scan.nextLine();
                if (isNumber(line)) {
                    number = Float.parseFloat(line);
                    System.out.println("Your input number: ");
                    return number;
                } else {
                    System.out.println("You input is not correct");
                }
            }
        } finally {
            scan.close();
        }
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}