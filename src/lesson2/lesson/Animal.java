package lesson2.lesson;

public class Animal {
    String breed;
    int wait;
    int speed;
    int price;

    public Animal(String breed, int wait, int speed, int price) {
        this.breed = breed;
        this.wait = wait;
        this.speed = speed;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWait() {
        return wait;
    }

    public void setWait(int wait) {
        this.wait = wait;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", wait=" + wait +
                ", speed=" + speed +
                ", price=" + price +
                '}'+ "\n";
    }
}
