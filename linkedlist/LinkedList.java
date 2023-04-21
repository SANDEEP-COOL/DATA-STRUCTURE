public class LinkedList{

	// global variable
	public static Node head=null;
	public static Node tail=null;

	class Node{
		int data;
		Node next;

		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}

	public void swapSecLatAndLastNode(){
		Node prev=null;
		Node temp=head;

		if(head==null){
			System.out.println("can't be Swapped , no node in list");
		}

		else if(temp.next==null) {
			System.out.println("can't be Swapped , only one node in list");
		}


		else{
			while(temp.next!=null && temp.next.next!=null){
				prev=temp;
				temp=temp.next;
			}
	
			Node ttemp=temp.next;
			prev.next=ttemp;
			ttemp.next=temp;
			temp.next=null;
		}

	}

	public void addNode(int data){
		Node temp=new Node(data);
		if(head==null){
			head=temp;
			tail=temp;
		}
		else{
			tail.next=temp;
			tail=temp;
		}
	}


	public void display(Node head){
		Node cur=head;
		
		while(cur!=null){
			System.out.print(cur.data+"\t");
			cur=cur.next;
		}
		// System.out.println("head = "+head+" and tail = "+tail);
		System.out.println();
	}

	public void addAtBegining(int data) {
	
		if(head==null){
			addNode(data);
			return;
		}

		Node temp=new Node(data);
		Node ref=head;
		head=temp;
		temp.next=ref;
	}

	public void addAtLast(int data) {
		if(head==null){
			addNode(data);
			return;
		}

		Node temp=new Node(data);
		tail.next=temp;
		tail=temp;
	}

	public int count(){
		Node cur=head;
		int count=0;
		while(cur!=null){
			count++;
			cur=cur.next;
		}
		return count;
	}

	public void addAtPosition(int data, int pos) {

		int count=count();

		if(pos>count+1 || pos<1){
			System.out.println("can't be add node!");
			return;
		}

		// at addAtBegining
		if(pos==1){
			addAtBegining(data);
			return;
		}

		// at addAtBegining
		if(pos==count+1){
			addAtLast(data);
			return;
		}

		// at addAtMiddle
		int i=1;
		Node cur=head;
		while(i < pos-1){
			cur=cur.next;
			i++;
		}
		Node temp=new Node(data);
		Node ref=cur.next;
		cur.next=temp;
		temp.next=ref;
	}

	public void deleteAtFirst(){

		if(head==null)
		return;

		head=head.next;
		if(head==null){
			tail=null;
		}
		return;
	}

	public void deleteAtLast(){
		if(head==null)
		return;

		Node cur=head;
		if(cur.next==null) {
			head=null;
			tail=null;
		}
		while(cur.next.next!=null){
			cur=cur.next;
		}
		cur.next=null;
		tail=cur;
	}

	public void deleteAtPostion(int pos) {

		//delete at first
		if(pos==1){
			// deleteAtFirst
		}


		//delete at last


		//at middle
		int i=1;
		Node cur=head;
		while(i<pos-1){
			cur=cur.next;
			i++;
		}
		cur.next=(cur.next).next;
	}

	public void delete(int pos){

		// at starting
		if(pos==1){
			if(head.next!=null){
				head=head.next;
				return;
			}
			else{
				head=null;
				return;
			}
		}
		


		//middle
		Node cur=head;
		int i=1;
		while(i<pos-1) {
			cur=cur.next;
			i++;
		}
		cur.next=cur.next.next;

		//at last
		if(pos==count()){
			i=1;
			cur=head;
			while(i<pos-1)	{
				cur=cur.next;
				i++;
			}
			cur.next=null;
			return;
		}
	}

	// can't maintain element's order
	public void split(){
		Node prev=head;
		Node temp=head;
		while(temp != null){
			// check 
			if(temp.data%2==0){
				int x=prev.data;
				prev.data=temp.data;
				temp.data=x;
				prev=prev.next;
			}
			temp=temp.next;
		}

	}

	// ye work kar ra ha sai se 
    public Node divide(Node head) {

		if(head==null || head.next==null) {
			return head;
		}

        Node firstListHead=null , secondListHead=null , tail1=null, tail2=null;
        Node temp=head, ttemp=null;
        // traverse main list
        while(temp!=null) {
            // check
            if(temp.data % 2==0) {
                //if even value
                if(firstListHead == null){
                    firstListHead=new Node(temp.data);
                    tail1=firstListHead;
                }
                else{
                    Node p=firstListHead;
                    while(p.next!=null){
                        p=p.next;
                    }
                    ttemp=new Node(temp.data);
                    p.next=ttemp;
                    tail1=ttemp;
                }
            }
			
            else {
                //if odd value
                if(secondListHead == null){
                    secondListHead=new Node(temp.data);
                    tail2=secondListHead;
                }
                else{
                    Node p=secondListHead;
                    while(p.next!=null){
                        p=p.next;
                    }
                    ttemp=new Node(temp.data);
                    p.next=ttemp;
                    tail2=ttemp;
                }
            }
			temp=temp.next;
        }
        
        // merge
        tail1.next=secondListHead;
        return firstListHead;
        
    }

	public static void main(String []args) {
		LinkedList list=new LinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(7);
		list.addNode(8);
		list.addNode(9);
		list.addNode(10);

		// list.display(head);
		// list.addAtBegining(50);
		// list.display(head);
		// list.addAtLast(60);
		// list.display(head);
		// list.addAtPosition(70 , 1);
		// list.display(head);
		// list.addAtPosition(80 , 4);
		// list.display(head);
		// list.addAtPosition(90 , 10);
		// list.display(head);
		// list.addAtPosition(90 , 0);
		// list.display(head);
		// list.deleteAtFirst();
		// list.display(head);
		// list.addNode(40);
		// list.deleteAtLast();
		// list.display(head);
		// list.addNode(40);
		// list.display(head);
		// list.delete(1);
		list.display(head);
		// list.split();
		// list.display(head);
		// // list.swapSecLatAndLastNode();
		// // list.display(head);

		// head=list.divide(head);
		// list.display(head);
	}
}