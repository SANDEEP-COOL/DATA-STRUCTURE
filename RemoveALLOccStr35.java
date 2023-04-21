class RemoveAllOccStr35 {

    public static String removeOccurrences(String s , String part) {

//        String - containes("") - checkes whether the substring passed as an argument to it , is presented in string or not
//         String - replaceFirst("", "") - this method replace the substring by other substring which is presented at first

        while( s.contains(part) ) {
            s = s.replaceFirst(part , "");
        }
        return s;
    }

    public static void main(String []args) {
        System.out.println(removeOccurrences("daabcbaabcbc" , "abc"));
    }
}
