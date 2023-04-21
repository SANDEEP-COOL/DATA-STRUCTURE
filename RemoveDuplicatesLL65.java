public class RemoveDuplicatesLL65{
   
    // global variable 
    Node head, temp, ttemp;
    class Node{
        int data;
        Node next;
    }

    void init(){
        head=temp=ttemp=null;
    }

    void createHeadNode(int data) {
        head=new Node();
        head.data=data;
        head.next=null;
    }

    void addNode(int data) {
        temp=head;
        while(temp.next != null) {
            temp=temp.next;
        }

        ttemp=new Node();
        ttemp.data=data;
        ttemp.next=null;
        temp.next=ttemp;
    }

    void display(){
        // System.out.println();
        temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
    }

    void removeDuplicates(){
        temp=head;

        // traverse the whole linkedlist 
        while(temp != null && temp.next != null) {
            ttemp=temp.next;

            // get ttemp to that data which is different from temp.data
            while(ttemp != null && ttemp.data == temp.data) {
                ttemp=ttemp.next;
            } 
            temp.next=ttemp;
            temp=ttemp;
        }
    }

    void removeDuplicatesRec(Node head) {
        // base case 
        if(head == null || head.next == null) {
            return;
        }

        temp=head;
        ttemp=temp.next;
        while(ttemp != null && temp.data == ttemp.data) {
            ttemp=ttemp.next;
        }
        temp.next=ttemp;
        removeDuplicatesRec(ttemp);
    }

    public static void main(String []args) {
        RemoveDuplicatesLL65 list =  new RemoveDuplicatesLL65();
        list.init();
        list.createHeadNode(1);
        list.addNode(1);
        list.addNode(1);
        list.addNode(1);
        list.addNode(1);
        list.addNode(1);
        list.addNode(3);

        list.addNode(3);

        list.addNode(2);

        list.addNode(2);

        list.addNode(2);

        list.addNode(2);
        list.display();

        // System.out.println("\nafter removing duplicates from ll"); 
        // list.removeDuplicates();
        // list.display();
        System.out.println("\nafter removing duplicates from ll"); 
        list.removeDuplicatesRec(list.head);
        list.display();

    }

}