public class SelectionSort25 {

//    Time Complexity : Worst Case = O(n^2) : Best Case = O(n^2);
//     Selection sort is stable sorting algo
    public static void sort(int arr[]){

        for( int i = 0 ; i < arr.length-1 ; i++ ){
            //consider ith ele as minimum
            int minIndex = i;

            for( int j = i + 1 ; j < arr.length ; j++ ){

                //check
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    public static void main(String []args){

        int arr[] = {6 , 2 , 8, 4 , 10};
        System.out.println("Before Any Sorting");
        sort(arr);
        System.out.println("After Selection Sorting");
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }

}
