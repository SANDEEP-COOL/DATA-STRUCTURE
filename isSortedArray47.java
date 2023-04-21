public class isSortedArray47 {

    public static boolean checkIsSorted(int arr[],int i) {

        //base case
        if(arr.length==0 || i == arr.length-1){
            return true;
        }

        boolean ans = false;

//        check

//        if array is in increasing order

        if(arr[0] < arr[1]){
            if(arr[i] < arr[i+1]){
                ans = true;
            }
            else
                ans = false;
        }

//        if array is in decreasing order

        if(arr[0] > arr[1]){
            if(arr[i] > arr[i+1]){
                ans = true;
            }
            else
                ans = false;
        }

        return ans && checkIsSorted(arr,i+1);
    }

//    perfactly workable code

    public static void main(String []args) {

        int arr[] = new int[]{3,4,2,4,6,34,322,};
//        System.out.println(arr[0]);
        boolean ans = checkIsSorted(arr,0);
        System.out.println(ans);

    }

}
