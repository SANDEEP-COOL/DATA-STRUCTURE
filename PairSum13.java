public class PairSum13 {

    public static int pariSum(int arr[] , int target) {

        int sum = 0 , count = 0 , j = arr.length-1;
        for(int i = 0 ; i < j ; ) {

            sum = arr[i] + arr[j];
            if(sum == target) {

                System.out.println("( "+arr[i]+" , "+arr[j]+" )");
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

    public static int pairSum1(int arr[] , int target) {

        int count = 0;
        for(int i = 0 ; i < arr.length-1 ; i++) {

            for(int j = i + 1 ; j < arr.length ; j++) {

                if(arr[i] + arr[j] == target){

                    System.out.println("( "+arr[i]+" , "+arr[j]+" )");
                    count++;
                    break;

                }

            }

        }
        return count;
    }

    public static void main(String []args){

        int arr[] = {1 , 2 , 3 , 4 , 5};
        System.out.println(pariSum(arr , 6));
        System.out.println(pairSum1(arr , 6));

    }

}
