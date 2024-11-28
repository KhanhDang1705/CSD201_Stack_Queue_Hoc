package Queue;

import Stack.MyStack;

public class MyQueue {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int length;

    public MyQueue(){
        front = null;
        rear = null;
        length = 0;
    }

    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Khong co du lieu.");
            return;
        }
        int value = front.data;
        front = front.next;
        length--;
        if (isEmpty()){
            rear = null;
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        System.out.println("Queue: " + myQueue.getLength());
        myQueue.dequeue();
        System.out.println("Queue: " + myQueue.getLength());
    }
}
