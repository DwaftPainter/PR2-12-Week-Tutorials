package Week01.TutorialWeek01Official;

public class PopulationDisplay {
    public static void main(String[] args) {
        int curPop = 312032486;
        int secPerYear = 24 * 60 * 60 * 365;
        int birthPerYear = secPerYear / 7;
        int deathPerYear = secPerYear / 13;
        int immigrantPerYear = secPerYear / 45;
        int pop;
        for (int i = 1; i <= 5; i++) {
            pop = curPop + (i - 1) + (birthPerYear + immigrantPerYear - deathPerYear) * i;
            System.out.printf(i == 1 ? "Population after %d year: %d\n" : "Population after %d years: %d\n", i, pop);
        }
    }
}
