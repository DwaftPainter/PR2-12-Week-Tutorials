package Week09.TutorialWeek09;

public class NotPossibleException extends Exception {
    public NotPossibleException(String message) {
        super("NotPossibleException: " + message);
    }
}
