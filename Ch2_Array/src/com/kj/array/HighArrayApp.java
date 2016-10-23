package com.kj.array;

/**
 * Created by joshik on 10/20/16.
 */
public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize);


        arr.insert(100);
        arr.insert(34);
        arr.insert(64);
        arr.insert(73);
        arr.insert(94);
        arr.insert(23);
        arr.insert(18);
        arr.insert(78);
        arr.insert(83);
        arr.insert(16);

        arr.display();

        int searchKey = 25;
        if(arr.find(searchKey)){
            System.out.println("found it!! ");
        }else{
            System.out.println("Sorry, not found!! ");
        }

        arr.delete(00);
        arr.delete(56);
        arr.delete(78);

        arr.display();

        System.out.println("Max Value = " + arr.getMaxVal());

        arr.removeMaxVal();

        arr.display();



    }
}
