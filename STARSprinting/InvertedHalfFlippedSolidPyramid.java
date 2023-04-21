public class InvertedHalfFlippedSolidPyramid {
    public static void main(String []args) {
        System.out.println("InvertedHalfFlippedSolidPyramid....");
        int n = 5;
        // rows 
        for(int row = 0 ; row < n; row++) {
            // Inverted Half Pyramid 
            for(int col = 0 ; col < row + 1 ; col++) {
                System.out.print("*");
            }

            // Inverted Full Pyramid 
            for(int col = 0 ; col < (2*n-2*row-1) ; col++){
                System.out.print(" ");
            }

            // Inverted half pyramid 
            // rows
            for(int col = 0 ; col < row+1 ; col++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}
