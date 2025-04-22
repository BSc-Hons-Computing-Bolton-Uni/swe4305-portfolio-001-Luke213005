package ProjectB;

import java.util.*;

public class StudentManager {
    private final Map<String, Student> students = new HashMap<>();
    private final ModuleManager moduleManager;

    public StudentManager(ModuleManager moduleManager) {
        this.moduleManager = moduleManager;
    }

    public void addStudent(String id, String name) {
        students.put(id, new Student(id, name));
    }

    public void enrollStudentInModule(String studentId, String moduleCode) {
        Student student = students.get(studentId);
        Module module = moduleManager.getModule(moduleCode);
        if (student != null && module != null) {
            student.addModule(module);
            System.out.println("Enrolled in module.");
        } else {
            System.out.println("Invalid student or module.");
        }
    }

    public void inputMark(String studentId, String moduleCode, int mark) {
        Student student = students.get(studentId);
        Module module = moduleManager.getModule(moduleCode);
        if (student != null && module != null && mark >= 0 && mark <= 100) {
            student.setMark(module, mark);
            System.out.println("Mark updated.");
        } else {
            System.out.println("Invalid input.");
        }
    }

    public void displayStudent(String id) {
        Student student = students.get(id);
        if (student != null) {
            student.displayTranscript();
        } else {
            System.out.println("Student not found.");
        }
    }
}
