package Week08.TutorialWeek08;

import java.util.Scanner;

public class StringOperation {
    //Attributes
    private String str;
    private String output;

    //Constructors
    public StringOperation(String str) throws InvalidInputException {
        validateString(str);
        this.str = str;
    }

    public void divideStringAtSeparator(String space) {
        String res = "";
        String[] cArr = new String[this.str.length()];
        for (int i = 0; i < this.str.length(); i++) {
            cArr[i] = String.valueOf(str.charAt(i));
        }

        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i].equals(space)) {
                cArr[i] = " | ";
            }
            res += cArr[i];
        }

        this.output = res;
    }

    public void findIndexOfLastOccurrence(String target) {
        int lastIndex = -1;

        for (int i = 0; i <= this.str.length() - target.length(); i++) {
            boolean match = true;

            for (int j = 0; j < target.length(); j++) {
                if (this.str.charAt(i + j) != target.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                lastIndex = i;
            }
        }

        this.output = String.format("Last occurrence at index: %d", lastIndex);
    }

    public void findIndexOfFirstOccurrence(String target) {
        int firstIndex = -1;
        boolean found = false;
        for (int i = 0; i < target.length(); i++) {
            for (int j = 0; j < this.str.length(); j++) {
                if (this.str.charAt(j) == target.charAt(i)) {
                    found = true;
                    if (firstIndex == -1) {
                        firstIndex = j;
                    }
                    break;
                }

                found = false;
            }
        }

        this.output = String.format("First occurrence at index: %d", firstIndex);
    }

    public void extractSubstring(int index1, int index2) throws InvalidInputException {
        if (index1 == index2 || index2 >= this.str.length() || index1 >= this.str.length() || index2 < 0 || index1 < 0) {
            throw new InvalidInputException("Invalid substring range!");
        }
        String substr = "";
        for (int i = index1; i <= index2; i++) {
            substr += this.str.charAt(i);
        }

        this.output = substr;
    }

    public void calculateOccurrenceOfEachCharacter() {
        java.util.HashMap<Character, Integer> occurrences = new java.util.HashMap<>();
        for (char c : this.str.toCharArray()) {
            occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
        }

        this.output = occurrences.toString();
    }

    public void countUppercaseAndLowercaseLetters() {
        int upper = 0;
        int lower = 0;

        for (char c : this.str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                upper++;
            } else if (c >= 'a' && c <= 'z') {
                lower++;
            }
        }

        this.output = String.format("Uppercase: %d, Lowercase: %d", upper, lower);
    }

    public void displayCharactersAtOddPositions() {
        this.output = "";
        for (int i = 0; i < this.str.length(); i++) {
            if (i % 2 == 0) {
                this.output += this.str.charAt(i);
            }
        }
    }

    public void displayCharactersAtEvenPositions() {
        this.output = "";
        for (int i = 0; i < this.str.length(); i++) {
            if (i % 2 != 0) {
                this.output += this.str.charAt(i);
            }
        }
    }

    public void countVowelsAndConsonants() {
        int vowels = 0;
        int consonants = 0;
        java.util.regex.Pattern regex = java.util.regex.Pattern.compile("[aeiouAEIOU]");
        java.util.regex.Pattern specialRegex = java.util.regex.Pattern.compile("[a-zA-Z]");

        for (String c : this.str.split("")) {
            if (regex.matcher(c).matches()) {
                vowels++;
            } else if (!c.equals(" ") && specialRegex.matcher(c).matches()) {
                consonants++;
            }
        }

        this.output = String.format("Vowels: %d, Consonants: %d", vowels, consonants);
    }

    public void reverseString() {
        String reversedString = "";
        for (int i = this.str.length() - 1; i >= 0; i--) {
            reversedString += this.str.charAt(i);
        }

        this.output = reversedString;
    }

    // Validators
    private void validateString(String str) throws InvalidInputException {
        if (str == null || str.isBlank()) {
            throw new InvalidInputException("String should not contain only space!");
        }
    }

    public String toString() {
        return String.format("StringOperator[input=%s,output=%s]", this.str, this.output);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a string: ");
            String anyTestStr = sc.nextLine();
            StringOperation st = new StringOperation(anyTestStr);

            st.reverseString();
            System.out.println(st);

            st.countVowelsAndConsonants();
            System.out.println(st);

            st.displayCharactersAtEvenPositions();
            System.out.println(st);

            st.displayCharactersAtOddPositions();
            System.out.println(st);

            st.countUppercaseAndLowercaseLetters();
            System.out.println(st);

            st.calculateOccurrenceOfEachCharacter();
            System.out.println(st);

            st.extractSubstring(1, 3);
            System.out.println(st);

            st.findIndexOfFirstOccurrence("is");
            System.out.println(st);

            st.findIndexOfLastOccurrence("is");
            System.out.println(st);

            st.divideStringAtSeparator(" ");
            System.out.println(st);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
