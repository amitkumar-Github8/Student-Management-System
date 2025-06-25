// Student.java
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {
    private int age;
    private ArrayList<Course> courses;
    private ArrayList<Subject> chosenSubjects = new ArrayList<>();
    private int examScore = -1;

    public Student(String name, String email, int age) {
        super(name, email);
        this.age = age;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void chooseSubjects(Scanner sc) {
        if (courses == null || courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        System.out.println("Choose a course:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
        }
        System.out.print("Enter course number: ");
        int idx = sc.nextInt() - 1;
        if (idx < 0 || idx >= courses.size()) {
            System.out.println("Invalid course selection.");
            return;
        }
        Course selectedCourse = courses.get(idx);
        selectedCourse.displaySubjects();
        System.out.print("Enter subject number to choose (comma separated for multiple): ");
        sc.nextLine();
        String[] subjectChoices = sc.nextLine().split(",");
        for (String s : subjectChoices) {
            try {
                int subIdx = Integer.parseInt(s.trim()) - 1;
                if (subIdx >= 0 && subIdx < selectedCourse.getSubjects().size()) {
                    chosenSubjects.add(selectedCourse.getSubjects().get(subIdx));
                }
            } catch (NumberFormatException e) {
                // skip invalid
            }
        }
        System.out.println("Subjects chosen.");
    }

    private void viewCourses() {
        if (courses == null || courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    private void takeExam(Scanner sc) {
        if (chosenSubjects.isEmpty()) {
            System.out.println("No subjects chosen. Please choose subjects first.");
            return;
        }
        System.out.println("Taking exam for chosen subjects...");
        // Simulate exam
        examScore = (int)(Math.random() * 100);
        System.out.println("Exam completed. Your score: " + examScore);
    }

    private void viewResult() {
        if (examScore == -1) {
            System.out.println("No exam taken yet.");
        } else {
            System.out.println("Your last exam score: " + examScore);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===================================");
            System.out.println("        ✨ Student Menu ✨         ");
            System.out.println("===================================");
            System.out.println("1. View Courses");
            System.out.println("2. Choose Subjects");
            System.out.println("3. Take Exam");
            System.out.println("4. View Result");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    viewCourses();
                    break;
                case 2:
                    chooseSubjects(sc);
                    break;
                case 3:
                    takeExam(sc);
                    break;
                case 4:
                    viewResult();
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