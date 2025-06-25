// Admin.java
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public Admin(String name, String email) {
        super(name, email);
    }

    private void addCourse(Scanner sc) {
        sc.nextLine(); // consume newline
        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();
        Course course = new Course(courseName);
        courses.add(course);
        System.out.println("Course '" + courseName + "' added!");
    }

    private void addSubject(Scanner sc) {
        if (courses.isEmpty()) {
            System.out.println("No courses available. Add a course first.");
            return;
        }
        System.out.println("Select course to add subject to:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
        }
        System.out.print("Enter course number: ");
        int idx = sc.nextInt() - 1;
        if (idx < 0 || idx >= courses.size()) {
            System.out.println("Invalid course selection.");
            return;
        }
        sc.nextLine(); // consume newline
        System.out.print("Enter subject name: ");
        String subjectName = sc.nextLine();
        courses.get(idx).addSubject(new Subject(subjectName));
        System.out.println("Subject '" + subjectName + "' added to course '" + courses.get(idx).getCourseName() + "'.");
    }

    private void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName() + " (" + s.getEmail() + ")");
        }
    }

    private void viewExamResults() {
        System.out.println("Exam results feature not implemented yet.");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Admin Menu ===");
            System.out.println("1. Add Course");
            System.out.println("2. Add Subject");
            System.out.println("3. View All Students");
            System.out.println("4. View Exam Results");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addCourse(sc);
                    break;
                case 2:
                    addSubject(sc);
                    break;
                case 3:
                    viewAllStudents();
                    break;
                case 4:
                    viewExamResults();
                    break;
                case 0:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}