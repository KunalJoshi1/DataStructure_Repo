package algorithms.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by joshik on 11/13/16.
 */
public class Duplicates {

    public static void main(String[] args) {

        String name = "harsh pandya";

       // ArrayList<String> dupes = findDupe(name);

        HashMap<String, Integer> dupes = findDupe(name);


    }

    private static HashMap<String, Integer> findDupe(String name) {
        String[] nameStr = name.split("");

        HashMap<String, Integer> dupe = new HashMap<>();

        System.out.println(nameStr);

        for(int i = 0; i < nameStr.length; i++){
            String sKey = nameStr[i];

            for(int j = i+1; j < nameStr.length; j++){
                if(nameStr[i].equalsIgnoreCase(nameStr[j])){
                    System.out.println("Dupe found: " + nameStr[i]);

                    dupe.get(nameStr[i]);
                    if(dupe.get(nameStr[i]) != null){
                        int counter = dupe.get(nameStr[i]) + 1;
                        dupe.put(nameStr[i], counter);
                    }else{
                        dupe.put(nameStr[i], 1);
                    }

                }

            }
        }

        return dupe;
    }



}
