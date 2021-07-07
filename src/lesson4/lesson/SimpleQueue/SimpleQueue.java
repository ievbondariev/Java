package lesson4.lesson.SimpleQueue;

import java.util.Queue;

public class SimpleQueue {
    private int maxSize;
    private  long[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public SimpleQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }
}

