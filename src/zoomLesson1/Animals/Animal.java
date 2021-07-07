package zoomLesson1.Animals;

public class Animal implements Comparable<Animal> {
    private String breed;
    private int price;

    @Override
    public int compareTo(Animal o) {
        return breed.compareTo(o.getBreed());
    }

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}