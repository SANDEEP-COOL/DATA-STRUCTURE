import java.util.ArrayList;


public class FindFirstLastOcc51 {
    public static int findKey(long arr[],int low,int high,int key) {
        //base case
        if(low>high){
            return -1;
        }

        int mid = (low+high)/2;
        long arrayElement = arr[mid];
        if(key == arrayElement){
            return mid;
        }
        else if(arrayElement > key){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
        return findKey(arr,low,high,key);
    }

    public static ArrayList<Long> find(long arr[], int n, int x)
    {
        int index = findKey(arr,0,arr.length-1,x);
        System.out.println(index);
        int leftIndex = index , rightIndex = index;
        while(leftIndex >= 0){
//            System.out.println(leftIndex);
            if(arr[leftIndex] != x){
                break;
            }
            leftIndex--;
        }
        while(rightIndex <= arr.length){
            System.out.println(rightIndex);
            if(arr[rightIndex] != x){
                break;
            }
            rightIndex++;
        }
        ArrayList<Long> al = new ArrayList<Long>();
        al.add((long)leftIndex+1);
        al.add((long)rightIndex-1);
        return al;
    }

    public static void main(String []args) {
        ArrayList<Long> al = new ArrayList<Long>();
        long arr[] = new long[]{1,3,5,5,5,5,67,123,125};
        int key = 5;
        al = find(arr,arr.length,key);
        System.out.println("Final result is this : "+al);
    }
}
