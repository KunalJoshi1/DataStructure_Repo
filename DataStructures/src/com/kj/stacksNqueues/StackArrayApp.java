package com.kj.stacksNqueues;

import com.kj.stacksNqueues.StackArray;

/**
 * Created by joshik on 10/25/16.
 */
public class StackArrayApp {

    public static void main(String[] args) {

        StackArray theStack = new StackArray(10);


        // Pushing values in
        theStack.push(21);
        theStack.push(11);
        theStack.push(45);
        theStack.push(65);


       /* theStack.peek();

        theStack.pop();

        theStack.peek();*/


        // Pop the top
        long value = theStack.pop();
        System.out.print("Popping " + value);
        System.out.print(" ");

        System.out.println(" ");

        // Peek
        long peek = theStack.peek();
        System.out.print("Peeking " + peek);

    }
}
