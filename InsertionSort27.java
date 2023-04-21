public class InsertionSort27 {

    public static void sort(int arr[]){

        for( int i = 1 ; i < arr.length ; i++ ){
            int maxTillNow = arr[i];
            int j = i - 1;
            for(  ; j >= 0 ; j--){
                if(arr[j] > maxTillNow){
                    //shift
                    arr[j + 1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j + 1] = maxTillNow;
        }

    }

    public static void sortWhile(int arr[]){

        int i = 0;
        while( i < arr.length){

            int maxTillNow = arr[i];

            int j = i - 1;
            while( j >= 0){
                if(arr[j] > maxTillNow){
                    //sift
                    arr[j + 1] = arr[j];
                }
                else{
                    break;
                }
                j--;
            }
            arr[j + 1] = maxTillNow;
            i++;
        }
    }

    public static void main(String []args){
        int arr[] = {10 , 1 , 7 , 4 , 8 , 2 , 11};
       System.out.println("Applying for loop and Before Sorting array is this:");
       for( int i : arr ){
           System.out.print(i+"\t");
       }
       sort(arr);
       System.out.println();
       System.out.println("After Sorting");
       for( int i : arr ){
           System.out.print(i+"\t");
       }

        System.out.println("Applying while loop and Before Sorting array is this:");
        for( int i : arr ){
            System.out.print(i+"\t");
        }

        System.out.println();
        System.out.println("After Sorting");
        sortWhile(arr);
        for( int i : arr ){
            System.out.print(i+"\t");
        }
    }

}
