package com.hy.dataStructure;

/**
 * Created by 黄宇 on 2017/4/17.
 */
public class Queue {
    public Node head;
    public Node current;
    public void add(int data){
        if(head == null){
            head = new Node(data);
            current = head;
        }else{
            Node node = new Node(data);
            current.next = node;
            current = node;
        }
    }

    public int pop() throws Exception{
        if(head == null){
            throw new Exception("Queue is Empty!");
        }
        Node node = head;
        head = head.next;
        return node.data;
    }

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        //入队操作
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }

        //出队操作
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
}
