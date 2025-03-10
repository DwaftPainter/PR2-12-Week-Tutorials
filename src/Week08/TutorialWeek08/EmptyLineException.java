package Week08.TutorialWeek08;

public class EmptyLineException extends Exception {
    public EmptyLineException(String message) {
        super("EmptyLineException: " + message);
    }
}
