import java.util.*;

public class Main {
    private static List<Student> students = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Admin Login");
            System.out.println("2. Student Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    Admin admin = new Admin("admin", "admin@school.com", students, courses);
                    admin.menu(sc);
                    break;
                case "2":
                    studentLogin(sc);
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void studentLogin(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        Student student = null;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                student = s;
                break;
            }
        }
        if (student == null) {
            System.out.print("Enter your email: ");
            String email = sc.nextLine();
            student = new Student(name, email);
            students.add(student);
            System.out.println("Student registered.");
        }
        student.menu(sc, courses);
    }
}