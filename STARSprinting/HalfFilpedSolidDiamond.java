public class HalfFilpedSolidDiamond {
    public static void main(String []args) {
        System.out.println("FlippedSolidDiamond....");

        int n = 5;
        
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
    }
}
