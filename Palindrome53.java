public class Palindrome53 {
    public static void checkPalindrome(String str,int first) {
        int last=(str.length()-1)-first;
        //base case
        if(first>=last){
            System.out.println(str+" is Palindrome!");
            return;
        }
        if(checkEle(str,first,last)){
            checkPalindrome(str,first+1);
        }
        else{
            System.out.println(str+" is not Palindrome!");
            return;
        }
    }
    public static boolean checkEle(String str,int first,int last) {
//        if(str.charAt(first)==str.charAt(last)){
//            return true;
//        }
//        return false;
        return str.charAt(first)==str.charAt(last) ? true : false;
    }
    public static void main(String []args) {
        String s = "pqrssrqp";
        checkPalindrome(s,0);
    }
}
