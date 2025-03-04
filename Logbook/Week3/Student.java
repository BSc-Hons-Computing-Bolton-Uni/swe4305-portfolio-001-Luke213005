package Logbook.Week3;

public class Student {

    private final int id;        // Student ID (int type)
    private final String name;   // Student name (String type)
    private Course course; // Course object (type Course)

    // Constructor to initialize Student object with ID, name, and course
    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    // Method to print student details including the enrolled course
    public void print() {
        System.out.println("Student ID: " + id + ", Name: " + name);
        System.out.print("Enrolled in: ");
        if (course != null) {
            course.print(); // Call the print method of the Course class
        } else {
            System.out.println("No course enrolled.");
        }
    }
    // Enroll method to assign a course to the student
    public void enrol(Course newCourse) {
        this.course = newCourse;
        System.out.println(name + " has been enrolled in the course: " + newCourse.getName());
    }
}