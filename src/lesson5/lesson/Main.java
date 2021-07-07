package lesson5.lesson;


public class Main extends Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.variable1 = 0;
        animal.weight = 0;
        animal.voice();

        Animal cat = new Cat();
        cat.voice();
        test(animal);
    }

    public static void test(Animal animal) {
        animal.voice();
        if (animal instanceof Cat) {
            System.out.println("this is cat");
        }
        System.out.println("this is plain animal");

    }
}

