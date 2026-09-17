import java.util.ArrayList;
import java.util.HashSet;

public class ConflictDetector {

    public void checkConflicts(
            SeatingArrangement arrangement,
            ArrayList<Student> students) {

        System.out.println("\n===== CONFLICT CHECK =====");

        boolean conflict = false;

        HashSet<String> studentIDs =
                new HashSet<>();

        HashSet<String> seatIDs =
                new HashSet<>();

        int assignedStudents = 0;

        for (Seat seat : arrangement.getSeats()) {

            if (seat.isOccupied()) {

                Student student =
                        seat.getStudent();

                assignedStudents++;

                // Check duplicate student
                if (studentIDs.contains(student.getId())) {

                    System.out.println(
                        "Conflict: Student " +
                        student.getId() +
                        " is assigned more than once."
                    );

                    conflict = true;

                } else {

                    studentIDs.add(student.getId());
                }

                // Check duplicate seat
                String seatID =
                        seat.getRoomNumber() +
                        "-" +
                        seat.getSeatNumber();

                if (seatIDs.contains(seatID)) {

                    System.out.println(
                        "Conflict: Seat " +
                        seatID +
                        " is assigned more than once."
                    );

                    conflict = true;

                } else {

                    seatIDs.add(seatID);
                }
            }
        }

        // Check unallocated students
        if (assignedStudents < students.size()) {

            System.out.println(
                "Conflict: " +
                (students.size() - assignedStudents) +
                " student(s) are unallocated."
            );

            conflict = true;
        }

        if (!conflict) {

            System.out.println(
                "No seating conflicts found."
            );
        }
    }
}
