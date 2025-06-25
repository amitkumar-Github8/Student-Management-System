import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Subject> subjects;

    public Course(String courseName) {
        this.courseName = courseName;
        this.subjects = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void displaySubjects() {
        System.out.println("Subjects in " + courseName + ":");
        for (Subject subject : subjects) {
            System.out.println("- " + subject.getSubjectName());
        }
    }
}