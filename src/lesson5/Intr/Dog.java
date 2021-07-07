package lesson5.Intr;

public class Dog extends AbstractAnimal implements AnimalInterface {

    @Override
    public void voice() {
        System.out.println("voice dog");
    }
}
