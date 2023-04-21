public class Fibonacci1 {

    public static void printFibonacci(int a , int b , int num){

        if(num == 0){

            return;

        }

        int c = a+b;
        System.out.print(" "+c);
        printFibonacci(b , c , num-1);
    }

    public static int getFibonacci(int num){

        if(num == 0 || num == 1){

            return num;

        }

        int ans = getFibonacci(num-1) + getFibonacci(num-2);
        return ans;
    }

    public static void main(String []args){

        System.out.print("0");
        //printing series till 5th term
        printFibonacci(0 , 1, 4);
        System.out.println();
        System.out.println(getFibonacci(5));

    }

}
