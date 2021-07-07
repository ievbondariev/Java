package lesson6.lesson.Generics;

import java.util.List;

public class Sample {
    public static <T> Object getFirst(List<? super T> list) {
        return list.get(0); // compile-time error
    }

}