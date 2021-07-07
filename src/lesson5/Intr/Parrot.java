package lesson5.Intr;

public class Parrot implements AnimalInterface {


    @Override
    public void run() {
        System.out.println("run parrot");
    }

    @Override
    public void voice() {
        System.out.println("Voice parrot");
    }
}
