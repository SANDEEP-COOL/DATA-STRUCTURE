import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// DEKHO BHAIYA LEVEL ORDER TRAVERSAL ME JO BHI LIKHA VO GALAT NI H...BOHOT KAM POSSIBILITY H KI KAHI PAR GALTI HO GAYI... 
// BUT YOU CAN BELIEVE ON THAT...AND ISKE LOGIC KO LEKAR KE JADA PARESHAN NI HONA BAS YE SOCH LENA ASE HI YE KAAM KARTA H... 
// AUR AGAR JADA HI CHULL HAI..TO KAR LO TRAVERSE....

public class BinaryTree {

    int maxdepth = -1;

    // node... 
    class Node{
        // data members...
        private Node left;
        private int data;
        private Node right;

        // constructor... 
        public Node(int data) {
            left = null;
            this.data = data;
            right = null;
        }

    }


    // pair for checking balanced tree or not... 
    class Pair{

        // var which tells wheter the left or right subtree of a node is balanced or not... 
        boolean isBalanced;

        // we need to give left and right subtree hight to the function which has called to recusion for left and right subtree... 
        int hight;
    }


    // buildTree(Recursive)...
    public Node buildTree(Node root) {

        // bulidTree bolega ok , ma only pehla node bana deta baaki iske left part aur right part ko rec sambhal lenge... 
        System.out.println("Enter data");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        // if data is -1, then user doesn't wanna enter data(base case)... 
        if(d == -1)
            return null;

        // createNode... 
        root = new Node(d);

        // leftPart... 
        System.out.println("Enter Data For inserting in left of "+d);
        root.left = buildTree(root.left);

        // rightPart... 
        System.out.println("Enter Data For inserting in right of "+d);
        root.right = buildTree(root.right);

        return root;
    }

    // levelOrderTraversal By Queue... 
    public void levelOrderTraversal(Node root) {

        System.out.println("\nThe level Order Traversal Of Binary Tree...");

        // create queue... 
        Queue<Node> queue = new LinkedList<>();

        // push root initially in queue...
        queue.add(root);
        
        // important note 
        // 1. jab bhi ek particular level compelete ho jada h to mujhe queue me null dalana h jo ye darshata h ki ek particular level yaha par finish ho gaya hai
        
        // now humne root ko agar queue me dala mtlb ek particular level compelete ho chuka h , that's why ab hume queue par null dalna h... 
        queue.add(null);

        // while loop... 
        while(queue.isEmpty() == false) {

            // queue me abhi kuch nodes ho sakte h... 
            Node temp = queue.peek();
            queue.remove();

            // ab ye temp 2 cheez ho sakta hai... 
            // 1. ya to ye ek Node ho.... 
            // 2. ya to ye null ho...

            // ek aur bohot important baat hai ok... 
            // agar temp null hai iske mtlb ye hai ki koi ek particular level yaha pahuchne ke pehle hi print ho chuka h 
            // and 
            // uske just next wala level queue me push ho chuka hai..only push hoa h usko print abhi karna bakki hai... 

            if(temp == null) {
                // ab ek paricular level ke finish hone par new line chahiye na ek... 
                System.out.println();

                // iske next level pura queue par already push ho chuka hai...to ab isliye ab hum queue me null daalenge... 
                if(queue.isEmpty() == false) {
                    queue.add(null);
                }
            }

            // agar temp ek node h... 
            
            else{
                // uske data ko print karo... 
                System.out.print(temp.data+" ");
                
                // left child... 
                if(temp.left != null) 
                    queue.add(temp.left);
                
                // right child... 
                if(temp.right != null) 
                    queue.add(temp.right);
            }

        }

    }


    // leafNode...
    public void leafTraversal(Node root){
        // base case... 
        if(root == null)
            return;
        
        // agar root null nahi hai...to hume only root ko print karna hai jiska left and right child null hai... 
        if(root.left == null && root.right == null)
            System.out.print(root.data+" ");
        
        // left part ko recursion sambhal lega... 
        leafTraversal(root.left);

        // right part ko recursion sambhal lega... 
        leafTraversal(root.right);
    }


    // logic samajhna kam se kam 2 baar traverse karo... 
   
    // rightView...
    public void rightView(Node root) {

        // agar root null h iska mtlb tree hi ni to kya hi traverse karenge... 
        if(root == null)
            return;

        // it will store all nodes of right view... 
        List<Integer> ans = new ArrayList<Integer>();

        int depth = 1;

        // calling helper...
        rightViewHelper(root, depth, ans);
        
        // Iterator<Integer> it = ans.iterator();
        // while(it.hasNext()) {

        //     // get ele... 
        //     System.out.print(it.next()+" ");

        // }
        System.out.println("This is the RIGHT VIEW of Binary Tree"+ans);

    }


