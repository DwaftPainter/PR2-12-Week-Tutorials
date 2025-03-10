package Week08.TutorialWeek08;

public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super("InvalidInputException: " + message);
    }
}
