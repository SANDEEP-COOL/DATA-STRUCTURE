public class StringComparison38 {

/////////////////////////////////CODE WORK NI KAR RA H , AUR ABHI DRY RUN BHI NI HOA H/////////////////////////////////////////////////////////////
    public static int insertCharLength(char arr[] , int length , int index){

        if(length == 0){
            return index;
        }

        int mod = length % 10;
        length/=10;
        int i = insertCharLength(arr,length,index);
        arr[index++] = (char)(mod+'0');
        return index;

    }

    public static int compare(char arr[]){

        int length = 1 , k = 0;
//        iterate every element
        for ( int i = 0 ; i < arr.length ; i++ ) {

//            j ko initialize karne ke space h bhi ki ni
            if( i < arr.length - 1 ){
                int j = i + 1;
//              if they are equal
                if(arr[i] == arr[j]){
//                    length nikaal lo
                    while ( j < arr.length && arr[i] == arr[j] ) {
                        length++;
                        j++;
                    }
//                    character aur length ko insert kar do
                    arr[k] = arr[i];
//                    jab jab ye insertion ho tab tab k ki value badha do
                    k++;
                    k = insertCharLength(arr , length , k );
                    length++;
//                    jaha j ha usse ek index pehle i ko la do
                    i = j - 1;
                }
                else {
//                    abhi only character insert karo kyuki length 1 h
                    arr[k] = arr[i];
                    k++;
                }
            }
//            if not
            if ( i == arr.length-1 ) {
                arr[k] = arr[i];
                k++;
            }

        }
        return k;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////ISKO WAPAS KARO BAN JAYEGA/////////////////////////////////////////////////////////////////////////////
  public static int  compress1(char arr[]){
        String arr1 = String.valueOf(arr);
        String ans = "";
        int count = 1;
        for (int i = 0 ; i < arr1.length() ; i++){
            count = 1;

            while(i < arr1.length()-1 && arr1.charAt(i) == arr1.charAt(i+1)){
                count++;
            }

            ans = ans + arr[i];
            if (count >  1) {
                ans = ans + count;
            }
        }
        arr = ans.toCharArray();
        return arr.length;
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String []args) {

        char arr[] = {'a','a','b','b','c','c','c'};
//        int k = compare(arr);
//        while(k >=0){
//            System.out.println(arr);
//            k--;
//        }

        int i = compress1(arr);
        for(char ch : arr){
            System.out.println(ch);
        }
    }

}
