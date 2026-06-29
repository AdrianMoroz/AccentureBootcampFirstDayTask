package studentmarktracker;

public class Main {

    public static void main(String[] args) {

        int[][] studentMarks = {
                {90, 80, 70, 60, 50},
                {45, 40, 55, 35, 50},
                {95, 92, 90, 98, 94}
        };

        StudentMarkTracker tracker = new StudentMarkTracker();

        double[] averages = tracker.calculateGradeAverages(studentMarks);
        String[] gradeRatings = tracker.decideGradeRatings(averages);

        for (int student = 0; student < studentMarks.length; student++) {
            System.out.println("Student " + (student + 1));
            System.out.printf("Average: %.2f%n", averages[student]);
            System.out.println("Grade Rating: " + gradeRatings[student]);
            System.out.println();
        }
    }
}