public class CheckRotatedSorted31 {

    public static boolean check( int arr[] ){

        int flag = 0 , i;

        for ( i = 0 ; i < arr.length-1 ; i++ ) {

            if( arr[i] < arr[i+1] ){
                continue;
            }
            else{
                flag = 1;
                break;
            }
        }

        i++;

        //if dip ele is found then do this
        if( flag == 1 ){

            while( i < arr.length-1 ){

                //both the condition should be true;
                if( arr[i] < arr[i+1] && arr[i] < arr[0] ){
                    i++;
                    continue;
                }

                else{
                    return false;
                }
            }

        }
        //if dip ele is not found , then do this
        return true;

    }

    public static void main(String []args) {

        int arr[] = {1,2,3};
        boolean ans = check(arr);
        System.out.println(ans);
    }

}
