public class SubsetArrayString60 {
    
    public static void findSubset(String str, String ans, int index) {

        // base case 
        if(index==str.length()){
            // print ans 
            System.out.println(ans);
            return;
        }

        // exclude
        findSubset(str, ans, index+1);

        // include 
        char ch=str.charAt(index);
        ans=ans+ch;
        findSubset(str, ans, index+1);

    }

    public static void main(String[] args) {
        String str="bbb", ans="";
        int index=0;
        findSubset(str, ans, index);
    }

}
