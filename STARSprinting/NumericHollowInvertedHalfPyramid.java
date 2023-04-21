public class NumericHollowInvertedHalfPyramid {
    public static void main(String[] args) {
        System.out.println("NumericHollowInvertedHalfPyramid....");
        int n = 5;

        // row 
        for(int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < n-row ; col++) {

                // first row 
                if(row == 0) {
                    System.out.print((col+1)+" ");
                }
                else{
                    if(col == 0) {
                        System.out.print((row+1)+" ");
                    }
                    else if(col == n-row-1) {
                        System.out.print(n+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
