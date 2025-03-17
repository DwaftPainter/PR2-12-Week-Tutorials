package Week09.TutorialWeek09;

public class Student implements java.io.Serializable {
    private String name;
    private String faculty;
    private double mark = 0.0;

    public Student(String name, String faculty) throws NotPossibleException {
        validateName(name);
        validateFaculty(faculty);
        this.name = name;
        this.faculty = faculty;
    }

    public Student(String name, String faculty, double mark) throws NotPossibleException {
        validateName(name);
        validateFaculty(faculty);
        validateMark(mark);
        this.name = name;
        this.faculty = faculty;
        this.mark = mark;
    }

    //Getter Methods
    public String getName() {
        return this.name;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public double getMark() {
        return this.mark;
    }

    //Setter Methods
    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Validators
    public void validateName(String name) throws NotPossibleException {
        java.util.regex.Pattern regex = java.util.regex.Pattern.compile("^[a-zA-Z]+$");
        if (name == null || name.isBlank() || !regex.matcher(name).matches()) {
            throw new NotPossibleException("Invalid Student Name");
        }
    }

    public void validateFaculty(String faculty) throws NotPossibleException {
        java.util.regex.Pattern regex = java.util.regex.Pattern.compile("^[a-zA-Z]+$");
        if (faculty == null || faculty.isBlank() || !regex.matcher(faculty).matches()) {
            throw new NotPossibleException("Invalid Student Faculty");
        }
    }

    public void validateMark(double mark) throws NotPossibleException {
        if (mark < 0 || mark > 10) {
            throw new NotPossibleException("Invalid Mark");
        }
    }

    public String toString() {
        return String.format("Student[name=%s,mark=%.1f,faculty=%s]", this.name, this.mark, this.faculty);
    }
}
