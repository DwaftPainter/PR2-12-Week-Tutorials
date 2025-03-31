package Week10.TutorialWeek10;

public class Logger {
    private static Logger logger = null;

    private Logger() {}

    public static Logger getInstance() {
         if (logger == null) {
             logger = new Logger();
         }

         return logger;
    }

    public void info(String message) {
        System.out.println("[INFO] " + message);
    }

    public void warning(String message) {
        System.out.println("[WARNING] " + message);
    }

    public void error(String message) {
        System.out.println("[ERROR] " + message);
    }
}
