public class FullPyramid {
    public static void main(String []args) {

        System.out.println("Printing Full Pyramid....");
        int n = 10;
        int m = n;

        for(int row = 0; row < n; row++) {
            // spaces 
            for(int j = 0; j < m; j++) {
                System.out.print("  ");
            }
            // star 
            for(int k = 0; k < row+1; k++) {
                System.out.print("*   ");
            }
            System.out.println();
            m = m-1;
        }
    }    
}
