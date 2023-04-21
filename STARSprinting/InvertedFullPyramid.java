public class InvertedFullPyramid {
    public static void main(String []args) {

        System.out.println("Printing Inverted Full Pyramid....");

        int n = 10;
        int m = n;

        // row 
        for(int row=0; row < n; row++) {

            // space 
            for(int j = 0; j < row; j++) {
                System.out.print("  ");
            }
            // star 
            for(int i = 0; i < m; i++) {
                System.out.print("*   ");
            }
            
            System.out.println();
            m = m-1;
        }
    }
}
