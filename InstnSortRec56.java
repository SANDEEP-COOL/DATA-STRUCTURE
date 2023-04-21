// INSERTION SORT USING RECURSION 
public class InstnSortRec56 {

    public static void sort(int arr[],int index,int size) {
        //base case
        if(size==0 || size==1 || index==size) {
            return;
        }
        
        /*
        Now here we will only sort one of the ele (1'st index element) and rest of elements
        will be sorted by recursion.
        */

        int minEleTillNow=arr[index];
        int j=index-1;

        for(; j>=0 ; j--) {
            if(arr[j] > minEleTillNow){
                //shift
                arr[j+1]=arr[j];
            }
            else{
                break;
            }
        }

        // keeping minEleTillNow into it's right position
        arr[j+1]=minEleTillNow;

        sort(arr, index+1, size);

        return;
    }

    public static void main(String []args) {
        int arr[]=new int[]{23,54,67,5,345,2,4,6,3,5,5};
        // there is special reason behind passing one to recursive fun(sort()) because in this sorting 
        // we start from the 1'st index ele and keep sorting till last
        sort(arr,1,arr.length);
        for(int val:arr) {
            System.out.println(val);
        }
    }
}