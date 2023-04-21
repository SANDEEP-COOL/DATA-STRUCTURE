
//Both the code are working well
public class PivotInSortedAndRotArr19 {

    public static void findPivotEle(int arr[]){

        int s = 0 , e = arr.length-1 , mid = (s + e)/2;
        while(s < e){

            if(arr[mid] >= arr[0]){

                s = mid + 1;

            }
            else{

                e = mid;

            }
            mid = (s + e)/2;
        }
        System.out.println("PIVOT in SHORTED and ROTATED array is:\t"+arr[s]);
        return;
    }

    public static void findPivotEleRec(int arr[],int s,int e) {
        //base case
        if(s>e){
            return;
        }

        int mid=(s+e)/2;
        if(mid<arr.length-1 && arr[mid-1] > arr[mid] && arr[mid] < arr[mid+1]) {
            System.out.println("Answer= "+mid);
            System.out.println("s= "+s+" e= "+e+" and mid= "+mid);
            System.out.println("arr[mid-1]= "+arr[mid-1]+" arr[mid]= "+arr[mid]+" arr[mid+1]= "+arr[mid+1]);
            return;
        }
        else if(arr[mid]<arr[0]){
            e=mid;
        }
        else{
            s=mid;
        }
        findPivotEleRec(arr,s,e);
        return;
    }

    public static void main(String []args){

        int arr[] = {3,1,2};
        System.out.println("array is this: ");
        for(int i : arr){
            System.out.print(i+"\t");
        }
        System.out.println();
//        findPivotEle(arr);
        findPivotEleRec(arr,0,arr.length-1);
    }

}
