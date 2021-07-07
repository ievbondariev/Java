package lesson5.intoduction;

public class Equal {
    public static void main(String[] args) {
        String firstStringToTestEquals = "My test String";
        String firstStringToTestEquals2 = "My test String";
        String secondStringToTestEquals = "my test string";

        boolean isEqualFirstStringToSecondString = firstStringToTestEquals.equals(secondStringToTestEquals); // - не будут счиатться одинаковыми, так как разный регистр;
        boolean isEqualSecondStringToSameFirstButAnotherObjectString = firstStringToTestEquals.equals(firstStringToTestEquals2);

        boolean isEqualFirstStringToSecondStringIgnoreCase = firstStringToTestEquals.equalsIgnoreCase(firstStringToTestEquals2); // equalsIgnoreCase - игнорирует регистр (большая или маленькая буква);

        System.out.println("Boolean result 1: " + isEqualFirstStringToSecondString);
        System.out.println("Boolean result 2: " + isEqualSecondStringToSameFirstButAnotherObjectString);
        System.out.println("Boolean result 3: " + isEqualFirstStringToSecondStringIgnoreCase);

    }
}
