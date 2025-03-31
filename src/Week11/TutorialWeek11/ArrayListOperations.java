package Week11.TutorialWeek11;

import Week09.TutorialWeek09.NotPossibleException;

public class ArrayListOperations {
    private java.util.ArrayList list = new java.util.ArrayList();

    public void addBoolean(boolean b) {
        list.add(b);
    }

    public void addString(String s) throws NotPossibleException {
        validateString(s);
        list.add(s.trim());
    }

    public void addDouble(double v) {
        list.add(v);
    }

    public void addInteger(int i) {
        list.add(i);
    }

    public String toString() {
        return list.toString().replace("[", "").replace("]", "").replace(",", "");
    }

    public void validateString(String s) throws NotPossibleException {
        if (s.isBlank()) {
            throw new NotPossibleException("Invalid string");
        }
    }
}

