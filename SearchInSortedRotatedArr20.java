public class SearchInSortedRotatedArr20 {

    public static int getPivot(int arr[]){

        int s = 0 , e = arr.length-1 , mid = (s + e)/2;
        while(s < e){

            if(arr[mid] >= arr[0]){
                s = mid + 1;
            }
            else{
                e = mid;
            }

            mid = (s + e)/2;
        }
        return s;
    }

    public static int binarySearch(int arr[] , int target , int start , int end){

        int s = start , e = end , mid = (s + e)/2;
        while(s <= e){

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }

            mid = (s + e)/2;
        }
        return -1;
    }

    public static void main(String []args){
//        int arr[] = {84 , 88 , 97 , 104 , 127 , 133 , 138 , 144 , 148 , 157 , 158 , 159 , 166 , 171 , 177 , 185 , 186 , 187 , 189 , 191 , 196 , 197 , 200 , 212 , 215 , 217 , 222 , 235 , 242 , 250 , 255 , 259 , 264 , 270 , 272 , 288 , 290, 291 ,293, 297 ,306 ,308 ,310 ,311 ,323 ,325 ,326 ,327 ,329 ,335 ,341 ,349 ,368 ,371 ,372 ,381 ,387 ,390, 397 ,399, 401 ,405 ,425 ,431 ,434 ,438 ,443 ,448 ,455 ,458 ,464 ,472 ,475 ,492 ,493, 500, 501, 502, 504, 510 ,513 ,520 ,521 ,524 ,530 ,539 ,542 ,566, 583, 592 ,593 ,608 ,617, 618 ,621, 631 ,652, 653, 656, 661, 663, 664, 666 ,673 ,691, 695, 697 ,698 ,711 ,721 ,733 ,737 ,750 ,753 ,754 ,763 ,767 ,770 ,777 ,781, 784, 789, 790, 798 ,804 ,812 ,815 ,827, 830, 837, 847 ,852 ,865 ,898 ,909 ,925, 931, 933 ,936, 939, 947 ,953, 965 ,978 ,983 ,993 ,997 ,13 ,17 ,20 ,22 ,28 ,33 ,39 ,43 ,47 ,59 ,62 ,67 ,73, 75, 76, 81,
//                24};
        int arr[] = {4 , 5 , 6 , 7 , 0 , 1 ,2};
        int target = 2;
        int indexPivot = getPivot(arr);
        if(arr[indexPivot] <= target &&  target<= arr[arr.length-1]) {

           System.out.println(binarySearch(arr , target , indexPivot , arr.length-1));

        }
        else {

            System.out.println(binarySearch(arr , target , 0 , indexPivot-1));

        }

//        int s = 0 , e = arr.length-1 , mid = (s + e)/2;
//
//        if(arr[mid] == target){
//            System.out.println(mid);
//        }
//        else if(arr[0] == target){
//            System.out.println("0");
//        }
//        else if(arr[arr.length-1] == target){
//            System.out.println("arr.length-1");
//        }
//
//        else if(target < arr[mid] && target > arr[0]){
//            System.out.println(binarySearch(arr , target , 0 , mid));
//        }
//        else if(target < arr[mid] && target < arr[0]) {
////            binarySearch(arr , target , mid + 1 , arr.length)-1;
//            System.out.println(binarySearch(arr , target , mid + 1 , 0));
//        }


    }
}
