public class SegregateEvenOddListNotWorking{

    Node head, temp, ttemp, evenhead, oddhead, segregatedList;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void init(){
        head= temp= ttemp= evenhead= oddhead=segregatedList = null;
    }

    public Node addNode(int data, Node start){

        Node temp = start;

        if(temp == null) {
            start = new Node(data);
            return start;
        }

        else{
            while(temp .next != null) {
                temp = temp.next;
            }

            temp.next = new Node(data);
            return start;
        }
        
    }

    public void display(Node start){
       temp = start;
       while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
       }
    }

    public Node divide(Node start){

        temp = start;
        if(start == null) 
            return start;

        while(temp != null) {
            if(temp.data % 2 == 0){
                evenhead = addNode(temp.data, evenhead);
            }
            else{
                // add on oddhead 
                oddhead = addNode(temp.data, oddhead);
            }
            temp = temp.next;
        }

        // merge 
        temp = evenhead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = oddhead;
        return evenhead;
    }

    public static void main(String[] args) {
        SegregateEvenOddListNotWorking list = new SegregateEvenOddListNotWorking();
        list.init();
        list.head = list.addNode(16, list.head);
        list.head = list.addNode(14, list.head);
        list.head = list.addNode(8, list.head);
        list.head = list.addNode(10, list.head);
        list.head = list.addNode(12, list.head);
        list.head = list.addNode(4, list.head);
        list.head = list.addNode(6, list.head);
        list.display(list.head);
        // System.out.println(list.head.data+" "+list.head.next.data);
        list.segregatedList = list.divide(list.head);
        System.out.println("After Segregation....");
        list.display(list.segregatedList);
    }
}