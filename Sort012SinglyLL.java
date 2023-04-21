public class Sort012SinglyLL {
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

     void sortLL(){
        Node cur = head;
        int count0 = 0 , count1 = 0 , count2 = 0;
        while(cur != null) {
            if(cur.data == 0){
                count0++;
            }
            else if(cur.data == 1) {
                count1++;
            }
            else{
                count2++;
            }
            cur = cur.next;
        }

        cur=head;
        while(count0 != 0) {
            cur.data = 0;
            cur = cur.next;
            count0--;
        }
        while(count1 != 0) {
            cur.data = 1;
            cur=cur.next;
            count1--;
        }
        while(count2 != 0) {
            cur.data = 2;
            cur = cur.next;
            count2--;
        }
     }

     public static void main(String []args) {
        Sort012SinglyLL list = new Sort012SinglyLL();
        list.init();
        list.createHeadNode(0);
        list.addNode(2);
        list.addNode(2);
        list.addNode(2);
        list.addNode(2);
        list.addNode(0);
        list.addNode(0);
        list.addNode(1);
        list.addNode(1);
        list.addNode(1);
        list.display();
        System.out.println("\nSorting the list");
        list.sortLL();
        list.display();
     }

}
