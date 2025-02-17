package Week05.TutorialWeek05;

public class Person {
    //Attributes
    private String name;
    private String address;

    //Constructors
    public Person() {}
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //Getter Methods
    public String getName() {
       return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    //Setter Methods
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return String.format("Person[name=%s,address=%s]", this.name, this.address);
    }
}

class Student extends Person {
    //Attributes
    private String program;
    private int year;
    private double fee;

    //Constructors
    public Student() {}
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    //Getter Methods
    public String getProgram() {
        return this.program;
    }

    public int getYear() {
        return this.year;
    }

    public double getFee() {
        return this.fee;
    }

    //Setter Methods
    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return String.format("Student[Person[name=%s,address=%s], program=%s, year=%d, fee=%.1f]", getName(), getAddress(), this.program, this.year, this.fee);
    }
}

class Staff extends Person {
    //Attributes
    private String school;
    private double pay;

    //Constructors
    public Staff() {};
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    //Getter Methods

    public String getSchool() {
        return this.school;
    }

    public double getPay() {
        return this.pay;
    }

    //Setter Methods
    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("Staff[Person[name=%s,address=%s], school=%s, pay=%.1f]", getName(), getAddress(), this.school, this.pay);
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", "123 Main St", "Computer Science", 2, 15000);
        Staff staff = new Staff("Bob", "456 Elm St", "XYZ High School", 50000);

        System.out.println(student);
        System.out.println(staff);
    }
}