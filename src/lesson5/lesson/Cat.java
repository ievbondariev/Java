package lesson5.lesson;


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
