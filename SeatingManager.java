import java.util.ArrayList;

public class SeatingManager {

    public SeatingArrangement generateArrangement(
            ArrayList<Student> students,
            ArrayList<ExamRoom> rooms) {

        SeatingArrangement arrangement =
                new SeatingArrangement();

        int studentIndex = 0;

        for (ExamRoom room : rooms) {

            for (int i = 1;
                 i <= room.getCapacity();
                 i++) {

                Seat seat = new Seat(
                    "Seat-" + i,
                    room.getRoomNumber()
                );

                if (studentIndex < students.size()) {

                    seat.assignStudent(
                        students.get(studentIndex)
                    );

                    studentIndex++;
                }

                arrangement.addSeat(seat);
            }
        }

        return arrangement;
    }
}