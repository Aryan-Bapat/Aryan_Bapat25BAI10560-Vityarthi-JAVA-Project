import java.util.ArrayList;

public class ReportGenerator {

    public String generateReport(
            ArrayList<Student> students,
            ArrayList<ExamRoom> rooms,
            SeatingArrangement arrangement) {

        int assigned = 0;

        for (Seat seat : arrangement.getSeats()) {

            if (seat.isOccupied()) {
                assigned++;
            }
        }

        int totalSeats =
                arrangement.getSeats().size();

        int unallocated =
                students.size() - assigned;

        String report = "";

        report += "===== EXAM SEATING REPORT =====\n";
        report += "Total Students: " +
                students.size() + "\n";

        report += "Total Rooms: " +
                rooms.size() + "\n";

        report += "Total Seats Available: " +
                totalSeats + "\n";

        report += "Students Allocated: " +
                assigned + "\n";

        report += "Students Unallocated: " +
                unallocated + "\n";

        return report;
    }
}