package Week02.Tut02_Class01;

public class Activity01 {
    public static void main(String[] args) {
        int firstRoll = (int) (Math.random() * 6) + 1;
        int secondRoll = (int) (Math.random() * 6) + 1;
        int totalRoll = firstRoll + secondRoll;

        System.out.println("The first die comes up " + firstRoll);
        System.out.println("The second die comes up " + secondRoll);
        System.out.println("Your total roll is " + totalRoll);
    }
}
