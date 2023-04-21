public class OnesComplement10 {

    public static int onesComplement(int n){

        int m = n;
        int mask = 0;
        while(m != 0){

            mask = (mask << 1) | 1;
            m  = m >> 1;

        }
        int ans = (~n) & mask;
        return ans;
    }

    public static void main(String []args){

        int n = 8;
        System.out.println("ONE'S COMPLEMENT OF "+n+" is: "+onesComplement(n));

    }

}
