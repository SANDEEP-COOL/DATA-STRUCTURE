public class PrintSpellingOfNum3 {

    public void PrintSpelling(int num){

        if(num == 0){

            return;

        }


//        printSpellingOfNum3 fun speaking - hey! recursion i print last digit only,
//        and remove that digit only from num and after making a new digit pass you...
//        after that you take care of that num i don't mean
        int rem = num % 10;
        num = num/10;
        PrintSpelling(num);
        switch (rem){

            case 1:
                System.out.print(" ONE");
                break;
            case 2:
                System.out.print(" TWO");
                break;
            case 3:
                System.out.print(" THREE");
                break;
            case 4:
                System.out.print(" FOUR");
                break;
            case 5:
                System.out.print(" FIVE");
                break;
            case 6:
                System.out.print(" SIX");
                break;
            case 7:
                System.out.print(" SEVEN");
                break;
            case 8:
                System.out.print(" EIGHT");
                break;
            case 9:
                System.out.print(" NINE");
                break;
            case 0:
                System.out.print(" ZERO");
                break;
        }

    }

    public static void main(String []args){

        PrintSpellingOfNum3 obj = new PrintSpellingOfNum3();
        obj.PrintSpelling(431);
    }

}
