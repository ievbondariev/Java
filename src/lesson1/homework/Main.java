package lesson1.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student("Ivan", 20);
        Student student1 = new Student("Anna", 21);
        students.add(student);
        students.add(student1);

        System.out.println(students);

        Map<String, Integer> map = new HashMap<>();
        map.put("Ivan", 20);
        map.put("Anna", 21);

        System.out.println(map.get("Ivan"));
    }
}