    // rightViewHelper... 
    public void rightViewHelper(Node root, int depth, List<Integer> ans){
        // base case... 
        if(root == null)
            return;
        
        // kya is level ko right most node ans me dal chuka h ki ni... 
        if(depth > ans.size()) {

            // agar nahi... 
            ans.add(root.data);
        }

        // pehle right... 
        rightViewHelper(root.right, depth+1, ans);

        // then left... 
        rightViewHelper(root.left, depth+1, ans);
    }


    // leftView ke baare me bhi jada sochna ni hai Traverse kar ke dekh lena...
    public void leftView(Node root) {

        List<Integer> ans = new ArrayList<Integer>();
        int depth = 0;
        leftViewHelper(root, depth, ans);
        System.out.println("This is the LEFT VIEW of binary tree "+ans);

    }


    private void leftViewHelper(Node root, int depth, List<Integer> ans) {

        if(root == null)
            return;

        if(depth > maxdepth) {
            ans.add(root.data);
            maxdepth = depth;
        }

        leftViewHelper(root.left, depth+1, ans);
        leftViewHelper(root.right, depth+1, ans);

    }

    // prdeorder(ROOT , LEFT , RIGHT)... 
    public void preorder(Node root) {
        // base case... 
        if(root == null) 
            return;
        
        // otherwise... 

        // root ko print karo... 
        System.out.print(root.data+" ");

        // ab left me chale jao...
        preorder(root.left);

        // last me right me chale jana... 
        preorder(root.right);
    }

    // inorder(ROOT , LEFT , RIGHT)... 
    public void inorder(Node root) {
        // base case... 
        if(root == null) 
            return;
        
        // otherwise... 

        // sabse pehle left me chale jao...
        inorder(root.left);

        // root ko print karo... 
        System.out.print(root.data+" ");

        // last me right me chale jana... 
        inorder(root.right);
    }

    // postorder(ROOT , LEFT , RIGHT)... 
    public void postorder(Node root) {
        // base case... 
        if(root == null) 
            return;
        
        // otherwise... 


        // sabse pehle left me chale jao...
        postorder(root.left);

        // then right me chale jana... 
        postorder(root.right);

        // last me root ko print karo... 
        System.out.print(root.data+" ");
    }

    public Node bildTreeLevelWise(Node root) {

        System.out.println("chala");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data for Root Node");
        int rootdata = sc.nextInt();

        // create root node... 
        root = new Node(rootdata);

        // create queue... 
        Queue<Node> queue = new LinkedList<Node>();

        // push root node... 
        queue.add(root);

        while(queue.isEmpty() == false) {

            System.out.println("chala");

            // ek node(jo already ban chuka hai) queue se nikallenge...aur iske left and right child banayenge... 
            Node temp = queue.peek();
            queue.remove();

            // leftChild... 
            System.out.println("Enter left child's data for "+temp.data+" Node");
            int ldata = sc.nextInt();

            // agar data -1 h so do nothing... 
            if(ldata != -1) {
                // naya node banana h aur new node ko is(temp) ke left me add karna hai... 
                temp.left = new Node(ldata);

                // ab aage chalke iske bhi to left aur right child banane padenge isliye inhe bhi baad ke liye queue me daal do... 
                queue.add(temp.left);
            }

            // rightChild... 
            System.out.println("Enter right child's data for "+temp.data+" Node");
            int rdata = sc.nextInt();

            // agar data -1 h so do nothing... 
            if(rdata != -1) {
                // naya node banana h aur new node ko is(temp) ke right me add karna hai... 
                temp.right = new Node(rdata);

                // ab aage chalke iske bhi to left aur right child banane padenge isliye inhe bhi baad ke liye queue me daal do... 
                queue.add(temp.right);
            }
        }
        return root;
    }

    public int  height(Node root) {
        // base case... 
        if(root == null) 
            return 0;
        
        // hight(node root) recusion1 se bolega...hey recursion you just return me the height of left subtree... 
        int lh = height(root.left);

        // and recursion2 se bolega.... hey recursion you just return me value of right subtree... 
        int rh = height(root.right);

        // after returning yours answers...i will find the greater one... 
        if(lh > rh){

            // ma apni bhi to height include kar du.... 
            return lh+1;

        }
        return rh+1;
    }


