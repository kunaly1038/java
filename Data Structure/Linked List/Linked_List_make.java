class LinkedList{
	Node head;
	int size=0;
	class Node{
		int data;
		Node next;
	}	

	public void insertBegin(int data){
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;	
	}
	public void insertLast(int data) {
		Node node = new Node();
		Node node2 = new Node();
		node.data = data;
		if(head == null)
			head = node;
		else {
			node2 = head;
			while(node2.next!=null) {
				node2 = node2.next;
			}
			node2.next = node;
			
		}
	}
	public void insertAt(int index, int data) {
		Node node = new Node();
		Node node2 = new Node();
		node.data = data;
		node2 = head;
		if(index == 0) {
			insertBegin(data);
		}
		else {
			for(int i =0; i<index-1; i++) {
				node2 = node2.next;
			}
			node.next = node2.next;
			node2.next = node;
		}
	}
	public void deleteBegin() {
		Node node = new Node();
		node = head;
		head = node.next;
	}
	public void deleteLast() {
		Node node = new Node();
		node = head;
		int size = listSize();
		for(int i=1; i<size-1; i++) {
			node = node.next;
		}
		node.next =null;
	}
	public int listSize() {
		Node node = new Node();
		node = head;
		while(node!=null) {
			node = node.next;
			size++;
		}
		return (size);
	}
	public void printList(){
		Node node = new Node();
		node = head;
		while(node != null){
			System.out.println(node.data+"");
			node = node.next;
		}
	}
	public static void main(String [] a){
		LinkedList List = new LinkedList();
		List.insertBegin(1);
		List.insertBegin(2);
		List.insertBegin(3);
		List.insertBegin(4);
		List.insertBegin(5);
		List.insertLast(6);		
		List.insertLast(7);
		List.insertLast(8);
		List.insertLast(9);
		List.insertAt(3, 99);
		//List.deleteBegin();
		List.deleteLast();
		List.printList();
	}
}
