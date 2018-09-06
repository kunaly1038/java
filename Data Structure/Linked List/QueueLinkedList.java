
package queue;

import java.util.Scanner;

public class Queue {
    static Scanner sc = new Scanner(System.in);
    public class Node{
        int data;
        Node next;
    }
    Node head;
    
    void enqueue(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    
    void dequeue(){
        Node node = new Node();
        Node node2 = new Node();
        node = head;
        if(size() == 0){
            head = null;
        }
        else{
            while(node.next!=null){
            node2 = node;
            node = node.next;
        }
        node2.next = null;
        }
    }
    
    void printQueue(){
        Node node = new Node();
        node = head;
        if(head == null){
            System.out.println("Queue is Empty.");
        }
        else{
            while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        }
        System.out.println("");
    }
    
    int size(){
        int count = 0;
        Node node = new Node();
        node = head;
        while(node.next!=null){
            node = node.next;
            count ++;
        }
        return count;
    }
    static int userChoice(){
        int choice = 0;
        System.out.println("1:Enqueue");
        System.out.println("2:dequeue");
        System.out.println("3:Print Queue");
        System.out.println("4:Size");
        System.out.println("6:To exit");
        System.out.println("Enter You choice:");
        return (choice=sc.nextInt());
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        while(true){
            switch(userChoice()){
                case 1:
                    System.out.println("Enter the data");
                    int data = sc.nextInt();                    
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.printQueue();
                    break;
                case 4:
                    System.out.println("The size of Queue :"+q.size());
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
    
}
