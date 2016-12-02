package algorithms.Test;

/**
 * Created by joshik on 11/17/16.
 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int n = 10;


        /*logic: Fn = F(n-1) + F(n-2)

        c = a + b; // c = 0 + 1;
        a=b; // now a= 1;
        b=c; // b = (0+1) = 1

        next time;

        c = 1 + 1 = 2; a= 1; b = 2;
        c = 1 + 2 = 3; a=2; b=3;
         */

        System.out.println(b);
        for (int i = 2; i < n; ++i) {

            c = a + b;

            System.out.println(c);
            a = b;
            b = c;

        }
    }
}



