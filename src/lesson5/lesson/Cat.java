package lesson5.lesson;

import lesson5.lesson.Animal;

public class Cat extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("mau mau");
    }
    private int voice(int i) {
        return i;
    }

}
