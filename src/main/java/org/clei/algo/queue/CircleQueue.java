package org.clei.algo.queue;

public class CircleQueue {
    private String[] items;
    private int n;
    private int head;
    private int tail;

    public CircleQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }
    public boolean enqueue(String item){
        if((tail + 1) % n == head ) return false;
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }
    public String dequeue(){
        if(head == tail) return null;
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }
    public void printAll(){
        if(0 == n) return;
        for(int i = head; i % n != tail; i = (i + 1) % n){
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}

