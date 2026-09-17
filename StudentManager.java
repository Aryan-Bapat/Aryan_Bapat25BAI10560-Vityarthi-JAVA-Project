import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public boolean addStudent(Student student) {

        for (Student s : students) {

            if (s.getId().equalsIgnoreCase(student.getId())) {

                System.out.println(
                    "Student with this roll number already exists."
                );

                return false;
            }
        }

        students.add(student);

        System.out.println(
            "Student added successfully."
        );

        return true;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void displayStudents() {

        System.out.println("\n===== STUDENTS =====");

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {

            student.displayUser();

            System.out.println("--------------------");
        }
    }
}