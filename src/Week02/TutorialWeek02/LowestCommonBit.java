package Week02.TutorialWeek02;

public class LowestCommonBit {
    public static void main(String[] args) {
        System.out.println(lowestCommonBit(22, 26));
        System.out.println(lowestCommonBit(8, 16));
        System.out.println(lowestCommonBit(15, 7));
        System.out.println(lowestCommonBit(14, 25));
    }

    static int lowestCommonBit(long num1, long num2) {
        StringBuilder num1Bin = new StringBuilder(decToBin(num1));
        int len1 = num1Bin.length();
        StringBuilder num2Bin = new StringBuilder(decToBin(num2));
        int len2 = num2Bin.length();

        if (len1 < len2) {
            for (int i = 0; i < len2 - len1; i++) {
                num1Bin.insert(0, "0");
            }
        } else if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {
                num2Bin.insert(0,"0");
            }
        }
        num1Bin.reverse();
        num2Bin.reverse();

        for (int i = 0; i < num1Bin.length(); i++) {
            if (num1Bin.charAt(i) != '0' && num1Bin.charAt(i) == num2Bin.charAt(i)) {
                return i;
            }
        }

        return -1;
    }

    static String decToBin (long num) {
        if (num == 0) {
            return "0";
        } else if (num == 1) {
            return "1";
        }

        char binary = (char) (num % 2 + '0');

        return decToBin(num / 2) + binary;
    }
}
