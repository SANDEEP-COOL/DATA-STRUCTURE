public class HalfHollowDiamond {
    public static void main(String []args) {

        System.out.println("printing HollowDiamond....");
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
    }
}
