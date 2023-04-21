public class FancyPatter1 {
    public static void main(String[] args) {

        System.out.println("Fancy Pattern#1....\n");
        int n = 5;

        for(int row = 0 ; row < n ; row++) {

            for(int col = 0 ; col < (2*n - row - 2) ; col++) {
                System.out.print("* ");
            }

            for(int col = 0 ; col < (2*row+1) ; col++) {
                if(col % 2 == 0)
                    System.out.print((row+1)+" ");
                else 
                    System.out.print("* ");    
            }

            for(int col = 0 ; col < (2*n - row - 2) ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
