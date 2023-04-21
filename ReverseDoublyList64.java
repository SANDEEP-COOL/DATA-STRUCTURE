class ReverseDoublyList64{
	Node first, temp, ttemp;
	
	class Node{
		int data;
		Node next, prev;
	}
	
	public void init(){
		first=temp=ttemp=null;
	}
	
	public void createFirsrt(int data) {
		first=new Node();
		first.data=data;
		first.next=first.prev=null;
	}
	
	void addNode(int data){
		temp=first;
		while(temp.next!=null) {
			temp=temp.next;
		}
		ttemp=new Node();
		ttemp.next=null;
		ttemp.data=data;
		ttemp.prev=temp;
		temp.next=ttemp;
	}
	
	void display(){
		System.out.println("This is Doubly Linked List....");
		temp=first;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void reverse(Node cur, Node back){
		// base case
		if(cur == null){
			first=back;
			return;
		}
		
		Node forward=cur.next;
		cur.next=back;
		cur.prev=forward;
		reverse(forward, cur);
	}
	
	public static void main(String []args){
		ReverseDoublyList64 dl=new ReverseDoublyList64();
		dl.init();
		dl.createFirsrt(10);
		dl.addNode(20);
		dl.addNode(30);
		dl.addNode(40);
		dl.addNode(50);
		dl.display();
		System.out.println("This is Doubly Linked List in Reverse Order....");
		dl.reverse(dl.first, null);
		dl.display();
	}
}