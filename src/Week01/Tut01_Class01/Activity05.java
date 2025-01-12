package Week01.Tut01_Class01;

import java.io.*;

public class Activity05 {
    public static void main(String[] args) {
        try (DataInputStream input = new DataInputStream(new FileInputStream("input.txt"))) {
           String[] NM = input.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);

            int totalCost = 0;
            for (int i = 0; i < M; i++) {
                String[] line = input.readLine().split(" ");
                totalCost += Integer.parseInt(line[0]) * Integer.parseInt(line[1]);
            }

            System.out.printf("Total price is: %d Dong", totalCost);
         } catch (IOException e) {
            System.out.println("Failed to read input file: " + e.getMessage());
        }
    }
}

