public class Pattern {
    public static void main(String []args) {

        int n = 10;
        int m = n;

        for(int row=0; row<n; row++) {
            
            // space 
            for(int i = 0; i < m; i++) {
                System.out.print("   ");
            }   

            for(int j=0; j<(row+1); j++) {
                System.out.print((j+1)+"  ");
            }

            for(int k=row; k>=1; k--) {
                System.out.print(k+"  ");
            }
            System.out.println();
            m = m-1;
        }

    }
}
