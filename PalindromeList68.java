public class PalindromeList68 {
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

    String makeNum2(Node head) {
        // base case 
        if(head == null)
            return "";

        int data = head.data;
        return makeNum2(head.next)+data;
    }

    void checkPalindrome(Node head) {
        String strNum1 = "";
        temp=head;
        while(temp!=null){
            strNum1 = strNum1+temp.data;
            temp = temp.next;
        }

        String strNum2 = makeNum2(head);

        // System.out.println(strNum1+"  "+strNum2);

        if(strNum1.equals(strNum2)){    
            System.out.println("It is Palindriome Linked List....");
        }
        else{
            System.out.println("It is Not Palindrome Linked List....0");
        }
    }

    Node findMiddileNode(Node head) {
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    Node reverse(Node head) {
        Node cur=head;
        Node prev=null;
        Node next=null;

        while(cur!=null) {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }

    void checkPalindrome1(Node head) {
        // step1 -> find middle Node 
        Node mid=findMiddileNode(head);
        
        // step -> reverse the second half 
        mid.next = reverse(mid.next);

        // step -> 3 compare 
        temp=head;
        ttemp=mid.next;
        while(ttemp!=null){
            if(temp.data != ttemp.data){
                System.out.println("This is not Palindrome List...");
                mid.next=reverse(mid.next);
                return;
            }
            temp=temp.next;
            ttemp=ttemp.next;
        }

        mid.next=reverse(mid.next);
        System.out.println("This is Palindrome List....");
    }

    public static void main(String []args) {
        PalindromeList68 list=new PalindromeList68();
        list.init();
        list.createHeadNode(1);
        // list.addNode(2);
        // list.addNode(2);
        // list.addNode(2);
        // list.addNode(1);
        list.display();
        // list.checkPalindrome(list.head);
        list.checkPalindrome1(list.head);

    }
}
