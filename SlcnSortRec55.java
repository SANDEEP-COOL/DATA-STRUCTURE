// SELECTION SORT 
public class SlcnSortRec55 { 

    // elements before index are sorted , we have to sort element from index to last of array 
    public static void sort(int arr[],int index,int size){
        //base case
        if(size==0 || size==1 || index>=size-1){
            return;
        }

        /*
        SlcnSortRec55() will place the minimum elemenet in arr[index] and rest of minimum elements 
        will be placed to their arr[index] by recursion   
        */

        // considering ith index elemenet as min element 
        int minIndex=index;

        // searching minimum element's index in rest of elements 
        for(int i=index+1; i < size ; i++){

                if(arr[i] < arr[minIndex]){
                    minIndex=i;
                }
 
        }  
        swap(index,minIndex,arr); 
        
        sort(arr,index+1,size);

        return;
    }

    public static void swap( int i,int j,int arr[] ) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String []args) {
        int arr[]=new int[]{};
        sort(arr,0,arr.length);
        for(int val:arr){
            System.out.println(val);
        }
    }
}
