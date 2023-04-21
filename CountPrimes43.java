import java.util.Arrays;


//////////////////////////////////ye bade value par time limit exeed mar raha hai////////////////////////////////////////////////////////////
public class CountPrimes43 {

    public static int count(int n){

        int count = 0;

        // traverse from 2 till n-1
        for(int i = 2 ; i < n ; i++){

            int x = i;

            int j;
            // check whether x is prime
            for(j = 2 ; j < x  ; j++){

                // x / j == 0
                if(x%j==0){
                    break;
                }

                if(j*2 > x){
                    System.out.println(x);
                    count++;
                    break;
                }

            }

            if(x==2){
                count++;
            }

        }
        return count;

    }
/////////////////////////////////ye bade value par time limit exeed mar raha hai////////////////////////////////////////////////////////////

/////////////////////////////////ye code badhiya work kar ra hai////////////////////////////////////////////////////////////
    public static int count1(int n){

        int count = 0;

        boolean[] isPrime = new boolean[n+1];

        Arrays. fill(isPrime, true);

        if(n==0){
            isPrime[0] = false;
        }

        if(n==1){
            isPrime[0] = isPrime[1] = false;
        }

        for(int i = 2 ; i < n ; i++){

            if(isPrime[i]==true){

                count++;

                // jitne bhi number 2 ki table me aa rae hai sabhi ko unprime kar do
                for(int j = i*2 ; j<n; j+=i){
                    isPrime[j]=false;
                }

            }

        }
        return count;
    }
/////////////////////////////////ye code badhiya work kar raha hai////////////////////////////////////////////////////////////

/////////////////////////////////Jab Range de ho [L,R] tab ye code bhi badhiya work kar ra h//////////////////////////////////////
    public static int count2( int L , int R ) {

        // using sieve erotthenus algo

        // make an array of (R+1)
        // create an array of (n+1) size
        boolean b[] = new boolean[R + 1];

        // initially mark all the number as prime
        Arrays.fill(b, true);

        int count = 0;

        // mark 0 and 1 as non prime
        b[0] = b[1] = false;


        // itrate from 2
        for (int i = 2; i <= R; i++) {
            if (b[i] == false) {
                continue;
            }

            // System.out.println(i,j)
            // if(){

            // }
            for (long j = (long) i * i; j <= R; j += i) {
                // System.out.println(j);
                int k = (int) j;
                b[k] = false;
            }
        }

        for (int i = L; i <= R; i++) {
            if (b[i] == true) count++;
        }

        return count;
    }
/////////////////////////////////Jab Range de ho [L,R] tab ye code bhi badhiya work kar ra h//////////////////////////////////////
    public static void main(String []args) {

        int n = 10;

//        System.out.println(count(n));
//        System.out.println(count1(n));
        int l = 5;
        int ans = count2(l, n);
        System.out.println("//////////////////////////////////");
        System.out.println(ans);

    }

}
