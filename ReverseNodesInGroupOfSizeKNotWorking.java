public class ReverseNodesInGroupOfSizeKNotWorking{
    Node first, temp, ttemp;
    class Node{
        int data;
        Node next;
    }
    void init(){
        first=temp=ttemp=null;
    }
    void createFirst(int data) {
        first=new Node();
        first.data=data;
        first.next=null;
    }
    void addNode(int data) {
        temp=first;
        while(temp.next != null) {
            temp=temp.next;
        }
        ttemp=new Node();
        ttemp.data=data;
        ttemp.next=null;
        temp.next=ttemp;
    }
    void display(Node temp) {
        if(temp == null){
            return;
        }

        System.out.print(temp.data+" ");
        display(temp.next);
    }
    public Node reverseNodes(Node temp, int k){
        // base case 
        if(temp == null) {
            return null;
        }

        // you just think that , how will you reverse first two nodes 
        Node cur=first, prev=null, next=null;
        int count=0;
        while(cur != null && count < k) {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            count++;
        }

        // baaki ka kaam recusrion dekh lega
        if(next != null) {
            first.next=reverseNodes(next, k);
        }
        

        // at the end return the head of reversed linkedlist 
        return prev;
    }
    public static void main(String []args) {
        ReverseNodesInGroupOfSizeKNotWorking list=new ReverseNodesInGroupOfSizeKNotWorking();
        list.init();
        list.createFirst(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.display(list.first);
        list.first=list.reverseNodes(list.first, 2);
    }
}