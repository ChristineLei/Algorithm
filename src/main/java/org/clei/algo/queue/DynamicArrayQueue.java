package org.clei.algo.queue;

public class DynamicArrayQueue {
    private String[] items;
    private int n;
    private int head;
    private int tail;

    public DynamicArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }
    public boolean equeue(String value){
        if (tail == n){
            if(head == 0) return false;
            for(int i = head; i < tail; ++i){
                items[i-head] = items[head];
            }
            tail -= head;
            head = 0;
        }
        items[tail] = value;
        tail++;
        return true;
    }

    public String dequeue(){
        if(head == 0) return null;
        String ret = items[head];
        ++head;
        return ret;
    }
    public void printAll(){
        for(int i = head; i < tail; ++i){
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}
