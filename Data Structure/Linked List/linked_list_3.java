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
    public void atBegin(int new_data){
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
        lk.atBegin(3);
        lk.atBegin(5);
        lk.atBegin(4);
        lk.atBegin(3);
        lk.atBegin(2);
        lk.printList();
    }
}
