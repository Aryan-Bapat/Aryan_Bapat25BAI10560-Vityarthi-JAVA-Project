public class User {

    protected String name;
    protected String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void displayUser() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}