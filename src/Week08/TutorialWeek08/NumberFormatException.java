package Week08.TutorialWeek08;

public class NumberFormatException extends Exception {
    public NumberFormatException(String message) {
        super("NumberFormatException: " + message);
    }
}
