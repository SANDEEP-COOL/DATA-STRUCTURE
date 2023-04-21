class PaintersBoards22{


    public static boolean isPossible ( int mid , int arr[] , int size , int k){

//         firstly we will allot board to first painter , that's why it is initialaized by 1 not 0
        int painters = 1;
        int sum = 0;

        for( int i = 0 ; i < size ; i++ ){
            if( sum + arr[i] <= mid ){
                sum = sum + arr[i];
            }

            else{
                painters++;
                if( painters > k || arr[i] > mid ){
                    return false;
                }
                else
                    sum = arr[i];
            }
        }
        return true;
    }

    static long minTime(int[] arr,int n,int k){
        int s = 0 , e , mid , ans = -1 , sum = 0 ;

        for( int i = 0 ; i < n ; i++ ){
            sum = sum + arr[i] ;
        }

        e = sum;
        mid = (s+e)/2;

        while( s <= e ){

//             if it is possible ans , then find minimum one
            if( isPossible(mid , arr , n , k ) ){
                ans = mid;
                e = mid - 1;
            }
//             if it is not possible ans , means we need to have more time for both the painters
            else{
                s = mid + 1;
            }
//             minimize the search space
            mid = (s+e)/2;
        }
        return ans;
    }
}
