import java.util.Scanner;

public class MaxRactengleNotWorking73 {

    public static void findMaxRec(int arr[][], int row, int col) {
        int widthOfRow[] = new int[row];

        for(int i = 0 ; i < row ; i++) {
            int width = 0;
            for(int j = 0 ; j < col ; j++) {
                if(arr[i][j] == 1){
                    width++;
                }
            }
            widthOfRow[i] = width;
        }

        int maxWidth = widthOfRow[0];
        for(int i = 0; i < widthOfRow.length ; i++) {
            if(maxWidth < widthOfRow[i])
                maxWidth = widthOfRow[i];
        }

        System.out.println("width = "+maxWidth);
        int length = 1;
        for(int i = 0 ; i < widthOfRow.length ; i++) {
            if(widthOfRow[i] == maxWidth) {
                for(int j =i+1 ; j < widthOfRow.length ; j++) {
                    if(widthOfRow[i] == widthOfRow[j]) 
                        length++;
                }
            }
        }

        System.out.println(" length = "+length+"Max area of Ractengle of given Matrix : "+length*maxWidth);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[][] = new int[4][4];

        for(int i = 0 ; i < 4 ; i++) {
            for(int j = 0 ; j < 4 ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int a[] : arr){
            for(int i : a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        findMaxRec(arr, 4, 4);
    }
}
