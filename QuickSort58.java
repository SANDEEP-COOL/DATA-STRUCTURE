public class QuickSort58 {

    public static int partition(int arr[] , int s , int e) {

        // take pivot 
        int pivot = arr[s];

        // count all elements smaller then pivotElement 
        int count = 0;

        for(int i = s+1 ; i <= e ; i++){
            if(arr[i] < pivot){
                count++;
            }
        }

        // getting pivotIndex as it's right position
        int pivotIndex = s + count;

        //swap 
        swap(arr , s , pivotIndex);

        // satisfying a condition of  ( less then a | a | greater then a )
        int i = s , j = e;
        while(i < pivotIndex && j > pivotIndex){

            // first case 
            while(arr[i] <= pivot){
                i++;
            }

            // second case 
            while(arr[j] > pivot){
                j--;
            }

            // otherwise , swap
            if(i < pivotIndex && j > pivotIndex ){
                swap(arr , i , j);
                i++;
                j--;
            }

        }
        return pivotIndex;
    }


    public static void quickSort( int arr[] , int s , int e ){

        // base case
        if(s >= e){
            return;
        }

        //this function will handle only one case
        int pivotIndex = partition(arr,s,e);

        //and the left part will be sorted by recursion
        quickSort(arr, s, pivotIndex-1);

        //the right part will also be solved by recursion
        quickSort(arr , pivotIndex+1 , e);

    }

    public static void swap(int arr[] , int i , int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        
        int arr[] = {10,80,30,90,40,50,70};
        System.out.println("Before Quick sort....");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("After Quick sort....");

        quickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }

    }

}
