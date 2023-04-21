public class MergeTwoSortedList67 {

    // global variable 
    Node first, temp, ttemp, second, merged;
    class Node{
        int data;
        Node next;
    }

    void init(){
        first=temp=ttemp=second=null;
    }

    void createHeadNodeOfLL(int data, String listName) {
        if(listName.equalsIgnoreCase("first")) {
            first=new Node();
            first.data=data;
            first.next=null;
        }
        else if(listName.equalsIgnoreCase("second")){
            second=new Node();
            second.data=data;
            second.next=null;
        }
        else if(listName.equalsIgnoreCase("merged")) {
            merged=new Node();
            merged.data=data;
            merged.next=null;
        }
    }

    void addNodeInLL(int data, String listName) {
        if(listName.equalsIgnoreCase("first")) {
            temp=first;
            while(temp.next != null) {
                temp=temp.next;
            }

            ttemp=new Node();
            ttemp.data=data;
            ttemp.next=null;
            temp.next=ttemp;
        }
        else if(listName.equalsIgnoreCase("second")) {
            temp=second;
            while(temp.next != null) {
                temp=temp.next;
            }

            ttemp=new Node();
            ttemp.data=data;
            ttemp.next=null;
            temp.next=ttemp;
        }
        else if(listName.equalsIgnoreCase("merged")) {
            temp=merged;
            while(temp.next != null) {
                temp=temp.next;
            }

            ttemp=new Node();
            ttemp.data=data;
            ttemp.next=null;
            temp.next=ttemp;
        }
        
    }

    void displayList(String listName){
        if(listName.equalsIgnoreCase("first")) {
            System.out.println("\nFirst List....");
            temp=first;
            while(temp!=null) {
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
        }
        else if(listName.equalsIgnoreCase("second")) {
            System.out.println("\nSecond List....");
            temp=second;
            while(temp!=null) {
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
        }
        else if(listName.equalsIgnoreCase("merged")) {
            System.out.println("\nMerged List....");
            temp=merged;
            while(temp!=null) {
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
        }
        
    }

    void merge(Node first, Node second) {
        Node temp = first;
        Node ttemp = second;
        int i = 0;

        if(temp == null && ttemp == null) {
            return;
        }
        else  if(temp != null && ttemp==null) {
            merged = temp;
            return;
        }
        else if(temp == null && ttemp != null) {
            merged = ttemp;
            return;
        }
        // jab tak dono list ke nodes bache ho 
        while(temp!=null && ttemp!=null) {
            i=i+1;
            if(temp.data < ttemp.data) {
                if(i == 1)
                createHeadNodeOfLL(temp.data, "merged");
                else
                addNodeInLL(temp.data, "merged");

                temp = temp.next;
            }
            else{
                if(i == 1) 
                    createHeadNodeOfLL(ttemp.data, "merged");
                else 
                    addNodeInLL(ttemp.data, "merged");

                ttemp = ttemp.next;
            }
        }

        // agar kisi list ke nodes bache hai to unhe bhi merge kar do 
        while(temp!=null) {
                // i++;
                // if(i == 1)
                //     createHeadNodeOfLL(temp.data, "merged");
                // else
                    addNodeInLL(temp.data, "merged");

                temp = temp.next;
        }

        while(ttemp!=null) {
            //     i++;
            //     if(i == 1) 
            //     createHeadNodeOfLL(ttemp.data, "merged");
            // else 
                addNodeInLL(ttemp.data, "merged");

            ttemp = ttemp.next;
        }
    }

    public static void main(String []args) {
        MergeTwoSortedList67 list = new MergeTwoSortedList67();
        list.init();
        list.createHeadNodeOfLL(1, "first");
        list.addNodeInLL(4, "first");
        list.addNodeInLL(5, "first");
        list.createHeadNodeOfLL(2, "second");
        list.addNodeInLL(3, "second");
        list.addNodeInLL(5, "second");
        list.displayList("first");
        list.displayList("second");
        list.merge(list.first, list.second);
        list.displayList("merged");
    }
}
