public class NumericHollowHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Numeric Hollow Half Pyramid....");
        int n = 10;
        
        // row 
        for(int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < row+1 ; col++) {

                // last row 
                if(row == n-1) {
                    System.out.print(col+1);
                }
                // otehrwise 
                else{
                    if(col == 0) {
                        System.out.print(1);
                    }
                    else if(col == row) {
                        System.out.print(row+1);
                    }
                    else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}
