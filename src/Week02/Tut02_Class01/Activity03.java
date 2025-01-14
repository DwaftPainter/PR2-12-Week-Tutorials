package Week02.Tut02_Class01;

import java.io.*;
import java.util.*;

public class Activity03 {
    public static void main(String[] args) {
        try {
            File file = new File("src/InputFile/testdata.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int totalScore = 0;
                for (int i = 0; i < 3; i++) {
                    totalScore += scanner.nextInt();
                    if (scanner.hasNextLine()) {
                        scanner.nextLine();
                    }
                }

                int GPA = totalScore / 3;

                System.out.println("Student's name: " + name);
                System.out.println("GPA: " + GPA);
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Failed to read file: " + e.getMessage());
        }

    }


}
