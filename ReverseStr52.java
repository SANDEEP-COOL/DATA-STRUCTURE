public class ReverseStr52 {
    public static String reverse(String str,int first,int last) {
        System.out.println("first= "+first+" last="+last);
        //base case
        if(first>=last){
            return str;
        }
        str=swap(str.toCharArray(),first,last);
        return reverse(str,first+1,last-1);
    }
    public static String swap(char str[],int first,int last) {
//        System.out.print(first+" , "+last);
        char temp = str[first];
        str[first] = str[last];
        str[last] = temp;
        String str1 = String.valueOf(str);
        return str1;
    }
    public static void main(String []args) {
        String str="10";
        System.out.println("Reverse of "+str+" is "+reverse(str,0,str.length()-1));
    }
}
