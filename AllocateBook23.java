
//kisi kisi case pe work ni kar ra h galat output de ra hai

class AllocateBook23
{

    public static boolean isPossibleAnswer( int arr[] , int mid , int m , int n ) {

        int studentCount = 1 , pageSum = 0;

        for( int i = 0 ; i < n ; i++ ) {

            if( pageSum + arr[i] <= mid) {

                pageSum += arr[i];

            }

            else{

                studentCount++;
                if( studentCount > m || arr[i] > mid ) {
                    return false;
                }

                pageSum = arr[i];
            }

        }
        return true;
    }

    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {

        int s = 0 , e;

        int sum = 0;

        for( int i = 0 ; i < A.length ; i++ ) {

            sum = A[i] + sum;

        }

        e = sum;
        int mid = (s + e) /2 , ans = -1;

        while( s <= e ) {

            if( isPossibleAnswer(A , mid , M ,N) ) {

                ans = mid;
                e = mid - 1;

            }

            else{

                s = mid + 1;

            }
            mid = (s + e)/2;
        }
        return ans;
    }
};