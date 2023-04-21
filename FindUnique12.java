public class FindUnique12{

    public static int findUnique(int[] arr){

        //traverse
        for(int i = 0 ; i < arr.length ; i++){

            int x = arr[i];
            if(x < 0){
                x = x * -1;
            }
            arr[x] = (-1) * arr[x];

        }

        //traverse , check negative number
        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] < 0){

                return i;

            }

        }

        return 0;
    }

    public static int findUniqueBitManipulation(int arr[]){

        int unique = 0;
        for(int i = 0; i < arr.length ; i++){
            unique = unique ^ arr[i];
        }
        return unique;
    }

    public static void main(String []args){

        int arr[] = {1 , 3 , 4 , 1 , 3};
        System.out.println("UNIQUE ELEMENT IS: "+findUnique(arr));
        System.out.println("UNIQUE ELEMENT IS: "+findUniqueBitManipulation(arr));

    }
}
