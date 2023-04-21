import java.util.Arrays;

public class MergerSortedArray29 {

    public static void merge(int arr1[] , int arr2[] , int arr3[]){

        int i = 0 , j = 0 , k = 0;

       while( i < arr1.length && j < arr2.length ){

           if( arr1[i] < arr2[j] ){
               arr3[k++] = arr1[i++];
           }

           else{
               arr3[k++] = arr2[j++];
           }

       }
       while( i < arr1.length ){
           arr3[k++] = arr1[i++];
       }
        while( j < arr2.length ){
            arr3[k++] = arr2[j++];
        }

    }

    public static void merge1(int arr1[] , int m , int arr2[] , int n) {

        //Just copy ele of arr2 into arr1
        int i = 0;
        while( m < arr1.length ) {

            arr1[m++] = arr2[i++];

        }

        //sort the whole array
        Arrays.sort(arr1);
    }

    public static void merge2( int arr1[] , int m , int arr2[] , int n ) {

        int i = m - 1 , j = n - 1 , k = (m+n) - 1;

        while ( j >= 0) {

            //find big ele
            if( arr2[j] > arr1[i] ) {

                arr1[k--] = arr2[j--];

            }

            else if( arr2[j] < arr1[i] ) {

                arr1[k--] = arr1[i--];

            }

            else if( arr2[j] == arr1[i] ) {

                arr1[k--] = arr1[i--];
                arr1[k--] = arr2[j--];

            }
        }

    }

    public static void merge3( int nums1[] , int m , int nums2[] , int n) {

        int last = m + n -1;

        //jab tak m aur n dono me hi ele hai
        while( m > 0 && n > 0) {

            if( nums1[m-1] > nums2[n-1] ) {

                nums1[last] = nums1[m-1];
                m--;

            }
            else{

                nums1[last] = nums2[n-1];
                n--;

            }
            last--;
        }

        //jab m me ele nahi h but n me ele h to n ke ele nums1 me dalna to padega
        while( n > 0) {

            nums1[last--] = nums2[n-1];
            n--;

        }

        //jab m me ele h but n me ni tab to kuch karna hi ni hai

    }

    public static void main(String []args){

        int arr1[] = { 1 , 2 , 3 , 0 , 0 , 0 , 0 , 0};
        int arr2[] = {3 , 4 , 5 , 6 , 7};
        int arr3[] = new int[8];

//        not working
//        merge(arr1 , arr2 , arr3);

//        another approach not working
//        merge1(arr1 , 5 , arr2 , 3);

//        another approach not working
//        merge2(arr1 , 5 , arr2 , 3);

//        another approach working
//        merge3(arr1 , 3 , arr2 , 5);

        for( int i = 0 ; i < arr1.length ; i++ ){
            System.out.print(arr1[i]+" ");
        }

    }

}
