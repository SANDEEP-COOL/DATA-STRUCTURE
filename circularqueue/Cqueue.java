// jada pareshan ni hona h circular queue ke logic me bas samajh
// lena hai asai kam karta ha iska logic bas jaisa h vasai...
import java.util.Stack;
public class Cqueue {

    // data members...
    int elements[];
    int front;
    int rear;
    int capacity;

    // constructor...
    public Cqueue(){
        capacity = 10000;
        elements = new int[capacity];
        front = -1;
        rear = -1;
    }

    // inqueue...
    public void enqeue(int data) {
        // 1 overflow... 
        if( (rear == capacity-1 && front == 0) || (rear == (front-1)%(capacity-1)) ){
            System.out.println("Oueue Overflow");
            return;
        }

        // 2 first element to be pushed in queue... 
        else if(front == -1) {
            front = 0;
            rear = 0;
        }

        // 3 maintain circular nature... 
        else if(rear == capacity-1 && front != 0){
            rear = 0;
        }

        // 4 otherwise... 
        else{
            rear++;
        }

        // push
        elements[rear] = data; 
        // System.out.println(data+" is pushed");
        return;
    }

    // deqeue...
    public int deqeue(){

        // 1 underflow... 
        if(front == -1){
            System.out.println("Queue Underflow");
            return -1;
        }

        int x = elements[front];
        elements[front] = -1;

        // 2 only single element is there and to be poped out... 
        if(front == rear) {
            front = -1;
            rear = -1;
        }

        // 3 maintain circular nature... 
        else if(front == capacity-1) {
            front = 0;
        }

        // 4 otherwise... 
        else{
            front++;
        }

        return x;
    }

    // isempty...
    public boolean isempty(){
        if(front == -1){
            return true;
        }
        return false;
    }

    // peek...
    public int peek(){
        if(this.isempty() == false){
            return elements[front];
        }
        return -1;
    }

    // reverse...
    public Cqueue reverse() {

        // using stack... 
        Stack<Integer> s = new Stack<>();
        
        while(!this.isempty()) {
            int x = this.deqeue();
            s.push(x);
        }
        
        while(!s.isEmpty()){
            int x = s.pop();
            this.enqeue(x);
        }
        return this;
    }

    public static void main(String[] args) {
        Cqueue cqueue = new Cqueue();
        cqueue.enqeue(10);
        cqueue.enqeue(20);
        cqueue.enqeue(30);
        cqueue.enqeue(40);
        // System.out.println("poped element is : "+cqueue.deqeue());
        // System.out.println("poped element is : "+cqueue.deqeue());
        // // System.out.println("poped element is : "+cqueue.deqeue());
        // // System.out.println("poped element is : "+cqueue.deqeue());
        // // System.out.println("poped element is : "+cqueue.deqeue());
        // cqueue.enqeue(50);
        // cqueue.enqeue(60);
        // cqueue.enqeue(70);
        // cqueue.enqeue(80);
        Cqueue ans = cqueue.reverse();
        System.out.println("poped element is : "+ans.deqeue());
        System.out.println("poped element is : "+ans.deqeue());
        System.out.println("poped element is : "+ans.deqeue());
        System.out.println("poped element is : "+ans.deqeue());
    }       
}
