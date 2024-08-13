package main;

import lombok.*;

@Getter
@Setter
@ToString(exclude = "gpax")
@EqualsAndHashCode
public class Student implements Comparable<Student> {
    private Integer id;
    private String name;
    private Double gpax;

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}
