import java.util.ArrayList;
import java.util.Stack;

public class Nstacks74NotWorking {

    class Nstacks{
        // arraylist...
        private ArrayList<Stack> al = new ArrayList<Stack>();
        // n, s 
        private int n, s;

        // const...
        public Nstacks(int n, int s){
            this.n = n;
            this.s = s;
        }

        // createNstacks...
        private void createNstacks() {
            int i = s;
            while(i > 1){
                Stack<Integer> s = new Stack<Integer>();
                al.add(s);
            }
        }

        public boolean push(int x, int m) {
            // Write your code here.
        }

        public static int pop(int m) {
            // Write your code here.
        }
    }

    public static void NStack(int N, int S) {
        
    }

    public static void main(String[] args) {

        Nstacks74NotWorking n = new Nstacks74NotWorking();
        Nstacks ds = n. new Nstacks(3, 100);
        ds.createNstacks();

    }

 
}
