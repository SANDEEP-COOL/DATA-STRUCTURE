class SolidDiamond{
    public static void main(String []args){
        int n = 10;
        int m = n;

        for(int row = 0; row < n; row++) {
            // spaces 
            for(int j = 0; j < m; j++) {
                System.out.print(" ");
            }
            // star 
            for(int k = 0; k < row+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
            m = m-1;
        }

        m = n;

        // row 
        // System.out.print(" ");
        for(int row=0; row < n; row++) {

            // space 
            for(int j = 0; j < row; j++) {
                System.out.print(" ");
            }
            // star 
            for(int i = 0; i < m; i++) {
                System.out.print("* ");
            }
            
            System.out.println();
            m = m-1;
        }
    }
}