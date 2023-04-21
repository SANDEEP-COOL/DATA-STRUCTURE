public class InsertEleAtBottomOfStack70{

    class Stack{
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
    
        public int size(InsertEleAtBottomOfStack70.Stack stack) {
            int size = 0;
            // System.out.println("tos = "+stack.tos);
            for(int i = stack.tos; i != -1; i--){
                size++;
            }
            return size;
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

        // iterative approach
        public InsertEleAtBottomOfStack70.Stack insertAtBottom(InsertEleAtBottomOfStack70.Stack s, int x){
            int var = s.tos;
            var++;
            int index = s.tos;
    
            // jab tak var 0 nahi hota tab tak....
            while(var != 0){
                s.elements[var] = s.elements[index];
                var--;
                index--;
            }
    
            // jab var 0 ke barabrer ho to....
            s.elements[var] = x;
    
            // increment tos , as it's right position
            s.tos++;
    
            return s;
        }

        // recursive approach
        public InsertEleAtBottomOfStack70.Stack insertAtBottomRec(InsertEleAtBottomOfStack70.Stack s, int x) {
            // base case
            if(s.isEmpty() == true) {
                s.push(x);
                return s;
            }
        
            // otherwise
        
            // ek ele nikall lo
            int y = s.pop();
        
            //baaki ke element ye recursive call nikallega , aur humko same stack but modified stack dega...
            Stack s1 = insertAtBottomRec(s, y);
        
            // ab hum isme x ko push karenge... 
            s1.push(x);
        
            return s1;
        } 



        public int top(InsertEleAtBottomOfStack70.Stack stack){
            int size = size(stack);
            return elements[size-1];
        }
    
        public void sort(InsertEleAtBottomOfStack70.Stack stack, int num){
            //base case...
            if(stack.isEmpty() == true){
                stack.push(num);
                return;
            }
    
            // kya num stack ke top element se chota hai... 
            if(num < stack.top(stack)){
                stack.push(num);
                return;
            }

            // agar num stack.top() element se bada hai... 
            int y = stack.pop();
            stack.sort(stack, num);
            stack.push(y);
            return;
        }
    
        public void sortStack(InsertEleAtBottomOfStack70.Stack stack){
            // base case... 
            if(stack.isEmpty() == true){
                return;
            }
            
            // top num nikall lo... 
            int num = stack.pop();
    
            // bache hoe stack ko recursion sort kar dega... 
            sortStack(stack);
    
            // ab hume num ko sort karna hai 
            sort(stack, num);
    
        }

        public void printElements(InsertEleAtBottomOfStack70.Stack stack){
            for(int i = stack.size(stack)-1 ; i != -1 ; i--) {
                System.out.print(stack.elements[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        InsertEleAtBottomOfStack70 outer = new InsertEleAtBottomOfStack70();
        InsertEleAtBottomOfStack70.Stack stack = outer.new Stack(100);
        stack.push(-1);
        stack.push(-2);
        stack.push(30);
        stack.push(40);
        stack.push(20);
        System.out.println("Before Sorting...");
        stack.printElements(stack);
        System.out.println("After Sorting...");
        stack.sortStack(stack);
        while(stack.isEmpty()==false){
            System.out.print(stack.pop()+" ");
        }
    }
}