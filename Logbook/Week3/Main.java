package Logbook.Week3;

public class Main {

    public static void main(String[] args) {
        // Create a Course object
        Course course1 = new Course("SWE4305", "Computing OOP");

        // Create a Student object with ID, name, and an initial course
        Student student1 = new Student(100182377, "Luke", course1);

        // Print student details before enrollment
        System.out.println("Testing student and course details...");
        student1.print();  // Prints student details and initial course information

        // Step 4: Enroll the student in a new course
        Course course2 = new Course("swe4303", "Computer Infrastructure");

        // Enroll the student in the new course
        student1.enrol(course2);  // Pass the new course object to the enrol method

        // Print updated student details and new course enrollment
        System.out.println("\nUpdated student details after enrollment...");
        student1.print();  // This prints the updated student details and the new course they are enrolled in
    }
}
