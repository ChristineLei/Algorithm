package org.clei.algo.queue;
#Array Queue sorting
public class ArrayQueue {
    private String[] items;
    private int n;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }
    public boolean enqueue(String item){
        if(tail == n) return false;
        items[tail] = item;
        ++tail;
        return true;
    }

    public String dequeue(){
        if(head == tail) return null;
        String ret = items[head];
        ++head;
        return ret;
    }
    public void printAll(){
        for(int i = head; i < tail; ++i){
            System.out.print(items[i] + "  ");
        }
        System.out.println();
    }

}
