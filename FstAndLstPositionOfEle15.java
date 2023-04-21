public class FstAndLstPositionOfEle15 {
    public static void FindPosition(int arr[] , int size , int ele) {

        //from 0 to size
        int first = -1;
        int i = 0;
        while(i < size) {

            if(ele == arr[i]) {

                first = i;
                break;

            }
            i++;
        }

        //from size to 0
        i = size-1;
        int last = -1;
        while(i >=0) {

            if(ele==arr[i]){

                last = i;
                break;

            }
            i--;
        }
        System.out.println("First Position is "+first+" and "+" Last Position is "+last);
    }

    public static void FindPositionBinaryAprch(int arr[] , int size , int ele) {

        //performing binary search
        int s = 0 , e = arr.length-1;
        int mid = (s + e) / 2 , first = -1 , last = -1;

        while(s <= e) {

            if(arr[mid] == ele) {
                first = mid;
                last = mid;
                break;
            }

            if(arr[mid] < ele) {
                s = mid + 1;
            }

            else {
                e = mid - 1;
            }

            mid = (s + e) / 2;
        }

        //search first and last position
        int i = first , j = last;
        while(i>=0 && arr[i] == ele){

            first = i;
            i--;

        }

        //if ele not found , return -1
        if(first == -1){
            System.out.println("First position is "+first+" , "+" Last position is "+last);
            return;
        }

        while(j<size && arr[j] == ele){

            last = j;
            j++;

        }

        System.out.println("First position is "+first+" , "+" Last position is "+last);
    }

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

    public static void main(String []args){

        int arr[] = {0 , 0 , 1 , 1 , 2 , 2 , 2 , 2};
        FindPosition(arr , 8 , 2);
        FindPositionBinaryAprch(arr , 8 , 2);
        System.out.println("LeftMost Occurrence is: "+FindPositionBinaryLeftMost(arr , 8 , 2));
        System.out.println("RightMost Occurrence is: "+ FindPositionBinaryRightMost(arr , 8 , 2));
    }

}

