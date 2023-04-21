public class Permutation6 {

    public static String swap(String str , int i , int j){

        char[] str1 = str.toCharArray();
        char temp = str1[i];
        str1[i] = str1[j];
        str1[j] = temp;
        String string = new String(str1);
        return string;

    }
    public static void getPermutation(String str , int index){

        if(index == str.length()-1){

            System.out.println(str);
//            str = swap(str , index-1 , 0);
            return;

        }

        for(int i = index ; i<str.length() ; i++){

            str = swap(str , index , i);
            getPermutation(str , index+1);
            str = swap(str , index , i);

        }
    }

    public static void main(String []args){

        Permutation6.getPermutation("abc" , 0);

    }

}
