package Week01.Tut01_Class01;

import java.util.Scanner;

public class Activity03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of eggs: ");
        int eggs = scanner.nextInt();
        if (eggs < 0) {
            System.out.println("Invalid number of eggs!");
            return;
        }
        System.out.println("You have: ");
        int gross = eggs / 144;
        int remainder = eggs % 144;
        int dozen = remainder / 12;
        remainder = remainder % 12;

        System.out.println(gross + " gross");
        System.out.println(dozen + " dozen");
        System.out.println(remainder + " leftover egg(s)");
    }
}
