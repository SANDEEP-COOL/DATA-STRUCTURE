////////////////////////////////////////////////Code Bohot Sai Chal Ra H Koi Problem Ni H//////////////////////////////////////////////////
class RomanToInteger39 {
    public static int romanToInt(String s) {

        int ans = 0;

        // Iterate the whole string
        for ( int i = 0 ; i < s.length() ; i++ ) {

            //fetch character presented at ith pos
            char ch = s.charAt(i);

            // multiple cases
            switch( ch ){

                // if that is V , add 5
                case 'V':
                    ans = ans + 5;
                    break;

                    // if L , add 50
                case 'L':
                    ans = ans + 50;
                    break;

                    // if D , add 500
                case 'D':
                    ans = ans + 500;
                    break;

                    // if M , add 1000
                case 'M':
                    ans = ans + 1000;
                    break;

                    // I found
                case 'I':

                    // check it's next element
                    if(i < s.length()-1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){

                        ans = ans - 1;
                    }
                    else{
//                        System.out.println(ans);
                        ans = ans + 1;
//                        System.out.println(ans);
                    }
                    break;

                    // C found
                case 'C':

                    // check it's next element
                    if(i < s.length()-1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
                        ans = ans - 100;
                    }
                    else{
                        ans = ans + 100;
                    }
                    break;

                    // X found
                case 'X':

                    // check it's next element
                    if(i < s.length()-1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                        ans = ans - 10;
                    }
                    else{
                        ans = ans + 10;
                    }
                    break;
            }

        }
        return ans;
    }
    ////////////////////////////////////////////////Code Bohot Sai Chal Ra H Koi Problem Ni H//////////////////////////////////////////////////
    public static void main(String []args){
        String s = "III";
        System.out.println(romanToInt(s));
    }
}