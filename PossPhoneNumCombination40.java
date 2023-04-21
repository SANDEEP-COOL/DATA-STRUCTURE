import java.util.ArrayList;

class PossPhoneNumCombination40
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList<String> possibleWords(int a[])
    {


        // firstly make those String
        int digitsStrLen = a.length;

        String[] stringsArr = new String[digitsStrLen];


        // iterate that string
        for ( int i = 0 ; i < digitsStrLen ; i++ ) {

            // i'th charcater nikallo
            int ch = a[i];

            // kon si digit h pata karo
            switch(ch){

                case 2:
                    stringsArr[i] = "abc";
                    break;

                case 3:
                    stringsArr[i] = "def";
                    break;

                case 4:
                    stringsArr[i] = "ghi";
                    break;

                case 5:
                    stringsArr[i] = "jkl";
                    break;

                case 6:
                    stringsArr[i] = "mno";
                    break;

                case 7:
                    stringsArr[i] = "pqrs";
                    break;

                case 8:
                    stringsArr[i] = "tuv";
                    break;

                case 9:
                    stringsArr[i] = "wxyz";
                    break;
            }

        }

        // now make combinations and store in list
        ArrayList<String> ans = new ArrayList<String>();

        for(String s : stringsArr){
            System.out.println(s);
        }

        // if first loop runs for 1 time so second loop runs for 3 times and third loop will run for 9 times , if there are three string

        if(stringsArr.length == 3){

            for(int i = 0 ; i < stringsArr[0].length() ; i++){

                for(int j = 0 ; j < stringsArr[1].length() ; j++){

                    for ( int k = 0 ; k < stringsArr[2].length() ; k++ ){

                        String str = "";
                        str = str+stringsArr[0].charAt(i) + stringsArr[1].charAt(j) + stringsArr[2].charAt(k);
                        ans.add(str);

                    }

                }

            }

        }


        if(stringsArr.length == 4){

            for(int i = 0 ; i < stringsArr[0].length() ; i++){

                for(int j = 0 ; j < stringsArr[1].length() ; j++){

                    for ( int k = 0 ; k < stringsArr[2].length() ; k++ ){

                        for( int l = 0 ; l < stringsArr[3].length() ; l++ ){

                            String str = "";
                            str = str+stringsArr[0].charAt(i) + stringsArr[1].charAt(j) + stringsArr[2].charAt(k) + stringsArr[3].charAt(l);
                            ans.add(str);

                        }

                    }

                }

            }

        }


        if(stringsArr.length == 2){

            for(int i = 0 ; i < stringsArr[0].length() ; i++){

                for(int j = 0 ; j < stringsArr[1].length() ; j++){

                    String str = "";
                    str = str+stringsArr[0].charAt(i) + stringsArr[1].charAt(j);
                    ans.add(str);

                }

            }

        }

        if(stringsArr.length == 1){

            for(int i = 0 ; i < stringsArr[0].length() ; i++){

                String str = "";
                str = str+stringsArr[0].charAt(i);
                ans.add(str);

            }

        }


        if(stringsArr.length == 5){

            for(int i = 0 ; i < stringsArr[0].length() ; i++){

                for(int j = 0 ; j < stringsArr[1].length() ; j++){

                    for ( int k = 0 ; k < stringsArr[2].length() ; k++ ){

                        for( int l = 0 ; l < stringsArr[3].length() ; l++ ){

                            for(int m = 0 ; m < stringsArr[4].length() ; m++){

                                String str = "";
                                str = str+stringsArr[0].charAt(i) + stringsArr[1].charAt(j) + stringsArr[2].charAt(k) + stringsArr[3].charAt(l) + stringsArr[4].charAt(m);
                                ans.add(str);

                            }

                        }

                    }

                }

            }

        }

        if(stringsArr.length == 6){

            for(int i = 0 ; i < stringsArr[0].length() ; i++){

                for(int j = 0 ; j < stringsArr[1].length() ; j++){

                    for ( int k = 0 ; k < stringsArr[2].length() ; k++ ){

                        for( int l = 0 ; l < stringsArr[3].length() ; l++ ){

                            for(int m = 0 ; m < stringsArr[4].length() ; m++){

                                for(int n = 0 ; n < stringsArr[5].length() ; n++){

                                    String str = "";
                                    str = str+stringsArr[0].charAt(i) + stringsArr[1].charAt(j) + stringsArr[2].charAt(k) + stringsArr[3].charAt(l) + stringsArr[4].charAt(m) + stringsArr[5].charAt(n);
                                    ans.add(str);

                                }

                            }

                        }

                    }

                }

            }

        }


        if(stringsArr.length == 7){

            for(int i = 0 ; i < stringsArr[0].length() ; i++){

                for(int j = 0 ; j < stringsArr[1].length() ; j++){

                    for ( int k = 0 ; k < stringsArr[2].length() ; k++ ){

                        for( int l = 0 ; l < stringsArr[3].length() ; l++ ){

                            for(int m = 0 ; m < stringsArr[4].length() ; m++){

                                for(int n = 0 ; n < stringsArr[5].length() ; n++){

                                    for(int o = 0 ; o < stringsArr[6].length() ; o++){

                                        String str = "";
                                        str = str+stringsArr[0].charAt(i) + stringsArr[1].charAt(j) + stringsArr[2].charAt(k) + stringsArr[3].charAt(l) + stringsArr[4].charAt(m) + stringsArr[5].charAt(n) + stringsArr[6].charAt(o);
                                        ans.add(str);

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

        if(stringsArr.length == 8){

            for(int i = 0 ; i < stringsArr[0].length() ; i++){

                for(int j = 0 ; j < stringsArr[1].length() ; j++){

                    for ( int k = 0 ; k < stringsArr[2].length() ; k++ ){

                        for( int l = 0 ; l < stringsArr[3].length() ; l++ ){

                            for(int m = 0 ; m < stringsArr[4].length() ; m++){

                                for(int n = 0 ; n < stringsArr[5].length() ; n++){

                                    for(int o = 0 ; o < stringsArr[6].length() ; o++){

                                        for(int p = 0 ; p < stringsArr[7].length() ; p++){

                                            String str = "";
                                            str = str+stringsArr[0].charAt(i) + stringsArr[1].charAt(j) + stringsArr[2].charAt(k) + stringsArr[3].charAt(l) + stringsArr[4].charAt(m) + stringsArr[5].charAt(n) + stringsArr[6].charAt(o) + stringsArr[7].charAt(p);
                                            ans.add(str);

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

        for(String str : stringsArr){
            System.out.println(str);
        }


        return ans;


    }

    public static void main(String []args){

        int arr[] = {2,3,4,5,6,7,8,9};
        System.out.println(possibleWords(arr));

    }
}

