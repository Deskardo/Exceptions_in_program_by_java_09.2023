package lesson_3.ex_001;

import java.io.IOException;
import java.io.PrintWriter;

class ReportExporter {
    public void saveReportToFile(String path, String data) {
        String modifiedOutputData = data; // Представим, что здесь форматируются входные данные
        try (PrintWriter writer = new PrintWriter(path)) {
            writer.println(modifiedOutputData);
        } catch (IOException e) {
            // Просто погасили исключение
        }
    }
}

public class App {

    private ReportExporter reportExporter = new ReportExporter();

    public void onSaveReportButtonClick() {
        String path = generateOutputReportPath();
        String outputData = "Очень важные данные для отчета";
        reportExporter.saveReportToFile(path,
                outputData);
    }

    public String generateOutputReportPath() {
        return "D:/reports/repository/1/" + (int) (Math.random() * 10000000) + ".txt";

    }

    public static void main(String[] args) {

    }
}
