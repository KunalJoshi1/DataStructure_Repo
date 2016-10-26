package com.kj.array;

/**
 * Created by joshik on 10/21/16.
 */
public class ClassDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray arr = new ClassDataArray(maxSize);

        arr.insert("aa","bb",12);
        arr.insert("cc","dd",23);
        arr.insert("ee","ff",34);
        arr.insert("gg","hh",45);
        arr.insert("ii","jj",56);
        arr.insert("kk","ll",67);
        arr.insert("mm","nn",78);
        arr.insert("oo","pp",65);
        arr.insert("qq","rr",54);
        arr.insert("ss","tt",21);

        arr.displayA();

        arr.find("pp");
        arr.find("kk");

        arr.delete("cc");
        arr.delete("ss");

        arr.displayA();





    }
}
