package Logbook.Week4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("BOLTON Computing\n" +
                "Level 4 (A1007-1001)", "Computer Science");

        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(100182377, "Luke", course));
        students.add(new Student(100182378, "Sarah", course));
        students.add(new Student(100182379, "James", course));

        // Print details for each student
        for (Student student : students) {
            student.print();
            System.out.println("--------------------------");
        }
    }
}