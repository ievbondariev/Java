package zoomLesson1.Animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Sphynx", 1000));
        animals.add(new Animal("Malamut", 2000));
        animals.add(new Animal("Maincoon", 3000));

        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal);

            iterator.remove();
            System.out.println(animals);
        }

        Animal sphynx = new Animal("Sphynx", 1000);
        Animal malamut = new Animal("Malamut", 2000);
        Animal maincoon = new Animal("Maincoon", 3000);

        Animal[] animal = {sphynx, malamut, maincoon};

        Arrays.sort(animal);
        System.out.println(Arrays.toString(animal));
    }
}
