public class BubbleSort26 {

//    Time Complexity : Worst Case : O(n^2) : Best Case : O(n) , It is a stable algo
    public static void ItrativeSol(int arr[]){

        int flag = 0;
        for( int i = 0 ; i < arr.length - 1 ; i++){

            for( int j = 0 ; j < arr.length - i - 1 ; j++ ){

                if( arr[j] > arr[ j+1 ]){
                    //swap;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }

            }
            if(flag==0){
                break;
            }
        }

    }

    public static void RecursiveSol(int arr[] , int size){

        //Base Case
        if(size <= 1){
            return;
        }

        //sort one of the ele
        for( int i = 0 ; i < size - 1 ; i++ ){
            if(arr[i] > arr[i + 1]){
                //swap;
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        //now recursion it's your turn to sort remaining ele
        RecursiveSol(arr , size - 1);

    }

    public static void main(String[] args) {
        int arr[] = {100 , -2 , 200 , 30 , 21 , 1 , 2 , 3 , 10000};
        int size  = arr.length;
        System.out.println("Before any sorting");
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
        System.out.println("After Bubble sorting");
        ItrativeSol(arr);
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }

        System.out.println("Before any sorting");
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        RecursiveSol(arr , size);
        System.out.println("After Bubble sorting");
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+"\t");
        }
    }

}
