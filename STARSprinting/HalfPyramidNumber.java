// package STARSprinting;

public class HalfPyramidNumber {
    public static void main(String []args) {
        System.out.println("Half Pyramid Of Number....");
        int n=5;

        for(int row=0; row<n; row++) {
            for(int col=0; col<=row; col++) {
                System.out.print((col+1)+" ");
            }
            System.out.println();
        }
    }
}
