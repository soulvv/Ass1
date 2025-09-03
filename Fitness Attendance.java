import java.util.Scanner;

public class FitnessCenterAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] attendance = new int[10];
        int total = 0;

        // Input attendance for 10 days
        System.out.println("Enter attendance for 10 days:");
        for (int i = 0; i < 10; i++) {
            attendance[i] = sc.nextInt();
            total += attendance[i];
        }

        // Calculate average
        double average = total / 10.0;

        // Find max and min attendance
        int maxDay = 0, minDay = 0;
        for (int i = 1; i < 10; i++) {
            if (attendance[i] > attendance[maxDay]) {
                maxDay = i;
            }
            if (attendance[i] < attendance[minDay]) {
                minDay = i;
            }
        }

        // Output results
        System.out.println("\nTotal visitors in 10 days: " + total);
        System.out.println("Day with maximum attendance: Day " + (maxDay + 1) +
                           " (" + attendance[maxDay] + " visitors)");
        System.out.println("Day with minimum attendance: Day " + (minDay + 1) +
                           " (" + attendance[minDay] + " visitors)");
        System.out.println("Average attendance: " + average);
        System.out.println("Days with attendance above average:");
        for (int i = 0; i < 10; i++) {
            if (attendance[i] > average) {
                System.out.println("Day " + (i + 1) + " (" + attendance[i] + ")");
            }
        }
    }
}
