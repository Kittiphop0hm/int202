package main;

import java.util.*;

public class TestSotedSet {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Set<Student> set = new HashSet<>();
        Student x = null;
        for (int i = 0; i < 20; i++) {
//            int x = (int) (Math.random() * 100)+10;
            x = new Student();
            x.setId(101);
            list.add(x);
            set.add(x);
        }
        System.out.println(list);
        System.out.println(set);
    }
}
