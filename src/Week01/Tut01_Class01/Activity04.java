package Week01.Tut01_Class01;

public class Activity04 {
    public static void main(String[] args) {
        double principal;
        double rate;
        double interest;

        principal = 17000;
        rate = 0.07;
        interest = principal * rate;
        principal = principal + interest;

        System.out.print("The interest earned is ");
        System.out.println(interest);
        System.out.print("The value of the investment after one year is ");
        System.out.println(principal);
    }
}

//a) It still work because the principal variable is double
/*b) The data type of interest variable in "principal = principal + interest" express can be cast into integer,
/*therefore the program will run normally without reserving the change of principal date type*/