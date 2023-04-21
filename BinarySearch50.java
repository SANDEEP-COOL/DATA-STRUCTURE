public class BinarySearch50 {

    public static int findKey(int arr[],int key,int low,int high) {
        //base case
        if(low > high){
            return -1;
        }

        /*findKey() is saying to recursion that hey recursion i am just comparing arr[mid] with key , if they are equal then
        i will return true if not then i will pass either the left or right part of array to you , and you just care about them*/

//        finding mid
        int mid = (low+high)/2;
        int element  = arr[mid];
//        check
        if(element==key){
            return mid;
        } else if (element > key) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
        return findKey(arr,key,low,high);
    }

    public static void main(String []args)
    {
        int arr[] = new int[]{1,7,10,15,17,20};
        int key=0;
        int answer = findKey(arr,key,0,arr.length-1);
        System.out.println(answer);
    }
}
