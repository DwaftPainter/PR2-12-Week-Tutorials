package Week01.Tut01_Class01;

import java.util.Scanner;

public class Activity02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.printf("Hello, %s, nice to meet you!", name.toUpperCase());
    }
}
