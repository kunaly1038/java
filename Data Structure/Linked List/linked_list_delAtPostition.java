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
    public void insertAtBegin(int data){
        Node node = new Node(); 
        node.data = data;
        node.next = head;
        head = node;
    }
    public void insertAtPost(int index, int data){
        Node node =  new Node();
        Node n;
        node.data = data;
        n = head;
         if(index ==  0){
            insertAtBegin(data);
       }
         else{
        for(int i=0; i<index-1; i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
        }
    }
    public void deleteAtpost(int index){
        Node node = new Node();
        Node node2 = new Node();
        node = head;
        if(index == 0){
            head = head.next;
        }
        else{
            for(int i=0; i<index-1; i++){
                node = node.next;
            }
            node2 = node.next;
            node.next = node2.next;
            System.out.println(node2.data + " is being deleted.");
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
        list.insertAtBegin(25);
        list.insertAtBegin(18);
        list.insertAtBegin(45);
        list.insertAtBegin(12);
        list.insertAtBegin(5);
        list.insertAtPost(0, 9);
        list.deleteAtpost(2);
        list.printList();
    }
    
}
