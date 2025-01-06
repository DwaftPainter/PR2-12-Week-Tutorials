package Week01.TutorialWeek01;

public class DisplayLeapYears {
    public static void main(String[] args) {
        int count = 0;
        int years = 0;
        System.out.println("All the leap years from 101 to 2100:");
        for (int i = 101; i <= 2100; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.print(i + " ");
                count++;
                years++;
            }

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
        System.out.printf("\nTotal number of leap years in this period: %d", years);
    }
}
