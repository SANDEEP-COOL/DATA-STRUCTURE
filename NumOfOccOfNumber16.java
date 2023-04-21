public class NumOfOccOfNumber16 {

    public static int FindPositionBinaryLeftMost(int arr[] , int size , int ele){

        int s = 0 , l = size - 1 , mid = (s + l)/2 , ans = -1;

        while(s <= l){

            if(arr[mid] == ele){
                ans = mid;
                l = mid -1;
            }
            else if(arr[mid] > ele){
                l = mid - 1;
            }
            else if(arr[mid] < ele){
                s = mid + 1;
            }

            mid = (s + l)/2;
        }
        return ans;
    }

    public static int FindPositionBinaryRightMost(int arr[] , int size , int ele){

        int s = 0 , l = size - 1 , mid = (s + l)/2 , ans = -1;

        while(s <= l){

            if(arr[mid] == ele){
                ans = mid;
                s = mid + 1;
            }
            else if(arr[mid] > ele){
                l = mid - 1;
            }
            else if(arr[mid] < ele){
                s = mid + 1;
            }

            mid = (s + l)/2;
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {0 , 0 , 1 , 1 , 2 , 2 , 2 , 2};
        int left = FindPositionBinaryLeftMost(arr , 8 , 2);
        int right = FindPositionBinaryRightMost(arr , 8 , 2);
        System.out.println("Total number of Occurrences is: "+((right-left)+1));
    }

}
