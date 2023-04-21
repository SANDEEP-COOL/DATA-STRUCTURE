public class SqrtBinaryApp21 {

    public static void findSqrt(int num){

        int i = 1 , ans = 0;
        while(i < num){

            int x = i * i;
            if(x == num){
                System.out.println("square root of "+ans+" is : "+i);
                return;
            }
            else if(x > num){
                System.out.println("square root of "+ans+" is : "+ans);
                return;
            }
            ans = i;
            i++;
        }

    }

    public static void findSqrtBinaryApp(int num){

        int s = 0 , e = num , mid = (s + e)/2 , ans = -1;
        while(s <= e){

            int sqr = mid * mid;
            if(sqr == num){
                System.out.println("square root of "+ans+" is : "+mid);
                return;
            }
            else if(sqr < num){
                s = mid + 1;
                ans = mid;
            }
            else{
                e = mid - 1;
            }
            mid = (s + e)/2;
        }
        System.out.println("square root of "+ans+" is : "+ans);
    }

    public static void main(String []args){

        int x = 256;
        findSqrt(x);
        findSqrtBinaryApp(x);

    }

}
