package problem;

import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private Integer id;
    private String name;
    private Double gpax;
    public final static Comparator<Student> GPAX_NAME_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            double x1 = s1.getGpax();
            double x2 = s2.getGpax();
            if(x1 != x2) {
                if (x1 > x2) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                return s1.getName().compareTo(s2.getName());
            }
        }
    };

    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }
}
