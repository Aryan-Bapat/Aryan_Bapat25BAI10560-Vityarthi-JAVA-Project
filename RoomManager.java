import java.util.ArrayList;

public class RoomManager {

    private ArrayList<ExamRoom> rooms;

    public RoomManager() {
        rooms = new ArrayList<>();
    }

    public boolean addRoom(ExamRoom room) {

        for (ExamRoom r : rooms) {

            if (r.getRoomNumber()
                    .equalsIgnoreCase(room.getRoomNumber())) {

                System.out.println(
                    "Room with this number already exists."
                );

                return false;
            }
        }

        rooms.add(room);

        System.out.println(
            "Room added successfully."
        );

        return true;
    }

    public ArrayList<ExamRoom> getRooms() {
        return rooms;
    }

    public void displayRooms() {

        System.out.println("\n===== EXAM ROOMS =====");

        if (rooms.isEmpty()) {
            System.out.println("No rooms available.");
            return;
        }

        for (ExamRoom room : rooms) {
            room.displayRoom();
        }
    }
}