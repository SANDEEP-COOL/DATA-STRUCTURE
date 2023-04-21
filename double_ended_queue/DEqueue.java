public class DEqueue {

    // data members...
    int elements[];
    int front;
    int rear;
    int capacity;

    // constructor...
    public DEqueue(){
        capacity = 5;
        front = -1;
        rear = -1;
        elements = new int[capacity];
    }

    // pushBack(push from rear end)...
    public void pushBack(int data) {

        // 1 Queue Overflow... 
        if(  (rear == capacity-1 && front == 0) || (rear == (front-1)%(capacity-1))  ) {
            System.out.println("Queue OverFlow...");
            return;
        }   

        // 2 single element to be pushed in queue...  
        else if(front == -1) {
            front = rear = 0;
        }

        // 3 maintain circular nature... 
        else if(rear == capacity-1 && front != 0) {
            rear = 0;
        }

        // 4 otherwise... 
        else{
            rear++;
        }

        // insert... 
        elements[rear] = data;
        return;
    }

    // pushFront(push from front end)...
    public void pushFront(int data) {

        // 1 Queue OverFlow... 
        if(  (rear == capacity-1 && front == 0) || (front != 0 && rear == (front-1)%(capacity-1))  ){
            System.out.println("Queue OverFlow");
            return;
        }

        // 2 only single element to be pused in queue... 
        else if(front == -1) {
            front = rear = 0;
        }

        // 3 maintain circular nature... 
        else if(front == 0 && rear != capacity-1) {
            front = capacity-1;
        }

        // 4 normal flow... 
        else{
            front--;
        }

        // insert... 
        elements[front] = data;
    }

    // popFront... pop element from front end...
    public int popFront(){
        // 1 Queue Underflow... 
        if(front == -1) {
            System.out.println("Queue UnderFlow");
            return -1;
        }

        int x = elements[front];
        elements[front] = -1;

        // 2 only single element to be poped from queue... 
        if(front == rear) {
            front = rear = -1;
        }

        // 3 maintain circular natutre... 
        else if(front == capacity-1){
            front = 0;
        }

        // 4 otherwise... 
        else{
            front++;
        }

        return x;
    }

    // popBack(pop from rear end)...
    public int popBack(){

        // 1 Queue UnderFlow...
        if(front == -1) {
            System.out.println("Queue UnderFlow");
            return -1;
        } 

        int x = elements[rear];
        elements[rear] = -1;

        // 2 only single element to be poped... 
        if(rear == front) {
            front = rear = -1;
        }

        // 3 maintain circular nature... 
        else if(rear == 0) {
            rear = capacity-1;
        }

        // 4 otherwise... 
        else{
            rear--;
        }

        return x;
    }

    public void printFrontRear(){
        System.out.println("Front is : "+front+" ans Rear is : "+rear);
    }

    public static void main(String []args) {
        DEqueue dequeue = new DEqueue();
        dequeue.pushBack(10);
        dequeue.pushBack(20);
        dequeue.pushBack(30);
        dequeue.pushBack(40);
        // dequeue.printFrontRear();
        // System.out.println(dqueue.popFront());
        System.out.println(dequeue.popFront());
        System.out.println(dequeue.popFront());
        System.out.println(dequeue.popFront());
        System.out.println(dequeue.popFront());
        System.out.println(dequeue.popFront());
    }
}
