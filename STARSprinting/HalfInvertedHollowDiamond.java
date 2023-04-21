public class HalfInvertedHollowDiamond {
    public static void main(String []args) {
        System.out.println("Printing InvertedHollowPyramid.....");
        int n=10;
        
        // rows 
        for(int row=0; row<n; row++) {
            // spaces 
            for(int col=0; col<row; col++) {
                System.out.print("_");
            }

            // star 
            for(int col=0; col < (2*n-2*row-1); col++) {
                if(col == 0 || col == (2*n-2*row-1-1)) {
                    System.out.print("*");
                }
                else{
                    System.out.print("_");
                }
            }

            System.out.println();
        }
    }
}
