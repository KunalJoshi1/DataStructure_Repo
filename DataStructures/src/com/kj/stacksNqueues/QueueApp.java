package com.kj.stacksNqueues;

/**
 * Created by joshik on 10/27/16.
 */
public class QueueApp {

    public static void main(String[] args) {

        Queue theQue = new Queue(5);


        theQue.insert(10);
        theQue.insert(5);
        theQue.insert(40);
        //theQue.insert(28);

        theQue.remove();

        theQue.peekFront();

        theQue.insert(50);
        theQue.insert(45);
        //theQue.insert(68);

        while (!theQue.isEmpty()){
            long n = theQue.remove();
            System.out.print(n);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
