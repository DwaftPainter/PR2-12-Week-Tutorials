package Week07.TutorialWeek07;

import java.util.Comparator;

public class SortStudentByGpaDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getGpa(), o1.getGpa());
    }
}
