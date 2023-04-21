public class PivotEle18 {

    public static  int findPivot(int arr[]){

        //var
        int leftSum = 0 , rightSum = 0;

        for(int x : arr){
            rightSum = rightSum + x;
        }

        for(int i = 0 ; i < arr.length ; i++){

            rightSum = rightSum - arr[i];
            if(rightSum == leftSum) {
                return arr[i];
            }
            leftSum = leftSum + arr[i];
        }

        return -1;
    }

    public static int findPivotByBrootForcce(int arr[]){

        int ls = 0 , rs = 0;
        for(int i = 0 ; i < arr.length ; i++){

            //left sum
            for(int j = 0 ; j < i ; j++){

                ls = ls + arr[j];

            }

            //right sum
            for(int k = i+1 ; k < arr.length ; k++){

                rs = rs + arr[k];

            }

            //check
            if(ls == rs){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String []args){

        int arr[] = {2 , 1 , -1};

//        int x = findPivot(arr);
        int x = findPivotByBrootForcce(arr);

        System.out.println("this is array");
        for(int i : arr){
            System.out.print(i+"\t");
        }
        System.out.println();
        if(x != -1)
            System.out.println(x+" is PIVOT ELEMENT in this array");
        else
            System.out.println("there is no PIVOT ELEMENT found");
    }

}
