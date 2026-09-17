import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void exportReport(String report) {

        try {

            FileWriter writer =
                    new FileWriter(
                        "exam_seating_report.txt"
                    );

            writer.write(report);

            writer.close();

            System.out.println(
                "Report exported successfully."
            );

        } catch (IOException e) {

            System.out.println(
                "Error while exporting report."
            );
        }
    }
}