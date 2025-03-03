package Week07.TutorialWeek07;

public interface StudentManageable {
    void addStudent(Student student) throws Exception;
    void removeStudent(String studentID) throws Exception;
    void updateStudent(String studentID, Student student) throws Exception;
    Student[] getEnrolledStudents() throws Exception;
}
