package Logbook.Week3;

public class Course {

    private final String code;  // Course code (String type)
    private final String name;  // Course name (String type)

    // Constructor to initialize course code and course name
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getter for course name
    public String getName() {
        return name;
    }

    // Method to print course details
    public void print() {
        System.out.println("Course Code: " + code + ", Course Name: " + name);
    }
}