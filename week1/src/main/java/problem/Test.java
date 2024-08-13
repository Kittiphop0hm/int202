package problem;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        testProblem1();
    }

    private static void testProblem1() {
        Set<Student> set1 = new HashSet<>();
        Set<Student> set2 = new TreeSet<>(Student.GPAX_NAME_COMPARATOR);
        List<Student> studentList = new ArrayList<>();
        set2.add(new Student(10001, "Somsri", 3.25));
        set2.add(new Student(10002, "Somsak", 3.00));
        set2.add(new Student(10009, "Somchai", 3.26));
        set2.add(new Student(10007, "Somsiri", 3.25));
        set2.add(new Student(10037, "Sirisopaphan", 3.25));
        Collections.sort(studentList, Student.GPAX_NAME_COMPARATOR);
        studentList.add(new Student(10001, "Somsri", 3.25));
        studentList.add(new Student(10002, "Somsak", 3.00));
        studentList.add(new Student(10009, "Somchai", 3.26));
        studentList.add(new Student(10007, "Somsiri", 3.25));
        studentList.add(new Student(10037, "Sirisopaphan", 3.25));
        System.out.println("--- From Set ---");
        set2.forEach(s -> System.out.printf("%5d %-13s %6.2f\n",
                s.getId(), s.getName(), s.getGpax()));
        System.out.println("--- From List ---");
        studentList.forEach(s -> System.out.printf("%5d %-13s %6.2f\n",
                s.getId(), s.getName(), s.getGpax()));
    }
}
