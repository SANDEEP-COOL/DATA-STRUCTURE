public class FancyPattern3 {
    public static void main(String[] args) {
        System.out.println("Fancy Pattern 3....");
        int n = 20;

        for(int row = 0 ; row < n ; row++) {

            // if row <= n/2 so col = 2*row otherwise col >n/2 so col=2*(n-row-1)
            int cond = row <= n/2 ? 2*row : 2*(n-row-1);
            // if row <= n/2 so col = 2*row otherwise col >n/2 so col=2*(n-row-1)

            for(int col = 0 ; col <= cond ; col++) {

                // printing palindrom number
                if(col <= cond/2) {
                    if(col == 0)
                        System.out.print("*"+(col+1));
                    else if(col == cond)
                        System.out.print((col+1)+"*");
                    else
                        System.out.print(col+1);
                }
                else{
                    if(col == 0)
                        System.out.print("*"+(cond-col+1));
                    else if(col == cond)
                        System.out.print((cond-col+1)+"*");
                    else 
                        System.out.print((cond-col+1));
                }
                // printing palindrom number

            }
            System.out.println();
        }
    }
}
