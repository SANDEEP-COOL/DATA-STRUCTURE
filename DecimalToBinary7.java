import java.util.ArrayList;

public class DecimalToBinary7 {

    public static int DecimalToBinary(int n){

        if(n == 0){

            //create one answer variable
            int ans = 0;
            return ans;

        }

        //perform bitwise & operation
        int bit = n & 1;
        int ans = DecimalToBinary(n>>1);
        return (ans*10) + bit ;
    }

    public static int DecimalToBinary1(int n){

        if(n == 0){

            int ans = 0;
            return ans;

        }

        int rem = n % 2 ;
        int ans = DecimalToBinary1(n/2);
        return (ans * 10) + rem;

    }

//    public static int DecimalToBinary2(int n){
//
//        //Firstly take binary of given number
//        int num = DecimalToBinary1(n);
//
////        arrayList and storing binary value in this
//        ArrayList<Integer> al = new ArrayList<Integer>(8);
//        for(int i = 7 ; i>=0 ; i--){
//
//            if(n != 0){
//
//                int rem = num % 10;
//                al.add(i , rem);
//                n = n/10;
//
//            }
//            al.add(i , 0);
//        }
//
//        //1's Complement
//        for(int i = 7 ; i>=0 ; i--){
//
//            int bit = al.get(i);
//
//            if(bit == 1){
//
//                al.add(i , 0);
//
//            }
//            else{
//
//                al.add(i , 1);
//
//            }
//
//        }
//
////        2's' Complement(adding 1)
//        al = Complement(al);
//
//    }

//    public static ArrayList<Integer> Comlement(ArrayList<Integer> al){
//
//
//
//    }

    public static void main(String []args){

        int n = 10;
//        int ans = 0 , i = 0;

        //recursion
        System.out.println("Performing Bitwise operation: "+DecimalToBinary(n));
        System.out.println("Performing division and modulo operation: "+DecimalToBinary1(n));
//        System.out.println(DecimalToBinary2(-6));
//        Servlet
    }

}
