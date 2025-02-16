package Week04.TutorialWeek04;

import java.util.Date;

public class Account {
    //Attributes
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    //Constructors
    public Account() {}
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    //Getter Methods
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return  this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public String getDateCreated() {
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("E, dd MMM yyyy");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(this.dateCreated);
        calendar.add(java.util.Calendar.DATE, -2);
        return formatter.format(calendar.getTime());
    }

    public double getMonthlyInterestRate() {
        return (this.annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        double monthlyInterestRate = getMonthlyInterestRate();

        return this.balance * monthlyInterestRate;
    }

    //Setter Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
}
