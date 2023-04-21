import java.util.*;

public class SubsetArrayNotWorking60{

    public static void findSubset(int arr[], int index, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> output) {

        // base case
        if(index == arr.length){
            ans.add(output);
            return;
        }

        // exclude
        findSubset(arr, index+1, ans, output);

        // include 
        int element = arr[index];
        output.add(element);
        findSubset(arr, index+1, ans, output);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        int index=0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> output = new ArrayList<Integer>();
        findSubset(arr, index, ans, output);
        for (int i = 0 ; i < ans.size() ; i++) {
            System.out.println(ans.get(i));
        }
    }
}