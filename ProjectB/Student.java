package ProjectB;

import java.util.*;

public class Student {
    private final String studentId;
    private final String studentName;
    private final Map<Module, Integer> marks;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = new HashMap<>();
    }

    public void addModule(Module module) {
        if (!marks.containsKey(module)) {
            marks.put(module, -1);
        }
    }

    public void setMark(Module module, int mark) {
        if (marks.containsKey(module)) {
            marks.put(module, mark);
        }
    }

    public Map<Module, Integer> getMarks() {
        return marks;
    }

    public String getGrade(int mark) {
        if (mark >= 70) return "A - First Class";
        if (mark >= 60) return "B - Upper Second";
        if (mark >= 50) return "C - Lower Second";
        if (mark >= 40) return "D - Third Class";
        return "F - Fail";
    }

    public void displayTranscript() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        for (Map.Entry<Module, Integer> entry : marks.entrySet()) {
            Module module = entry.getKey();
            int mark = entry.getValue();
            String grade = (mark >= 0) ? getGrade(mark) : "N/A";
            System.out.println("  - " + module + " | Mark: " + (mark >= 0 ? mark : "N/A") + " | Grade: " + grade);
        }
    }
}
