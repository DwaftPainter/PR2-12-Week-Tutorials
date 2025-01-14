package Week02.Tut02_Class01;

import java.util.Scanner;

public class Activity02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your quarters: ");
        int quarters = scanner.nextInt();
        System.out.println("Enter your dimes: ");
        int dimes = scanner.nextInt();
        System.out.println("Enter your nickels: ");
        int nickels = scanner.nextInt();
        System.out.println("Enter your pennies: ");
        int pennies = scanner.nextInt();

        double dollars = quarters * 0.25 + dimes * 0.1 + nickels * 0.05 + pennies * 0.01;

        System.out.printf("You have %.2f dollar(s)", dollars);
    }
}
