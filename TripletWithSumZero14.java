public class TripletWithSumZero14 {

    public static int triplet(int arr[] , int target) {

        int sum = 0 , count = 0 , j = arr.length-1;
        for(int i = 0 ; i < j ; ) {

            sum = arr[i] + arr[j] + arr[j-1];
            if(sum == target) {

                System.out.println("( "+arr[i] + " , "+arr[j]+" , "+arr[j-1]+" )");
                count++;
                i++;
                j--;

            }

            else if(sum < target) {

                i++;

            }

            else{

                j--;

            }

        }
        return count;
    }

    public static void main(String []args) {

        int arr[] = {1 , 2 , 3 , 4 , 5};
        System.out.println(triplet(arr , 12));

    }

}
