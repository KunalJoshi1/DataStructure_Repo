package algorithms.Test;

/**
 * Created by joshik on 11/15/16.
 */
public class Palindrome {

    public static void main(String[] args) {



        String s = "madam";
        String rev = "";

        for(int i = s.length()-1; i >= 0; i--){

            rev= rev + s.charAt(i);

        }
        System.out.println(rev);


        if(s.equalsIgnoreCase(rev)){
            System.out.println("Is a Palindrome");
        } else{
            System.out.println("Is not a Palindrome");
        }

    }




}
