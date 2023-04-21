import java.util.*;
public class RemoveDupUnsotedLL66 {

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
        Node cur=head;
        Node prev=null;
        HashMap<Integer, String> hm=new HashMap<Integer, String>();
        while(cur != null) {

            Integer x = cur.data;

            //kya ye data map me already h ya ni , agar ha to..
            if(prev != null && hm.containsKey(x) == true) {
                prev.next = cur.next;
            }

            // agar ye data map me ni h to daal do... 
            else{
                hm.put(x," ");
                prev=cur;
            }

            cur=cur.next;
        }     
     }

     void removeDuplicates2Loops(){
        
        Node cur=head;
        Node prev=head;
        while(cur != null) {
            temp=cur.next;
            while(temp != null) {
                if(temp.data == cur.data) {
                    prev.next = temp.next;
                }
                else{
                    prev = temp;
                }

                temp = temp.next;
            }
            cur = cur.next;
        }
     }
    
     public static void main(String []args) {
        RemoveDupUnsotedLL66 list=new RemoveDupUnsotedLL66();
        list.init();
        list.createHeadNode(4);
        list.addNode(2);
        list.addNode(5);
        list.addNode(4);
        list.addNode(2);
        list.addNode(2);
        list.addNode(-1);
        
        list.display();
        System.out.println("\nAfter Removing Duplicates from LL");
        // list.removeDuplicates();
        list.removeDuplicates2Loops();
        list.display();
     }
}
