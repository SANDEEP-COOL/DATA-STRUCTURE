public class RotateArray31 {

//    public static void rotate(int arr[] , int max){
//
//        //every time pick last ele
//        int last = arr.length - 1 ;
//        int start = 0;
//
//        //repeat for 3 times
//        for( int i = 0 ; i < max ; i++ ){
//
//            int num = arr[last];
//
//            //shift
//            for( int j = last ; j > 0 ; j-- ){
//
//                arr[j] = arr[j - 1];
//
//            }
//
//            //assign num at first
//            arr[start] = num;
//        }
//
//    }
//
//    public static void rotate1( int arr[] , int max ){
//
//        int x = arr.length - 1 ;
//        int y = arr.length - (1+max) ;
//
//        for( int i = 0 ; i < max ; i++ ){
//
//            //swapping
//            int temp = arr[y];
//            arr[y] = arr[x];
//            arr[x] = temp;
//
//            x--;
//            y--;
//
//        }
//
//        if( y == -1){
//            return;
//        }
//
//        //pick arr[0];
//        int num = arr[0];
//
//        //shift max number of ele
//        int i = 0;
//
//        while(i < max){
//
//            arr[i] = arr[i+1];
//            i++;
//
//        }
//
//        //assign num to max index
//        arr[max] = num;
//    }
//
//    public static void rotate2( int arr[] , int max ){
//
//        int arr1[] = new int[arr.length];
//
//        for( int i = 0 ; i < arr.length ; i++ ){
//            arr1[ (i+max) % arr.length ] = arr[i];
//        }
//
//        for( int i = 0 ; i < arr.length ; i++ ){
//
//            arr[i] = arr1[i];
//
//        }
//
//        return;
//
//    }

    public static void rotate(int arr[] , int k) {

//        reverse first part
        int i = 0 , j = arr.length-(k+1);
        reverse(arr , i , j);

//        reverse second part
        reverse(arr , arr.length-k , arr.length-1);

//        reverse the whole array
        reverse(arr , 0 , arr.length-1);
    }

    public static void reverse( int arr[] , int i , int j) {

      while( i < j ){

          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

          i++;
          j--;

      }

    }

    public static void main(String []args){

        int arr[] = {7 , 9 , 3 , 11 , 15 , 20 , 17};
//        rotate(arr , 2);
//        rotate1(arr , 2);
//        rotate2(arr , 3);
        rotate(arr , 1);

        for (int i :
                arr) {
            System.out.print(i+"\t");
        }
    }

}
