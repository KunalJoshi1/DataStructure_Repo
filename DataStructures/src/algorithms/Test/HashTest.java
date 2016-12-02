package algorithms.Test;

import java.util.HashMap;

/**
 * Created by joshik on 11/13/16.
 */
public class HashTest {

    public static void main(String[] args) {

        HashMap<String, Boolean> name = new HashMap<>();
        name.put("H", true);
        name.put("a", true);
        name.put("r", true);
        name.put("s", true);
        name.put("H", true);

        name.values();
        System.out.println(name.get("H"));




    }
}
