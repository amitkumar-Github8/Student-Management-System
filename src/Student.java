import java.util.*;

public class Student extends User {
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name, String email) {
        super(name, email);
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    public void menu(Scanner sc, List<Course> courses) {
        while (true) {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. View Available Courses");
            System.out.println("2. Enroll in Course");
            System.out.println("3. My Courses");
            System.out.println("4. Take Exam");
            System.out.println("5. Logout");
            System.out.print("Choose option: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    viewCourses(courses);
                    break;
                case "2":
                    enroll(sc, courses);
                    break;
                case "3":
                    myCourses();
                    break;
                case "4":
                    takeExam(sc);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void viewCourses(List<Course> courses) {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        System.out.println("Courses:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i+1) + ". " + courses.get(i).getName());
        }
    }

    private void enroll(Scanner sc, List<Course> courses) {
        viewCourses(courses);
        if (courses.isEmpty()) return;
        System.out.print("Select course number: ");
        int idx = Integer.parseInt(sc.nextLine()) - 1;
        if (idx >= 0 && idx < courses.size()) {
            enrollCourse(courses.get(idx));
            System.out.println("Enrolled in course.");
        } else {
            System.out.println("Invalid selection.");
        }
    }

    private void myCourses() {
        if (enrolledCourses.isEmpty()) {
            System.out.println("Not enrolled in any courses.");
            return;
        }
        System.out.println("My Courses:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getName());
        }
    }

    private void takeExam(Scanner sc) {
        if (enrolledCourses.isEmpty()) {
            System.out.println("Not enrolled in any courses.");
            return;
        }
        System.out.println("Select course to take exam:");
        for (int i = 0; i < enrolledCourses.size(); i++) {
            System.out.println((i+1) + ". " + enrolledCourses.get(i).getName());
        }
        int idx = Integer.parseInt(sc.nextLine()) - 1;
        if (idx >= 0 && idx < enrolledCourses.size()) {
            int score = ExamUtils.gradeExam();
            System.out.println("You scored: " + score + "/100");
        } else {
            System.out.println("Invalid selection.");
        }
    }
}