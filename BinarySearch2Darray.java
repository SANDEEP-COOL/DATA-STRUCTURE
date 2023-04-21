public class BinarySearch2Darray {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length , col = matrix[0].length;
        System.out.println(row+" "+col);

        int s = 0 , e = row * col - 1 , mid;
        mid = (s + e)/2;

        while ( s < e ) {

            System.out.println((mid - col)+" "+(mid - row));
            if ( matrix[mid - col][mid - row] == target ) {

                return true;

            }
            else if (matrix[mid - col][mid - row] < target ) {
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
            mid = (s + e) / 2;
        }
        return false;
    }

    public static void main(String []args) {

        int arr[][] = {{1,3,5,7} , {10,11,16,20} , {23,30,34,60}};
        System.out.println(searchMatrix(arr,3));

    }

}
