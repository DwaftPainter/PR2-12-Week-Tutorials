package Week10.TutorialWeek10;

public class FactorialRecursive {
    private int index;
    private static java.util.Map<Integer, Double> cached = new java.util.HashMap<>();
    private static FactorialRecursive instance = null;

    private FactorialRecursive(int index) {
        this.index = index;
    }

    public static FactorialRecursive get(int index) throws NotPossibleException {
        if (index < 1) {
            throw new NotPossibleException("FactorialRecursive get: Index " + ( index - 1 ) + " out of bounds for length " + (cached.size() + 1));
        }

        if (instance == null) {
            instance = new FactorialRecursive(index);
        }

        instance.setIndex(index);
        return instance;
    }

    public double getValue() throws NotPossibleException {
        if (index == 0 || index == 1) {
            return 1;
        }

        if (cached.containsKey(index)) { return cached.get(index); }

        double value = index * new FactorialRecursive(index - 1).getValue();
        cached.put(index, value);
        return value;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static void main(String[] args) {
        try {
            FactorialRecursive f1 = FactorialRecursive.get(5);
            System.out.println("Factorial of 5: " + f1.getValue());

            FactorialRecursive f2 = FactorialRecursive.get(3);
            System.out.println("Factorial of 3: " + f2.getValue());

            FactorialRecursive f3 = FactorialRecursive.get(6);
            System.out.println("Factorial of 6: " + f3.getValue());

            FactorialRecursive f4 = FactorialRecursive.get(-4);
            System.out.println("Factorial of -4: " + f4.getValue());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
