public class SolidHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Solid Half Pyramid....");

        int n = 5;

        // upper pyramid 
        for(int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        n--;
        //lower pyramid
        for(int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < n-row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
