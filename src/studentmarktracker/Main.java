package studentmarktracker;

public class Main {

    public static void main(String[] args) {

        int[] marks={90,80,70,60,50};
        StudentMarkTracker studentMarkTracker = new StudentMarkTracker();
        studentMarkTracker.calculateGradeAverage(marks);
        studentMarkTracker.decideGradeRating();
        System.out.println("Average: " + studentMarkTracker.getAverage());
        System.out.println("Grade Rating: " + studentMarkTracker.getGradeRating());
    }
}