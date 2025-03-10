package Week08.TutorialWeek08;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LetterOccurrence {
    //Attributes
    private String word;

    //Constructors
    public LetterOccurrence(String word) throws WordLengthException, InvalidInputException {
        isValidWord(word);
        this.word = word;
    }

    //Getter Method
    public HashMap<String, Integer> getLetterOccurrence() {
        HashMap<String, Integer> occurrence = new HashMap<>();
        for (String c : this.word.split("")) {
            if (occurrence.containsKey(c)) {
                occurrence.put(c, occurrence.get(c) + 1);
            } else {
                occurrence.put(c, 1);
            }
        }

        return occurrence;
    }

    //Validators
    public void isValidWord(String word) throws WordLengthException, InvalidInputException {
        Pattern regex = Pattern.compile("[a-zA-Z]+");

        if (word.isEmpty() || word.contains(" ") || !regex.matcher(word).matches()) {
            throw new InvalidInputException("Word should not be empty, it should contain only letters!");
        } else if (word.length() > 45) {
            throw new WordLengthException("Word length should be between 1 and 45 characters.");
        }
    }

    public String toString() {
        return String.format("LetterOccurrence[{word=%s} contains %s]", this.word, this.getLetterOccurrence().toString().replace("{", "").replace("}", "").replace("=", ": "));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a word: ");
            String word = sc.nextLine();
            LetterOccurrence lo = new LetterOccurrence(word);
            HashMap<String, Integer> occurence = lo.getLetterOccurrence();
            System.out.println(lo.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
