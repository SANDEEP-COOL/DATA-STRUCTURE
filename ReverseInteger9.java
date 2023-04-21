//
//class Solution {
//    public int reverse(int x) {
//
//        long ans = 0;
//
//        while(x!=0){
//
//            int rem = x % 10;
//            System.out.println(rem);
//            ans = (ans * 10) + rem;
//            x = x/10;
//
//        }
//
//        if(ans > Integer.MAX_VALUE){
//
//            return 0;
//
//        }
//
//        else{
//
//            return (int)ans;
//
//        }
//    }
//}
//
//public class ReverseInteger9{
//
//    public static void main(String []args){
//
//        Solution1 s = new Solution1();
//        System.out.println(s.reverse(-123));
//
//    }
//
//}
