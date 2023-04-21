public class TwoDArray36 {

    public static void printColWise( int arr[][] , int i , int j ){

        int x = 0;
        for( int col = 0 ; col < j ; col++ ) {
            if ( x % 2 != 0 ) {
                for( int row = i-1 ; row >= 0 ; row-- ) {
                    System.out.print(arr[row][col]+" ");
                }
            }
            else{
                for( int row = 0 ; row < i ; row++ ) {
                    System.out.print(arr[row][col]+" ");
                }
            }
            x++;
            System.out.println();
        }

    }

    public static void main( String []args ) {

        int[][] arr = { {1, 2, 3,4}, {5, 6, 7, 8}, {9, 10, 11, 12}, };
        printColWise(arr , 3,4);
    }

}
