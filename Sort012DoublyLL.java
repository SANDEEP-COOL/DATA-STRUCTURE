public class Sort012DoublyLL {
    Node head, temp, ttemp;
    class Node{
        int data;
        Node prev, next;
    }

    void init(){
        head=temp=ttemp=null;
    }

    void createHeadNode(int data) {
        head = new Node();
        head.data = data;
        head.next = null;
        head.prev = null;
    }

    void addNode(int data) {
        temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        ttemp = new Node();
        ttemp.data = data;
        ttemp.next = null;
        ttemp.prev = temp;
        temp.next = ttemp;
    }

    void display(){
        System.out.println("This is Doubly Linked List....");
        temp = head;
        while(temp != null) {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
    }

    void sort012(){

        System.out.println("\nAfter sorting zeros, ones and tows");

        // setup of low and mid in startingNode and high in last Node 
        Node low = head;
        Node mid = head;
        Node high = head;

        while(high.next != null) {
            high = high.next;
        }

        // jab tak mid high se bada ni hota tab tak loop chalate raho 
        while(high.next != mid) {

            if(mid.data == 0) {
                swap(mid, low);
                mid = mid.next;
                low = low.next;
            }
            else if(mid.data == 1) {
                mid = mid.next;
            }
            else if(mid.data == 2) {
                swap(mid,high);
                high = high.prev;
            }

        }
    }

    void swap(Node x, Node y) {
        int temp = x.data;
        x.data = y.data;
        y.data = temp; 
    }

    public static void main(String []args) {
        Sort012DoublyLL list = new Sort012DoublyLL();
        list.init();
        list.createHeadNode(0);
        list.addNode(2);
        list.addNode(2);
        list.addNode(2);
        list.addNode(0);
        list.addNode(1);
        list.addNode(1);
        list.display();
        list.sort012(); 
        list.display();
    }
}
