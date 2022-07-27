package baobao.sort;

import baobao.model.Student;

import java.util.Comparator;

public class ComparatorScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int compare = Double.compare(o1.getScore(), o2.getScore());

        if (compare != 0) {
            return compare;
        }

        return o1.getName().compareTo(o2.getName());
    }
}
