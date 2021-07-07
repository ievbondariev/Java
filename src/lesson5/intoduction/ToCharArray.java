package lesson5.intoduction;

import java.util.Arrays;

public class ToCharArray {
    public static void main(String[] args) {

//      name.toCharArray(); // - преобразовует стринг в массив символов (чаров);

        String myString = new String("My test data String");
        char[] myStringCharArray = myString.toCharArray();

        System.out.println("myStringCharArray value: ");
        System.out.println(Arrays.toString(myStringCharArray));
    }
}
