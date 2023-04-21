public class MergeSortLinkedList {
    
    // global variable 
    Node first, temp, ttemp, left, right , ans;
    class Node{
        int data;
        Node next;
    }

    void init(){
        first=temp=ttemp=left=right=ans=null;
    }

    Node createHeadNode(int data, Node head) {
        head=new Node();
        head.data=data;
        head.next=null;
        return head;
    }

    Node addNode(int data, Node p) {
        temp=p;
        while(temp.next != null) {
            temp=temp.next;
        }

        ttemp=new Node();
        ttemp.data=data;
        ttemp.next=null;
        temp.next=ttemp;

        return p;
    }

    void display(Node p){
        // System.out.println("This is original Linked List....");
        temp=p;
        while(temp!=null) {
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
    }

    Node findMid(Node head) {
        Node slow=head , fast = head.next;
        while(fast != null && fast.next != null)     {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    Node merge(Node first, Node second) {
        Node temp = first;
        Node ttemp = second;
        int i = 0;

        // agar dono list null hai 
        if(temp == null && ttemp == null) {
            return null;
        }

        // agar first list null nahi hai , second list null hai 
        else  if(temp != null && ttemp==null) {
            ans = temp;
            return temp;
        }

        // agar first list null hai , second list null hai h 
        else if(temp == null && ttemp != null) {
            ans = ttemp;
            return ttemp;
        }

        // jab tak dono list ke nodes bache ho 
        while(temp!=null && ttemp!=null) {
            i=i+1;
            if(temp.data < ttemp.data) {
                if(i == 1)
                ans=createHeadNode(temp.data, ans);
                else
                ans=addNode(temp.data, ans);

                temp = temp.next;
            }
            else{
                if(i == 1) 
                ans=createHeadNode(ttemp.data, ans);
                else 
                ans=addNode(ttemp.data, ans);

                ttemp = ttemp.next;
            }
        }

        // agar kisi list ke nodes bache hai to unhe bhi merge kar do 
        while(temp!=null) {
                ans=addNode(temp.data, ans);
                temp = temp.next;
        }

        while(ttemp!=null) {
            ans=addNode(ttemp.data, ans);
            ttemp = ttemp.next;
        }

        return ans;
    }


    Node mergeSort(Node head){

        // base case 
        if(head == null || head.next == null) {
            return head;
        }
        

        // break the list into two halfs
        Node mid=findMid(head);
        Node left=head;
        Node right=mid.next;

        // don't forget to assign null after mid , because this is ending point of list (it's starting from left)
        mid.next=null;

        // recursive calls
        left=mergeSort(left);
        right=mergeSort(right);

        // merge them
        Node result=merge(left, right);

        return result;
    }


    public static void main(String []args) {
        MergeSortLinkedList list=new MergeSortLinkedList();
        list.init();
        list.first=list.createHeadNode(3,list.first);
        list.first=list.addNode(5,list.first);
        list.first=list.addNode(4,list.first);
        list.first=list.addNode(2,list.first);
        list.first=list.addNode(1,list.first);

        list.display(list.first);

        list.mergeSort(list.first);

        list.display(list.ans);
    }

}
