package studentmarktracker;

public class StudentMarkTracker {

    private static final double PASS_MARK = 50;
    private static final double EXCELLENT_MARK = 90;

    private static final String FAILED_TEXT = "Failed";
    private static final String NORMAL_TEXT = "Normal";
    private static final String EXCELLENT_TEXT = "Excellent";

    public double[] calculateGradeAverages(int[][] studentMarks) {
        if (studentMarks == null || studentMarks.length == 0) {
            throw new IllegalArgumentException("Student marks cannot be empty");
        }

        double[] averages = new double[studentMarks.length];

        for (int student = 0; student < studentMarks.length; student++) {
            int[] marks = studentMarks[student];

            if (marks == null || marks.length == 0) {
                throw new IllegalArgumentException(
                        "Marks for student " + (student + 1) + " cannot be empty"
                );
            }

            double total = 0;

            for (int mark : marks) {
                total += mark;
            }

            averages[student] = total / marks.length;
        }

        return averages;
    }

    public String[] decideGradeRatings(double[] averages) {
        if (averages == null || averages.length == 0) {
            throw new IllegalArgumentException("Averages cannot be empty");
        }

        String[] gradeRatings = new String[averages.length];

        for (int student = 0; student < averages.length; student++) {
            double average = averages[student];

            if (average < PASS_MARK) {
                gradeRatings[student] = FAILED_TEXT;
            } else if (average < EXCELLENT_MARK) {
                gradeRatings[student] = NORMAL_TEXT;
            } else {
                gradeRatings[student] = EXCELLENT_TEXT;
            }
        }

        return gradeRatings;
    }
}