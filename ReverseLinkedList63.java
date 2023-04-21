class ReverseLinkedList63{
	Node first, temp, ttemp;
	class Node{
		int data;
		Node next;
	}
	
	public void init(){
		first=temp=ttemp=null;
	}
	
	public void createFirst(int data){
		first=new Node();
		first.data=data;
		first.next=null;
	}
	
	public void addNode(int data) {
		temp=first;
		while(temp.next != null) {
			temp=temp.next;
		}
		ttemp=new Node();
		ttemp.data=data;
		ttemp.next=null;
		temp.next=ttemp;
	}
	
	public void display(){
		System.out.println("This is the Linked List");
		temp=first;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void reverse(Node cur, Node prev){
		// base case
		if(cur==null){
			// assign last node address into head
			first=prev;
			return;
		}
		
		Node p=cur.next;
		cur.next=prev;
		reverse(p, cur);
	}
	
	public static void main(String args[]) {
		ReverseLinkedList63 list=new ReverseLinkedList63();
		list.init();
		list.createFirst(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
		list.display();
		System.out.println("After Reversing Order");
		list.reverse(list.first, null);
		list.display();
	}
}