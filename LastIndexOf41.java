public class LastIndexOf41 {

    public static String lastWord(String s){

//        removing spaces from both the end
        s = s.trim();

//        is space presented
        if(s.indexOf(' ')==-1){
            return s;
        }

        return s.substring(s.lastIndexOf(' ')+1);
    }

    public static void main(String []args) {

        String s = "abc xyz defg";
        System.out.println(lastWord(s).length());

    }

}
