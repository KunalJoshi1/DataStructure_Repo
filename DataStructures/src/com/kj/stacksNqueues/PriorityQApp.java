package com.kj.stacksNqueues;

/**
 * Created by joshik on 10/27/16.
 */
public class PriorityQApp {

    public static void main(String[] args) {
        PriorityQ thePQ = new PriorityQ(5);

        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        long min = thePQ.minPeek();
        System.out.println(min);

        while (!thePQ.isEmpty()){
            long val = thePQ.remove();
            System.out.print(val + " ");
        }
        System.out.println(" ");


    }
}
