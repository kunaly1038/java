package linkedlist;

import java.util.Scanner;

class Linkedlist{
    static Scanner sc = new Scanner(System.in);
    int count = 0;
    class Node{
        int data;
        Node next;
    }
    Node head;
    
    public void insertAtBegin(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    
    public void insertAtEnd(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node node2 = new Node();
        if(head == null)
            head =  node;
        else{
            node2 = head;
            while(node2.next!=null){
                node2 = node2.next;
            }
            node2.next = node;
        }
    }
    
    public void insertAtIndex(int index, int data){
        Node node = new Node();
        Node node2 = new Node();
        node.data = data;
        node.next = null;
        Node node3 = new Node();
        if(index == 0){
            insertAtBegin(data);
        }
        else{
            node2 = head;
            for(int i=0; i<index-1; i++){
                node2 = node2.next;
            }
            node3.next = node2.next;
            node2.next = node;
            node.next = node3.next;
        }
    }
    
    public void deleteAtBegin(){
        Node node = new Node();
        if(head == null)
            System.out.println("List is Empty.");
        else
            head = head.next;
    }
    
    public void deleteAtEnd(){
        Node node = new Node();
        Node node2 = new Node();
        node2 = head;
        if(head == null)
            System.out.println("List is Empty.");
        else{
           while(node2.next!=null){
               node = node2;
               node2 = node2.next;
           } 
           node.next = null;
        }
    }
    
    public void deleteAtIndex(int index){
        Node node = new Node();
        Node node2 = new Node();
        if(head == null)
            System.out.println("List is Empty.");
        else{
            node = head;
            for(int i=0; i<index-1; i++){
                node = node.next;
            }
            node2 = node.next;
            node.next =  node2.next;
        }
    }
    
    public void printList(){
        Node node = new Node();
        node = head;
        while(node!=null){
            System.out.print(node.data+" ");
            node =  node.next;
        }
    }
    
    public void listSize(){
        Node node = new Node();
        node = head;
        while(node!=null){
            node = node.next;
            count++;
        }
        System.out.println("The size of List is :"+count);
    }
   
    static public int enterChoice(){
        int choice;
        System.out.println("Enter your choice :");
        System.out.println("1:Insert At Begin of the List");
        System.out.println("2:Insert At End of the List");
        System.out.println("3:Insert At Position of the List");
        System.out.println("4:Delete At Begin of the List");
        System.out.println("5:Delete At End of the List");
        System.out.println("6:Delete At Position of the List");
        System.out.println("7:Get the Size of the List");
        System.out.println("8:Print the List");
        System.out.println("9:Press 9 to exit");
        choice = sc.nextInt();
        return choice;
    }
    public static void main(String [] a){
        Linkedlist List = new Linkedlist();
        int data, index;
        while (true){
            switch(enterChoice()){
                case 1:
                    System.out.println("Enter the Data :");
                    data = sc.nextInt();
                    List.insertAtBegin(data);
                    break;
                case 2:
                    System.out.println("Enter the Data :");
                    data = sc.nextInt();
                    List.insertAtEnd(data);
                    break;
                case 3:
                    System.out.println("Enter the Data :");
                    data = sc.nextInt();
                    System.out.println("Enter the index :");
                    index = sc.nextInt();                   
                    List.insertAtIndex(index, data);
                    break;
                case 4:
                    List.deleteAtBegin();
                    break;
                case 5:
                    List.deleteAtEnd();
                    break;
                case 6:
                    System.out.println("Enter the Index :");
                    index = sc.nextInt();
                    List.deleteAtIndex(index);
                    break;
                case 7:
                    List.listSize();
                    break;
                case 8:
                    List.printList();
                    break;
                case 9:
                    System.out.println("You choose to Exit.");
                    System.exit(9);
                
            }
        }
    }
}
