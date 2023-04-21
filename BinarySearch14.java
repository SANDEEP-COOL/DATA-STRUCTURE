public class BinarySearch14 {

    public static int BinarySearch(int arr[] , int key) {

        int s = 0 , e = arr.length-1;
        int mid = (s + e) / 2;

        while(s <= e) {

            if(arr[mid] == key) {
                return mid;
            }

            if(arr[mid] < key) {
                s = mid + 1;
            }

            else {
                e = mid - 1;
            }

            mid = (s + e) / 2;
        }
        return -1;
    }

    public static void main(String []args) {

        int evenArr[] = {2 , 4 , 6 , 8 , 10 , 12};
        int oddArr[] = {3 , 5 , 6 , 10 , 11};

        System.out.println(BinarySearch(evenArr , 13));
        System.out.println(BinarySearch(oddArr, 11));

    }

}
