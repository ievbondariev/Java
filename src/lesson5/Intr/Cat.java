package lesson5.Intr;

public class Cat extends AbstractAnimal implements AnimalInterface {

    @Override
    public void voice() {
        System.out.println("voice cat");
    }
}
