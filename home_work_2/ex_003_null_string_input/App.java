package home_work_2.ex_003_null_string_input;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        getString();
    }

        public static String getString() {
        String line = "";
        Scanner scan = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Please input not null string");
                line = scan.nextLine();
                if (!line.equals(null) && line.length() > 0 && !" ".equals(line)) {
                    System.out.println("Your input string: " + line);
                    return line;
                } else {
                    System.out.println("Your input is not correct");
                }
            }
        } finally {
            scan.close();
        }
    }
}
