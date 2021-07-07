package zoomLesson1.oop2;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {
        int[] marks = {10, 8, -30, 1000,50};
        String [] students = {"Alex", "ali", "Baba"};

        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(students));
    }
}
