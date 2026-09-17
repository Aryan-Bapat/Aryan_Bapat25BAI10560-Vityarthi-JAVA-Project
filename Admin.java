public class Admin extends User {

    public Admin(String name, String id) {
        super(name, id);
    }

    @Override
    public void displayUser() {
        System.out.println("Admin Name: " + name);
        System.out.println("Admin ID: " + id);
    }
}