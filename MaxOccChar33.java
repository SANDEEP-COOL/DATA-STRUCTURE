class MaximumOccChar33
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {

        /*creating count array for a to z characters , and a repersentes 0th index and b represents 25th index , same like all charcters represents their position between 0 to 25th index , and how did we calculate this.
        with this formula
        formula is = charcter - 'a' = index
        */

        int arr[] = new int[26];

        //traverse a whole string and store count in count array
        for( int i = 0 ; i < line.length() ; i++ ) {

            char ch = line.charAt(i);

            //getting it's position
            int index = ch - 'a';

            //and increase the count of ch
            arr[index]++;

        }

        // max tells maximum occurence , and ans tells index of that
        int max = -1 , ans = 0;
        //find the maximum count accordingly return the corresponding character
        for( int i = 0 ; i < 26 ; i++ ) {

            if( max < arr[i] ) {

                max = arr[i];
                ans = i;

            }

        }
        char ch = (char)('a' + ans);
        return ch;
    }

    public static void main(String []args)
    {

        String str = "output";
        System.out.println(getMaxOccuringChar(str));

    }
}
