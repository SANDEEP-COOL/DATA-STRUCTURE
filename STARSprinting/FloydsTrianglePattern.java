public class FloydsTrianglePattern {
    public static void main(String[] args) {
        System.out.println("Floyd's Triangle Pattern....");
        int n = 7;
        int count=1;
        // row 
        for(int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < row+1 ; col++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
