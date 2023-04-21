// import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem72{

    // public static boolean knows(int x, int y) {
    //     Random random = new Random();
    //     boolean randomValue = random.nextBoolean();
    //     return randomValue;
    // }
        
    // public static void findCelebrity(int n) {
    //     // create knows array of size n and intialize it by  -1
    //     int knows[] = new int[n];

    //     // create known array of size n and init it by -1
    //     int known[] = new int[n];

    //     // iterate people's id
    //     for(int i = 0 ; i < n ; i++) {
    //         for(int j = i+1 ; j < n-1 ; j++) {

    //             // for (i, j)
    //             boolean ans = knows(i, j);
    //             if(ans == true) {
    //                 // i wala banda j ko jaanta hai
    //                 knows[i] = 0;
    //                 known[j] = 0;
    //             }

    //             // for (j, i)
    //             ans = knows(j, i);
    //             if(ans == true) {
    //                 knows[j] = 0;
    //                 known[i] = 0;
    //             } 

    //         }
    //     }

    //     // check whose knows[index] = -1 but known[index] = 0
    //     for(int i = 0 , j = 0 ; i < n ; i++ , j++){
    //         if(knows[i] == -1 && known[j] == 0) {
    //             System.out.println("i = "+i+" j = "+j+" ko janta hai...");
    //         }
    //     }
    // }


    private static boolean knows(int[][] people, int a, int b) {
        if(people[a][b] ==1) 
            return true ;
        else 
            return false;
    }

    private static int findCelebrity1(int[][] people, int size) {

        // step1 : create a stack and push all people in that... 
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0 ; i < size ; i++) {
            stack.push(i);
        }

        // step2 : until the size of stack becomes lesser then 1 till then just repeat one process... 
        while(stack.size() > 1) {
            // pop one people...
            int a = stack.pop();

            // pop second people...
            int b = stack.pop();
            
            // check that a knows b or not...
            if(knows(people, a, b)) {
                // if person a knows person b , means a is not celebrity... 
                stack.push(b);
            }
            else{
                // if person a doesn't knows person b , means b is not celebrity... 
                stack.push(a);
            }
        }

        // step3 : pop remaining one ele from the stack , which is potential Celebrity...
        // verify it...

        int ans = stack.pop();
        int zeroCount = 0 , oneCount = 0;

        for(int i = 0; i < size ; i++) {
            // row...
            if(people[ans][i] == 0)
                zeroCount++;
            
            // col... 
            if(people[i][ans] == 1)
                oneCount++;
        }

        if(zeroCount == size && oneCount == size-1) {
            return ans;
        }
        else{
            return -1;
        }
    }


   


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        // two people total 
        // findCelebrity(2);

        // create arr which keeps info about people and who knows each another
        int arr[][] = new int[3][3];

        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int a[] : arr){
            for(int i : a){
                System.out.print(i+" ");
            }
            System.out.println();
        }


        // finding Celebrity 
        int celebrity = findCelebrity1(arr, 3);
        System.out.println("The Celebrity is : "+celebrity);
    }

    

    
}