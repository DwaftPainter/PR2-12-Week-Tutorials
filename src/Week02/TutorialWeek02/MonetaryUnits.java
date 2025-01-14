package Week02.TutorialWeek02;

import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount in double, for example, 11.56: ");
        double money = scanner.nextDouble();

        System.out.printf("Your amount %.2f consists of\n", money);
        money = money * 100;
        int cents = (int) money;
        int dollars = cents / 100;
        int remainder = cents % 100;
        int quarters = remainder / 25;
        remainder %= 25;
        int dimes = remainder / 10;
        remainder %= 10;
        int nickels = remainder / 5;
        remainder %= 5;

        System.out.printf("    %d dollars\n", dollars);
        System.out.printf("    %d quarters\n", quarters);
        System.out.printf("    %d dimes\n", dimes);
        System.out.printf("    %d nickels\n", nickels);
        System.out.printf("    %d pennies\n", remainder);
    }
}
