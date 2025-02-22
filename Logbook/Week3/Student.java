public class Student {
    // Attributes
    private int id;      // Student ID (integer)
    private String name; // Student Name (String)

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}

