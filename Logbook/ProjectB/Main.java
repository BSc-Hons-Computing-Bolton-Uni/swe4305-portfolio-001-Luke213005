package Logbook.ProjectB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ModuleManager moduleManager = new ModuleManager();
        StudentManager studentManager = new StudentManager(moduleManager);

        while (true) {
            System.out.println("\n=== Project B: Student Performance Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display Modules");
            System.out.println("3. Enroll Student in Module");
            System.out.println("4. Input Mark");
            System.out.println("5. Display Student Transcript");
            System.out.println("6. Exit");
            System.out.print("Select option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    studentManager.addStudent(id, name);
                }
                case 2 -> moduleManager.displayModules();
                case 3 -> {
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter Module Code: ");
                    String moduleCode = scanner.nextLine();
                    studentManager.enrollStudentInModule(studentId, moduleCode);
                }
                case 4 -> {
                    System.out.print("Enter Student ID: ");
                    String sid = scanner.nextLine();
                    System.out.print("Enter Module Code: ");
                    String mcode = scanner.nextLine();
                    System.out.print("Enter Mark: ");
                    int mark = scanner.nextInt();
                    scanner.nextLine();
                    studentManager.inputMark(sid, mcode, mark);
                }
                case 5 -> {
                    System.out.print("Enter Student ID: ");
                    String sid = scanner.nextLine();
                    studentManager.displayStudent(sid);
                }
                case 6 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
