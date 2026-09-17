public class ExamRoom {

    private String roomNumber;
    private int capacity;

    public ExamRoom(String roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void displayRoom() {
        System.out.println(
            "Room: " + roomNumber +
            " | Capacity: " + capacity
        );
    }
}