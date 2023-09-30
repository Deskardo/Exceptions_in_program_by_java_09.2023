package seminar_2.ex_003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String path = "D:\\Курсы\\GeekBrains аналитика\\7_0_Java_errors&exceptions\\seminar_2\\ex_003\\n" + //
                "ames.txt";
        List<String[]> names = readFile(path);
        checkMass(names);
        writeFile(names, path);
    }

    public static boolean isNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isNumberTwo(String string) {
        String str = "0123456789";
        for (char item : string.toCharArray()) {
            if (!str.contains(String.valueOf(item))) {
                return false;
            }
        }
        return true;
    }

    public static void checkMass(List<String[]> arr) {
        for (String[] item : arr) {
            if (item[1].equals("?")) {
                item[1] = String.valueOf(item[0].length());
                continue;
            } else if (!isNumber(item[1])) {
                System.out.println("не число");
            }

        }
    }

    public static List<String[]> readFile(String path) {
        List<String[]> temp = new ArrayList<>();
        try {
            String tempString = "";
            BufferedReader file = new BufferedReader(new FileReader(path));
            while ((tempString = file.readLine()) != null) {
                temp.add(tempString.split("="));
            }
            file.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return temp;
    }

    public static void writeFile(List<String[]> arr, String path){
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(path));
            for (String[] strings : arr) {
                write.write(strings[0] + "=" + strings[1] + "\n");
            }
            write.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
