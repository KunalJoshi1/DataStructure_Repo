package com.kj.array;

/**
 * Created by joshik on 10/23/16.
 */
public class OrderedApp {

    public static void main(String[] args) {
        int maxSize = 100;
        OrderedArray arr = new OrderedArray(maxSize);

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

        int sKey = 200;
        if(arr.find(sKey) != arr.size()){
            System.out.println("Found!!");
        }else{
            System.out.println("Not Found!!");
        }

        arr.display();

        arr.delete(94);
        arr.delete(16);
        arr.delete(0);

        arr.display();
    }
}
