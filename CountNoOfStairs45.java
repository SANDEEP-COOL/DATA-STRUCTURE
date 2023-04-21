
public class CountNoOfStairs45 {

    public static int count(int n){

        //base case
        if(n < 0){
            return 0;
        }

        if(n == 0){
            return 1;
        }

        int x = count(n-1) + count(n-2);

        return x;
    }

//    ye TLE maar ra hai code

    public static void main(String []args) {
        int x = count(4);
        System.out.println(x);
    }

}
