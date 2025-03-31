package Week10.TutorialWeek10;

import javax.naming.StringRefAddr;
import java.util.Scanner;

public class IntegerRecursiveSequence {
    private static IntegerRecursiveSequence instance = new IntegerRecursiveSequence();
    private int count = 0;
    private int tracking = 0;
    private int num = 0;
    private int prevNum = 1;

    private IntegerRecursiveSequence() {
    }

    public void setCount(int count) {
        validateCount(count);
        this.count = count;
    }

    public void printEvenSequence() {
        if (tracking >= count) {
            tracking = 0;
            num = 0;
            return;
        }

        System.out.print(num);
        num += 2;
        tracking++;
        if (tracking < count) {
            System.out.print(", ");
        }

        printEvenSequence();
    }

    public void printTriangularSequence() {
        if (tracking >= count) {
            tracking = 0;
            num = 0;
            return;
        }

        System.out.print(num);
        tracking++;
        num += tracking;
        if (tracking < count) {
            System.out.print(", ");
        }

        printTriangularSequence();
    }

    public void printFibonacciSequence() {
        if (tracking >= count) {
            tracking = 0;
            num = 0;
            return;
        }

        System.out.print(num);
        int next = num + prevNum;
        num = prevNum;
        prevNum = next;
        tracking++;
        if (tracking < count) {
            System.out.print(", ");
        }

        printFibonacciSequence();
    }

    public void validateCount(int count) throws NotPossibleException {
        if (count <= 0) {
            throw new NotPossibleException("IntegerRecursiveSequence setter: Invalid count " + count);
        }
        ;
    }

    public static IntegerRecursiveSequence getInstance() {
        if (instance == null) instance = new IntegerRecursiveSequence();
        return instance;
    }
}
