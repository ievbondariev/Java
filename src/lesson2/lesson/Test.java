package lesson2.lesson;

import java.util.Objects;

public class Test {

    public static void main(String[] args) {
        A a = new A();
        A b = new A();

//        Integer a = 128;
//        Integer b = 128;
//        Integer c = 200;
//        Integer d = 200;

        System.out.println(a.equals(b));
//        System.out.println(c.equals(d));


    }
}

class A {
    private int field = 200;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return field == a.field;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}

