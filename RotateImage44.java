public class RotateImage44 {

    public static void transpose(int arr[][] , int rc){

        for(int col = 0 ; col < rc ; col++){

            for(int row = 0 , endingRow = rc-(col+1) ; row < rc ; row++){

                int temp = arr[row][col];
                arr[row][col] = arr[endingRow][row];
                arr[endingRow][row] = temp;

            }

        }
    }

    public static void reverse (int arr[][] , int rc) {

//        reversing rc number of rows
        for( int row = 0 ; row < rc ; row++ ){

            for(int startingCol = 0,endingCol = rc-1 ; startingCol<=endingCol ; startingCol++,endingCol--){

                int temp = arr[row][startingCol];
                arr[row][startingCol] = arr[row][endingCol];
                arr[row][endingCol] = temp;

            }

        }

    }

    public static void main(String args[]){

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(arr , 3);
        for( int i = 0 ; i < 3 ; i++ ){
            for( int j = 0 ; j < 3 ; j++ ){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("//////////////////////////////////");
        reverse(arr , 3);
        for( int i = 0 ; i < 3 ; i++ ){
            for( int j = 0 ; j < 3 ; j++ ){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }
    }

}
