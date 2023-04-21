// It is optimised version of a to power b 

public class PowerAtoBOptimised54{

    public static int getPowerOdd(int a,int b) {
        //base case

        // if any number's power is 0 , the it's answer is 1
        if(b==0) {
            int ans=1;
            return ans;
        }
        
        /* there are two cases
        1 : if b is even then the recurence relation will be 
            return (a ^ b/2) * (a ^ b/2);
        2 : if b is odd then the recurence relation will be 
            return a * (a ^ b/2) * (a ^ b/2); */

        int x=1;
        if(b%2!=0)
        x=a;

        b = b / 2;
        int myValue=1;

        // one of the (a ^ b/2) is found in this function 
        for(int i = 1; i<=b; i++){
            myValue=myValue*a;
        }

        // one of the (a ^ b/2) is found in recursive function 
        int yourAnswer=getPowerOdd(a, b);

        
        return x*myValue*yourAnswer;
    }

    public static void main(String []args) {
        int a=2,b=10;
        System.out.println("Answer is : "+getPowerOdd(a,b));
    }

}