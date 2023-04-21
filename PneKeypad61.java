// Phone KeyPad Problem.....

import java.util.ArrayList;
public class PneKeypad61 {

    public static void findCombination(String digits, String output, int index, ArrayList<String>al, String mapping[]){

        // base case 
        if(index==digits.length()){
            // store output in the list al 
            al.add(output);
            return;
        }

        // digit ka index'th number nikallo
        int number= digits.charAt(index) - '0';

        // mapping se value nikallo number ke according
        String value=mapping[number];

        //traversing each character of value
        for(int i=0; i<value.length(); i++){
            char ch=value.charAt(i);
            output=output+ch;
            findCombination(digits, output, index+1, al, mapping);

            // jab wapas jana tab last character ko remove kar dena output string se 
            output=output.substring(0, output.length()-1);
        }
    }

    public static void main(String []args) {
        String digits="23";
        String output="";
        int index=0;
        ArrayList<String> al=new ArrayList<String>();

        String mapping[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        findCombination(digits,output,index,al,mapping);
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
    }

}
