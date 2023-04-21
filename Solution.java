class Solution {

/////////////////////////////////////////////////this solution is working on small cases , not big///////////////////////////////////////////
    public static int binaryToInt(int x,int pow) {

        if(x==0){
//            int ans = 0;
            return 0;
        }

        // take last digit
        int rem = x % 10;

        // is it 1
        if(rem==1){

            x = x / 10;
            return binaryToInt(x,pow+1) + (int)Math.pow(2,pow);

        }
        return binaryToInt(x/10 , pow+1);

//        if(x == 0){
//
//            int ans = 0;
//            return ans;
//
//        }
//
//        int rem = x % 10;
//        if(rem == 1){
//
//            x = x/10;
//            return (int) Math.pow(2 , pow) + binaryToInt(x , pow+1);
//
//        }
//        return binaryToInt(x/10 , pow+1);
    }

    public static int intToBinary(int n) {

        // if n is 0
        if(n == 0){
            return 0;
        }
        // if not

        // get the last bit
        int bit = n & 1;
        int ans = intToBinary(n>>1);
        return (ans*10)+bit;
    }

    public static String addBinary(String a, String b) {

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);

        // converting binary into int
        int x = binaryToInt(c,0);
        int y = binaryToInt(d,0);

        System.out.println(x);
        System.out.println(y);

        // add them
        int ans = x + y;

        // converting into to binary
        return String.valueOf(intToBinary(ans));

    }
    /////////////////////////////////////////////////this solution is working on small cases , not big///////////////////////////////////////////

    public static String addBinary1(String a , String b){
        a.trim();
        b.trim();

        // making res StringBuilder
        StringBuilder res = new StringBuilder();

        // for iterating both of the strings
        int i = a.length()-1 , j = b.length()-1;

        // carry , and sum
        int carry = 0 , sum;

        while(i>=0 || j>=0){

            sum = carry;
            if(i>=0) sum+=a.charAt(i--)-'0';
            if(j>=0) sum+=b.charAt(j--)-'0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum%2);

        }

        if(carry!=0) res.append(carry);
        String ans = res.reverse().toString();
        while(ans.charAt(0)=='0'){
            ans = ans.substring(1);
        }
        return ans;
    }
    public static void main(String []args) {
        String a = "01001001" , b = "0110101";
//        System.out.println(addBinary(a,b));
        System.out.println(addBinary1(a,b));
    }
}
