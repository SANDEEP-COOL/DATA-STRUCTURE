
//getting a ^ b
public class PowerOfAtoB {

    public static int getPower(int a,int b){
        //base case

        /*
        when it would be base case then one variable will be created(ans) having value 1 , and finally this variable's
        will be returned ,
        the specialty of this variable is this , that it is created in this function(getPower()) we didn't use argument
        variable.
        */

        if(b==0){
            int ans=1;
            return ans;
        }

        /* getPower function will say to recursion that hey Recursion i have got my value , you just return me your answer , after
        getting your i will simply multiply my value into your anwer and finally i will reuturn my answer is well */
        int myValue=a;
        int yourAnswer=getPower(a,b-1);
        int finalAnswer=myValue*yourAnswer;
        return finalAnswer;
    }
    public static void main(String []args) {
        int a=2,b=10;
        System.out.println(getPower(a,b));
    }
}
