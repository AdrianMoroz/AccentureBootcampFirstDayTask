package studentmarktracker;

public class StudentMarkTracker {

    private double average;
    private String gradeRating = "";

    private static final double PASS_MARK = 50;
    private static final double EXCELLENT_MARK = 90;

    private static final String FAILED_TEXT = "Failed";
    private static final String NORMAL_TEXT = "Normal";
    private static final String EXCELLENT_TEXT = "Excellent";

    public double getAverage() {
        return average;
    }

    public String getGradeRating() {
        return gradeRating;
    }

    public void calculateGradeAverage(int[] marks) {
        if (marks == null || marks.length == 0) {
            throw new IllegalArgumentException("Marks cannot be empty");
        }

        double total = 0;

        for (int mark : marks) {
            total += mark;
        }

        average = total / marks.length;
    }

    public void decideGradeRating() {
        if (average < PASS_MARK) {
            gradeRating = FAILED_TEXT;
        } else if (average < EXCELLENT_MARK) {
            gradeRating = NORMAL_TEXT;
        } else {
            gradeRating = EXCELLENT_TEXT;
        }
    }
}