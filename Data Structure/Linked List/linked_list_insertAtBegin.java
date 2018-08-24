package linkedlist;

class Linkedlist{
   Node head;
    class Node{
       int data;
       Node next;
      
    }
    public void insertAtBegin(int data){
        Node node = new Node(); 
        node.data = data;
        node.next = head;
        head = node;
    }
    
    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
    public static void main(String [] args){
        Linkedlist list = new Linkedlist();
        list.insertAtBegin(1);
        list.insertAtBegin(2);
        list.insertAtBegin(3);
        list.insertAtBegin(4);
        list.insertAtBegin(5);
        list.printList();
    }
    
}
