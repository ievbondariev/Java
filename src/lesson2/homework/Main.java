package lesson2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Anna", "Coval", 21, 4, 40));
        students.add(new Student("Petr", "Kinaev", 25, 3, 55));
        students.add(new Student("Vasil", "Ivanov", 19, 2, 46));
        System.out.println(students);

        Collections.sort(students);
        System.out.println("Sort students by Average Mark");
        System.out.println(students);
    }

    public static int compare(Student o1, Student o2) {
        String o1Name = o1.getName();
        String o2Name = o2.getName();
        return o1Name.compareTo(o2Name);


//            System.out.println("Sort students by Name");
//            System.out.println(students);
        }

}