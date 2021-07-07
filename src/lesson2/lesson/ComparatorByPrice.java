package lesson2.lesson;

import java.util.Comparator;

public class ComparatorByPrice  implements Comparator<Animal> {
    @Override
    public int compare(Animal animal, Animal t1) {
        return animal.getPrice() - t1.getPrice();
    }
}
