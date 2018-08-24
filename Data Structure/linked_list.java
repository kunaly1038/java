class Linkedlist{
   Node head;
    class Node{
       int data;
       Node next;
      
    }
    public void insertList(int data){
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
        list.insertList(1);
        list.insertList(2);
        list.insertList(3);
        list.insertList(4);
        list.insertList(5);
        list.printList();
    }
    
}
