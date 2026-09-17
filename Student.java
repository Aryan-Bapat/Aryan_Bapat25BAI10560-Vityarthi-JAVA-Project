public class Student extends User {

    private String course;

    public Student(String name, String id, String course) {
        super(name, id);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void displayUser() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + id);
        System.out.println("Course: " + course);
    }
}