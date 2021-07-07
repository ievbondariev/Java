package lesson2.lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog", 10, 50, 1000);
        Animal cat = new Animal("cat", 20, 40, 2000);
        Animal bird = new Animal("bird", 5, 80, 500);
        Animal [] animals = {dog, cat, bird};

       Arrays.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal t, Animal t1) {
                if (t.price == t1.price) {
                    return t.speed - t1.speed;
                } else {
                    return t.price - t1.price;
                }
            }
        });
        System.out.println(Arrays.toString(animals));

        Arrays.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal t, Animal t1) {
                return t.speed - t1.speed;
            }
        });

        System.out.println(Arrays.toString(animals));
        Arrays.sort(animals, new ComparatorByPrice());
        System.out.println(Arrays.toString(animals));

        Arrays.sort(animals, new ComparatorByBreed());
        System.out.println(Arrays.toString(animals));
    }
}

