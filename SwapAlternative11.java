public class SwapAlternative11 {

    public static void swapAlternative(int arr[]){

        int i = 0;
        int size = arr.length;
        while(i < size-1) {

            //swapping
            int x = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = x;
            i += 2;

        }
    }

    public static void main(String []args){

        int arr[] = {1 , 2 , 3 , 4 , 5 , 6};
        System.out.println("BEFORE SWAPPING ");
        for(int i : arr){

            System.out.println(i);

        }

        swapAlternative(arr);

        System.out.println("AFTER SWAPPING");
        //foreach loop
        for(int i : arr){

            System.out.println(i);

        }

    }

}
