package lesson4.lesson;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<Human> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Human("Olga"));
        priorityQueue.add(new Human("Abram"));
        priorityQueue.add(new Human("Vasia"));
        System.out.println(priorityQueue);

        Iterator<Human> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            Human human = iterator.next();
            String name = human.getName();
            System.out.println(name);
        }

        for (Human human : priorityQueue) {
            System.out.println(human);
        }


    }
}

class  Human implements  Comparable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human: " +
                "name - " + name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
