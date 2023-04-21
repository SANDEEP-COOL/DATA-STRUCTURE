public class FullHollowDiamond {
    public static void main(String []args) {
        
        System.out.println("Println FullHollowDiamond....");
        int n = 10;
        // for n rows
        for(int row=0; row<n; row++) {
            // spaces 
            for(int i=0; i<(n-row-1); i++) {
                System.out.print("_");
            }
            // star 
            // System.out.println("row*2+1 = "+(row*2+1));
            for(int i=0; i<(row*2+1); i++) {
                // System.out.print("i = "+i+" ");
                if(i == 0 || i == (row*2)) {
                    System.out.print("*");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }

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
