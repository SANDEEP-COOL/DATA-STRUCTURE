public class BinaryToDecimal8 {

    public static int BinaryToDecimal(int n , int pow){

        if(n == 0){

            int ans = 0;
            return ans;

        }

        int rem = n % 10;
        if(rem == 1){

            n = n/10;
            return (int) Math.pow(2 , pow) + BinaryToDecimal(n , pow+1);

        }
        return BinaryToDecimal(n/10 , pow+1);
    }

    public static void main(String []args){

        int n = 11;
        System.out.println(n+" is converted into DECIMAL: "+BinaryToDecimal(n , 0));

    }

}
