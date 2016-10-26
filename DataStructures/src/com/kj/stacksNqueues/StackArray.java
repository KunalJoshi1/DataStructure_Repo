package com.kj.stacksNqueues;

/**
 * Created by joshik on 10/25/16.
 */
public class StackArray {

    private int maxSize;
    private long[] stackArray;
    private int top = -1;



    // Constructor ***********************************

    public StackArray(int s){
        maxSize = s;
        stackArray = new long[s];
    }


    // Push to add values to the stackArray *********

    public void push(long value){
        stackArray[++top] = value; // increment and then assign value
    }


    // Pop to remove last inserted item *************

    public long pop(){
        return stackArray[top--];
    }

    // Peek to see what is at the top of the stack **

    public long peek(){
        return stackArray[top];
    }

    // If array is empty ****************************

    public boolean isEmpty(){
        return top == -1;
    }

    // If array is full *****************************

    public boolean isFull(){
        return top == maxSize;
    }


}
