public class FullFlipedSolidPyramid {
    public static void main(String[] args) {
        System.out.println("FullFlipedSolidPyramid printing....");
        int n = 10;
        // traversing each row 
        for(int row = 0 ; row < n ; row++) {
            // Inverted half pyramid 
            for(int col = 0 ; col < n-row ; col++) {
                System.out.print("*");
            }

            // full pyramid spaces 
            for(int col = 0 ; col < 2*row+1 ; col++) {
                System.out.print(" ");
            }

            // Inverted half pyramid 
            for(int col = 0 ; col < n-row ; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

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
