package lesson2.lesson;

import java.util.Comparator;

public class ComparatorByBreed implements Comparator<Animal> {
    @Override
    public int compare(Animal animal, Animal t1) {
        return animal.getBreed().compareTo(t1.getBreed());
    }
}
