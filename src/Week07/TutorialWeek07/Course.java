package Week07.TutorialWeek07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class Course implements StudentManageable {
    //Attributes
    private String CourseID;
    private String name;
    private int credits;
    private Department department;
    private Semester semester;
    private List<Student> enrolledStudent = new ArrayList<>();

    //Constructors
    public Course() {
    }

    public Course(String CourseID, String name, int credits, Department department, Semester semester) throws Exception {
        validateCourseID(CourseID);
        validateName(name);
        validateCredits(credits);
        validateDepartment(department);
        validateSemester(semester);
        this.CourseID = CourseID;
        this.name = name;
        this.credits = credits;
        this.department = department;
        this.semester = semester;
    }

    //Getter Method
    public String getCourseID() {
        return this.CourseID;
    }

    public String getName() {
        return this.name;
    }

    public double getCredits() {
        return this.credits;
    }

    public Department getDepartment() {
        return this.department;
    }

    public Semester getSemester() {
        return this.semester;
    }

    public List<Student> getEnrolledStudent() {
        return this.enrolledStudent;
    }

    //Setter Method
    public void setName(String name) throws Exception {
        validateName(name);
        this.name = name;
    }

    public void setCredits(int credits) throws Exception {
        if (credits < 0 || credits > 4) {
            throw new Exception("Course: Invalid Credit Value");
        }
        this.credits = credits;
    }

    public Student searchStudentByID(String studentID) {
        for (Student student : enrolledStudent) {
            return student.getStudentId().equals(studentID) ? student : null;
        }

        return null;
    }

    /**
     * @param student
     * @throws Exception
     */
    @Override
    public void addStudent(Student student) throws Exception {
        this.enrolledStudent.add(student);
    }

    /**
     * @param studentID
     * @throws Exception
     */
    @Override
    public void removeStudent(String studentID) throws Exception {
        for (Student student : enrolledStudent) {
            if (student.getStudentId().equals(studentID)) {
                this.enrolledStudent.remove(student);
            }
        }
    }

    /**
     * @param student
     * @throws Exception
     */
    @Override
    public void updateStudent(String CourseID, Student student) throws Exception {

    }

    /**
     * @return
     * @throws Exception
     */
    @Override
    public Student[] getEnrolledStudents() throws Exception {
        return new Student[0];
    }

    //Validators
    private void validateCourseID(String courseID) throws Exception {
        if (courseID == null || courseID.isEmpty()) {
            throw new Exception("Course: Invalid course ID");
        }
    }

    private void validateCredits(int credits) throws Exception {
        if (credits < 0 || credits > 4) {
            throw new Exception("Course: Invalid Credit Value");
        }
    }

    private void validateName(String name) throws Exception {
        Pattern regex = Pattern.compile("[0-9]]");

        if (name == null || name.isEmpty() || regex.matcher(name).find()) {
            throw new Exception("Course: Invalid course name");
        }
    }

    private void validateDepartment(Department department) throws Exception {
        if (department == null) {
            throw new Exception("Course: Invalid department");
        }
    }

    private void validateSemester(Semester semester) throws Exception {
        if (semester == null) {
            throw new Exception("Course: Invalid semester");
        }
    }

    public String toString() {
        return String.format("Course [courseID=%s, name=%s, credits=%s, department=%s, semester=%s, enrolledStudent=%d]", this.CourseID, this.name, this.credits, this.department, this.semester, this.enrolledStudent.size());
    }
}

class SortCourseByNameAsc implements Comparator<Course> {
    @Override
    public int compare(Course c1, Course c2) {
        return c1.getName().compareToIgnoreCase(c2.getName());
    }
}

class SortCourseByCreditAsc implements Comparator<Course> {
    @Override
    public int compare(Course c1, Course c2) {
        return Double.compare(c1.getCredits(), c2.getCredits());
    }
}

class SortCourseByDepartmentAsc implements Comparator<Course> {
    @Override
    public int compare(Course c1, Course c2) {
        return Character.compare(
                c1.getDepartment().name().charAt(0),
                c2.getDepartment().name().charAt(0)
        );
    }
}

class SortCourseBySemesterAsc implements Comparator<Course> {
    @Override
    public int compare(Course c1, Course c2) {
        return Character.compare(
                c1.getSemester().name().charAt(0),
                c2.getSemester().name().charAt(0)
        );
    }
}