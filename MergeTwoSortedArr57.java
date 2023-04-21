//MERGE TWO SORTED ARRAY , BUT NOW HOW CAN I OPTIMIZE IT MORE?
public class MergeTwoSortedArr57 {

    public static void swap(int arr1[],int arr2[],int i,int j) {
        int temp=arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=temp;
    }

    public static void swap1(int arr[],int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void merge(int arr1[],int arr2[]) {

        for( int i = 0 , j = 0 ; (i < arr1.length && j < arr2.length) ; i++  ){
            if(arr1[i] > arr2[j]) {
                //swap
                swap(arr1,arr2,i,j);
                int k=j;
                while(k<arr2.length-1){
                    if(arr2[k] > arr2[k+1]){
                        swap1(arr2,k,k+1);
                    }
                    else{
                        break;
                    }
                    k++;
                }
            }
            // j--;
        }

    }

    public static void main(String []args) {
        int arr1[]=new int[]{13,17,18,19,20,22,27,36,39,46};
        int arr2[]=new int[]{4,12,45};
        merge(arr1,arr2);
        System.out.println("arr1[] after being sorted");
        for(int x:arr1){
            System.out.println(x);
        }
        System.out.println("arr2[] after being sorted");
        for(int x:arr2){
            System.out.println(x);
        }
    }   
}





















































































