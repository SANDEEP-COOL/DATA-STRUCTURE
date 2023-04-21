public class Fibonacci45 {

    public static void printFib(int a , int b , int n){
//        base case
        if(n==0){
            return;
        }

//        processing
        int c = a + b;
        System.out.print(c+" ");

//        recurrence relation
        printFib(b,c,n-1);

    }

    public static long printFib1(int n) {

        if (n <= 1) return n;

        long[] arr = new long[(int)n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
        return arr[(int)n];

    }

    public static void main(String []args) {
        int a = 0 , b = 1 , n = 7;
//        System.out.print(a+" ");
//        System.out.print(b+" ");
//        printFib(a , b , n-2);
        System.out.println(printFib1(656));
    }

}
