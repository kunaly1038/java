package linkedlist;

class Linkedlist{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void printList(){
        Node n =head;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
    public static void main(String [] args){
        Linkedlist lk = new Linkedlist();
        lk.push(3);
        lk.push(5);
        lk.push(4);
        lk.push(3);
        lk.push(2);
        lk.printList();
    }
}
