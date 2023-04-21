public class MoveZeros30 {

    public static void move(int arr[]){

        int i = 0 , start = 0;

        while( i < arr.length ){
            if( arr[i] !=0 ){
                arr[start++] = arr[i];
            }
            i++;
        }

        while( start < arr.length ){
            arr[start++] = 0;
        }

    }

    public static void main(String []args){
        int arr[] = {2 , 0 , 0 , 3 , 0 , 5 , 0};
        move(arr);
        for (int i :
                arr) {
            System.out.print(i+"\t");
        }
    }

}
