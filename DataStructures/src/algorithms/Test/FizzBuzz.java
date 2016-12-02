package algorithms.Test;

import java.util.Scanner;

/**
 * Created by joshik on 11/17/16.
 */
public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("Enter value for n: ");
        int n = new Scanner(System.in).nextInt();

        for(int i =1; i < n; i++){
            if((i % 5 ==0) && (i % 3 ==0)){
                System.out.println(i + " :FizzBuzz!!");
            } else if(i % 5 ==0){
                System.out.println(i + " :Fizz");
            } else if(i % 3 == 0){
                System.out.println(i + " :Buzz");
            } else if((i % 5 !=0) && (i % 3 !=0)){
                System.out.println(i + " :Oops!!");
            }
        }
    }
}
