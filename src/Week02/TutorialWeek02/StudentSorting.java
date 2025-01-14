package Week02.TutorialWeek02;

import java.util.Scanner;

public class StudentSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of students: ");
        int students = scanner.nextInt();

        String[] names = new String[students];
        int[] scores = new int[students];
        for (int i = 0; i < students; i++) {
            System.out.printf("Student %d: \n", i + 1);
            names[i] = scanner.next();
            System.out.printf("Student %d'score: \n", i + 1);
            scores[i] = scanner.nextInt();
        }
        if (students == 0) {
            System.out.println("Error: No students to sort.");
            return;
        }
        for (int score : scores) {
            if (score < 0 || score > 100) {
                System.out.println("Invalid score: The score cannot be negative or exceed 100.");
                return;
            }
        }

        for (int i = 0; i < students; i++) {
            for (int j = i + 1; j < students; j++) {
                if (scores[i] < scores[j]) {
                    int tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.print("List of students: ");
        for (int i = 0; i < students; i++) {
            System.out.printf("%s(%d)", names[i], scores[i]);
            if (i + 1 == students) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
    }
}
