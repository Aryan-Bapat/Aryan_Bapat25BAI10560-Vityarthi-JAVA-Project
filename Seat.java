public class Seat {
    private String seatNumber;
    private String roomNumber;
    private Student student;

    public Seat(String seatNumber, String roomNumber) {
        this.seatNumber = seatNumber;
        this.roomNumber = roomNumber;
        this.student = null;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public Student getStudent() {
        return student;
    }

    public boolean isOccupied() {
        return student != null;
    }

    public void assignStudent(Student student) {
        this.student = student;
    }

    public void displaySeat() {
        if (student == null) {
            System.out.println(roomNumber + " - " +
                    seatNumber + " -> Empty");
        } else {
            System.out.println(roomNumber + " - " +
                    seatNumber + " -> " +
                    student.getCourse() + " - Student Assigned");
        }
    }
}
