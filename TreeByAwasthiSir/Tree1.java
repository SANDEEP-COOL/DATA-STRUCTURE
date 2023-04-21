import java.math.*;
class Tree1{

    // global variable
    Node temp, ttemp, p, root;

    class Node{
        int data;
        Node left, right;
    }

    public void init(){
        root=temp=ttemp=p=null;
    } 
    
    public void createRoot(int data){
        root=new Node();
        root.left=root.right=null;
        root.data=data;
    }
    public void addNode(int data){
        temp=root;
        while(temp!=null) {
            ttemp=temp;
            if(temp.data > data){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        p=new Node();
        p.data=data;
        p.left=p.right=null;
        if(ttemp.data > data){
            ttemp.left=p;
        }
        else{
            ttemp.right=p;
        }
    }
    
    public static void inorder(Node p){
        if(p!=null){
            inorder(p.left);
            System.out.println(p.data);
            inorder(p.right);
        }
    }


    public int height(Node p){
        if(p==null){    
            return 0;
        }
        // System.out.println(p.data);
        return Math.max(height(p.left), height(p.right))+1;
    }

    public int diameter(Node temp){
        return (height(temp.left)+height(temp.right))+1;
    }

    public void preorder(Node p){
        if(p!=null){
            preorder(p.left);
            preorder(p.right);
            System.out.println(p.data);
        }
    }

    public void postorder(Node p){
        if(p!=null) {
            postorder(p.left);
            postorder(p.right);
            System.out.println(p.data);
        }
    }

    public static void main(String []args) {
        Tree1 t=new Tree1();
        t.init();
        t.createRoot(100);
        t.addNode(50);
        t.addNode(150);
        t.addNode(40);
        t.addNode(140);
        t.addNode(160);
        t.addNode(30);
        t.addNode(130);
        t.addNode(170);
        t.addNode(120);
        t.addNode(110);
        System.out.println("The Tree is : ");
        inorder(t.root);
        System.out.println("The Height of Tree is : "+t.height(t.root));
        System.out.println("THe Diameter of Tree is : "+t.diameter(t.root));
    }
}







