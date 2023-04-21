// BUBBLE SORT USING RECURSION 
public class BbleSortRec54{


    public static void swap( int i,int j,int arr[] ) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    
    public static void sortArray(int arr[],int size){
        //base case
        if(size==0 || size==1){
            return;
        }   

        /*
        sortArray() will just sort one of the element of array , then for rest of elements recursion will 
        be applyed and recursion will take care of
        */


        int flag=1;
        for(int i= 0 ; i<size-1 ; i++){
            if(arr[i] > arr[i+1]){
                swap(i, i+1, arr);
                flag=0;
            }
        }

        if(flag==1){
            return;
        }

        // now it's your turn recursion
        sortArray(arr, size-1);
        return;
    }

    public static void main(String []args) {
        int arr[]=new int[]{5,4,6,9,1};
        sortArray(arr,arr.length);
        for(int val:arr){
            System.out.println(val);
        }
    }
}