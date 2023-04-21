public class FancyPattern2NotWorking {
    public static void main(String[] args) {
        System.out.println("Fancy Pattern2....\n");

        int n = 4 , count = 1;
        for(int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < 2*row+1 ; col++) {
                if(col % 2 == 0) {
                    System.out.print(count+" ");
                    count++;
                }
                else if(col % 2 != 0) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        count = count - n;
        for(int row = 0 ; row < (2*n-2*row-1) ; row++) {
            int start = count;
            for(int col = 0 ; col < n-row; col++) {
                if(col % 2 == 0) {
                    System.out.print(start+" ");
                    start++;
                }
                else{
                    System.out.print("* ");
                }
            }
            count = count - (n-row-1);
            System.out.println();
        }
    }
}
