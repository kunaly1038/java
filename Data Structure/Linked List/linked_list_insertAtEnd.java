class Linkedlist{
   Node head;
    class Node{
       int data;
       Node next;
      
    }
    public void insertAtEnd(int data){
        Node node =new Node();
        node.data = data;
        if(head ==  null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
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
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.printList();
    }
    
}
