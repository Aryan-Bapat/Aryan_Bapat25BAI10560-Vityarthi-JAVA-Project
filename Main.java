import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager studentManager =
                new StudentManager();

        RoomManager roomManager =
                new RoomManager();

        SeatingManager seatingManager =
                new SeatingManager();

        SeatingArrangement arrangement = null;

        ReportGenerator reportGenerator =
                new ReportGenerator();

        FileManager fileManager =
                new FileManager();

        int choice = 0;

        while (choice != 10) {

            System.out.println(
                "\n=============================="
            );

            System.out.println(
                " SMART EXAM SEATING SYSTEM"
            );

            System.out.println(
                "=============================="
            );

            System.out.println("1. Add Student");
            System.out.println("2. Add Exam Room");
            System.out.println("3. View Students");
            System.out.println("4. View Rooms");
            System.out.println("5. Generate Seating Arrangement");
            System.out.println("6. Check Conflicts");
            System.out.println("7. View Seating Arrangement");
            System.out.println("8. Generate Report");
            System.out.println("9. Export Report");
            System.out.println("10. Exit");

            System.out.print(
                "Enter your choice: "
            );

            try {

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print(
                            "Enter student name: "
                        );

                        String name =
                                sc.nextLine();

                        System.out.print(
                            "Enter roll number: "
                        );

                        String roll =
                                sc.nextLine();

                        System.out.print(
                            "Enter course: "
                        );

                        String course =
                                sc.nextLine();

                        if (name.trim().isEmpty()
                                || roll.trim().isEmpty()
                                || course.trim().isEmpty()) {

                            System.out.println(
                                "Fields cannot be empty."
                            );

                            break;
                        }

                        Student student =
                                new Student(
                                    name,
                                    roll,
                                    course
                                );

                        studentManager.addStudent(
                            student
                        );

                        break;

                    case 2:

                        System.out.print(
                            "Enter room number: "
                        );

                        String roomNo =
                                sc.nextLine();

                        System.out.print(
                            "Enter room capacity: "
                        );

                        int capacity =
                                sc.nextInt();

                        sc.nextLine();

                        if (roomNo.trim().isEmpty()) {

                            System.out.println(
                                "Room number cannot be empty."
                            );

                            break;
                        }

                        if (capacity <= 0) {

                            System.out.println(
                                "Capacity must be greater than 0."
                            );

                            break;
                        }

                        ExamRoom room =
                                new ExamRoom(
                                    roomNo,
                                    capacity
                                );

                        roomManager.addRoom(room);

                        break;

                    case 3:

                        studentManager.displayStudents();

                        break;

                    case 4:

                        roomManager.displayRooms();

                        break;

                    case 5:

                        if (studentManager
                                .getStudents()
                                .isEmpty()
                                ||
                            roomManager
                                .getRooms()
                                .isEmpty()) {

                            System.out.println(
                                "Please add students and rooms first."
                            );

                        } else {

                            arrangement =
                                seatingManager
                                    .generateArrangement(
                                        studentManager
                                            .getStudents(),
                                        roomManager
                                            .getRooms()
                                    );

                            System.out.println(
                                "Seating arrangement generated successfully."
                            );
                        }

                        break;

                    case 6:

                        if (arrangement == null) {

                            System.out.println(
                                "Generate seating arrangement first."
                            );

                        } else {

                            SeatingCheckThread thread =
                                new SeatingCheckThread(
                                    arrangement,
                                    studentManager
                                        .getStudents()
                                );

                            thread.start();

                            try {

                                thread.join();

                            } catch (InterruptedException e) {

                                System.out.println(
                                    "Conflict checking interrupted."
                                );
                            }
                        }

                        break;

                    case 7:

                        if (arrangement == null) {

                            System.out.println(
                                "Generate seating arrangement first."
                            );

                        } else {

                            arrangement
                                .displayArrangement();
                        }

                        break;

                    case 8:

                        if (arrangement == null) {

                            System.out.println(
                                "Generate seating arrangement first."
                            );

                        } else {

                            String report =
                                reportGenerator
                                    .generateReport(
                                        studentManager
                                            .getStudents(),
                                        roomManager
                                            .getRooms(),
                                        arrangement
                                    );

                            System.out.println(
                                "\n" + report
                            );
                        }

                        break;

                    case 9:

                        if (arrangement == null) {

                            System.out.println(
                                "Generate seating arrangement first."
                            );

                        } else {

                            String report =
                                reportGenerator
                                    .generateReport(
                                        studentManager
                                            .getStudents(),
                                        roomManager
                                            .getRooms(),
                                        arrangement
                                    );

                            fileManager
                                .exportReport(report);
                        }

                        break;

                    case 10:

                        System.out.println(
                            "Thank you for using the system."
                        );

                        break;

                    default:

                        System.out.println(
                            "Invalid choice. Please enter 1-10."
                        );
                }

            } catch (Exception e) {

                System.out.println(
                    "Invalid input. Please try again."
                );

                sc.nextLine();
            }
        }

        sc.close();
    }
}