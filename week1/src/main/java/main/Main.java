package main;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1150);
        s1.setName("Ohm");
        s1.setGpax(4.00);
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getGpax());
        System.out.println(s1);
    }
}
