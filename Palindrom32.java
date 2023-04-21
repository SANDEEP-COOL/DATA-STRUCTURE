// import java.util.* ;
// import java.io.*;
public class Palindrom32 {

    public static boolean checkPalindrome(String str) {

        str = str.toLowerCase();
        int start = 0 , end = str.length() - 1;

        while( start < end ) {

            char ch = str.charAt(start);
            char ch1 = str.charAt(end);

            while(  (!Character.isLetter(ch) && !Character.isDigit(ch))  ) {
                System.out.println(start);
                start++;
                ch = str.charAt(start);
            }

            while(  (!Character.isLetter(ch1) && !Character.isDigit(ch1))  ) {
                System.out.println(end);
                end--;
                ch1 = str.charAt(end);
            }

            if( ch == ch1 ) {

                System.out.println(ch+" , "+ch1);
                start++;
                end--;


            }
            else if( ch != ch1 ){

                System.out.println(ch+" , "+ch1);
                return false;

            }

        }
        return true;
    }

    public static void main(String []args) {
        String str = "c1 O$d@eeD o1c";
        System.out.println(checkPalindrome(str));
    }
}
