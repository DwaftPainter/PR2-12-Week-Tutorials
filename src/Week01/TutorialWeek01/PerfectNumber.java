package Week01.TutorialWeek01;

public class PerfectNumber {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("The four perfect numbers less than 10,000: ");
        for (int i = 1; i < 10000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println(i);
                count++;
                if (count == 4) {
                    break;
                }
            }
        }
    }
}
