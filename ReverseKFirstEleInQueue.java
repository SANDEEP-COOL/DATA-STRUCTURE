import java.util.*;
public class ReverseKFirstEleInQueue
{
    public static LinkedList<Integer> reverseFirstKEle(LinkedList<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        
        // first k elements ko queue se pop karke stack me push karo...
        for(int i = 0 ; i < k ; i++) {
            int x = q.remove();
            stack.push(x);
        }
        
        // ab stack se sabhi elements ko nikaalo and queue me daalo...
        while(stack.isEmpty() == false) {
            int x = stack.pop();
            q.add(x);
        }
        
        // n-k elements ko queue se pop karke queue me hi push karo...
        int t = q.size()-k;
        
        for(int i = 0 ; i < t ; i++) {
            int x = q.remove();
            q.add(x);
        }
        
        return q;
    }

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        LinkedList<Integer> ans = reverseFirstKEle(queue, 3);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());        
        System.out.println(queue.remove());        

    }
}