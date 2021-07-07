package lesson4.lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(55);
        arrayList.add(55);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int arr = iterator.next();
            System.out.println(arr);
        }

        List list = new ArrayList();
        list.add("hello");

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1.get(0));

        LinkedList<Integer> arrayList1 = new LinkedList<>();
        arrayList1.add(5);
        arrayList1.add(10);

        LinkedList<Integer> linkedList = new LinkedList<>();
        arrayList1 = new LinkedList<>(arrayList1);
        System.out.println(arrayList1);
        System.out.println(linkedList);

        ArrayList<String> stringArrayList = new ArrayList<>(10000);
        System.out.println("hello");
        System.out.println("hi");
        System.out.println();
        System.out.println(stringArrayList.size());

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(10);
        arrayList2.add(20);
        int i = arrayList2.indexOf(5);
        int i2 = arrayList2.indexOf(500);
        System.out.println(i + i2);

        LinkedList<String> list2 = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.offer(60);
        System.out.println(queue.element());
        System.out.println(list2);


    }
}

