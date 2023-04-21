// package STARSprinting;

public class InvertedHalfPyramid {
    public static void main(String []args) {
        System.out.println("Inverted Half Pyramid Printing....");
        int n = 10;
        for(int row=0; row<n; row++) {
            for(int col=0; col<(n-row); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
