package lesson5.Intr;

public class Main {
    public static void main(String[] args) {
        AnimalInterface dog = new Dog();
        AnimalInterface cat = new Cat();
        AnimalInterface parrot = new Parrot();
        parrot.run();
        cat.voice();
        dog.voice();
        parrot.voice();
        dog.run();
    }
}