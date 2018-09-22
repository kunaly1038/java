package queue;

import java.util.*;


public class Queue{
    
    class stack{
        int data;
        stack next;
        public stack(int data){
            this.data = data;
            next = null;
        }
    }
    stack head = null;
    
    void push(int data){
        stack node = new stack(data);
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    
    void pop(){
        //head = head.next.next;
        stack node;
        node = head;
        head = node.next;
    }
    
    void printStack(){
        stack  node;
        if(head == null){
            System.out.println("Empty Stack");
        }
        else{
            node = head;
            while(node!=null){
                System.out.println(node.data);
                node = node.next;
            }
        }
    }
    
    public static void main(String... args){
        Queue q = new Queue();
        q.push(5);
        q.push(4);
        q.push(3);
        q.push(2);
        q.push(1);
        q.printStack();
        q.pop();
        q.pop();
        q.printStack();
    }
}
