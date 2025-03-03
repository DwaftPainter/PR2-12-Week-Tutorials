package Week07.TutorialWeek07;

public class Student extends Person {
    private String studentId;
    private double gpa;

    //Constructors
    public Student(int id, String name, String dateOfBirth, String email, String tel, String address, String studentId, double gpa) throws Exception {
        super(id, name, dateOfBirth, email, tel, address);
        validateGpa(gpa);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    //Getter Method
    public String getStudentId() {
        return this.studentId;
    }

    public double getGpa() {
        return this.gpa;
    }

    //Setter Method
    public void setGpa(double gpa) throws Exception {
        validateGpa(gpa);
        this.gpa = gpa;
    }

    //Validator
    public void validateGpa(double gpa) throws Exception {
        if (gpa < 0 || gpa > 4) {
            throw new Exception("Student: Invalid GPA");
        }
    }

    @Override
    public String toString() {
        return String.format("Student [%s, studentID=%s, gpa=%.1f]", super.toString(), this.studentId, this.gpa);
    }
}
