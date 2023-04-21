public class Gcd44 {

    public static int findGcd( int a , int b ){

        if(a==0) return b;
        if(b==0) return a;

//        jab tak dono barabar nahi hote , tab tak chalte raho
        while( a != b ){

//            chalna matlab check karo ki kon bada hai
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }

    public static int findGcdRec(int a , int b){

//        base case jab dono barabr ho gaye
        if(a==b){
            return a;
        }

//       check
        if(a > b) a = a -b ;
        else b = b - a;

//        aage ka kam recursion ko de do , kyuki use bhi yahi sab karna hai
        return findGcdRec(a,b);
    }

    public static void main(String []args) {

        System.out.println(findGcd(72,24));
        System.out.println(findGcdRec(72,24));

    }

}
