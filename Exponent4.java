public class Exponent4 {

    public static int getExponent(int b){

        if(b == 0){

            return 1;

        }

        return 2*getExponent(b-1);

    }

    public static int getExponentImrovedVersion(int b){

        if(b == 0)
            return 1;

//        if(b%2 == 0){
//
//            b = b/2;
//            int x = getExponentImrovedVersion(b);
//            return x*x;
//
//        }
//
//        else{
//
//            b = b/2;
//            int x = getExponentImrovedVersion(b);
//            return 2*x*x;
//
//        }

        int x = getExponentImrovedVersion(b/2);
        if(b%2 == 0){

            return x*x;

        }

        else{

            return 2*x*x;

        }

    }

    public static void main(String []args){

        int ans = getExponent(5);
        System.out.println(ans);
        System.out.println(getExponentImrovedVersion(8));
    }

}
