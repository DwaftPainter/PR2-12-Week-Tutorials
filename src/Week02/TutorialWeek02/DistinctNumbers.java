package Week02.TutorialWeek02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> distinctNum = new LinkedHashSet<>();
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            distinctNum.add(scanner.nextInt());
        }

        System.out.println("The number of distinct numbers is " + distinctNum.size());
        System.out.print("The distinct numbers are: " );

        for (int num : distinctNum) {
            System.out.print(num +  " ");
        }
    }
}
