package Week07.TutorialWeek07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class LearningManagmentSystem {
    //Attributes
    private final LinkedHashMap<String, Student> Students = new LinkedHashMap<>();
    private final LinkedHashMap<String, Course> Courses = new LinkedHashMap<>();

    private String generateId(int id) {
        int year = LocalDate.now().getYear();
        int month = LocalDate.now().getMonthValue();

        if (month <= 3) {
            return "SP" + year + id;
        } else if (month <= 6) {
            return "SM" + year + id;
        } else if (month <= 9) {
            return "F" + year + id;
        }

        return "WT" + year + id;
    }

    public String addStudent(Student student) {
        String id = generateId(student.getId());
        Students.put(id, student);
        return id;
    }

    public String addCourse(Course course) {
        String id = generateId(Courses.size() + 1);
        Courses.put(id, course);
        return id;
    }

    public void removeStudent(String studentID) {
        Students.remove(studentID);
    }

    public void removeCourse(String courseID) {
        Courses.remove(courseID);
    }

    public void displayAllStudents() {
        for (Student student : Students.values()) {
            System.out.println(student);
        }
    }

    public void displayAllCourses() {
        for (Course course : Courses.values()) {
            System.out.println(course);
        }
    }

    //Search Methods
    public String searchStudentByName(String name) {
        for (Student student : Students.values()) {
            if (student.getName().equals(name)) return student.getStudentId();
        }

        return "Student not found";
    }

    public String searchCourseByName(String name) {
        for (Course course : Courses.values()) {
            if (course.getName().equals(name)) {
                return course.getCourseID();
            }
        }
        return "Course not found";
    }

    //Sort Methods
    public List<Student> getSortedStudentsByGpa() {
        List<Student> sortedStudents = new ArrayList<>(Students.values());
        sortedStudents.sort(new SortStudentByGpaAsc());

        return sortedStudents;
    }

    public List<Course> getSortedCoursesByCredits() {
        List<Course> sortedCourses = new ArrayList<>(Courses.values());
        sortedCourses.sort(new SortCourseByCreditAsc());

        return sortedCourses;
    }
}
