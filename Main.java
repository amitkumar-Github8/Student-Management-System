// Main.java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userType;
        Admin admin = new Admin("admin", "admin@email.com");
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("========== Welcome to Student Management System ==========");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Student");
        System.out.print("Select User Type: ");
        userType = sc.nextInt();
        sc.nextLine();  // consume the leftover newline

        if (userType == 1) {
            admin.displayMenu();
        } else if (userType == 2) {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Student Email: ");
            String email = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            Student student = new Student(name, email, age);
            student.setCourses(admin.getCourses());
            admin.addStudent(student);
            student.displayMenu();
        } else {
            System.out.println("Invalid choice. Exiting...");
        }
        sc.close();
    }
}