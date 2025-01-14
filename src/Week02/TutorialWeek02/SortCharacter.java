package Week02.TutorialWeek02;

import java.util.Scanner;

public class SortCharacter {
    public static void main(String[] args) {
        System.out.println(sortCharacters("aba"));
    }

    static String sortCharacters(String s) {

        char[] sArr = s.toCharArray();
        java.util.Arrays.sort(sArr);
        String res = "";
        for (char c : sArr) {
            res += c;
        }
        return res;
    }
}
