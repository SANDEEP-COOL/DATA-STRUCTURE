public class SortStack71 {
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
    
        public int size(SortStack71.Stack stack) {
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

        public int top(SortStack71.Stack stack){
            int size = size(stack);
            return elements[size-1];
        }
    
        public void sort(SortStack71.Stack stack, int num){
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
    
        public void sortStack(SortStack71.Stack stack){
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

        public void printElements(SortStack71.Stack stack){
            for(int i = stack.size(stack)-1 ; i != -1 ; i--) {
                System.out.print(stack.elements[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        SortStack71 outer = new SortStack71();
        SortStack71.Stack stack = outer.new Stack(100);
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
