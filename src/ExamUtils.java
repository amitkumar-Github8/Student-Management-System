// This file contains utility functions for handling exam grading and related operations.

import java.util.HashMap;
import java.util.Map;

public class ExamUtils {

    // Method to calculate the grade based on marks
    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to calculate average marks from a list of marks
    public static double calculateAverage(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    // Method to get the highest mark from a list of marks
    public static int getHighestMark(int[] marks) {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    // Method to get the lowest mark from a list of marks
    public static int getLowestMark(int[] marks) {
        int lowest = marks[0];
        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }

    // Method to generate a report of grades for a student
    public static Map<String, String> generateGradeReport(String studentName, int[] marks) {
        Map<String, String> report = new HashMap<>();
        report.put("Student Name", studentName);
        report.put("Average", String.valueOf(calculateAverage(marks)));
        report.put("Highest Mark", String.valueOf(getHighestMark(marks)));
        report.put("Lowest Mark", String.valueOf(getLowestMark(marks)));
        return report;
    }

    public static int gradeExam() {
        return (int)(Math.random() * 100);
    }
}