package Stack;

import Queue.MyQueue;

public class MyStack {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int length;
    public MyStack(){
        top = null;
        length = 0;
    }

    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Khong co du lieu.");
            return;
        }
        int value = top.data;
        top = top.next;
        length--;
        System.out.println(value);
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("Stack: " + myStack.getLength());
        myStack.pop();
        System.out.println("Stack: " + myStack.getLength());
    }
}
