package zoomLesson1.hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        HashSet<Human> hashSet = new HashSet();
        hashSet.add(human);

//        List<String> arrayList = new ArrayList();
//        arrayList.add("hello");
//        arrayList.add("50");


        List<String> list = new ArrayList<>();
        list.add("5");
        list.add("test");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();

        }
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            String var = stringListIterator.next();
            System.out.println(var);
        }

    }
}


class Human {

}