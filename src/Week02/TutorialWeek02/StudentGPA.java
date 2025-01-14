package Week02.TutorialWeek02;

import  java.io.*;

public class StudentGPA {
    public static void main(String[] args) throws FileNotFoundException {
        printStudentGpa("src/InputFile/score.txt");
    }

    static void printStudentGpa(String filepath) {

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(filepath))) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String line;
            while ((line = reader.readLine()) != null) {
                String name = line;

                double totalScore = 0;
                for  (int i = 0; i < 3; i++) {
                    totalScore += Integer.parseInt(reader.readLine());
                }
                double GPA = totalScore / 3;

                System.out.println("Student's name: " + name);
                System.out.println("GPA: " + GPA);
            }
        } catch (IOException e) {
            System.out.println("Failed to read file: " + e.getMessage());
        }
    }
}
