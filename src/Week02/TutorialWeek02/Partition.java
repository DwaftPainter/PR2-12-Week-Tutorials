package Week02.TutorialWeek02;

import java.util.Scanner;

public class Partition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list: ");
        int size = scanner.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }
        partition(list);
        System.out.print("After the partition, the list is ");

        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
    }

    static int partition(int[] list) {
        int pivot = list[0];
        int start = 1;
        int end = list.length - 1;

        while (start < end) {
            while (start <= end && list[start] <= pivot) {
                start++;
            }

            while (start <= end && list[end] > pivot) {
                end--;
            }

            if (start < end) {
                int temp = list[start];
                list[start] = list[end];
                list[end] = temp;
            }
        }
        while (end >= 0 && list[end] >= pivot) {
            end--;
        }

        if (end >= 0) {
            int temp = list[end];
            list[end] = list[0];
            list[0] = temp;
        }

        return end;
    }
}

