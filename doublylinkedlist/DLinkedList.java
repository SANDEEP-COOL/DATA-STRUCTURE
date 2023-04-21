package doublylinkedlist;

public class DLinkedList {
    
    public Node head=null;
    public Node tail=null;

    //node
    class Node{
        Node prev=null;
        int data;
        Node next=null;

        public Node(int data) {
            this.data=data;
            next=null;
            prev=null;
        }
    }

    public void addNodeAtLast(int data){
        Node temp=new Node(data);

        // head is null 
        if(head==null) {
            head=temp;
            tail=temp;
            return;
        }

        // only one node present , or more then one
        Node cur=head;
        while(cur.next != null){
            cur=cur.next;
        }
        cur.next=temp;
        temp.prev=cur;
        tail=temp;
        return;
    }
   
    public void printList(){
        System.out.println("Printing in Normal order");
        Node cur=head;
        if(cur==null){
            System.out.print("No node exist!");
        }
        while(cur != null){
            System.out.println(cur.data);
            cur=cur.next;
        }
        return;
    }

    public void printListBack(){
        System.out.println("Printing in Reverse order");
        Node cur=tail;
        while(cur!=null) {
            System.out.println(cur.data);
            cur=cur.prev;
        }
    }


    public int length(){
        int count=1;
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
            count++;
        }
        System.out.println("count is : "+count);
        return count;
    }

    public void addAtHead(int data) {
        Node temp=new Node(data);
        Node cur=head;
        if(cur==null) {
            addNodeAtLast(data);
            return;
        }
    
        else if(cur!=null) {
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }

    public void addAtPosition(int data, int pos) {
        if(pos >= 1 && pos <=4) {
            if(pos==1){
                addAtHead(data);
                return;
            }
            else if(pos==length()){
                addNodeAtLast(data);
                return;
            }
            else{
                int i=1;
                Node cur=head;
                while(i < pos-1){
                    cur = cur.next;
                    i++;
                }
                Node temp=new Node(data);
                Node p=cur.next;
                cur.next=temp;
                temp.prev=cur;
                temp.next=p;
                p.prev=temp;
            }
        }

    }

    public void deleteAtPosition(int pos) {

        if(head==null) {
            System.out.println("list is blank , no node is exist!");
            return;
        }

        //if only one node presented
        if( (pos==1 || pos== length()) && (head.next==null) ){
            head=tail=null;
            return;
        }


        //at first , more then one node present
        if(pos==1){
            head=head.next;
            return;
        }

        //at last , more then one node present
        System.out.println("length = "+length());
        if(pos==length()){
            
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            return;
        }


        //at middle , more then one node present
        else{
            int i=1;
            Node prevNode=null , temp=head;
            while(i!=pos){
                prevNode=temp;
                temp=temp.next;
                i++;
            }
            Node p = temp.next;
            prevNode.next=p;
            p.prev=prevNode;
        }
        
    }

    public static void main(String []args) {
        DLinkedList dl=new DLinkedList();
        // dl.addNodeAtLast(10);
        // dl.addNodeAtLast(20);
        // dl.addNodeAtLast(30);
        // dl.addNodeAtLast(40);
        // dl.printList();
        // dl.printListBack();
        // System.out.println(dl.length());
        dl.addAtHead(50);
        dl.addAtHead(60);
        dl.addAtHead(70);
        dl.printList();
        // dl.addAtPosition(80, 2);
        // dl.printList();
        // dl.addAtPosition(90, 1);

        // this line was giving NullPointerException , don't know why ?
        // dl.addAtPosition(100, 4);
        // dl.printList();    

        dl.deleteAtPosition(3);
        dl.printList();

        System.out.println("head = "+dl.head.data+" , "+dl.tail.data);

    }
}
