import java.util.ArrayList;

public class ReverseArray28 {

    public static void reverse(int arr[]){
        
        int s = 0 , e = arr.length-1;
        while(s < e){
            
            //swap
//            int a = 0 , b = 0;
//            arr[s] = a;
//            arr[e] = b;
//
//            a = a + b;
//            a = a-b;
//            b = a-b;
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
            
        }
        
    }

    public static void reverse1( int arr[] , int m ) {

        if( m < arr.length-2 ){
            //initialize start with m+1;
            int s = m + 1 , e = arr.length-1 ;

            while(s < e){

                //swap
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                s++;
                e--;
            }
        }
        return;
    }

    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        if( m < arr.size() - 2){
            //initialize start with m+1;
            int s = m + 1 , e = arr.size() - 1 ;

            while(s < e){

                //swap
                int temp = arr.get(s);
                arr.add(s, arr.get(e));
                arr.add(e , temp );

                s++;
                e--;
            }
        }
        return;
    }

    public static void main(String []args){
//        int arr[] = {1 , 2 , 3 , 4 , 5 , 6};
//        reverse(arr);
//        System.out.println("After reversing");
//        for (int i : arr) {
//            System.out.print(i+"\t");
//        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0 , 1);
        arr.add(1 , 2);
        arr.add(2 , 3);
        arr.add(3 , 4);
        arr.add(4 , 5);
        arr.add(5 , 6);

        int m = 3;
        reverseArray(arr , m);
        System.out.println(arr);
    }    
    
}
