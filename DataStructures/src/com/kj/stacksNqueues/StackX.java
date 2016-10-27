package com.kj.stacksNqueues;

/**
 * Created by joshik on 10/26/16.
 */
public class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int max){
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j){
        stackArray[++top] = j;
    }

    public char pop(){
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * Created by joshik on 10/26/16.
     */
    public static class Reverser {

        private String input;
        private String output;


        public Reverser(String in){
            input = in;
        }

        public String doRev(){

            int stackSize  = input.length();
            StackX theStack = new StackX(stackSize);

            for(int j = 0; j< input.length(); j++){
                char ch = input.charAt(j);
                theStack.push(ch);
            }

            output = " ";

            while (!theStack.isEmpty()){

                char ch = theStack.pop();
                output = output + ch;
            }

            return output;

        }
    }
}
