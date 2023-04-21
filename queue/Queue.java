public class Queue {
    // data members...
    int arr[];
    int front;
    int rear;
    int capacity;
    
    // constructor...
    public Queue(){
        capacity = 10000;
        arr = new int[10000];
        front = 0;
        rear = 0;
    }

    // size...
    public int size(){
        return rear;
    }

    // enqueue...
    public void enqueue(int data){
        if(rear == capacity){
            System.out.println("Queue Overflow");
            return;
        }
        arr[rear] = data;
        rear++;
        System.out.println(data+" is enqueued");
        return;
    }

    // dequeue...
    public int dequeue(){
        if(rear == front){
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = arr[front];
        arr[front] = -1;
        front++;
        if(rear == front){
            rear = 0;
            front = 0;
        }
        System.out.println(x+" is dequeued");
        return -1;
    }

    // empty...
    public boolean empty(){
        if(rear == front)
            return true;
        return false;
    }

    // front...
    public int getFront(){
        if(rear == front){
            return -1;
        }
        return arr[front];
    }

    public static void main(String []args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.getFront();
        q.getFront();
        q.getFront();
        q.getFront();
        q.getFront();
        // System.out.println(q.size());
        // q.dequeue();
        // q.dequeue();
        // q.dequeue();
        // q.dequeue();
        // q.dequeue();
        // System.out.println(q.size());
    }   
}
