package lesson5.lesson;

public class Animal {
    private static final String VARIABLE = "CONST";
    private int height;
    int weight;
    protected int variable1;
    public int variable2;

    public static String getVARIABLE() {
        return VARIABLE;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getVariable1() {
        return variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public void voice() {
        System.out.println("gav gav");
    }
}
