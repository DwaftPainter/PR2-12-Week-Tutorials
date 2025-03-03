package Week07.TutorialWeek07;

import java.util.Comparator;

public class SortStudentByGpaAsc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }
}
