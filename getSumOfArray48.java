public class getSumOfArray48 {

//    we have taken one variable(explicitly) as argument (in which all recursive call's ans will be stored)
    public static int getSum(int arr[] , int i , int sum) {

        //base case
        if(arr.length == 0){
            return 0;
        }
        if(i == arr.length){
            return sum;
        }

//        get the ith ele
        int ele = arr[i];
        sum = sum + ele;
        return getSum(arr , i+1 , sum);
    }


//    we haven't take any variable as argument rather we create a resultent variable when we hit the base case
    public static int getSum1(int arr[] , int i){
        if(arr.length==0){
            return 0;
        }
        if(i == arr.length){
//            now it is the base case , and when it will run sum variable is created and from the base case only it is returned
//            and it will include all recursive call's ans in it
            int sum = 0;
            return sum;
        }

        int ele = arr[i];
        return ele + getSum1(arr , i+1);
    }

    public static void main(String []args) {
        int arr[] = new int[]{};
        System.out.println(getSum(arr , 0 , 0));
        System.out.println(getSum1(arr , 0));
    }

}
