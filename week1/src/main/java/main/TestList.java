package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        Set<Integer> set = new HashSet<>(50, 0.5f);
        for (int i = 0; i < 20; i++) {
            set.add((int) (Math.random()*100));
        }
    }
}
