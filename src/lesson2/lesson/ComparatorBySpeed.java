package lesson2.lesson;

import java.util.Comparator;

public class ComparatorBySpeed implements Comparator<Animal> {
    @Override
    public int compare(Animal animal, Animal t1) {
        return animal.getSpeed() - t1.getSpeed();
    }
}