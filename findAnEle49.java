public class findAnEle49 {

    public static boolean findKey(int arr[],int i,int key) {
        //base case
        if(i==arr.length){
            return false;
        }

        //check
        if(arr[i]==key){
            return true;
        }
        return findKey(arr,i+1,key);
    }

    public static void main(String []args) {
        int arr[] = new int[]{1 , 2 , 3 , 4 , 5};
        int key = 10;
        boolean answer = findKey(arr,0,key);
        System.out.println(answer);
    }
}
