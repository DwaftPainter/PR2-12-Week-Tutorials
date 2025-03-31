package Week11.TutorialWeek11;

import java.util.ArrayList;

public class ArrayListIntegerLoop {
    private final ArrayList<Integer> list = new ArrayList<Integer>();
    private int size;

    public ArrayListIntegerLoop(int size) {
        this.size = size;
    }

    public void getIntegers() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        try {
            for (int i = 0; i < size; i++) {
                System.out.println("Enter number at position " + (i + 1) + ": ");
                list.add(scanner.nextInt());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printAllElements() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Number " + (i + 1) + ": " + list.get(i));
        }
    }
}
