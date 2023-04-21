public class PrintCount2 {

    public static void printCount(int n){

        //Base Case
        if(n == 0){

            return;

        }
//        printCount will say that hey recursion i print only n after that all the remaining numbers you print

        System.out.println(n);
        printCount(n-1);
    }

    public static void printCountRev(int n){
        //Base Case
        if(n == 0){
            return;
        }

//        printCountRev will say to recursion that hey recursion you print all remaining numbers except n
//        and when you will complete your task then i will print n

        printCountRev(n-1);
        System.out.println(n);
    }

    public static int printFactorial(int n){

        //Base Case
        if(n == 1){

            return 1;

        }

        int x = printFactorial(n-1);
        return (x*n);

    }

    public static void printFibonacci(int a , int b , int n){

        if(n == 0){

            return;

        }

        System.out.print(" "+(a+b));
        printFibonacci(b , a+b , n-1);

    }

    public static void main(String []args){
//        static - static keyword allows us to access method without creating it's object
        printCount(5);
        System.out.println();
        printCountRev(5);
        System.out.println();
        int ans = printFactorial(7);
        System.out.println("Factorial of 7 is "+ans);
//        if you want to print fibonacci series till 3rd term so pass it 2
        System.out.print("0 1");
        printFibonacci(0 , 1 , 4);
    }

}
