public class Sorted_Unsorted5 {

    public static boolean sorted_unsorted(int i , int arr[] , String str){

        if(i == (arr.length)-1){

            return true;

        }

        if(str == "arr[0] < arr[1]"){

            if(arr[i] < arr[i+1]) {

                return true && sorted_unsorted(i + 1, arr, str);

            }
            else{

                return false && sorted_unsorted(i+1 , arr , str);

            }
        }

        else{

            if(arr[i] > arr[i+1]) {

                return true && sorted_unsorted(i + 1, arr, str);

            }
            else{

                return false && sorted_unsorted(i+1 , arr , str);

            }

        }

    }

    public static void main(String [] args){

        int arr[] = {1 , 3 , 4 , 2 , 11};
        if(arr[0] < arr[1]){

            System.out.println(sorted_unsorted(1 , arr , "arr[0] < arr[1]"));

        }

        else{

            System.out.println(sorted_unsorted(1 , arr , "arr[0] > arr[1]"));

        }
    }

}
