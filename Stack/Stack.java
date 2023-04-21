// class 
public class Stack{

    // private data members
    private int elements[];
    private int capacity;
    private int tos;

    
    // Constructor , initialization
    public Stack(int capacity){
        this.capacity = capacity;
        elements = new int[capacity];
        tos = -1;
    }

    // push 
    public void push(int element) {
        if(tos == capacity-1){
            System.out.println("Stack Overflow....");
            return;
        }
        
        else{
            elements[++tos] = element;
        }
    }

    // pop 
    public int pop(){
        // System.out.println("Poped Element is");
        if(tos == -1){
            System.out.println("Stack Underflow....");
            return -1;
        }
        else{
            int x = elements[tos--];
            return x;
        }
    }

    // isEmpty
    public boolean isEmpty(){
        if(tos == -1){
            return true;
        }
        return false;
    }

    // reverse a string 
    public String reverse(String str) {
        String ans = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            push(ch);
        }

        while(isEmpty() == false){
            char ch = (char) pop();
            if(ch != -1) {
                ans = ans + ch;
            }
        }
        return ans;
    }

    // size 
    public int size(){
        return tos + 1;
    }

    // validateExpression
    public boolean validateExpression(String s){
        for(int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);

            // opening , push 
            if(ch == '(' || ch =='[' || ch == '{')
                this.push(ch);

            // closing , pop 
            else if(ch == ')' || ch == ']' || ch == '}'){
                char ch1 = (char)this.pop();
                
                // agar closing bracket aya but pehle se hi stack empty hai..... 
                if(ch1 == -1)
                    return false;
                    
                // agar koi closing aya , to exact wahi openening bhi stack me hona chahiye , nahi h to false 
                if((ch == ')' && ch1 != '(') || (ch == '[' && ch1 != ']') || (ch == '{' && ch1 != '}'))
                    return false;

            }
        }
        if(isEmpty() == true)
            return true;
        else 
            return false;
    }

    // main 
    public static void main(String []args) {
        Stack stack = new Stack(100);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.reverse("abcdefgdigklmnopqrstuvwxyz"));
        // System.out.println(stack.size());
        // System.out.println(stack.validateExpression("()[]{}[]{"));
    }

    // public void getMin() {
    // }
}