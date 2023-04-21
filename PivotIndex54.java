public class PivotIndex54 {
    public static int find(int arr[],int s,int e) {
        //base case
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2,leftSum=0,rightSum=0;
        for(int i = 0;i<mid;i++){
            leftSum = leftSum + arr[i];
        }
        for(int i = mid+1;i<arr.length;i++){
            rightSum = rightSum + arr[i];
        }
        if(leftSum==rightSum){
            return mid;
        }
        else if (leftSum>rightSum) {
            e=mid-1;
        }
        else{
            s=mid+1;
        }
        return find(arr,s,e);
    }
    public static void main(String []args) {
        int arr[] = new int[]{2,1,-1};
        int ans=find(arr,0,arr.length-1);
        System.out.println(ans);
    }
}
