package org.clei.alo.queue;

public class QueueBasedOnLinkedList {

    private Node head;
    private Node tail;

    private void enqueue(String data){
        if(tail == null){
            Node newNode = new Node(data, null);
            head = newNode;
            tail = newNode;
        } else {
            tail.next = new Node(data, null);
            tail = tail.next;
        }
    }
    private String dequeue(){
        if(head == null) return null;
        String value = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return value;
    }
    private void printAll(){
        Node p = head;
        while (p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }


    private static class Node{
        private String data;
        private Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
        public String getData(){
            return data;
        }
    }
}
