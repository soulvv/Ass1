import java.util.Scanner;

public class ClassroomTestScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[12];
        int total = 0;

        // Input marks of 12 students
        System.out.println("Enter marks of 12 students:");
        for (int i = 0; i < 12; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average
        double average = total / 12.0;

        // Find highest and lowest
        int highest = marks[0], lowest = marks[0];
        for (int i = 1; i < 12; i++) {
            if (marks[i] > highest) highest = marks[i];
            if (marks[i] < lowest) lowest = marks[i];
        }

        // Count students above average
        int countAboveAvg = 0;
        for (int mark : marks) {
            if (mark > average) countAboveAvg++;
        }

        // Display results
        System.out.println("\nClass average: " + average);
        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);
        System.out.println("Students scoring above average: " + countAboveAvg);

        // Check for failing students
        boolean anyFail = false;
        for (int i = 0; i < 12; i++) {
            if (marks[i] < 40) {
                System.out.println("Student " + (i + 1) + " failed with " + marks[i]);
                anyFail = true;
            }
        }
        if (!anyFail) {
            System.out.println("No student scored below passing marks (40).");
        }
    }
}
