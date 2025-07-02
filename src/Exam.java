public class Exam {
    private String examName;
    private String courseName;
    private String date;
    private int duration; // in minutes
    private int totalMarks;

    public Exam(String examName, String courseName, String date, int duration, int totalMarks) {
        this.examName = examName;
        this.courseName = courseName;
        this.date = date;
        this.duration = duration;
        this.totalMarks = totalMarks;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examName='" + examName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", date='" + date + '\'' +
                ", duration=" + duration +
                ", totalMarks=" + totalMarks +
                '}';
    }
}