    // balances... 
    public boolean isBalanced(Node root) {
        if(root == null)
    	    return true;
    	    
    	boolean leftBalanced = isBalanced(root.left);
    	boolean rightBalanced = isBalanced(root.right);
    	boolean diff = (Math.abs(height(root.left) - height(root.right)) <= 1) ? true : false;
        if(leftBalanced && rightBalanced && diff)
            return true;
        else
            return false;
    }


    // iska output sai ni aa raha hai... 
    public Pair fastIsBalanced(Node root) {

        // base case(if we are at null node)... 
        if(root == null) {

            // to root node hamesa hi balance hota h... 
            Pair p = new Pair();
            p.isBalanced = true;
    
            // aur root h to iski height bhi 0 hi hogi...
            p.hight = 0; 

            return p;
        }

        // agar ye null node nahi ha to... 

        Pair lp = fastIsBalanced(root.left);

        Pair rp = fastIsBalanced(root.left);

        // check whether the left subtree is balanced or not... 
        boolean isLeftSubTreeBal = lp.isBalanced;

        // check whether the right subtree is balanced or not... 
        boolean isRightSubTreeBal = rp.isBalanced;

        // is node ko bhi to check karna hoga na ki kahi yahi node to balance ni hai...check karo... 
        boolean diff = (Math.abs(lp.hight - rp.hight) <= 1 ? true : false);

        // is tree ki hight niakaal lo....kyuki jisne tumhe call kiya hai usko tumhare hight ki need hai... 
        Pair p = new Pair();
        p.hight = Math.max(lp.hight, rp.hight) + 1;

        // check... 
        if(isLeftSubTreeBal && isRightSubTreeBal && diff) {
            p.isBalanced = true;
        }
        else{
            p.isBalanced = false;
        }

        return p;
    }

    // diameter... 
    public int diameterOfTree(Node root) {
        // base case... 
        if(root == null)
            return 0;

        int op1 = diameterOfTree(root.left);
        int op2 = diameterOfTree(root.right);
        int op3 = height(root.left) + height(root.right) + 1;

        int ans = Math.max(op1, Math.max(op2, op3));

        return ans;
    }


    // zigZag... 
    public ArrayList<Integer> zigZag(Node root) {

        ArrayList<Integer> result = new ArrayList<>();


        // agar root hi null hai to...   
        if(root == null)
            return result;

        // queue ka use yaha par ye h ki....agar hum kisi bhi node par hai to hum use left aur right child ko store kar paaye... 
        Queue<Node> q = new LinkedList<>();

        // pehle ek node to kam se kam hona chaihye queue par loop lagane ke liye... 
        q.add(root);

        // flag... 
        boolean leftToRight = true;

        // while loop for traversing each level at once... 
        while(!q.isEmpty()) {

            // get size of queue... 
            int sizeOfQueue = q.size();

            // is time queue par ek level ke saare elements h unko store karne ke liye bhi to ek array hona chahiye... 
            int arr[] = new int[sizeOfQueue];

            // kisi ek level ki saare nodes(queue me rakhe h) ko traverse karne ke liye for loop...
            for(int i = 0 ; i < sizeOfQueue ; i++) {

                // node nikaalo... 
                Node front = q.peek();

                // pop... 
                q.remove();

                // normal insertion or reverse insertion... 
                int index = leftToRight ? i : sizeOfQueue - i - 1;

                // array ke us index me daalo... 
                arr[index] = front.data;

                // kya uska left child hai... 
                if(front.left != null) 
                    q.add(front.left);

                // kya uske right me child hai... 
                if(front.right != null)
                    q.add(front.right);
            }

            // ab jab ek level compelete ho jae to agle level me jaane se pehle direction change kar dena... 
            leftToRight = !leftToRight;

            // aur arr ke elements ko result me store kara do... 
            for (int i : arr) {
                result.add(i); 
            }
        }
        return result;
    }

    public static void main(String[] args) {

        BinaryTree btree = new BinaryTree(); 

        // root... 
        Node root = null;

        root = btree.buildTree(root);
        // btree.rightView(root);
        // btree.leftView(root);
        // btree.preorder(root);
        // btree.postorder(root);
        // root = btree.bildTreeLevelWise(root);
        btree.levelOrderTraversal(root);
        // btree.inorder(root);
        // System.out.println("Hight of the binary tree is : "+btree.height(root));
        // System.out.println("Diameter of the binary tree is : "+btree.diameterOfTree(root));
        // System.out.println("is tree banlaned : "+btree.isBalanced(root));
        // System.out.println("is tree banlaned : "+(btree.fastIsBalanced(root)).isBalanced);
        ArrayList<Integer> al = btree.zigZag(root);
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
