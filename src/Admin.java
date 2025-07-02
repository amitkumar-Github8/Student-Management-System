// This file contains the Admin class, which manages the admin user logic and menu-driven interface for the application.

import java.util.*;

public class Admin extends User {
    private List<Student> students;
    private List<Course> courses;

    public Admin(String name, String email, List<Student> students, List<Course> courses) {
        super(name, email);
        this.students = students;
        this.courses = courses;
    }

    public void menu(Scanner sc) {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Add Student to Course");
            System.out.println("4. View Students");
            System.out.println("5. Logout");
            System.out.print("Choose option: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    addCourse(sc);
                    break;
                case "2":
                    viewCourses();
                    break;
                case "3":
                    addStudentToCourse(sc);
                    break;
                case "4":
                    viewStudents();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void addCourse(Scanner sc) {
        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        courses.add(new Course(name));
        System.out.println("Course added.");
    }

    private void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        System.out.println("Courses:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i+1) + ". " + courses.get(i).getName());
        }
    }

    private void addStudentToCourse(Scanner sc) {
        if (students.isEmpty() || courses.isEmpty()) {
            System.out.println("Add students and courses first.");
            return;
        }
        viewStudents();
        System.out.print("Select student number: ");
        int sIdx = Integer.parseInt(sc.nextLine()) - 1;
        viewCourses();
        System.out.print("Select course number: ");
        int cIdx = Integer.parseInt(sc.nextLine()) - 1;
        if (sIdx >= 0 && sIdx < students.size() && cIdx >= 0 && cIdx < courses.size()) {
            students.get(sIdx).enrollCourse(courses.get(cIdx));
            System.out.println("Student enrolled in course.");
        } else {
            System.out.println("Invalid selection.");
        }
    }

    private void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }
        System.out.println("Students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i+1) + ". " + students.get(i).getName() + " (" + students.get(i).getEmail() + ")");
        }
    }
}