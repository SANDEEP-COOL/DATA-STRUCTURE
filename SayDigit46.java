//bohot sai work kar ra hai ye code

public class SayDigit46 {

    public static void print(int n){

        //base case
        if(n==0){
            return;
        }

//        processing
//        get the last digit
        int rem = n % 10;

//        now divide the number by 10
        n = n / 10;
//        pass n for the next recursive call
        print(n);

//        check , what is this number
        switch(rem){

            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("-1");
        }
    }

    public static void main(String []args) {

        int n = 100;
        print(n);

    }

}
