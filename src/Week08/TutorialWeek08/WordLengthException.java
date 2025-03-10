package Week08.TutorialWeek08;

public class WordLengthException extends Exception {
    public WordLengthException(String message) {
        super("WordLengthException: " + message);
    }
}
