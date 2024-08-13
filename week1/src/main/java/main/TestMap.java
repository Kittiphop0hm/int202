package main;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, Math.random()*100);
        }
        System.out.println(map.get(3));
    }
}
