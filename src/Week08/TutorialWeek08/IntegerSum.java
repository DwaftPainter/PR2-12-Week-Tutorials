package Week08.TutorialWeek08;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IntegerSum {
    //Attributes
    private String numSequence;

    //Constructors
    public IntegerSum(String numSequence) throws Exception {
        isValidSequence(numSequence);
        this.numSequence = numSequence;
    }

    public int getTotal() {
        int sum = 0;
        for (String i : this.numSequence.split("\\s+")) {
            if (i.equals("0")) {
                break;
            }

            sum += Integer.parseInt(i.trim());
        }

        return sum;
    }

    //Validators
    private void isValidSequence(String sequence) throws Exception {
        Pattern pattern = Pattern.compile("^-?[0-9]+(?:\\s+-?[0-9]+)*$");
        if (sequence.isBlank()) {
            throw new EmptyLineException("The series should not be empty!");
        } else if (!pattern.matcher(sequence).matches()) {
            throw new InvalidInputException("The series should contain integers [-2147483648 2147483647] only!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sequence of integers (terminate with 0): ");
        String input = sc.nextLine();
        try {
            IntegerSum calculator = new IntegerSum(input);
            int result = calculator.getTotal();
            System.out.println("Sum of numbers: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
