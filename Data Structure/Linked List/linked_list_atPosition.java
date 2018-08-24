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
        list.insertAtPost(5, 9);
        list.printList();
    }
    
}
