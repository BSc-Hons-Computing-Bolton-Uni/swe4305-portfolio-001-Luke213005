package Logbook.Week3;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student(101, "Alice");

        // Display student details
        student1.displayStudent();

        // Modify values using setters
        student1.setId(102);
        student1.setName("Bob");

        // Display updated student details
        student1.displayStudent();
    }
}