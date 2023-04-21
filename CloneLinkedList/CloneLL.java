public class CloneLL {

    Node head,temp,ttemp;
    class Node{
        int data;
        Node next;
        Node random;
    }

    void init(){
        head=temp=ttemp=null;
    }

    void createHeadNode(int d){
        head=new Node();
        head.next=head.random=null;
        head.data=d;
    }

    void addNode(int d){
        temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        ttemp=new Node();
        ttemp.next=ttemp.random=null;
        ttemp.data=d;
        temp.next=ttemp;
    }


    void display(){
        System.out.println("This is Linked List....");
        temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    void displaybyrandom(){
        System.out.println();
        System.out.println("This is Linked List....");
        temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.random;
        }
    }

    void randomPointing(int x, int y){
        Node temp=ttemp=head;
        while(temp.data != x){
            temp=temp.next;
        }
        while(ttemp.data != y){
            ttemp=ttemp.next;
        }
        temp.next=ttemp;
    }

    public static void main(String []args) {

        CloneLL list=new CloneLL();
        list.init();
        list.createHeadNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.display();
        list.randomPointing(1,3);
        list.randomPointing(2,1);
        list.randomPointing(2,5);
        list.randomPointing(4,3);
        list.randomPointing(5,2);

        list.displaybyrandom();

    }
} 
