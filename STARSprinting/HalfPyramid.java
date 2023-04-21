// package STARSprinting;

public class HalfPyramid {
    public static void main(String []args) {
        System.out.println("Half Pyramid....");
        int n = 50;
        for(int row=0; row<n; row++) {
            for(int col=0; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
