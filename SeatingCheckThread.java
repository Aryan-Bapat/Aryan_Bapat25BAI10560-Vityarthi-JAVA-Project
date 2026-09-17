import java.util.ArrayList;

public class SeatingCheckThread extends Thread {

    private SeatingArrangement arrangement;
    private ArrayList<Student> students;

    public SeatingCheckThread(
            SeatingArrangement arrangement,
            ArrayList<Student> students) {

        this.arrangement = arrangement;
        this.students = students;
    }

    @Override
    public void run() {

        ConflictDetector detector =
                new ConflictDetector();

        detector.checkConflicts(
            arrangement,
            students
        );
    }
}