public class FancyPattern1{
    public static void main(String[] args) {
        System.out.println("Fancy Pattern.....");
        int n = 10;

        // row 
        for(int row = 0 ; row < n ; row ++) {
            for(int col = 0 ; col < 2*row+1 ; col++) {
                if(col % 2 == 0){
                    System.out.print(row+1+" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
