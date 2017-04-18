package com.hy.dataStructure;


/**
 * Created by 黄宇 on 2017/4/17.
 */
public class Stack {
    public Node head;
    public Node currenct;
    public void push(int data) {
        if (head == null) {
            head = new Node(data);
            currenct = head;
        } else {
            Node node = new Node(data);
            node.pre = currenct;
            currenct = node;
        }
    }

    public Node pop() {
        if (currenct == null) {
            return null;
        }
        Node node = currenct;
        currenct = currenct.pre;
        return node;
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
    }


    class Node {
        int data;
        Node pre;

        public Node(int data) {
            this.data = data;
        }
    }
}
