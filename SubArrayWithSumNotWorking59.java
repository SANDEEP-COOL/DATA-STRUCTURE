public class SubArrayWithSumNotWorking59{

    public static void findans(int arr[] , int s){
        
        int j=0;
        int sum = 0;
        int flag = 0; // abhi kisi cycle me nhi h
        for (int i = 0 ; i < arr.length ; i++){
            //check for cycle
            if(flag == 0){
                j=i;
                flag=1;
            }
            
            //add
            sum = sum + arr[i];

            //check
            if(sum == s){
                System.out.println("i= "+(i+1)+" and j= "+(j+1));
            }
            
            else if(sum > s){
                // start subtracting
                while(j < i){
                    System.out.println("j= "+j);
                    sum = sum - arr[j];
                    j++;
                    //check
                    if(sum == s){
                        System.out.println("ans "+"i= "+(i+1)+" and j= "+(j+1));
                        return;
                    }
                }
                //since this cycle didn't give the desired sum , start new cycle
                flag = 0;
                sum = 0;
            }
        }

    }
    public static void main(String[] args) {
        
        int arr[] = {135 ,101 ,170 ,125 ,79 ,159 163 65 106 146 82 28 162 92 196 143 28 37 192 5 103 154 93 183 22 117 119 96 48 127 172 139 70 113 68 100 36 95 104 12 123 134};
        findans(arr , 12);

    }
}