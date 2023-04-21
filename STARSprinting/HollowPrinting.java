public class HollowPrinting{
    public static void main(String []args) {
        System.out.println("Hollow Ractangle....");
        int n = 15;
        for(int row=0; row<n; row++) {
            for(int col=0; col<10; col++) {
                if(row == 0 || row == n-1) {
                    System.out.print("* ");
                }
                else{
                    if(col == 0 || col == 9) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}